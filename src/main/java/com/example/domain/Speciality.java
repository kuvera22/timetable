package com.example.domain;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class Speciality {
    @Id
    private UUID id;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private SpecialityPlan specialityPlan;
    @OneToMany
    private List<StudentGroup> studentGroups;

    public Speciality() {
    }

    public Speciality(UUID id, SpecialityPlan specialityPlan, List<StudentGroup> studentGroups) {
        this.id = id;
        this.specialityPlan = specialityPlan;
        this.studentGroups = studentGroups;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public SpecialityPlan getSpecialityPlan() {
        return specialityPlan;
    }

    public void setSpecialityPlan(SpecialityPlan specialityPlan) {
        this.specialityPlan = specialityPlan;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speciality that = (Speciality) o;
        return Objects.equals(id, that.id) && Objects.equals(specialityPlan, that.specialityPlan) && Objects.equals(studentGroups, that.studentGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, specialityPlan, studentGroups);
    }
}
