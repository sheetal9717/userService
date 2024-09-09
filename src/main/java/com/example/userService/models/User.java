package com.example.userService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Entity     //table will be creating for this model
@Getter
@Setter
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;

    @ManyToMany
    private Set<Role> roleSet;
}
