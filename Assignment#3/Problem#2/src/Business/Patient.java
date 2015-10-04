/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

public class Patient extends Person{
    
   private int patientId;
   private String primaryDocName;
   private String preferredPharmacy;
   public VitalSignHistory vitalSignHistory;
   
    public Patient(){
           super();
           vitalSignHistory = new VitalSignHistory();
    }    

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

}
