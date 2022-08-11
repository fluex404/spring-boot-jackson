package com.fluex404.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fluex404.dto.serializer.CustomerDateSerializerResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties({"id"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    @JsonIgnore
    private Integer id;
    private String name;
    @JsonSerialize(using = CustomerDateSerializerResponse.class)
    @JsonProperty("joinDate")
    private LocalDate join;
}
