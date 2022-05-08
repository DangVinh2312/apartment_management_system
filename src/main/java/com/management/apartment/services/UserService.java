package com.management.apartment.services;

import com.management.apartment.dto.room.RoomRequestDTO;
import com.management.apartment.dto.user.UserRequestDTO;
import com.management.apartment.entities.Apartment;
import com.management.apartment.entities.Room;
import com.management.apartment.entities.User;
import com.management.apartment.repositoties.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void saveUser(UserRequestDTO userRequestDTO) {
        User user = new User(userRequestDTO);
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
