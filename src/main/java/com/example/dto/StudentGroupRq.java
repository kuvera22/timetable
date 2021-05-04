package com.example.dto;

import java.util.UUID;

public class StudentGroupRq {
    private String name;
    private Integer numberOfStudents;
    private UUID specialityUUID;

    public StudentGroupRq() {
    }

    public StudentGroupRq(String name, Integer numberOfStudents, UUID specialityUUID) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.specialityUUID = specialityUUID;
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

    public UUID getSpecialityUUID() {
        return specialityUUID;
    }

    public void setSpecialityUUID(UUID specialityUUID) {
        this.specialityUUID = specialityUUID;
    }
}
