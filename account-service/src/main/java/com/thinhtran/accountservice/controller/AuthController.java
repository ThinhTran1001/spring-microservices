package com.thinhtran.accountservice.controller;

import com.nimbusds.jose.JOSEException;
import com.thinhtran.accountservice.dto.request.AuthenticationRequest;
import com.thinhtran.accountservice.dto.request.IntrospectRequest;
import com.thinhtran.accountservice.dto.request.LogOutRequest;
import com.thinhtran.accountservice.dto.request.RefreshRequest;
import com.thinhtran.accountservice.dto.response.ApiResponse;
import com.thinhtran.accountservice.dto.response.AuthenticationResponse;
import com.thinhtran.accountservice.dto.response.IntrospectResponse;
import com.thinhtran.accountservice.service.AuthService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthController {

    AuthService authService;

    @PostMapping("/token")
    ApiResponse<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
        var rs = authService.authenticate(request);
        return ApiResponse.<AuthenticationResponse>builder()
                .result(rs)
                .build();
    }

    @PostMapping("/introspect")
    ApiResponse<IntrospectResponse> authenticate(@RequestBody IntrospectRequest request)
            throws ParseException, JOSEException {
        var rs = authService.introspect(request);
        return ApiResponse.<IntrospectResponse>builder()
                .result(rs)
                .build();
    }

    @PostMapping("/logout")
    ApiResponse<Void> logout(@RequestBody LogOutRequest request) throws ParseException, JOSEException {
        authService.logout(request);
        return ApiResponse.<Void>builder().build();
    }

    @PostMapping("/refresh")
    ApiResponse<AuthenticationResponse> authenticate(@RequestBody RefreshRequest request)
            throws ParseException, JOSEException {
        var rs = authService.refreshToken(request);
        return ApiResponse.<AuthenticationResponse>builder()
                .result(rs)
                .build();
    }
}
