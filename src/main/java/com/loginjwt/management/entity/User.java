package com.loginjwt.management.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @OneToOne
    private Role role;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Integer status;

    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}