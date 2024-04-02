package org.doctorapp.repository;

import org.doctorapp.exception.DoctorNotFoundException;
import org.doctorapp.exception.IdNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.util.DoctorDb;
import org.doctorapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
    public void addDoctor(Doctor doctor) {
        // establish connection
        // create a prepared statement
        // set values for placeholders
        // call execute

        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
        ){
            statement.setString(1,doctor.getDoctorName());
            statement.setString(2,doctor.getSpeciality());
            statement.setInt(3,doctor.getExperience());
            statement.setDouble(4,doctor.getFees());
            statement.setInt(5,doctor.getRatings());
            statement.execute();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateDoctor(int doctorId, double fees) {
        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);
            ){
            statement.setDouble(1,fees);
            statement.setInt(2,doctorId);

            int result = statement.executeUpdate();
            System.out.println(result+" updated");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteDoctor(int doctorId) {
        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);
        ){
            statement.setInt(1,doctorId);

            int result = statement.executeUpdate();
            System.out.println(result+" deleted");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Doctor findById(int doctorId) throws IdNotFoundException {
        Doctor doctor = null;
        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYID);
        ){
            statement.setInt(1,doctorId);
            try(ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    String doctorName = resultSet.getString("doctor_name");
                    int experience = resultSet.getInt("experience");
                    double fees = resultSet.getDouble("fees");
                    int ratings = resultSet.getInt("ratings");
                    String speciality = resultSet.getString("speciality");

                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setFees(fees);
                    doctor.setRatings(ratings);

                    doctor = new Doctor(doctorName,speciality,fees,ratings,experience);

                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return doctor;
    }

    public List<Doctor> findAll() {
        List<Doctor> doctorList = new ArrayList<>();
        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDALLQUERY);
            ResultSet resultSet = statement.executeQuery();
            ){
                while(resultSet.next()){
                    String doctorName = resultSet.getString("doctor_name");
                    String speciality = resultSet.getString("speciality");
                    double fees = resultSet.getDouble("fees");
                    int ratings = resultSet.getInt("ratings");
                    int experience = resultSet.getInt("experience");

                    Doctor doctor = new Doctor(doctorName,speciality,fees,ratings,experience);
                    doctorList.add(doctor);
                }
        }catch (Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    public List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException {
        List<Doctor> doctorList = new ArrayList<>();
        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITY);
        ){
            statement.setString(1,speciality);
            try(ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    String doctorName = resultSet.getString("doctor_name");
                    int experience = resultSet.getInt("experience");
                    double fees = resultSet.getDouble("fees");
                    int ratings = resultSet.getInt("ratings");

                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setFees(fees);
                    doctor.setRatings(ratings);

                    doctorList.add(doctor);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
        List<Doctor> doctorList = new ArrayList<>();
        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDEXP);
        ){
            statement.setString(1,speciality);
            statement.setInt(2,experience);
            try(ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    String doctorName = resultSet.getString("doctor_name");
                    double fees = resultSet.getDouble("fees");
                    int ratings = resultSet.getInt("ratings");

                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setFees(fees);
                    doctor.setRatings(ratings);

                    doctorList.add(doctor);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    public List<Doctor> findBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
        List<Doctor> doctorList = new ArrayList<>();
        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDFEES);
        ){
            statement.setString(1,speciality);
            statement.setDouble(2,fees);
            try(ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    String doctorName = resultSet.getString("doctor_name");
                    int experience = resultSet.getInt("experience");
                    int ratings = resultSet.getInt("ratings");
                    double fees1 = resultSet.getDouble("fees");

                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setFees(fees1);
                    doctor.setRatings(ratings);

                    doctorList.add(doctor);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
        List<Doctor> doctorList = new ArrayList<>();
        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDRATINGS);
        ){
            statement.setString(1,speciality);
            statement.setInt(2,ratings);
            try(ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    String doctorName = resultSet.getString("doctor_name");
                    int experience = resultSet.getInt("experience");
                    int ratings1 = resultSet.getInt("ratings");
                    double fees = resultSet.getDouble("fees");

                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setFees(fees);
                    doctor.setRatings(ratings1);

                    doctorList.add(doctor);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) throws DoctorNotFoundException {
        List<Doctor> doctorList = new ArrayList<>();
        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDNAME);
            ){
            statement.setString(1,speciality);
            statement.setString(2,"%"+doctorName+"%");
            try(ResultSet resultSet = statement.executeQuery();){
                while (resultSet.next()) {
                    String name = resultSet.getString("doctor_name");
                    int experience = resultSet.getInt("experience");
                    double fees = resultSet.getDouble("fees");
                    int ratings = resultSet.getInt("ratings");

                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(name);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setFees(fees);
                    doctor.setRatings(ratings);

                    doctorList.add(doctor);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }
}
