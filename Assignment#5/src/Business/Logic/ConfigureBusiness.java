/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logic;

/**
 *
 * @author Ankit Bhayani
 */
public class ConfigureBusiness {
    
    public static Business initializeBusiness(){
        Business business = Business.getInstance();
        
        SalesPerson employee = business.getEmployeeDirectory().addEmployee();
        employee.setFirstName("Admin");
        employee.setLastName("Admin Last");
        employee.setOrganization("NEU");
        
        UserAccount ua = business.getUserDirectory().addUserAccount();
        ua.setUserName("admin");
        ua.setPassword("admin");
        ua.setPerson(employee);
        ua.setRole(UserAccount.ADMIN_ROLE);
        ua.setIsActive("Yes");
        
        return business;
        
    }
}
