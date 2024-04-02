package org.doctorapp.client;

import org.doctorapp.exception.DoctorNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

import java.util.List;

public class User {
    public static void main(String[] args) {
        IDoctorService doctorService = new DoctorServiceImpl();
        // enum constant
//        Specialization specialization = Specialization.DERMA;
//        String speciality = specialization.getSpeciality();
//        Doctor doctor = new Doctor("Kavitha",speciality,1800,8,10);
//        Doctor doctor1 = new Doctor("Sridhar",speciality,2000,9,15);
//        Doctor doctor2 = new Doctor("Likhith",speciality,1900,9,13);
//        Doctor doctor3 = new Doctor("Chida",speciality,1700,8,14);
//        Doctor doctor4 = new Doctor("Amogh",speciality,1600,9,9);
//        doctorService.addDoctor(doctor);
//        doctorService.addDoctor(doctor1);
//        doctorService.addDoctor(doctor2);
//        doctorService.addDoctor(doctor3);
//        doctorService.addDoctor(doctor4);
          List<Doctor> doctorList = doctorService.getAll();
          for (Doctor doctor : doctorList){
              System.out.println(doctor);
          }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("By Speciality");

        try {
            doctorList = doctorService.getBySpeciality("Neurologist");
            for (Doctor doctor : doctorList){
                System.out.println(doctor);
            }
        } catch (DoctorNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("By Speciality and Experience");

        try {
            doctorList = doctorService.getBySpecialityAndExp("Oncologist",12);
            for (Doctor doctor : doctorList){
                System.out.println(doctor);
            }
        } catch (DoctorNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("By Speciality and Name");


        try {
            doctorList = doctorService.getBySpecialityAndNameContains("Neurologist","l");
            for (Doctor doctor : doctorList){
                System.out.println(doctor);
            }
        } catch (DoctorNotFoundException e) {
            e.printStackTrace();
        }



        System.out.println("----------------------------------------------------------------------------");
        System.out.println("By Speciality and Fees");


        try {
            doctorList = doctorService.getBySpecialityAndLessFees("Oncologist",2000);
            for (Doctor doctor : doctorList){
                System.out.println(doctor);
            }
        } catch (DoctorNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("By Speciality and ratings");


        try {
            doctorList = doctorService.getBySpecialityAndRatings("NEUROLOGIST",8);
            for (Doctor doctor : doctorList){
                System.out.println(doctor);
            }
        } catch (DoctorNotFoundException e) {
            e.printStackTrace();
        }
    }
}
