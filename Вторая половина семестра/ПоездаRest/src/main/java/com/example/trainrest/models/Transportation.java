
package com.example.trainrest.models;

import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue; import jakarta.persistence.GenerationType; import jakarta.persistence.Id; import jakarta.persistence.ElementCollection; import java.util.List;

@Entity public class Transportation { @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

    @ElementCollection
    private List<Boolean> freeSeats;

    public Transportation() {}

    public Transportation(Long id, List<Boolean> freeSeats) {
        this.id = id;
        this.freeSeats = freeSeats;
    }

    public Transportation(List<Boolean> freeSeats) {
        this.freeSeats = freeSeats;
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

    @Override
    public String toString() {
        return "Transportation{" +
                "id=" + id +
                ", freeSeats=" + freeSeats +
                '}';
    }
}
