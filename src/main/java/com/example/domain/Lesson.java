package com.example.domain;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

import javax.persistence.OneToOne;
import java.util.UUID;

@PlanningEntity
public class Lesson {
    private UUID id;
    private String name;
    @OneToOne
    private Teacher teacher;
    private StudentGroup studentGroup;

    @PlanningVariable(valueRangeProviderRefs = "timeslotRange")
    private Timeslot timeslot;

    @PlanningVariable(valueRangeProviderRefs = "roomRange")
    private Room room;

    private Lesson() {
    }


}