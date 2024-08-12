package com.example.demo.repository;

import com.example.demo.model.Hall;

import java.util.List;

public class HallRepo implements BaseRepo<Hall>{
    @Override
    public void save(Hall hall) {

    }

    @Override
    public Hall get(Integer id) {
        return null;
    }

    @Override
    public List<Hall> getAll() {
        return List.of();
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
