package com.example.backend;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackendService {
    private BackendRepository repo;

    public List<Data> getAll() {
        return repo.findAll();

    }

}
