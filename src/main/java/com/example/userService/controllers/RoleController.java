package com.example.userService.controllers;

import com.example.userService.dtos.CreateRoleRequestDto;
import com.example.userService.models.Role;
import com.example.userService.services.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.CacheResponse;

@RestController
@RequestMapping("/roles")
public class RoleController {
    private RoleService roleService;
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }


    @PostMapping
    public String createRole(){
        return roleService.createRole();
    }

}
