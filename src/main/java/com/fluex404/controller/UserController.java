package com.fluex404.controller;

import com.fluex404.dto.UserCreateDTO;
import com.fluex404.dto.UserDTO;
import com.fluex404.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getUsers(){
        return ResponseEntity.ok(userService.getUsers());
    }

    @PostMapping
    public ResponseEntity<UserDTO> save(
            @RequestBody UserCreateDTO dto
            ){
        return ResponseEntity.ok(userService.add(dto));
    }

}
