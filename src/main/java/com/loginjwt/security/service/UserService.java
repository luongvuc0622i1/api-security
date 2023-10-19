package com.loginjwt.security.service;

import com.loginjwt.management.entity.User;
import com.loginjwt.management.repository.IUserRepository;
import com.loginjwt.security.entity.UserPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;

    public User findByUsername(String username) {
        for (User user : userRepository.findAll()) {
            if (Objects.equals(user.getUsername(), username)) {
                return user;
            }
        }
        return null;
    }

    public boolean add(User user) {
        for (User userExist : userRepository.findAll()) {
            if (Objects.equals(user.getId(), userExist.getId()) || Objects.equals(user.getUsername(), userExist.getUsername())) {
                return false;
            }
        }
        userRepository.save(user);
        return true;
    }

    public UserDetails loadUserByUsername(String username) {
        for (User user : userRepository.findAll()) {
            if (Objects.equals(user.getUsername(), username)) {
                return UserPrinciple.build(user);
            }
        }
        return null;
    }
}