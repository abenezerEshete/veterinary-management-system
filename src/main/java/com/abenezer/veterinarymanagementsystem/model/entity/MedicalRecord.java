package com.abenezer.veterinarymanagementsystem.model.entity;

import console.ConsoleUtil;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;


@Entity
public class MedicalRecord {

    private int recordID;
    private LocalDate date;
    private String treatment;
    private Pet pet;
    @Id
    private int id;


    public MedicalRecord(int recordID, LocalDate date, String treatment, Pet pet) {
        this.recordID = recordID;
        this.date = date;
        this.treatment = treatment;
        this.pet = pet;
    }

    public MedicalRecord(int recordID) {
        this.recordID = recordID;
    }

    public int getRecordID() {
        return recordID;
    }

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Pet getPets() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
