package com.abenezer.veterinarymanagementsystem.model.entity;


import jakarta.persistence.Entity;

@Entity
public class VeterinaryDoctor extends User {

    private final String Certification;
    private Appointment appointment;

    public VeterinaryDoctor(String cert) {
        this.Certification = cert;
    }

    public VeterinaryDoctor() {

    }

    public String getCertification() {
        return Certification;
    }
}
