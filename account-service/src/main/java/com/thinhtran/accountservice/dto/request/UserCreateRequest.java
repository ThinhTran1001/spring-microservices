package com.thinhtran.accountservice.dto.request;

import com.thinhtran.accountservice.exception.ErrorCode;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserCreateRequest {

    @Size(min = 3, message = "USERNAME_INVALID")
    private String username;

    @Size(min = 8, max = 50, message = "PASSWORD_INVALID")
    private String password;

    private String firstName;

    private String lastName;

    private LocalDate dob;
}
