/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.IndividualUser;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ankit Bhayani
 */
public class Doctor extends Employee{
    
    private String degree;
    private double rating;
    private UserAccount userAccount;
    private ArrayList<String> scheduleList;
    private int employeeid;
    //private static int count = 1000;


    public Doctor() {
        scheduleList = new ArrayList<String>();
      //  employeeid = count;
       // count++;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    
    public ArrayList<String> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(ArrayList<String> scheduleList) {
        this.scheduleList = scheduleList;
    }

    
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
    
    
}
