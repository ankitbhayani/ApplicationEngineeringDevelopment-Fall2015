/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aedfall2015assignment3q1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ankit Bhayani
 */
public class ProductCatalog {

    public ArrayList<Product> productList;
    
    public ProductCatalog() {
        productList = new ArrayList<>();
        
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product addProduct(String pName, float price){
        Product product = new Product(pName,price);
        productList.add(product);
        return product;
    }
    
    public void removeProduct(Product p){
        productList.remove(p);
    }
         
}
