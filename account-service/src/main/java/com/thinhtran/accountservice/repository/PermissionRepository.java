package com.thinhtran.accountservice.repository;

import com.thinhtran.accountservice.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, String> {
}
