package com.example.demo.registration;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonDeserialize
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;


}