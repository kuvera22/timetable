package com.example.repository;

import com.example.domain.StudentGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentGroupRepository extends JpaRepository<StudentGroup, UUID> {
}
