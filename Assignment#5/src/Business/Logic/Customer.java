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
public class Customer {
   
    private String customerName;
    private static int count=0;
    private int customerID;
    private MasterOrderCatalog customerOrderList;
    private double salesvol=0;

    public void setSalesvol(double salesvol) {
        this.salesvol = salesvol;
    }

    public double getSalesvol() {
        return salesvol;
    }

    public Customer() {
        customerID=++count;
        customerOrderList = new MasterOrderCatalog();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public MasterOrderCatalog getCustomerOrderList() {
        return customerOrderList;
    }

    public void setCustomerOrderList(MasterOrderCatalog customerOrderList) {
        this.customerOrderList = customerOrderList;
    }



    @Override
    public String toString() {
        return customerName;
    }
    
}
