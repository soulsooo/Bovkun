
package com.example.trainrest.controllers;

import com.example.trainrest.models.Transportation;
import com.example.trainrest.models.Flying;
import com.example.trainrest.models.Trains;
import com.example.trainrest.models.TrainType;
import com.example.trainrest.services.TransportaionService;
import com.example.trainrest.services.FlyingService;
import com.example.trainrest.services.TrainsService;
import com.example.trainrest.util.Util;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainsController {
    @Autowired
    TrainsService trainsService;
    @Autowired
    FlyingService flyingService;
    @Autowired
    TransportaionService transportaionService;

    @PostMapping({"/trains"})
    public ResponseEntity<String> addTrain(@RequestParam(name = "name") String name,
                                           @RequestParam(name = "type") TrainType type,
                                           @RequestParam(name = "seats") int seats,
                                           @RequestParam(name = "carriage") int carriage) {
        Trains trains = new Trains(name, type);
        List<Transportation> transportation = Util.addCarriages(trains, carriage, seats);
        transportaionService.addCarriages(transportation);
        trainsService.addTrain(trains);
        return new ResponseEntity<>("Train added", HttpStatus.CREATED);
    }

    @PostMapping({"/flights"})
    public ResponseEntity<String> addFlight(@RequestParam(name = "cityFrom") String cityFrom,
                                            @RequestParam(name = "cityWhere") String cityWhere,
                                            @RequestParam(name = "departureDate") String departureDate,
                                            @RequestParam(name = "arrivalDate") String arrivalDate,
                                            @RequestParam(name = "departureTime") String departureTime,
                                            @RequestParam(name = "arrivalTime") String arrivalTime,
                                            @RequestParam(name = "basePrice") int basePrice,
                                            @RequestParam(name = "train") String trainName) {
        Trains trains = trainsService.findByName(trainName);
        Flying flying = new Flying(cityFrom, cityWhere, departureDate, departureTime, arrivalDate, arrivalTime, basePrice, trains);
        flyingService.addFlight(flying);
        return new ResponseEntity<>("Flying added", HttpStatus.CREATED);
    }

    @GetMapping({"/trains"})
    public ResponseEntity<List<Trains>> getAllTrains() {
        List<Trains> trains = trainsService.findAllTrains();
        return new ResponseEntity<>(trains, HttpStatus.OK);
    }

    @GetMapping({"/trains/names"})
    public ResponseEntity<List<String>> getAllTrainNames() {
        List<String> trainNames = trainsService.findAllTrains()
                .stream()
                .map(Trains::getName)
                .collect(Collectors.toList());
        return new ResponseEntity<>(trainNames, HttpStatus.OK);
    }

    @GetMapping({"/flights"})
    public ResponseEntity<List<Flying>> getAllFlights() {
        List<Flying> flights = flyingService.findAllFlights();
        return new ResponseEntity<>(flights, HttpStatus.OK);
    }

    @PostMapping({"/trains/tickets"})
    public ResponseEntity<String> buyTicket(@RequestParam(name = "train") String trainName) {
        Trains trains = trainsService.findByName(trainName);
        return new ResponseEntity<>("Ticket bought for Train " + trains.getName(), HttpStatus.OK);
    }
}