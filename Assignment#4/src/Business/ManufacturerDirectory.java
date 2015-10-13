/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abhishekashwathnarayanvenkat
 */
public class ManufacturerDirectory {

    private List<Manufacturer> manufacturerList;
    public ManufacturerDirectory() {
    
        manufacturerList = new ArrayList<Manufacturer>();
    }
    
    public List<Manufacturer> getManufacturerlist(){
        return manufacturerList;
    }
    
    public Manufacturer addManufacturer(){
        Manufacturer s = new Manufacturer();
        manufacturerList.add(s);
        return s;
    }
    
    public void removeManufacturer(Manufacturer s){
        manufacturerList.remove(s);
    }
    
    public Manufacturer searchManufacturer(String keyword){
        for (Manufacturer manufacturer : manufacturerList) {
            if(manufacturer.getManufactrerName().equals(keyword)){
                return manufacturer;
            }
        }
        return null;
    }
}
