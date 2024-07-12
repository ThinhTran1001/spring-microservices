package com.thinhtran.accountservice.controller;

import com.thinhtran.accountservice.dto.request.AuthenticationRequest;
import com.thinhtran.accountservice.dto.response.ApiResponse;
import com.thinhtran.accountservice.dto.response.AuthenticationResponse;
import com.thinhtran.accountservice.service.AuthService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthController {

    AuthService authService;

    @PostMapping("/login")
    ApiResponse<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request){
        Boolean rs = authService.authenticate(request);
        return ApiResponse.<AuthenticationResponse>builder()
                .result(AuthenticationResponse.builder()
                        .isAuthenticated(rs)
                        .build())
                .build();
    }
}
