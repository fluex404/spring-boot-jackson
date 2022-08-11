package com.fluex404.dto;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fluex404.dto.deserializer.CustomeDateDeserializeRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDTO {
    private Integer id;
    private String name;
    @JsonAlias("joinDate") // dd-MM-yy
    @JsonDeserialize(using = CustomeDateDeserializeRequest.class)
    private LocalDate join;
}
