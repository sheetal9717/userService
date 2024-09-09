package com.example.userService.services;

import com.example.userService.dtos.LoginRequestDto;
import com.example.userService.dtos.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class AuthService {
    public ResponseEntity<UserDto> login(String email, String password){
        System.out.println("Hii I am in login method ");
        return null;
    }

    public ResponseEntity<Void> logout() {
        return null;
    }

    @PostMapping("/signup")
    public ResponseEntity<UserDto> signup() {
        return null;
    }

    public String validate() {
        return "validate";
    }
}
