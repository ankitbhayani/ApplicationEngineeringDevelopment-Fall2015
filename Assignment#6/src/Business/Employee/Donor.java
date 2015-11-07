/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.BloodDonation;
import java.util.ArrayList;

/**
 *
 * @author Ankit Bhayani
 */
public class Donor extends Employee{
    private int age;
    private String bloodType;
    private ArrayList<BloodDonation> bloodDonationList;

    public Donor() {
        bloodDonationList = new ArrayList<>();
    }
   
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<BloodDonation> getBloodDonationList() {
        return bloodDonationList;
    }

    public void setBloodDonationList(ArrayList<BloodDonation> bloodDonationList) {
        this.bloodDonationList = bloodDonationList;
    }

    
}
