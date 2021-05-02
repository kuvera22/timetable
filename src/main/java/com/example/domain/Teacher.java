package com.example.domain;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.UUID;

@Entity
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class Teacher {
    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private List<SubjectQuality> subjectQuality;
    @ManyToOne
    private Department department;

    public Teacher() {
    }

    public Teacher(UUID id, String firstName, String lastName, List<SubjectQuality> subjectQuality, Department department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjectQuality = subjectQuality;
        this.department = department;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
