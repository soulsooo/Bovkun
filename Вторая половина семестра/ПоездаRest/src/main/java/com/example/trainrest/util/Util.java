package com.example.trainrest.util;

import com.example.trainrest.models.Transportation;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<Transportation> addCarriages(Trains trains, int amountCarr, int seats) {
        List<Transportation> transportations = new ArrayList<>();
        for (int i = 0; i < amountCarr; i++) {
            List<Boolean> seatsAvailability = new ArrayList<>();
            for (int j = 0; j < seats; j++) {
                seatsAvailability.add(true);
            }
            Transportation transportation = new Transportation(seatsAvailability);
            transportations.add(transportation);
        }
        return transportations;
    }
}