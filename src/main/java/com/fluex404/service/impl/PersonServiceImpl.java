package com.fluex404.service.impl;

import com.fluex404.dto.PersonDTO;
import com.fluex404.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private List<PersonDTO> persons = Arrays.asList(
            new PersonDTO("test3", "test3@gmail.com", "123", 51, true, 103),
            new PersonDTO("test4", "test4@gmail.com", "123", 11, false, 104),
            new PersonDTO("test1", "test1@gmail.com", "123", 21, true, 101),
            new PersonDTO("test2", "test2@gmail.com", "123", 31, false, 102)
    );



    @Override
    public List<PersonDTO> getPersons() {
        return persons;
    }
}
