package com.fluex404.service.impl;

import com.fluex404.dto.UserCreateDTO;
import com.fluex404.dto.UserDTO;
import com.fluex404.service.UserService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final List<UserDTO> users = new ArrayList<>(Arrays.asList(
            new UserDTO(101, "test1", LocalDate.now().plusDays(1)),
            new UserDTO(102, "test2", LocalDate.now().plusDays(3)),
            new UserDTO(103, "test3", LocalDate.now().plusDays(2)),
            new UserDTO(104, "test4", LocalDate.now().plusDays(4))
    ));

    @Override
    public List<UserDTO> getUsers(){
        return users;
    }

    @Override
    public UserDTO add(UserCreateDTO dto){
        UserDTO userDTO = new UserDTO(dto.getId(), dto.getName(), dto.getJoin());
        users.add(userDTO);
        return userDTO;
    }
}
