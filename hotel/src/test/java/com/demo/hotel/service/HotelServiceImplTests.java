package com.demo.hotel.service;


import com.demo.hotel.model.Hotel;
import com.demo.hotel.model.Location;
import com.demo.hotel.repository.HotelRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class HotelServiceImplTests {

    @Mock
    HotelRepository hotelRepository;

    @InjectMocks
    private HotelServiceImpl hotelService = new HotelServiceImpl();


    @Test
    public void getHotelBylocationTest() throws Exception{
        Hotel hotel = new Hotel(1001,"The Grand Hotel",new Location(123,"New York"),"Image");

        Iterable<Hotel> ho = Arrays.asList(hotel);
        Mockito.when(hotelRepository.findAll()).thenReturn(ho);

        Hotel actual = hotelService.getHotelBylocation("New York");
        Assertions.assertEquals(hotel.getHotelId(),actual.getHotelId());
        Assertions.assertEquals(hotel.getHotelName(),actual.getHotelName());
        Assertions.assertEquals(hotel.getLocation(),actual.getLocation());
    }

}
