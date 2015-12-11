/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private String city;
    private String enterpriseName;
    private String enterpriseMapLocation;
    private int id;
    private UserAccount userAccount;
    
    private static int count = 1;
    
    public Employee() {
        id = count;
        count++;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    
    public String getEnterpriseMapLocation() {
        return enterpriseMapLocation;
    }

    public void setEnterpriseMapLocation(String enterpriseMapLocation) {
        this.enterpriseMapLocation = enterpriseMapLocation;
    }

    
    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
    
    
    
    public enum EmployeeType{
        Admin("Admin"), 
        Doctor("Doctor"), 
        Receptionist("Receptionist"),
        Nurse("Nurse"),
        Lab("Lab"),
        PharmaManager("PharmaManager"),
        StorePharmacist("StorePharmacist"),
        DrugController("DrugController"),
        DrugInspector("DrugInspector"),
        Manufacturer("Manufacturer"),
        Patient("Patient");
        
        private String value;
        private EmployeeType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }
    
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
