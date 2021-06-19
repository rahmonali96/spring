package com.example.spring.services;

import com.example.spring.entities.Person;
import com.example.spring.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public List<Person> findAll(){
        return personRepository.findAll();
    }
    public Person save(Person person){
        return personRepository.save(person);
    }
}
