/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logic;

import java.util.Comparator;

/**
 *
 * @author Ankit Bhayani
 */
public class SalesPerson extends Person implements Comparable<SalesPerson>{
    private static int count=100;
    private  String organization;
    private int employeeID;
    private MasterOrderCatalog salesPersonOrderList;
    private int salesVolume=0;
    private double salesComission=0;
            
    
    @Override
    public String toString() {
        //return this.getFirstName();
        return (this.getFirstName() +" " + this.getLastName());
    }

    
    public int compareTo(SalesPerson sp) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int compareVol=sp.getSalesVolume();
        /* For Ascending order*/
        //return this.salesVolume-compareVol;
        /* For Descending order do like this */
        return compareVol-this.salesVolume;
        
    }
    
    
    public SalesPerson() {
        employeeID= count++;
        salesPersonOrderList = new MasterOrderCatalog();
                
    }
    
    public double getSalesComission(){
        double salesCom=0;
          for(Order o: salesPersonOrderList.getOrders()){
                salesCom= salesCom+o.getSalesPersonComission();
            }
        return salesCom;
    }

    public void setSalesComission(double salesComission) {
        this.salesComission = salesComission;
    }
    
    
    public int getSalesVolume(){
        int salesvol=0;
            for(Order o: salesPersonOrderList.getOrders()){
                salesvol=(int) (salesvol+o.getTotalOrderValue());
            }
        return salesvol;
    }

    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }
    
    
    public MasterOrderCatalog getSalesPersonOrderList() {
        return salesPersonOrderList;
    }

    public void setSalesPersonOrderList(MasterOrderCatalog salesPersonOrderList) {
        this.salesPersonOrderList = salesPersonOrderList;
    }

    
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    
}
