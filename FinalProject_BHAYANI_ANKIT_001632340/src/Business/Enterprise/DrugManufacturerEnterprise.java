/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Drug.DrugCatalog;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ankit Bhayani
 */
public class DrugManufacturerEnterprise extends Enterprise{

    private DrugCatalog manuFacturerDrugCatalog;

    public DrugCatalog getManuFacturerDrugCatalog() {
        return manuFacturerDrugCatalog;
    }

    public void setManuFacturerDrugCatalog(DrugCatalog manuFacturerDrugCatalog) {
        this.manuFacturerDrugCatalog = manuFacturerDrugCatalog;
    }
    
    public DrugManufacturerEnterprise(String name) {
        super(name, EnterpriseType.DrugManufacturer);
        manuFacturerDrugCatalog = new DrugCatalog();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      return null;  
    }
    
}
