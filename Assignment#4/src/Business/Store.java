/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Ankit Bhayani
 */
public class Store {
    private String storeName;
    private String storeLocation;
    private static int count=0;
    private int storeID;
    public DrugCatalog storeDrugCatalog;

    public Store() {
        storeDrugCatalog = new DrugCatalog();
        count++;
        storeID=count;
    }

    public int getStoreID() {
        return storeID;
    }

    @Override
    public String toString() {
        return storeName;
    }

      
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

     public DrugCatalog getStoreDrugCatalog() {
        return storeDrugCatalog;
    }

    public void setStoreDrugCatalog(DrugCatalog storeDrugCatalog) {
        this.storeDrugCatalog = storeDrugCatalog;
    }
    
    
}
