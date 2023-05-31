package com.example.trainrest.services;

import com.example.trainrest.models.Trains; import com.example.trainrest.repositories.TrainsRepository; import lombok.RequiredArgsConstructor; import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor public class TrainsService { private final TrainsRepository trainsRepository;

    public void addTrain(Trains t){
        trainsRepository.save(t);
    }

    public Trains findByName(String name){
        return trainsRepository.findByName(name);
    }

    public List<Trains> findAllTrains(){
        return trainsRepository.findAll();
    }
}




