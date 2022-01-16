package com.example.demo.registration;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class RegistrationService {

    public String register(RegistrationRequest request) {
        return "It works!";
    }
}
