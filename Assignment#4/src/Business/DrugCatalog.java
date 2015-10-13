/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Ankit Bhayani
 */
public class DrugCatalog {
    
    public ArrayList<Drug> drugList;

    public DrugCatalog() {
        drugList = new ArrayList<Drug>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }
       
    public Drug addDrug(){
        Drug p = new Drug();
        drugList.add(p);
        return p;
    }
    
    public void removeDrug(Drug p){
        drugList.remove(p);
    }
    
    public Drug searchDrug(String dName){
        for (Drug drug : drugList) {
            if(drug.getDrugName().equals(dName)){
                return drug;
            }
        }
        return null;
    }
    
}
