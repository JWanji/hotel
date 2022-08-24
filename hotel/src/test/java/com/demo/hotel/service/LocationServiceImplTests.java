package com.demo.hotel.service;

import com.demo.hotel.model.Location;
import com.demo.hotel.repository.LocationRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Iterator;

@SpringBootTest
class LocationServiceImplTests {

    @Mock
    private LocationRepository locationRepository;

    @InjectMocks
    private LocationServiceImpl service = new LocationServiceImpl();


    @Test
    public void getLocations() throws Exception{
        Location l1 = new Location(123,"New York");
        Location l2 = new Location(124,"San Fransisco");
        Iterable<Location> l = Arrays.asList( l1,l2);
        Mockito.when( locationRepository.findAll()).thenReturn(l);

        Assertions.assertEquals(2 ,service.getLocations().size());

    }
}
