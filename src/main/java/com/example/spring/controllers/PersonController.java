package com.example.spring.controllers;

import com.example.spring.entities.Person;
import com.example.spring.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private PersonService personService;

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
    @GetMapping
    public ResponseEntity<List<Person>> getPersonApi(){
        List<Person> personList = personService.findAll();
        return new ResponseEntity<>(personList, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Person> getPersonApi(@RequestBody Person person){
        Person person1 = personService.save(person);
        return new ResponseEntity<>(person1, HttpStatus.OK);
    }


}
