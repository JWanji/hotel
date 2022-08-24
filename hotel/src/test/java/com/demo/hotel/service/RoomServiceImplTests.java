package com.demo.hotel.service;


import com.demo.hotel.model.RoomType;
import com.demo.hotel.model.Rooms;
import com.demo.hotel.repository.RoomsRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class RoomServiceImplTests {

    @Mock
    RoomsRepository roomRepository;

    @InjectMocks
private RoomServiceImpl roomService = new RoomServiceImpl();

    @Test
    public void getAllRoomsTest() throws Exception{
        roomRepository = Mockito.mock(RoomsRepository.class);

        Iterable<Rooms> it = Arrays.asList(new Rooms(1, RoomType.DELUXE,2000),new Rooms(2, RoomType.DELUXE,2000));

        Mockito.when(roomRepository.findAll()).thenReturn(it);

        Assertions.assertEquals(2,roomService.getAllRooms().size());

    }
}
