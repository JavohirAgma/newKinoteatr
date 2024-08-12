package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Seance {
    private Integer id;
    private Integer movieId;
    private Integer hallId;
    private Integer haveSeats;
    private LocalTime startTime;
    private LocalTime endTime;
    private Boolean isActive;
}