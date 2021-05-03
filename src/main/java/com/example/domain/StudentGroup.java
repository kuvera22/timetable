package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;
import java.util.UUID;

@Table(name = "student_group")
@Entity
public class StudentGroup {
    @Id
    private UUID id;
    private String name;
    private Integer numberOfStudents;
    @ManyToOne
    private Speciality speciality;

    public StudentGroup() {
    }

    public StudentGroup(UUID id, String name, Integer numberOfStudents, Speciality speciality) {
        this.id = id;
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.speciality = speciality;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGroup that = (StudentGroup) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(numberOfStudents, that.numberOfStudents) && Objects.equals(speciality, that.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, numberOfStudents, speciality);
    }
}
