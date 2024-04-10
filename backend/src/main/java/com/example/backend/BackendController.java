package com.example.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
@RequiredArgsConstructor
public class BackendController {

    private final BackendService service;

    @GetMapping
    public List<Content> getAll(){
        return service.getAll();
    }
}
