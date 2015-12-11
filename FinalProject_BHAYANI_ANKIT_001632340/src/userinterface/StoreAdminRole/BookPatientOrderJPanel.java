/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StoreAdminRole;

import Business.Drug.Drug;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.IndividualUser.Doctor;
import Business.IndividualUser.Patient;
import Business.IndividualUser.StorePharmacist;
import Business.Orders.MasterOrderCatalog;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import Business.Organization.StorePharmacistOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentWorkRequest;
import Business.WorkQueue.GetDiagnosisWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.PharmaManagerRole.DrugLookUpStoreAssignJPanel;

/**
 *
 * @author Ankit Bhayani
 */
public class BookPatientOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
       
    private EcoSystem business;
    private UserAccount ua;
    private Patient patient;
    private Order order;
    private boolean isCheckedOut = false;			
    private MasterOrderCatalog masterOrderCatalog;
    private StorePharmacist storePharmacist;
    
    private StorePharmacistOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PharmacyEnterprise pharmacyEnterprise;
    private Doctor doctor;
    private EcoSystem ecoSystem;
    //private StorePharmacist storePharmacist;
    private GetDiagnosisWorkRequest getDiagnosisWorkRequest;
    
    
    private float fp=0;
    private float tp=0;
    private float cp=0;
    private double comission=0;
    private double totalOrder=0;
    
	
    /**
     * Creates new form BookCustomerOrder
     */
    public BookPatientOrderJPanel(JPanel userProcessContainer, GetDiagnosisWorkRequest workRequest, UserAccount account, StorePharmacistOrganization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
  
        //lblActivity.setText("Book Customer Order");
        this.getDiagnosisWorkRequest= workRequest;
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.pharmacyEnterprise = (PharmacyEnterprise)enterprise;
        this.masterOrderCatalog = pharmacyEnterprise.getMasterOrderCatalog();
        this.userAccount = account;
        this.storePharmacist = (StorePharmacist)account.getEmployee();
        this.patient = workRequest.getPatient();
                
        this.ecoSystem = ecoSystem;
        lblSalesPersonName.setText(storePharmacist.getName());
        lblCustomerName.setText(patient.getName()+"'s Order");
        lblDrugRequested.setText("Drug Requested: " +getDiagnosisWorkRequest.getPrescribedMedicines());
        //this.pharmacist=(PharmaManager)userAccount.getEmployee();
                
        if(!isCheckedOut){
            order = new Order();
        }  
        
        populateDrugTable();
    }

     public void populateDrugTable(){
         
        DefaultTableModel dtm = (DefaultTableModel) drugCatalogTable.getModel();
        //Drug drug = (Supplier)suppComboBox1.getSelectedItem();
        dtm.setRowCount(0);
        
              
        for(Drug d: storePharmacist.getStoreDrugCatalog().getDrugList()){
            
                //JOptionPane.showMessageDialog(null, d.getStock());
                if(d.getStock()<6)
                    d.setBelowThreshold(true);
            
                Object row[] = new Object[5];
                row[0]=d;
                row[1]=d.getDrugPrice();
                row[2]=d.getStock();
                row[3]=d.isBelowThreshold();
                row[4]=d.getManufacturerName();
                dtm.addRow(row);
        }

        
    }
    
    
    public void refreshTableForSearch(String prodName){
        int rowCount = drugCatalogTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)drugCatalogTable.getModel();
        for(int i=rowCount-1; i>=0;i--){
            dtm.removeRow(i);
        }
        
        for(Drug d: storePharmacist.getStoreDrugCatalog().getDrugList()){
                if(d.getStock()<6)
                    d.setBelowThreshold(true);
            
                Object row[] = new Object[5];
                row[0]=d;
                row[1]=d.getDrugPrice();
                row[2]=d.getStock();
                row[3]=d.isBelowThreshold();
                row[4]=d.getManufacturerName();
                dtm.addRow(row);
        }

    }

        
     private void refershOrderTable(){
        
        int rowCount = orderTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)orderTable.getModel();
        
        for(int i=rowCount-1; i>=0;i--){
                dtm.removeRow(i);
        }
        
        //JOptionPane.showMessageDialog(null, "REFRESHORDERTABLE");
        //JOptionPane.showMessageDialog(null,order.getOrderItems().size());
        
        for(OrderItem orderItem: order.getOrderItems()){
                Object row[] = new Object[4];
                row[0]=orderItem;
                row[1]=orderItem.getSalesPrice();
                row[2]=orderItem.getQuantity();
                row[3]=orderItem.getSalesPrice()*orderItem.getQuantity();
                dtm.addRow(row);
        }

        
    }
        
    
    public void populateComissionAndTotal(Drug selectedDrug,OrderItem oi, int salesPrice,int fetchQty){
                 //fp=selectedDrug.getFloorPrice();
                 //tp=selectedDrug.getTargetPrice();
                 //cp=selectedDrug.getCeilingPrice();
                
                totalOrder=totalOrder+salesPrice*fetchQty;
/*                if(salesPrice>tp && salesPrice<cp ){
                    comission = comission + 0.10*fp*fetchQty;
                    lblComissionDesc.setText("Last OrderItem added between Target and Ceiling Price.. 10% commision on the drug's floor price");
                }
                else if(salesPrice>fp && salesPrice<tp){
                    lblComissionDesc.setText("Last OrderItem added between Floor and Target Price..Sorry No Comission this time");
                }
                else if(salesPrice>cp ){
                    comission = comission + 0.2*fp*fetchQty;
                    lblComissionDesc.setText("Last OrderItem added above Ceiling Price.. 20% commision on the drug's floor price");
                }
                else if(salesPrice==tp ){
                    comission = comission + 0.05*fp*fetchQty;
                    lblComissionDesc.setText("Last OrderItem added on Target Price.. 5% commision on the drug's floor price");
                }
                else if(salesPrice==fp){
                    lblComissionDesc.setText("Last OrderItem added on Floor Price..Sorry No Comission this time");
                }
                
                //txtComission.setText(String.valueOf(comission));*/
                txtTotalValue.setText(String.valueOf(totalOrder));
    } 
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSalesPersonName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtSearchKeyWord = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnSearchProduct = new javax.swing.JButton();
        lblPersontext = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        btnCheckOut = new javax.swing.JButton();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        btnAddToCart = new javax.swing.JButton();
        lblCustomerName = new javax.swing.JLabel();
        txtTotalValue = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugCatalogTable = new javax.swing.JTable();
        lblDrugRequested = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 247, 222));

        lblSalesPersonName.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        lblSalesPersonName.setForeground(new java.awt.Color(0, 0, 255));
        lblSalesPersonName.setText(" Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Store Drug Catalog");

        btnBack.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/backButton.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtSearchKeyWord.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/updateButton.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnSearchProduct.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSearchProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/searchButton.png"))); // NOI18N
        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        lblPersontext.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPersontext.setText("StorePharmacist Name:");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setText("Store Pharmacist Book Order Panel");

        jSeparator1.setPreferredSize(new java.awt.Dimension(80, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Item in cart");

        orderTable.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Sold Price", "Quantity", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        btnCheckOut.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/reportButton.png"))); // NOI18N
        btnCheckOut.setText("Process Order ");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        txtSalesPrice.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Sales Price");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        quantitySpinner.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        btnAddToCart.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAddToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/1449760376_ic_add_shopping_cart_48px.png"))); // NOI18N
        btnAddToCart.setText("ADD TO CART");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        lblCustomerName.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(153, 51, 0));
        lblCustomerName.setText("Patient Name:");

        txtTotalValue.setEditable(false);
        txtTotalValue.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Total Order:");

        drugCatalogTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        drugCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Drug Name", "Drug Price", "Stock", "IsBelowThrehold", "Drug Manufacturer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugCatalogTable);

        lblDrugRequested.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        lblDrugRequested.setForeground(new java.awt.Color(153, 51, 0));
        lblDrugRequested.setText("Drug Requested:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(47, 47, 47)
                                .addComponent(lblPersontext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSalesPersonName))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnAddToCart))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnBack)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCheckOut))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDrugRequested)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchProduct)
                                .addGap(14, 14, 14)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 127, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblSalesPersonName)
                    .addComponent(lblPersontext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerName)
                    .addComponent(lblDrugRequested))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchProduct)
                            .addComponent(btnRefresh))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(btnAddToCart)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(178, 178, 178))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnCheckOut))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        int dialogResult=JOptionPane.showConfirmDialog(null, "Would you like to abort this transaction?","Warning",JOptionPane.YES_NO_OPTION);
        
        if(dialogResult==JOptionPane.YES_OPTION){
        
        //int dialogResult = JOptionPane.showMessageDialog(null, "Would you like to abort this transaction!","Warning",JOptionPane.YES_NO_OPTION);
            if(order.getOrderItems().size()>0){

                ArrayList<OrderItem> orderItems  = order.getOrderItems();
                for(OrderItem orderItem:orderItems){
                    Drug p = orderItem.getDrug();
                    p.setStock(orderItem.getQuantity()+p.getStock());
                }

                order.getOrderItems().removeAll(orderItems);
                totalOrder=0;
                comission=0;
              }
                   

            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            ProcessRequestsStoreJPanel prsjp = (ProcessRequestsStoreJPanel) component;
            prsjp.populateRequestTable();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }   
            
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateDrugTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed

        String prodName= txtSearchKeyWord.getText();
        refreshTableForSearch(prodName);
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        if(order.getOrderItems().size()>0){
            
            order.setPatient(patient);
            order.setSalesperson(storePharmacist);
            //order.setSalesPersonComission(comission);
            order.setTotalOrderValue(totalOrder);
            order.setDateOrdered(String.valueOf(new Timestamp(System.currentTimeMillis())));
            masterOrderCatalog.addOrder(order);
            patient.getPatientDrugOrders().addOrder(order);
            storePharmacist.getStoreDrugOrders().addOrder(order);
            getDiagnosisWorkRequest.setOrder(order);
            order.setGetDiagnosisWorkRequest(getDiagnosisWorkRequest);
            getDiagnosisWorkRequest.setStatus("Completed");
            //drugenterpriseadd
                        
            isCheckedOut=true;
            JOptionPane.showMessageDialog(null, "Order has been processed successfully!");
//            lblComissionDesc.setText("");
            totalOrder=0;
            comission=0;
            //txtComission.setText("");
            txtTotalValue.setText("");
            order = new Order();
            refershOrderTable();
            populateDrugTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Order has not been added because there are no items present in the cart!");
        }

    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        int selectedRow = drugCatalogTable.getSelectedRow();
        Drug selectedDrug;
        int salesPrice=0;

        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        else{
            selectedDrug=(Drug)drugCatalogTable.getValueAt(selectedRow, 0);
        }

        try{
            salesPrice = Integer.parseInt(txtSalesPrice.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Sales Price");
        }

        if(salesPrice<selectedDrug.getDrugPrice()){
            JOptionPane.showMessageDialog(null, "Sales price needs to be above floor price");
            return;
        }

        int fetchQty = (Integer)quantitySpinner.getValue();
        int availableForsale = selectedDrug.getStock()-5;
        
        if(fetchQty<=0){
            JOptionPane.showMessageDialog(null, "Quantity cant be negative or 0");
        }
        else if(fetchQty<= availableForsale){
            //JOptionPane.showMessageDialog(null, "INside Elseif before entering loop");
            boolean alreadyPresent= false;
            for(OrderItem orderItem: order.getOrderItems()){
                if(orderItem.getDrug()==selectedDrug ){
                    if(orderItem.getSalesPrice()==salesPrice){
                        alreadyPresent= true;
                        if(!selectedDrug.isBelowThreshold()){
                            int oldAvail = selectedDrug.getStock();
                            int newAvail = oldAvail - fetchQty;
                            selectedDrug.setStock(newAvail);
                            orderItem.setQuantity(fetchQty+orderItem.getQuantity());

                            populateDrugTable();
                            refershOrderTable();
                            populateComissionAndTotal(selectedDrug,orderItem, salesPrice, fetchQty);
                            break;
                        }
                        else{
                             JOptionPane.showMessageDialog(null, "Cannot Order beyond this level");
                        }
                    }
                    else{
                        String prod=orderItem.toString();
                        JOptionPane.showMessageDialog(null, prod +" have different SalesPrice in this order, Please input the same amount to proceed");
                        alreadyPresent= true;
                   }
                }
                
                    
            }

            if(!alreadyPresent){
                if(!selectedDrug.isBelowThreshold()){
                    int oldAvail = selectedDrug.getStock();
                    int newAvail = oldAvail - fetchQty;
                    selectedDrug.setStock(newAvail);

                    //JOptionPane.showMessageDialog(null, "First time");
                    //JOptionPane.showMessageDialog(null, selectedDrug.getAvail() );
                    OrderItem oi=order.addOrderItem(selectedDrug, salesPrice, fetchQty);

                    /*for(OrderItem orderItem: order.getOrderItems()){
                        JOptionPane.showMessageDialog(null,orderItem.getQuantity() );
                    }*/
                    populateDrugTable();
                    refershOrderTable();
                    populateComissionAndTotal(selectedDrug,oi, salesPrice, fetchQty);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Cant Order at first hand");
                }
            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Quantity requested is not available");
        }

    }//GEN-LAST:event_btnAddToCartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JTable drugCatalogTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblDrugRequested;
    private javax.swing.JLabel lblPersontext;
    private javax.swing.JLabel lblSalesPersonName;
    private javax.swing.JTable orderTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTextField txtSearchKeyWord;
    private javax.swing.JTextField txtTotalValue;
    // End of variables declaration//GEN-END:variables
}
