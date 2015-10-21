/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logic;

import java.util.ArrayList;

/**
 *
 * @author Ankit Bhayani
 */
public class SalesPersonDirectory {
    
    private ArrayList<SalesPerson> employeeList;

    public SalesPersonDirectory() {
        employeeList = new ArrayList<SalesPerson>();
    }

    public ArrayList<SalesPerson> getemployeeList() {
        return employeeList;
    }

    public void setemployeeList(ArrayList<SalesPerson> employeeList) {
        this.employeeList = employeeList;
    }
    
    public SalesPerson addEmployee(){
        SalesPerson Employee = new SalesPerson();
        employeeList.add(Employee);
        return Employee;
        
    }

   public void deleteEmployee(SalesPerson e){
        this.employeeList.remove(e);
    }
    
    
    
}
