/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aedfall2015assignment3q1;

/**
 *
 * @author Ankit Bhayani
 */
public class Product {
    
    private String productName;
    private float productPrice;

    public Product(String pName, float price) {
        productName=pName;
        productPrice=price;
    }
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }
        
}
