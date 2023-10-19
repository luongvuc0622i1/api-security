package com.loginjwt.management.repository;

import com.loginjwt.management.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long> {
}