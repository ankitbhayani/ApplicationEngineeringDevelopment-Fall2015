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
public class Business {
 
    private SupplierDirectory supplierDirectory;
    
    private static Business business;
    private ProductCatalog xeroxProductCatalog;
    private MasterOrderCatalog masterOrderCatalog;
    private CustomerDirectory customerDirectory;
    private SalesPersonDirectory employeeDirectory;
    private UserAccountDirectory userDirectory;
    
    
    
    public Business() {
        supplierDirectory = new SupplierDirectory();
        
        xeroxProductCatalog = new ProductCatalog();
        masterOrderCatalog = new MasterOrderCatalog();
        customerDirectory = new  CustomerDirectory();
        employeeDirectory= new SalesPersonDirectory();
        userDirectory = new UserAccountDirectory();
    }
    
    public static Business getInstance(){
        if(business==null){
            business= new Business();
        }
        return business;
    }
    
    public UserAccountDirectory getUserDirectory() {
        return userDirectory;
    }

    public  void setUserDirectory(UserAccountDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public SalesPersonDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(SalesPersonDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public ProductCatalog getXeroxProductCatalog() {
        return xeroxProductCatalog;
    }

    public void setXeroxProductCatalog(ProductCatalog xeroxProductCatalog) {
        this.xeroxProductCatalog = xeroxProductCatalog;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    
        
    
    ///////////////////////////////////////////////////////////////////////////
    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }    
    ///////////////////////////////////////////////////////////////////////////
}
