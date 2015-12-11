/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orders;

import Business.Drug.Drug;
import Business.IndividualUser.Patient;
import Business.IndividualUser.StorePharmacist;
import Business.WorkQueue.GetDiagnosisWorkRequest;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ankit Bhayani
 */
public class Order {
    
    private ArrayList<OrderItem> orderItems;
    private static int count=0;
    private int orderNumber;
    private double salesPersonComission=0;
    private double totalOrderValue=0;
    private String dateOrdered ;
    private StorePharmacist storePharmacist;
    private GetDiagnosisWorkRequest getDiagnosisWorkRequest;
    private Patient patient;
    private String status;

    public Order() {
        orderItems = new ArrayList<OrderItem>();
        count++;
        orderNumber=count;
    }

    public StorePharmacist getStorePharmacist() {
        return storePharmacist;
    }

    public void setStorePharmacist(StorePharmacist storePharmacist) {
        this.storePharmacist = storePharmacist;
    }

    public GetDiagnosisWorkRequest getGetDiagnosisWorkRequest() {
        return getDiagnosisWorkRequest;
    }

    public void setGetDiagnosisWorkRequest(GetDiagnosisWorkRequest getDiagnosisWorkRequest) {
        this.getDiagnosisWorkRequest = getDiagnosisWorkRequest;
    }

    
    
    public double getStorePharmacistComission() {
        return salesPersonComission;
    }

    public void setStorePharmacistComission(double salesPersonComission) {
        this.salesPersonComission = salesPersonComission;
    }

    public double getTotalOrderValue() {
        return totalOrderValue;
    }

    public void setTotalOrderValue(double totalOrderValue) {
        this.totalOrderValue = totalOrderValue;
    }

    public String getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(String dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public StorePharmacist getSalesperson() {
        return storePharmacist;
    }

    public void setSalesperson(StorePharmacist salesperson) {
        this.storePharmacist = salesperson;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient customer) {
        this.patient = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        

    public int getOrderNumber() {
        return orderNumber;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    
    public void removeOrderItem(OrderItem orderItem){
        orderItems.remove(orderItem);
    }
    
    public OrderItem addOrderItem(Drug drug, int salesPrice, int quantity){
        OrderItem orderItem = new OrderItem();
        orderItem.setDrug(drug);
        orderItem.setQuantity(quantity);
        orderItem.setSalesPrice(salesPrice);
        orderItems.add(orderItem);
        return orderItem;
    }

    public OrderItem searchOrderItem(String keyword){
        for (OrderItem oi : orderItems) {
            if(oi.getDrug().equals(keyword)){
                return oi;
            }
        }
        return null;
    }
    
    
    
    @Override
    public String toString() {
        return dateOrdered;
    }
    
    
            
}
