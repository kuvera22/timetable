package com.example.domain;

import java.util.List;

public class SpecialityPlan {
    private List<SubjectQuality> subjectQuality;
    private Integer numOfYear;

    public SpecialityPlan() {
    }

    public SpecialityPlan(List<SubjectQuality> subjectQuality, Integer numOfYear) {
        this.subjectQuality = subjectQuality;
        this.numOfYear = numOfYear;
    }

    public List<SubjectQuality> getSubjectQuality() {
        return subjectQuality;
    }

    public void setSubjectQuality(List<SubjectQuality> subjectQuality) {
        this.subjectQuality = subjectQuality;
    }

    public Integer getNumOfYear() {
        return numOfYear;
    }

    public void setNumOfYear(Integer numOfYear) {
        this.numOfYear = numOfYear;
    }
}
