/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.IndividualUser.Doctor;
import Business.IndividualUser.Patient;
import Business.VitalSigns.VitalSign;

/**
 *
 * @author Ankit Bhayani
 */
public class AppointmentWorkRequest extends WorkRequest {
 
    private String testResult;
    private Patient patient;
    private Doctor doctor;
    private VitalSign vitalSignsCapturedViaNurse;
    private String appointmentDateTime;

    public VitalSign getVitalSignsCapturedViaNurse() {
        return vitalSignsCapturedViaNurse;
    }

    public void setVitalSignsCapturedViaNurse(VitalSign vitalSignsCapturedViaNurse) {
        this.vitalSignsCapturedViaNurse = vitalSignsCapturedViaNurse;
    }

    
    public String getTestResult() {
        return testResult;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    
    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(String appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }
    
    
    
}
