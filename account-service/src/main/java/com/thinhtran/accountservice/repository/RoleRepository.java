package com.thinhtran.accountservice.repository;

import com.thinhtran.accountservice.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
