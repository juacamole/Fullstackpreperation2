package com.example.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BackendService {

    private final BackendRepository repo;

    public List<Content> getAll() {
        return repo.findAll();

    }

}
