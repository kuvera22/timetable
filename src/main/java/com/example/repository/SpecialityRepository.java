package com.example.repository;

import com.example.domain.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpecialityRepository extends JpaRepository<Speciality, UUID> {

}
