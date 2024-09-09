package com.example.userService.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass   //class is super class, not associated with Db tables
                    // but its properties are inherited by child class associated with tables
@Getter
@Setter
public class BaseModel {
    @Id             //primary key
    @GeneratedValue (strategy = GenerationType.IDENTITY)    //Pk will be generated automatically by DB and auto incrementing in nature
    private Long id;
}
