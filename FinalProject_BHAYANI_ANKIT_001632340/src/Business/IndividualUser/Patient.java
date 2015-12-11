/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.IndividualUser;

import Business.Employee.Employee;
import Business.Orders.MasterOrderCatalog;
import Business.VitalSigns.VitalSign;
import Business.VitalSigns.VitalSignHistory;
import Business.WorkQueue.GetDiagnosisWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author Ankit Bhayani
 */
public class Patient extends Employee{
    
    private String patientName;
    private String patientChronicDisease;
    private int age;
    private String streetAdress;
    private String town;
    private int zipCode;
    private String occupation;
    private String emailAddress;
    private long mobileNumber;
   
   //private String chronicDisease;
   //private ArrayList<VitalSign> vitalSignHistory;
   public VitalSignHistory vitalSignHistory;
   private VitalSign lastVitalSign;
   private ArrayList<GetDiagnosisWorkRequest> getDiagnosisWorkRequestList;
   private MasterOrderCatalog patientDrugOrders;
      
    public Patient(){
        //vitalSignHistory = new ArrayList<>();
        vitalSignHistory = new VitalSignHistory();
        getDiagnosisWorkRequestList = new ArrayList<>();
        patientDrugOrders = new MasterOrderCatalog();
        
    }    

    
    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    

    public ArrayList<GetDiagnosisWorkRequest> getGetDiagnosisWorkRequestList() {
        return getDiagnosisWorkRequestList;
    }

    public void setGetDiagnosisWorkRequestList(ArrayList<GetDiagnosisWorkRequest> getDiagnosisWorkRequestList) {
        this.getDiagnosisWorkRequestList = getDiagnosisWorkRequestList;
    }

    public MasterOrderCatalog getPatientDrugOrders() {
        return patientDrugOrders;
    }

    public void setPatientDrugOrders(MasterOrderCatalog patientDrugOrders) {
        this.patientDrugOrders = patientDrugOrders;
    }

    
    public VitalSign getLastVitalSign() {
        return lastVitalSign;
    }

    public void setLastVitalSign(VitalSign lastVitalSign) {
        this.lastVitalSign = lastVitalSign;
    }
    
    
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientChronicDisease() {
        return patientChronicDisease;
    }

    public void setPatientChronicDisease(String patientChronicDisease) {
        this.patientChronicDisease = patientChronicDisease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /*public String getChronicDisease() {
        return chronicDisease;
    }

    public void setChronicDisease(String chronicDisease) {
        this.chronicDisease = chronicDisease;
    }

    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
   
       public VitalSign addVitalSign(){
        VitalSign vitalSign= new VitalSign();
        vitalSignHistory.add(vitalSign);
        return vitalSign;
    }
    
    public void removeVitalSign(VitalSign vitalSign){
        vitalSignHistory.remove(vitalSign);
    }
  */   

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
}
