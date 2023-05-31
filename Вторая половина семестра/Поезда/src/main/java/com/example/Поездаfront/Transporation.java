package com.example.trainfront;

import java.util.List;

public class Transportation {
    private Long id;
    List<Boolean> freeSeats;

    public Carriage(Long id, List<Boolean> freeSeats) {
        this.id = id;
        this.freeSeats = freeSeats;
    }

    public Transportation() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Boolean> getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(List<Boolean> freeSeats) {
        this.freeSeats = freeSeats;
    }
}
