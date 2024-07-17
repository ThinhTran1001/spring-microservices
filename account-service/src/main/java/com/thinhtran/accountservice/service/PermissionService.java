package com.thinhtran.accountservice.service;

import com.thinhtran.accountservice.dto.request.PermissionRequest;
import com.thinhtran.accountservice.dto.response.PermissionResponse;

import java.util.List;

public interface PermissionService {

    PermissionResponse create(PermissionRequest request);

    List<PermissionResponse> getAll();

    void delete(String permission);
}
