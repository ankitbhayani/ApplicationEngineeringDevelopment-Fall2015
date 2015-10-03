/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aedfall2015assignment3q1;

import java.util.ArrayList;

/**
 *
 * @author Ankit Bhayani
 */
public class SupplierDirectory {
    
    public ArrayList<Supplier> supplierList;

    public SupplierDirectory(){
        supplierList = new ArrayList<>();
    }
    
    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }

    public Supplier addSupplier(String sName, int sId){
        Supplier supplier = new Supplier(sName, sId);
        supplierList.add(supplier);
        return supplier;
    }
    
    public void removeSupplier(Supplier s){
        supplierList.remove(s);
    }
         
          
}
