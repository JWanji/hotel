package com.demo.hotel.service;


import com.demo.hotel.model.Customer;
import com.demo.hotel.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CustomerServiceImplTests {

    @Mock
    CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService = new CustomerServiceImpl();

    @Test
    public void getFeedbacksTests() throws Exception {
        Customer customer1 =new Customer("Harley","Quinn","my Feedback","Good Hotel","Feedback");
        Customer customer2 =new Customer("Harley","Quinn","my Feedback","Good Hotel","Feedback");
        Iterable<Customer> cust = Arrays.asList(customer1,customer2);

        Mockito.when(customerRepository.findAll()).thenReturn(cust);

        List<String> expectedMessages = Arrays.asList(customer1.getMessage(),customer2.getMessage());

        Assertions.assertEquals(expectedMessages,customerService.getFeedbacks());
    }


}
