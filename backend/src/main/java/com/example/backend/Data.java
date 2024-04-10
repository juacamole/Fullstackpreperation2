package com.example.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;


@Entity
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    String Content;
}
