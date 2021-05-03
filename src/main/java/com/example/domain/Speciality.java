package com.example.domain;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
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
    private String name;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private SpecialityPlan specialityPlan;
    @ManyToOne
    private Department department;

    public Speciality() {
    }

    public Speciality(UUID id, String name, SpecialityPlan specialityPlan, Department department) {
        this.id = id;
        this.name = name;
        this.specialityPlan = specialityPlan;
        this.department = department;
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

    public SpecialityPlan getSpecialityPlan() {
        return specialityPlan;
    }

    public void setSpecialityPlan(SpecialityPlan specialityPlan) {
        this.specialityPlan = specialityPlan;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speciality that = (Speciality) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(specialityPlan, that.specialityPlan) && Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, specialityPlan, department);
    }
}
