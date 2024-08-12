package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseRepo<M>{

    void save(M m);
    M get(Integer id);
    List<M> getAll();
    boolean delete(Integer id);
}
