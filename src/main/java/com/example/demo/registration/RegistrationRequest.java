package com.example.demo.registration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

    public RegistrationRequest(@JsonProperty("firstName")String firstName,
                               @JsonProperty("lastName")String lastName,
                               @JsonProperty("email")String email,
                               @JsonProperty("password")String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}