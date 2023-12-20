package com.example.FlightReservationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FlightReservationSystem.entity.Reservation;





public interface ReservationRepo extends JpaRepository<Reservation, Long> {

}
