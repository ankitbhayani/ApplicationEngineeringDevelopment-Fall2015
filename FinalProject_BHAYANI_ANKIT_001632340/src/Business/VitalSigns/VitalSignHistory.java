/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import java.util.ArrayList;

/**
 *
 * @author Ankit Bhayani
 */
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
    
        
    public VitalSign addVitalSign(){
        VitalSign vitalSign= new VitalSign();
        vitalSignHistory.add(vitalSign);
        return vitalSign;
    }
    
    public void removeVitalSign(VitalSign vitalSign){
        vitalSignHistory.remove(vitalSign);
    }
}
