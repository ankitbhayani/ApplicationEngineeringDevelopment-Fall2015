/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ankit Bhayani
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private String enterpriseCity;
    private String enterpriseAddress;
    private String enterpriseMap;
    private OrganizationDirectory organizationDirectory;

    public Enterprise(String name,EnterpriseType enterpriseType) {
        super(name);
        this.enterpriseType = enterpriseType;
        organizationDirectory = new OrganizationDirectory();
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getEnterpriseMap() {
        return enterpriseMap;
    }

    public void setEnterpriseMap(String enterpriseMap) {
        this.enterpriseMap = enterpriseMap;
    }

    
    public String getEnterpriseCity() {
        return enterpriseCity;
    }

    public void setEnterpriseCity(String enterpriseCity) {
        this.enterpriseCity = enterpriseCity;
    }
    
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        Pharmacy("Pharmacy"),
        DrugManufacturer("DrugManufacturer"),
        //Insurance("Insurance"),
        DrugAdministration("DrugAdministration");
                
        public String value;

        public String getValue() {
            return value;
        }
        
        
        private EnterpriseType(String  value){
            this.value=value;
        }

        @Override
        public String toString() {
            return  value;
        }
        
        
    }
    
    
    
    
    
}
