package com.loginjwt.management.repository;

import com.loginjwt.management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}