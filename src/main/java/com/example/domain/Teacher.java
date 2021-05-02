package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Teacher {
    @Id
    private UUID id;
}
