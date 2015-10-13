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
public class StoreDirectory {
 
    private ArrayList<Store> storeList;

    public StoreDirectory() {
        storeList = new ArrayList<Store>();
    }

    public ArrayList<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(ArrayList<Store> storeList) {
        this.storeList = storeList;
    }

    public Store addStore(){
        Store s = new Store();
        storeList.add(s);
        return s;
    }
    
    public void removeStore(Store s){
        storeList.remove(s);
    }
    
    public Store searchStore(String keyword){
        for (Store store : storeList) {
            if(store.getStoreName().equals(keyword)){
                return store;
            }
        }
        return null;
    }
    
}
