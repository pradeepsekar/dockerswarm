package com.pradeep.example.dockerswarm.service;

import com.pradeep.example.dockerswarm.dto.PersonDTO;
import com.pradeep.example.dockerswarm.entity.Person;
import com.pradeep.example.dockerswarm.repository.PersonsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PersonService {

    @Autowired
    PersonsRepository personsRepository;

    public List<PersonDTO> getAllPersons() {
        log.info("Making repository call to fetch all persons.");
        List<PersonDTO> persons = new ArrayList<>();
        for(Person person : personsRepository.findAll()) {
            PersonDTO personDTO = new PersonDTO();
            personDTO.setFirstName(person.getFirstName());
            personDTO.setLastName(person.getLastName());
            personDTO.setAge(person.getAge());
            persons.add(personDTO);
        }
        return persons;
    }

}
