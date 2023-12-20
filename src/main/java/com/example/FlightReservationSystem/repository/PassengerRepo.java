package com.example.FlightReservationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FlightReservationSystem.entity.Passenger;





public interface PassengerRepo extends JpaRepository<Passenger, Long> {

}
