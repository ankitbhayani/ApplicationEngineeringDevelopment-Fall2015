/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Ankit Bhayani
 */
public class DonorDirectory {
 
    private ArrayList<Donor> donorList;

    
    public DonorDirectory() {
        donorList = new ArrayList<>();
    }
    
    public ArrayList<Donor> getDonorList() {
        return donorList;
    }

    public void setDonorList(ArrayList<Donor> donorList) {
        this.donorList = donorList;
    }
    
    public Donor createDonor(String name,int age, String bloodType){
        Donor donor = new Donor();
        donor.setName(name);
        donor.setAge(age);
        donor.setBloodType(bloodType);
        donorList.add(donor);
        return donor;
    }
    
    
    
}
