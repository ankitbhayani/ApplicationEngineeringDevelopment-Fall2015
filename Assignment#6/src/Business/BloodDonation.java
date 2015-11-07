/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import java.util.Date;

/**
 *
 * @author Ankit Bhayani
 */
public class BloodDonation {
    
    private String extractionDate;
    private String barCode;
    private String quantity;
    private Employee nurse;
    private Employee donor;

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    
    public Employee getDonor() {
        return donor;
    }

    public void setDonor(Employee donor) {
        this.donor = donor;
    }
    
    public String getExtractionDate() {
        return extractionDate;
    }

    public void setExtractionDate(String extractionDate) {
        this.extractionDate = extractionDate;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Employee getNurse() {
        return nurse;
    }

    public void setNurse(Employee nurse) {
        this.nurse = nurse;
    }

    @Override
    public String toString() {
        return extractionDate ;
    }
    
    
}
