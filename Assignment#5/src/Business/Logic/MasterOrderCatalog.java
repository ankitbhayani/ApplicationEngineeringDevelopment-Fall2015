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
public class MasterOrderCatalog {
    
    private ArrayList<Order> orders;

    public MasterOrderCatalog() {
        orders = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    
    public Order addOrder(Order o){
        orders.add(o);
        return o;
    }
    
}
