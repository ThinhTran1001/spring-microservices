package com.thinhtran.accountservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_EXISTED("error", "User existed!"),
    UNCATEGORIZED_EXCEPTION("error", "Uncategorized error!"),
    KEY_INVALID("error", "Invalid message key!"),
    USERNAME_INVALID("error", "Username must be at least 3 characters!"),
    PASSWORD_INVALID("error", "Password must be in range 8 to 50 characters!"),
    USER_NOT_EXISTED("error", "User is not existed!"),
    UNAUTHENTICATED("error", "Unauthenticated!");

    private final String status;
    private final String message;


}
