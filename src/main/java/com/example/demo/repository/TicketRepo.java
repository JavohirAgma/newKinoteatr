package com.example.demo.repository;

import com.example.demo.model.Ticket;

import java.util.List;

public class TicketRepo implements BaseRepo<Ticket>{
    @Override
    public void save(Ticket ticket) {

    }

    @Override
    public Ticket get(Integer id) {
        return null;
    }

    @Override
    public List<Ticket> getAll() {
        return List.of();
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
