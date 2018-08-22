package com.reaction.reaction.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by muhammad.nizar01 on 8/22/2018.
 */
@Data
@Entity
public class Employee {

    private @Id @GeneratedValue long id;
    private String firstName;
    private String lastName;
    private String description;

    private Employee(){}

    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }


}
