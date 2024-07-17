package com.thinhtran.accountservice.mapper;

import com.thinhtran.accountservice.dto.request.RoleRequest;
import com.thinhtran.accountservice.dto.response.RoleResponse;
import com.thinhtran.accountservice.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
