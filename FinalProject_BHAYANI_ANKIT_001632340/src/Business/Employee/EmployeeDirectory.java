/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.Employee.EmployeeType;
import Business.IndividualUser.Doctor;
import Business.IndividualUser.Patient;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
    private int lastEmployeeID;
    
    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public int getLastEmployeeID() {
        return lastEmployeeID;
    }

    public void setLastEmployeeID(int lastEmployeeID) {
        this.lastEmployeeID = lastEmployeeID;
    }
    
    
    
    public Employee createEmployee(EmployeeType employeeType){
        Employee employee = null;
        if (employeeType.getValue().equals(EmployeeType.Doctor.getValue())){
            employee = new Doctor();
            employeeList.add(employee);
        }
        /*else if (employeeType.getValue().equals(EmployeeType.Lab.getValue())){
            employee = new LabEmployee();
            employeeList.add(employee);
        }
        else if (employeeType.getValue().equals(EmployeeType.Nurse.getValue())){
            employee = new NurseEmployee();
            employeeList.add(employee);
        }
        else if (employeeType.getValue().equals(EmployeeType.Receptionist.getValue())){
            employee = new ReceptionistEmployee();
            employeeList.add(employee);
        }*/
        else if (employeeType.getValue().equals(EmployeeType.Patient.getValue())){
            employee = new Patient();
            employeeList.add(employee);
            
        }
        else {
            employee = new Employee();
            employeeList.add(employee);
        }
        
        return employee;
        
        
    }
}