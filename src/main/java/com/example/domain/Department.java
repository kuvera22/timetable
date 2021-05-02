package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Table(name = "department")
@Entity
public class Department {
    @Id
    private UUID id;
    @OneToMany
    private List<Speciality> specialities;
    @OneToMany
    private List<StudentGroup> studentGroups;
}
