package com.dagdi.training.hospital.hall;
import com.dagdi.training.hospital.patient.Patient;
import com.dagdi.training.hospital.doctor.Doctor;

public class Hall {
    public Doctor[] doctors;

    public Hall(Doctor[] doctors){
        this.doctors =doctors;

    }
    public void treatPatient(Patient patient, int doctorId) {
        System.out.println("Welcome "+patient.patientName+" you are in treatment room and i am doctor "+doctors[doctorId].name);

    }
}
