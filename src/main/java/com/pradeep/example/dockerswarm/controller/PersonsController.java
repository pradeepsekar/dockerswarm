package com.pradeep.example.dockerswarm.controller;

import com.pradeep.example.dockerswarm.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")
@CrossOrigin("*")
@Slf4j
public class PersonsController {

    @Autowired
    PersonService personService;

    @GetMapping("/")
    public ResponseEntity getAllPersons() {
        log.info("Fetching all persons from DB");
        return new ResponseEntity(personService.getAllPersons(), HttpStatus.OK);
    }

}
