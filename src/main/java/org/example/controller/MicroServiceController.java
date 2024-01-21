package org.example.controller;

import org.example.response.PersonResponse;
import org.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServiceController {

    @Autowired
    private PersonService personService;
    @GetMapping("/microservice/{id}")
    private ResponseEntity<PersonResponse> getEmployeeDetails(@PathVariable("id") int id) {
//        EmployeeResponse employee = employeeService.getEmployeeById(id);
        String helloWorld = "Hello World";
        PersonResponse personResponse = personService.getPersonById(id);
        return ResponseEntity.status(HttpStatus.OK).body(personResponse);
    }
}
