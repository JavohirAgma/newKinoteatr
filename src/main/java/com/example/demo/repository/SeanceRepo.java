package com.example.demo.repository;

import com.example.demo.model.Seance;

import java.util.List;

public class SeanceRepo implements BaseRepo<Seance>{
    @Override
    public void save(Seance seance) {

    }

    @Override
    public Seance get(Integer id) {
        return null;
    }

    @Override
    public List<Seance> getAll() {
        return List.of();
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
