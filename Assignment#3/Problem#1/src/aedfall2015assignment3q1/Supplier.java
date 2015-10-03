/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aedfall2015assignment3q1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ankit Bhayani
 */
public class Supplier {
    
    private String supplierName;
    private int supplierID;
    
    public ProductCatalog productCatalog;

    public Supplier(String s, int id){
        productCatalog = new ProductCatalog();
        supplierName = s;
        supplierID = id;
    }
    
        
    public void askForAddingProd(){
        System.out.println("Do you want to add products for "+ supplierName+" supplier (yes/no)?");
        
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
                
        if(s.equalsIgnoreCase("yes")){
            addproducts(supplierName);
        }    
        else
            System.out.println("Products need not to be stored at this time");
        
    }
         
    public void addproducts(String no){
        
        switch(no)
        {
            case "Dell":  
            productCatalog.addProduct("Inspiron Laptops ",700);
            productCatalog.addProduct("New Dell Desktops",300);
            productCatalog.addProduct("Dell Venue Tablets ",200);
            productCatalog.addProduct("Electronic Accessories",500);
            productCatalog.addProduct("Battery Replacement",50);
            productCatalog.addProduct("Software Upgrades",100);
            productCatalog.addProduct("Dell Chromebooks",400);
            productCatalog.addProduct("Dell Monitors   ",400);
            productCatalog.addProduct("Dell Printers   ",250);
            productCatalog.addProduct("Dell Gift Cards ",100);
            break;
                      
            
            case "HP":  
            productCatalog.addProduct("Envy Laptops ",500);
            productCatalog.addProduct("HP Desktops",300);
            productCatalog.addProduct("Stream Tablets ",200);
            productCatalog.addProduct("Accessories",500);
            productCatalog.addProduct("Replacement",50);
            productCatalog.addProduct("OS Upgrades",100);
            productCatalog.addProduct("HP Chromebooks",400);
            productCatalog.addProduct("HP Monitors",400);
            productCatalog.addProduct("HP Printers",250);
            productCatalog.addProduct("HP Gift Cards",100);
            break;
                
            case "Toshiba":  
            productCatalog.addProduct("Satellite Laptops ",500);
            productCatalog.addProduct("Toshiba Desktops",300);
            productCatalog.addProduct("New Encore Tablets  ",200);
            productCatalog.addProduct("Electronic Accessories",500);
            productCatalog.addProduct("Battery Replacement",50);
            productCatalog.addProduct("Hardware Upgrades",100);
            productCatalog.addProduct("Toshiba Chromebooks ",400);
            productCatalog.addProduct("Toshiba Monitors",400);
            productCatalog.addProduct("Toshiba Jet Printers",250);
            productCatalog.addProduct("Toshiba Gift Cards",100);
            break;
            
            case "Apple":  
            productCatalog.addProduct("MacBook Pro",500);
            productCatalog.addProduct("Mac Desktops",300);
            productCatalog.addProduct("Apple ipad",200);
            productCatalog.addProduct("Accessories",500);
            productCatalog.addProduct("Replacement",50);
            productCatalog.addProduct("Mac Upgrades",100);
            productCatalog.addProduct("ipod shuffle",400);
            productCatalog.addProduct("Apple Monitors",400);
            productCatalog.addProduct("Apple Printers",250);
            productCatalog.addProduct("Apple Gifts ",100);
            break;
            
            case "Lenovo":  
            productCatalog.addProduct("Lenovo Ultrabooks ",900);
            productCatalog.addProduct("Lenovo Desktops   ",300);
            productCatalog.addProduct("Ideapads Lenovo ",200);
            productCatalog.addProduct("Lenovo Accessories",500);
            productCatalog.addProduct("Spftware Replacement",50);
            productCatalog.addProduct("OS/Other Upgrades  ",100);
            productCatalog.addProduct("Lenovo Chromebooks",400);
            productCatalog.addProduct("lenovo Monitors   ",400);
            productCatalog.addProduct("lenovo Printers   ",250);
            productCatalog.addProduct("lenovo Gift Cards",100);
            break;
            default:
                System.out.println("Please enter 5 or 10 as input");
        }
    }
    
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }
 
}
