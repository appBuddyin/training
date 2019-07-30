package com.dagdi.training.hospital;

import com.dagdi.training.hospital.doctor.Doctor;
import com.dagdi.training.hospital.hall.Hall;
import com.dagdi.training.hospital.patient.Patient;

public class Reception {
    Hall halls;
    Doctor[] doctors;

    public Reception(Hall halls, Doctor[] doctors) {
        this.doctors = doctors;
        this.halls = halls;
    }

    public void allocate(Patient patient) {

        int doctorId = findDocter(patient.patientName);
        halls.treatPatient(patient, doctorId);
    }

    private int findDocter(String patientProblem){
        int doctorId = (int) (Math.random() * doctors.length);
        return doctorId;
    }
}


