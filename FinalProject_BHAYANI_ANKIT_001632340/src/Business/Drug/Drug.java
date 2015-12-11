/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import java.util.Date;

/**
 *
 * @author Ankit Bhayani
 */
public class Drug {
    private String drugName;
    private float drugPrice;
    private int serialNo;
    private int count;
    private int avail;
    private int stock;
    private String manufacturerName;
    private String manufacturingDate;
    private String expiryDate;
    private String drugType;
    private String specification;
    private String dosage;
    private String dissolutionType;
    private boolean BelowThreshold=false;

    public boolean isBelowThreshold() {
        return BelowThreshold;
    }

    public void setBelowThreshold(boolean BelowThreshold) {
        this.BelowThreshold = BelowThreshold;
    }
    
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }
    

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public float getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(float drugPrice) {
        this.drugPrice = drugPrice;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDissolutionType() {
        return dissolutionType;
    }

    public void setDissolutionType(String dissolutionType) {
        this.dissolutionType = dissolutionType;
    }
    
    @Override
    public String toString() {
        return drugName; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
