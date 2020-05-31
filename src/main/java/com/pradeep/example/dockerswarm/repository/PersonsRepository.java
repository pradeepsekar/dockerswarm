package com.pradeep.example.dockerswarm.repository;

import com.pradeep.example.dockerswarm.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonsRepository extends CrudRepository<Person, Integer> {

}
