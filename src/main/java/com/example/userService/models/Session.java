package com.example.userService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Session extends BaseModel{
    private String token;
    private Date expiringAt;

    @ManyToOne
    private User user;

    @Enumerated(EnumType.ORDINAL)       //for persisting enum in DB, ordinal number that has some order/sequence
    private SessionStatus sessionStatus;
}
