package com.example.demo.repository;

import com.example.demo.model.Movie;

import java.util.List;

public class MovieRepo implements BaseRepo<Movie>{
    @Override
    public void save(Movie movie) {

    }

    @Override
    public Movie get(Integer id) {
        return null;
    }

    @Override
    public List<Movie> getAll() {
        return List.of();
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
