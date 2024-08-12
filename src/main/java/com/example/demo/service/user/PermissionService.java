package com.example.demo.service.user;

import com.example.demo.model.user.Permission;
import com.example.demo.repository.user.PermissionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PermissionService {
    @Autowired
    PermissionRepo permissionRepo;

    public List<Permission> getByRole(Integer roleId){
        return permissionRepo.getByRole(roleId);
    }
}
