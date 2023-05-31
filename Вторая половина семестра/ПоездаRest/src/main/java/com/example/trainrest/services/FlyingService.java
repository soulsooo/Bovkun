package com.example.trainrest.services;

import com.example.trainrest.models.Flying; import com.example.trainrest.repositories.FlyingRepository; import lombok.RequiredArgsConstructor; import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor public class FlyingService { private final FlyingRepository flyingRepository;

    public void addFlight(Flying f){ flyingRepository.save(f); }

    public List<Flying> findAllFlights(){ return flyingRepository.findAll(); } }
