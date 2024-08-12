package com.example.demo.service.user;

import com.example.demo.model.user.Role;
import com.example.demo.repository.user.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoleService {
    @Autowired
    RoleRepo roleRepo;

    public List<Role> getByUser(Integer userId){
        return roleRepo.getByUser(userId);
    }
}
