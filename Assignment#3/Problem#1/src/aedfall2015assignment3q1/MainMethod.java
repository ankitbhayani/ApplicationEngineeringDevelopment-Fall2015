/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aedfall2015assignment3q1;

/**
 *
 * @author Ankit Bhayani
 */
public class MainMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int noOfProd;
        
        System.out.println("*********************Welcome to our application*********************");
        System.out.println("We are about to create supplier directory with 5 suppliers(Dell, HP, Toshiba, Apple and Lenovo)");
        
        SupplierDirectory supplierDirectory = new SupplierDirectory();
        supplierDirectory.addSupplier("Dell",1);
        supplierDirectory.addSupplier("HP",2);
        supplierDirectory.addSupplier("Toshiba",3);
        supplierDirectory.addSupplier("Apple",4);
        supplierDirectory.addSupplier("Lenovo",5);
        
        for(Supplier s: supplierDirectory.getSupplierList()){
            s.askForAddingProd();
            noOfProd= s.productCatalog.getProductList().size();
            
            System.out.println("<---------------Supplier " + s.getSupplierName()+ " has following " + noOfProd + " products:--------------->");
                if(noOfProd==0)
                   System.out.println("\t No products registered so far");
            
                for(Product p: s.productCatalog.getProductList()){
                   System.out.println("\t"+ p.getProductName() +"\t"+ p.getProductPrice());
                }                  
            System.out.println("<----------------------------------------------------------------->");
        }
                  
    }
    
}
