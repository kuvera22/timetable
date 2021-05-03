package com.example.dto;

import com.example.domain.SpecialityPlan;

import java.util.UUID;

public class SpecialityRq {
    private String name;
    private SpecialityPlan specialityPlan;
    private UUID departmentUUID;

    public SpecialityRq() {
    }

    public SpecialityRq(String name, SpecialityPlan specialityPlan, UUID departmentUUID) {
        this.name = name;
        this.specialityPlan = specialityPlan;
        this.departmentUUID = departmentUUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpecialityPlan getSpecialityPlan() {
        return specialityPlan;
    }

    public void setSpecialityPlan(SpecialityPlan specialityPlan) {
        this.specialityPlan = specialityPlan;
    }

    public UUID getDepartmentUUID() {
        return departmentUUID;
    }

    public void setDepartmentUUID(UUID departmentUUID) {
        this.departmentUUID = departmentUUID;
    }
}
