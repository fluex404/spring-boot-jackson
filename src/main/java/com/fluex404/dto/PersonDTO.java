package com.fluex404.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"id", "name", "email"})
public class PersonDTO {
    private String name;
    private String email;
    private String phone;
    private Integer age;
    private Boolean isMan;
    private Integer id;
}
