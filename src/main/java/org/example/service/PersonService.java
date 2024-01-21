package org.example.service;

import org.example.entity.Persons;
import org.example.repository.PersonRepo;
import org.example.response.PersonResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersonRepo repo;

    @Autowired
    ModelMapper modelMapper;
    public PersonResponse getPersonById(int id){
        Optional<Persons> persons = repo.findById(id);
        if(persons.isEmpty()) return new PersonResponse(0, "Invalid ID", "Invalid ID", "Invalid ID", "Invalid ID");
        return modelMapper.map(persons, PersonResponse.class);

    }
}
