package com.example.FlightReservationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FlightReservationSystem.entity.User;





public interface UserRepo extends JpaRepository<User, Long> {
User findByEmail( String emailId);
}
