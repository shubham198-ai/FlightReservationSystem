package com.example.FlightReservationSystem.service;

import com.example.FlightReservationSystem.dto.RequestReservation;
import com.example.FlightReservationSystem.entity.Reservation;

public interface ReservationService {
Reservation bookFlight(RequestReservation reservation);
}
