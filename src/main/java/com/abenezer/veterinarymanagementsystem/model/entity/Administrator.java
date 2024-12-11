package com.abenezer.veterinarymanagementsystem.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Administrator extends User {
    @Id
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
