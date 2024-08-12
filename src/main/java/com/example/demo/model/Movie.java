package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Movie {
    private Integer id;
    private String name;
    private Integer duration;
    private Integer ownerId;
    private Boolean isActive;
}
