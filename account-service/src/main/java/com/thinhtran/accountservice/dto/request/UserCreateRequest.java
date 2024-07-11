package com.thinhtran.accountservice.dto.request;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserCreateRequest {

    private String username;

    @Size(min = 8, max = 50, message = "password must be in range 8 to 50")
    private String password;

    private String firstName;

    private String lastName;

    private LocalDate dob;
}
