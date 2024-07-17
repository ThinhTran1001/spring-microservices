package com.thinhtran.accountservice.mapper;

import com.thinhtran.accountservice.dto.request.PermissionRequest;
import com.thinhtran.accountservice.dto.request.UserCreateRequest;
import com.thinhtran.accountservice.dto.request.UserUpdateRequest;
import com.thinhtran.accountservice.dto.response.PermissionResponse;
import com.thinhtran.accountservice.dto.response.UserResponse;
import com.thinhtran.accountservice.entity.Permission;
import com.thinhtran.accountservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
