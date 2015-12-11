/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Ankit Bhayani
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }
    
    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        
        if(type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Pharmacy){
            enterprise = new PharmacyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.DrugManufacturer){
            enterprise = new DrugManufacturerEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.DrugAdministration){
            enterprise = new DrugAdministrationEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public Enterprise searchEnterprise(String eName){
        for (Enterprise e : enterpriseList) {
            if(e.getName().equals(eName)){
                return e;
            }
        }
        return null;
    }
    
    public void removeEnterprise(Enterprise e){
        enterpriseList.remove(e);
    }
    
    

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
}
