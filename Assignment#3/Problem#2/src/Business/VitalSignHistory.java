/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;


public class VitalSignHistory {
 
    private ArrayList<VitalSign> vitalSignHistory;
    
    public  VitalSignHistory(){
        vitalSignHistory = new ArrayList<>();
    }       

    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
        
    public VitalSign addVitalSign(float rr, float hr, float bp, float wt){
        VitalSign vitalSign= new VitalSign(rr,hr,bp,wt);
        vitalSignHistory.add(vitalSign);
        return vitalSign;
    }
    
    public void removeVitalSign(VitalSign vitalSign){
        vitalSignHistory.remove(vitalSign);
    }
}
