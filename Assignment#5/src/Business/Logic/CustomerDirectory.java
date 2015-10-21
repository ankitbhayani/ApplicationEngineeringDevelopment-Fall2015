/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ankit Bhayani
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory() {
    
        customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
       
    public Customer addCustomer(){
        Customer s = new Customer();
        customerList.add(s);
        return s;
    }
    
    public void removeCustomer(Customer s){
        customerList.remove(s);
    }
    
    public Customer searchCustomer(String keyword){
        for (Customer customer : customerList) {
            if(customer.getCustomerName().equals(keyword)){
                return customer;
            }
        }
        return null;
    }
    
}
