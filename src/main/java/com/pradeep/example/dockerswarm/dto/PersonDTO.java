package com.pradeep.example.dockerswarm.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PersonDTO {

    private String firstName;
    private String lastName;
    private int age;
}
