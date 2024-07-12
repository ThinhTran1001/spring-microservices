package com.thinhtran.accountservice.service;

import com.nimbusds.jose.JOSEException;
import com.thinhtran.accountservice.dto.request.AuthenticationRequest;
import com.thinhtran.accountservice.dto.request.IntrospectRequest;
import com.thinhtran.accountservice.dto.response.AuthenticationResponse;
import com.thinhtran.accountservice.dto.response.IntrospectResponse;

import java.text.ParseException;

public interface AuthService {
    AuthenticationResponse authenticate(AuthenticationRequest request);

    IntrospectResponse introspect(IntrospectRequest request) throws JOSEException, ParseException;

}
