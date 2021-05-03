package com.example.repository;

import com.example.domain.Timeslot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TimeslotRepository extends JpaRepository<Timeslot, UUID> {
}
