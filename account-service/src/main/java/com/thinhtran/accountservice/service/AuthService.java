package com.thinhtran.accountservice.service;

import com.thinhtran.accountservice.dto.request.AuthenticationRequest;

public interface AuthService {
    boolean authenticate(AuthenticationRequest request);

}
