/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logic;

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
    private SalesPerson salesperson;
    private Customer customer;
    private String status;

    public Order() {
        orderItems = new ArrayList<OrderItem>();
        count++;
        orderNumber=count;
    }

    public double getSalesPersonComission() {
        return salesPersonComission;
    }

    public void setSalesPersonComission(double salesPersonComission) {
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

    public SalesPerson getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(SalesPerson salesperson) {
        this.salesperson = salesperson;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
    
    public OrderItem addOrderItem(Product product, int salesPrice, int quantity){
        OrderItem orderItem = new OrderItem();
        orderItem.setProduct(product);
        orderItem.setQuantity(quantity);
        orderItem.setSalesPrice(salesPrice);
        orderItems.add(orderItem);
        return orderItem;
    }

    public OrderItem searchOrderItem(String keyword){
        for (OrderItem oi : orderItems) {
            if(oi.getProduct().equals(keyword)){
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
