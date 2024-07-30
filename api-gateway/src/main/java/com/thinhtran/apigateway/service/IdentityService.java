package com.thinhtran.apigateway.service;


import com.thinhtran.apigateway.dto.response.ApiResponse;
import com.thinhtran.apigateway.dto.response.IntrospectResponse;
import reactor.core.publisher.Mono;

public interface IdentityService {

    public Mono<ApiResponse<IntrospectResponse>> introspect(String token);

}
