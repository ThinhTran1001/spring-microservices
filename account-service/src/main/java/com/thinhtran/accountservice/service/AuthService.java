package com.thinhtran.accountservice.service;

import com.nimbusds.jose.JOSEException;
import com.thinhtran.accountservice.dto.request.AuthenticationRequest;
import com.thinhtran.accountservice.dto.request.IntrospectRequest;
import com.thinhtran.accountservice.dto.request.LogOutRequest;
import com.thinhtran.accountservice.dto.request.RefreshRequest;
import com.thinhtran.accountservice.dto.response.AuthenticationResponse;
import com.thinhtran.accountservice.dto.response.IntrospectResponse;

import java.text.ParseException;

public interface AuthService {
    AuthenticationResponse authenticate(AuthenticationRequest request);

    IntrospectResponse introspect(IntrospectRequest request) throws JOSEException, ParseException;

    void logout(LogOutRequest request) throws ParseException, JOSEException;

    AuthenticationResponse refreshToken(RefreshRequest request) throws ParseException, JOSEException;

}
