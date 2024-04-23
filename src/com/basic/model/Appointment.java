package com.basic.model;

import java.time.LocalDate;

class Appointment {
    private int patientId;
    private int doctorId;
    private LocalDate date;

    public Appointment(int patientId, int doctorId, LocalDate date) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public LocalDate getDate() {
        return date;
    }
}