package com.fluex404.service;

import com.fluex404.dto.UserCreateDTO;
import com.fluex404.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getUsers();
    UserDTO add(UserCreateDTO dto);
}
