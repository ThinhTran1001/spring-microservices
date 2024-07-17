package com.thinhtran.accountservice.service.impl;

import com.thinhtran.accountservice.dto.request.RoleRequest;
import com.thinhtran.accountservice.dto.response.RoleResponse;
import com.thinhtran.accountservice.mapper.RoleMapper;
import com.thinhtran.accountservice.repository.PermissionRepository;
import com.thinhtran.accountservice.repository.RoleRepository;
import com.thinhtran.accountservice.service.RoleService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RoleServiceImpl implements RoleService {

    RoleRepository roleRepository;

    RoleMapper roleMapper;

    PermissionRepository permissionRepository;

    @Override
    public RoleResponse create(RoleRequest request) {
        var role = roleMapper.toRole(request);

        var permissions = permissionRepository.findAllById(request.getPermissions());
        role.setPermissions(new HashSet<>(permissions));

        return roleMapper.toRoleResponse(roleRepository.save(role));
    }

    @Override
    public List<RoleResponse> getAll() {
        return roleRepository.findAll()
                .stream()
                .map(roleMapper::toRoleResponse)
                .toList();
    }
}
