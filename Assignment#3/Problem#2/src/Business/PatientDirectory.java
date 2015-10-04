/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ankit Bhayani
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient addPatient(){
        Patient patient = new Patient();
        //JOptionPane.showMessageDialog(null, "Patient inserted!");
        patientList.add(patient);
        return patient;
    }
    
    public void deletePatient(Patient patient){
        patientList.remove(patient);
    }
    
    public Patient searchPatientByID(int id){
   
        for(Patient p : patientList){
                 //JOptionPane.showMessageDialog(null,p.getPatientId(),"Inside pdr",JOptionPane.INFORMATION_MESSAGE);
            if(p.getPatientId() == id){
                return p;
            }
        }
        return null;
        
        
    }
    
    
}
