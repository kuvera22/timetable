package com.example.domain;

import java.util.UUID;

public class SubjectQuality {
    private String name;
    private Integer numberOfHours;
    private UUID departmentUUID;
    private SubjectType subjectType;

    public SubjectQuality() {
    }

    public SubjectQuality(String name, Integer numberOfHours, UUID departmentUUID, SubjectType subjectType) {
        this.name = name;
        this.numberOfHours = numberOfHours;
        this.departmentUUID = departmentUUID;
        this.subjectType = subjectType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(Integer numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public UUID getDepartmentUUID() {
        return departmentUUID;
    }

    public void setDepartmentUUID(UUID departmentUUID) {
        this.departmentUUID = departmentUUID;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(SubjectType subjectType) {
        this.subjectType = subjectType;
    }
}
