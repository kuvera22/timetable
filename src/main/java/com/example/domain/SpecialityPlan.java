package com.example.domain;

public class SpecialityPlan {
    private SubjectQuality subjectQuality;
    private Integer numOfYear;

    public SpecialityPlan() {
    }

    public SpecialityPlan(SubjectQuality subjectQuality, Integer numOfYear) {
        this.subjectQuality = subjectQuality;
        this.numOfYear = numOfYear;
    }

    public SubjectQuality getSubjectQuality() {
        return subjectQuality;
    }

    public void setSubjectQuality(SubjectQuality subjectQuality) {
        this.subjectQuality = subjectQuality;
    }

    public Integer getNumOfYear() {
        return numOfYear;
    }

    public void setNumOfYear(Integer numOfYear) {
        this.numOfYear = numOfYear;
    }
}
