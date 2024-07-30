package com.thinhtran.apigateway.service.impl;

import com.thinhtran.apigateway.dto.request.IntrospectRequest;
import com.thinhtran.apigateway.dto.response.ApiResponse;
import com.thinhtran.apigateway.dto.response.IntrospectResponse;
import com.thinhtran.apigateway.repository.IdentityClient;
import com.thinhtran.apigateway.service.IdentityService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class IdentityServiceImpl implements IdentityService {

    IdentityClient identityClient;


    @Override
    public Mono<ApiResponse<IntrospectResponse>> introspect(String token) {
        return identityClient.introspect(IntrospectRequest.builder()
                .token(token)
                .build());
    }
}
