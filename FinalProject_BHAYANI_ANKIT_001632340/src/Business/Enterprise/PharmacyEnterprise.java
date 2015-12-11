/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Drug.DrugCatalog;
import Business.Orders.MasterOrderCatalog;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ankit Bhayani
 */
public class PharmacyEnterprise extends Enterprise{
     
    private DrugCatalog pharmaDrugCatalog;
    private MasterOrderCatalog masterOrderCatalog;

    public DrugCatalog getPharmaDrugCatalog() {
        return pharmaDrugCatalog;
    }

    public void setPharmaDrugCatalog(DrugCatalog pharmaDrugCatalog) {
        this.pharmaDrugCatalog = pharmaDrugCatalog;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    
    
    public PharmacyEnterprise(String name) {
        super(name, EnterpriseType.Pharmacy);
        pharmaDrugCatalog = new DrugCatalog();
        masterOrderCatalog = new MasterOrderCatalog();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      return null;  
    }
    
}
