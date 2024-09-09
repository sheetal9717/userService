package com.example.userService.controllers;

import com.example.userService.dtos.LoginRequestDto;
import com.example.userService.dtos.UserDto;
import com.example.userService.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody LoginRequestDto request){
        return authService.login(request.getEmail(), request.getPassword());
    }

    @PostMapping("/logout")
    public ResponseEntity<Void> logout(){
        return authService.logout();
    }

    @PostMapping("/signup")
    public ResponseEntity<UserDto> signup(){
        return authService.signup();
    }

    @PostMapping("/validate")
    public String validate(){
        return authService.validate();
    }
}
