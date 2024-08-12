package com.example.demo.service.user;

import com.example.demo.model.user.AuthUser;
import com.example.demo.repository.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public void save(AuthUser signupDto) {
        userRepo.save(signupDto);
    }
    public AuthUser get(Integer id){
        return userRepo.get(id);
    }
    public Integer saveReturnId(AuthUser user){
        return userRepo.saveReturnId(user);
    }
    public Optional<AuthUser> getByUsername(String username) {
        return userRepo.getByUsername(username);
    }
}
