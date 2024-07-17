package com.thinhtran.accountservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_EXISTED("error", "User existed!", HttpStatus.BAD_REQUEST),
    UNCATEGORIZED_EXCEPTION("error", "Uncategorized error!", HttpStatus.INTERNAL_SERVER_ERROR),
    KEY_INVALID("error", "Invalid message key!", HttpStatus.BAD_REQUEST),
    USERNAME_INVALID("error", "Username must be at least 3 characters!", HttpStatus.BAD_REQUEST),
    PASSWORD_INVALID("error", "Password must be in range 8 to 50 characters!", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED("error", "User is not existed!", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED("error", "Unauthenticated!", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED("error", "You do not have permission!", HttpStatus.FORBIDDEN),
    INVALID_DOB("error", "Invalid date of birth", HttpStatus.BAD_REQUEST);

    private final String status;
    private final String message;
    private final HttpStatusCode statusCode;


}
