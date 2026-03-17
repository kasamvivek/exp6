package com.example.jwt_auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtectedController {

    @GetMapping("/protected")
    public String protectedRoute() {
        return "You accessed a protected route!";
    }
}