 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.IndividualUser;

import Business.Drug.DrugCatalog;
import Business.Employee.Employee;
import Business.Orders.MasterOrderCatalog;

/**
 *
 * @author Ankit Bhayani
 */
public class StorePharmacist extends Employee{
    public DrugCatalog storeDrugCatalog;
    private  MasterOrderCatalog storeDrugOrders;

    public StorePharmacist() {
        storeDrugCatalog = new DrugCatalog();
        storeDrugOrders = new MasterOrderCatalog();
    }

    public MasterOrderCatalog getStoreDrugOrders() {
        return storeDrugOrders;
    }

    public void setStoreDrugOrders(MasterOrderCatalog storeDrugOrders) {
        this.storeDrugOrders = storeDrugOrders;
    }

    
    public DrugCatalog getStoreDrugCatalog() {
        return storeDrugCatalog;
    }

    public void setStoreDrugCatalog(DrugCatalog storeDrugCatalog) {
        this.storeDrugCatalog = storeDrugCatalog;
    }
    
    
    
}
