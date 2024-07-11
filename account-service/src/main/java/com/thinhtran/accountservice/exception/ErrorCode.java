package com.thinhtran.accountservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_EXISTED(1001, "User existed!"),
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error!"),
    KEY_INVALID(1002, "Invalid message key!"),
    USERNAME_INVALID(1003, "Username must be at least 3 characters!"),
    PASSWORD_INVALID(1004, "Password must be in range 8 to 50 characters!");

    private final Integer code;
    private final String message;


}
