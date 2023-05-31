package com.example.trainrest.repositories;


import com.example.trainrest.models.Trains;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainsRepository extends JpaRepository<Trains,Long> {
    Trains findByName(String name);
}
