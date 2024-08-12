package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hall {
    private Integer id;
    private String name;
    private Integer seatsCount;
    private Boolean isActive;
}
