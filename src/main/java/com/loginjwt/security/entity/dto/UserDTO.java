package com.loginjwt.security.entity.dto;

import com.loginjwt.management.entity.Role;

public class UserDTO {
    private Long id;
    private String name;
    private Role role;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRoles() {
        return role;
    }

    public void setRoles(Role roles) {
        this.role = roles;
    }
}