package com.example.domain;

import java.util.UUID;


public class DepartmentSubjects {
    private String name;
    private UUID departmentUUID;

    public DepartmentSubjects() {
    }

    public DepartmentSubjects(String name, UUID departmentUUID) {
        this.name = name;
        this.departmentUUID = departmentUUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getDepartmentUUID() {
        return departmentUUID;
    }

    public void setDepartmentUUID(UUID departmentUUID) {
        this.departmentUUID = departmentUUID;
    }
}
