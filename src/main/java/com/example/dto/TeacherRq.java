package com.example.dto;

import com.example.domain.SubjectQuality;

import java.util.List;
import java.util.UUID;

public class TeacherRq {
    private String firstName;
    private String lastName;
    private List<SubjectQuality> subjectQuality;
    private UUID departmentUUID;

    public TeacherRq() {
    }

    public TeacherRq(String firstName, String lastName, List<SubjectQuality> subjectQuality, UUID departmentUUID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjectQuality = subjectQuality;
        this.departmentUUID = departmentUUID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<SubjectQuality> getSubjectQuality() {
        return subjectQuality;
    }

    public void setSubjectQuality(List<SubjectQuality> subjectQuality) {
        this.subjectQuality = subjectQuality;
    }

    public UUID getDepartmentUUID() {
        return departmentUUID;
    }

    public void setDepartmentUUID(UUID departmentUUID) {
        this.departmentUUID = departmentUUID;
    }
}
