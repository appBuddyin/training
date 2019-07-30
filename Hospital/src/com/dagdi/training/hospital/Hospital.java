package com.dagdi.training.hospital;
import com.dagdi.training.hospital.hall.Hall;
import com.dagdi.training.hospital.doctor.Doctor;
import com.dagdi.training.hospital.patient.Patient;

public class Hospital {
    Reception reception;
    public void treatPatient(Patient patient){
        reception.allocate(patient);
    }

    public static void main (String[] args){
        Doctor[] doctors=new Doctor[8];
        doctors[0]=new Doctor("Ram","Fever");
        doctors[1]=new Doctor("Nigam","Kidney");
        doctors[2]=new Doctor("Shubham","Heart");
        doctors[3]=new Doctor("Rohit","lever");
        doctors[4]=new Doctor("Harshi","Mind");
        doctors[5]=new Doctor("Puja","Bones");
        doctors[6]=new Doctor("Neha","Ashthama");
        doctors[7]=new Doctor("Nitish","Cold");
        Reception rc =new Reception(new Hall(doctors),doctors);
        Hospital hospital = new Hospital();
        hospital.reception = rc;

        Patient patient = new Patient();
        patient.patientName = "nigam";
        patient.problem="mantle problem";
        hospital.treatPatient(patient);
    }

}

