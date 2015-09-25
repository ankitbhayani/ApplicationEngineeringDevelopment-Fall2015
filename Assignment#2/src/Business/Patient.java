/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

public class Patient {
    
   private String patientName;
   private String patientId;
   private int age;
   private String primaryDocName;
   private String preferredPharmacy;
   //private ArrayList<VitalSign> vitalSignHistory;
   public VitalSignHistory vitalSignHistory;
   
    public Patient(){
        //vitalSignHistory = new ArrayList<>();
        vitalSignHistory = new VitalSignHistory();
    }    

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrimaryDocName() {
        return primaryDocName;
    }

    public void setPrimaryDocName(String primaryDocName) {
        this.primaryDocName = primaryDocName;
    }

    public String getPreferredPharmacy() {
        return preferredPharmacy;
    }

    public void setPreferredPharmacy(String preferredPharmacy) {
        this.preferredPharmacy = preferredPharmacy;
    }

    /*public ArrayList<VitalSign> getVitalSignHistory() {
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
