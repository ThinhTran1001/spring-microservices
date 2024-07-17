package com.thinhtran.accountservice.service;

import com.thinhtran.accountservice.dto.request.RoleRequest;
import com.thinhtran.accountservice.dto.response.RoleResponse;
import com.thinhtran.accountservice.enums.Role;

import java.util.List;

public interface RoleService {
    RoleResponse create(RoleRequest request);

    List<RoleResponse> getAll();
}
