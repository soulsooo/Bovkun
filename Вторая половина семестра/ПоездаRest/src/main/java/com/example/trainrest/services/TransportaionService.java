package com.example.trainrest.services;

import com.example.trainrest.models.Transportation;
import com.example.trainrest.repositories.TransportainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportationService {

    @Autowired
    TransportainRepository transportationRepository;

    public void addTransportation(Transportation transportation){
        transportationRepository.save(transportation);
    }
}
