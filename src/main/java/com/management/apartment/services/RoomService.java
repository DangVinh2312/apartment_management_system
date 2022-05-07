package com.management.apartment.services;

import com.management.apartment.dto.room.RoomRequestDTO;
import com.management.apartment.entities.Room;
import com.management.apartment.repositoties.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public void saveRoom(RoomRequestDTO roomRequestDTO) {
        Room room = new Room(roomRequestDTO);
        roomRepository.save(room);
    }
}
