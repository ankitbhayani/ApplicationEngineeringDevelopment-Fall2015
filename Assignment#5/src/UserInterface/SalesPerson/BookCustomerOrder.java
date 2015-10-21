/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesPerson;

import Business.Logic.Business;
import Business.Logic.Customer;
import Business.Logic.SalesPerson;
import Business.Logic.MasterOrderCatalog;
import Business.Logic.Order;
import Business.Logic.OrderItem;
import Business.Logic.Product;
import Business.Logic.UserAccount;
import UserInterface.Customer.ViewOrderItemDetailJPanel;
import java.awt.CardLayout;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankit Bhayani
 */
public class BookCustomerOrder extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Business business;
    private UserAccount ua;
    private Customer customer;
    private Order order;
    private boolean isCheckedOut = false;			
    private MasterOrderCatalog masterOrderCatalog;
    private SalesPerson employee;
    
    
    private float fp=0;
    private float tp=0;
    private float cp=0;
    private double comission=0;
    private double totalOrder=0;
    
	
    /**
     * Creates new form BookCustomerOrder
     */
    public BookCustomerOrder(JPanel userProcessContainer,Business business,UserAccount ua,Customer customer) {
        initComponents();
        this.business=business;
	this.userProcessContainer=userProcessContainer;
        this.customer=customer;
        this.ua=ua;
        masterOrderCatalog = business.getMasterOrderCatalog();
        
        employee = (SalesPerson)ua.getPerson();
        lblSalesPersonName.setText(employee.getFirstName().concat(" " +employee.getLastName()));
        lblCustomerName.setText(customer.getCustomerName()+"'s Order");
        //lblActivity.setText("Book Customer Order");
        
        if(!isCheckedOut){
            order = new Order();
        }  
        
        populateProductTable();
    }

     public void populateProductTable(){
         
        DefaultTableModel dtm = (DefaultTableModel) productTable.getModel();
        //Product product = (Supplier)suppComboBox1.getSelectedItem();
        dtm.setRowCount(0);
        
        for(Product product: business.getXeroxProductCatalog().getProductcatalog()){
                Object row[] = new Object[6];
                row[0]=product;
                row[1]=product.getProdDesc();
                row[2]=product.getFloorPrice();
                row[3]=product.getTargetPrice();
                row[4]=product.getCeilingPrice();
                row[5]=product.getAvail();
                dtm.addRow(row);
        }
        
    }
    
    
        public void refreshTableForSearch(String prodName){
        int rowCount = productTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)productTable.getModel();
        for(int i=rowCount-1; i>=0;i--){
            dtm.removeRow(i);
        }
        
        for(Product product: business.getXeroxProductCatalog().getProductcatalog()){
                if(product.getProdName().equals(prodName)){
                Object row[] = new Object[6];
                row[0]=product;
                row[1]=product.getProdDesc();
                row[2]=product.getFloorPrice();
                row[3]=product.getTargetPrice();
                row[4]=product.getCeilingPrice();
                row[5]=product.getAvail();
                    dtm.addRow(row);
                }
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
        
    
    public void populateComissionAndTotal(Product selectedProduct,OrderItem oi, int salesPrice,int fetchQty){
                 fp=selectedProduct.getFloorPrice();
                 tp=selectedProduct.getTargetPrice();
                 cp=selectedProduct.getCeilingPrice();
                
                totalOrder=totalOrder+salesPrice*fetchQty;
                if(salesPrice>tp && salesPrice<cp ){
                    comission = comission + 0.10*fp*fetchQty;
                    lblComissionDesc.setText("Last OrderItem added between Target and Ceiling Price.. 10% commision on the product's floor price");
                }
                else if(salesPrice>fp && salesPrice<tp){
                    lblComissionDesc.setText("Last OrderItem added between Floor and Target Price..Sorry No Comission this time");
                }
                else if(salesPrice>cp ){
                    comission = comission + 0.2*fp*fetchQty;
                    lblComissionDesc.setText("Last OrderItem added above Ceiling Price.. 20% commision on the product's floor price");
                }
                else if(salesPrice==tp ){
                    comission = comission + 0.05*fp*fetchQty;
                    lblComissionDesc.setText("Last OrderItem added on Target Price.. 5% commision on the product's floor price");
                }
                else if(salesPrice==fp){
                    lblComissionDesc.setText("Last OrderItem added on Floor Price..Sorry No Comission this time");
                }
                
                txtComission.setText(String.valueOf(comission));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtSearchKeyWord = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnSearchProduct = new javax.swing.JButton();
        btnViewProdDetails = new javax.swing.JButton();
        lblPersontext = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        btnViewOrderItem = new javax.swing.JButton();
        btnModifyQuantity = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        txtNewQuantity = new javax.swing.JTextField();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        btnAddToCart = new javax.swing.JButton();
        lblCustomerName = new javax.swing.JLabel();
        txtComission = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotalValue = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblComissionDesc = new javax.swing.JLabel();

        lblSalesPersonName.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        lblSalesPersonName.setForeground(new java.awt.Color(0, 0, 255));
        lblSalesPersonName.setText("SalesPerson Name");

        productTable.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Description", "Floor Price", "Target Price", "Ceiling Price", "Avail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText(" Product Catalog");

        btnBack.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtSearchKeyWord.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnSearchProduct.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        btnViewProdDetails.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnViewProdDetails.setText("View Product Detail");
        btnViewProdDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProdDetailsActionPerformed(evt);
            }
        });

        lblPersontext.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPersontext.setText("Sales Person Name:");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setText("Xerox Sales Employee Work Area");

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

        btnViewOrderItem.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnViewOrderItem.setText("View Item");
        btnViewOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderItemActionPerformed(evt);
            }
        });

        btnModifyQuantity.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.setEnabled(false);
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });

        btnRemoveOrderItem.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.setEnabled(false);
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });

        btnCheckOut.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        txtNewQuantity.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNewQuantity.setEnabled(false);

        txtSalesPrice.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Sales Price");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        quantitySpinner.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        btnAddToCart.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAddToCart.setText("ADD TO CART");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        lblCustomerName.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(153, 51, 0));
        lblCustomerName.setText("Customer Name:");

        txtComission.setEditable(false);
        txtComission.setBackground(new java.awt.Color(255, 255, 255));
        txtComission.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        txtComission.setForeground(new java.awt.Color(0, 102, 51));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("My Comission:");

        txtTotalValue.setEditable(false);
        txtTotalValue.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Total Order:");

        lblComissionDesc.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        lblComissionDesc.setForeground(new java.awt.Color(0, 102, 0));

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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCustomerName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtComission, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchProduct)
                                .addGap(14, 14, 14)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewOrderItem)
                                .addGap(31, 31, 31)
                                .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnModifyQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemoveOrderItem)
                                .addGap(32, 32, 32)
                                .addComponent(btnCheckOut))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(47, 47, 47)
                                .addComponent(lblPersontext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSalesPersonName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewProdDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnAddToCart))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 86, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblComissionDesc)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerName)
                    .addComponent(jLabel8)
                    .addComponent(txtComission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchProduct)
                            .addComponent(btnRefresh))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(btnAddToCart)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewProdDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblComissionDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewOrderItem)
                    .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModifyQuantity)
                        .addComponent(btnCheckOut)
                        .addComponent(btnRemoveOrderItem)))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
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
                    Product p = orderItem.getProduct();
                    p.setAvail(orderItem.getQuantity()+p.getAvail());
                }

                order.getOrderItems().removeAll(orderItems);
                totalOrder=0;
                comission=0;
              }
                   

            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }   
            
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateProductTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed

        String prodName= txtSearchKeyWord.getText();
        refreshTableForSearch(prodName);
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnViewProdDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProdDetailsActionPerformed

        int selectedRow = productTable.getSelectedRow();

        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }

        Product p = (Product)productTable.getValueAt(selectedRow, 0);
        ViewProductDetailJPanel voidjp = new ViewProductDetailJPanel(userProcessContainer,p);
        userProcessContainer.add("ViewProductDetailJPanel",voidjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewProdDetailsActionPerformed

    private void btnViewOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderItemActionPerformed

        int selectedRow = orderTable.getSelectedRow();

        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }

        OrderItem orderItem = (OrderItem)orderTable.getValueAt(selectedRow, 0);
        ViewOrderItemDetailJPanel voidjp = new ViewOrderItemDetailJPanel(userProcessContainer,orderItem);
        userProcessContainer.add("ViewOrderItemDetailJPanel",voidjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnViewOrderItemActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed

        int selectedRow = orderTable.getSelectedRow();

        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }

        if(!txtNewQuantity.getText().isEmpty() && !txtNewQuantity.getText().equals("0")){
            OrderItem orderItem = (OrderItem)orderTable.getValueAt(selectedRow, 0);
            int currentAvail = orderItem.getProduct().getAvail();
            int oldQuantity = orderItem.getQuantity();
            int newQuantity = Integer.parseInt(txtNewQuantity.getText());

            if(newQuantity>(currentAvail+ oldQuantity)){
                JOptionPane.showMessageDialog(null, "Quantity exceeding the availability");
            }
            else{
                if(newQuantity<=0){
                    JOptionPane.showMessageDialog(null, "Quantity should be poistive");
                    return;
                }

                orderItem.setQuantity(newQuantity);
                orderItem.getProduct().setAvail(currentAvail+(oldQuantity-newQuantity));
                refershOrderTable();
                populateProductTable();
            }
        }
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed

        int rowCount = orderTable.getRowCount();
        if(rowCount<=0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }

        int selectedRow = orderTable.getSelectedRow();
        OrderItem orderItem=(OrderItem)orderTable.getValueAt(selectedRow, 0);
        int oldQuantity = orderItem.getProduct().getAvail();
        int orderQuantity = orderItem.getQuantity();
        int newQuantity = oldQuantity + orderQuantity;

        orderItem.getProduct().setAvail(newQuantity);
        order.removeOrderItem(orderItem);

        JOptionPane.showMessageDialog(null, "orderItem has been removed!");
        refershOrderTable();
        populateProductTable();

    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        if(order.getOrderItems().size()>0){
            
            order.setCustomer(customer);
            order.setSalesperson(employee);
            order.setSalesPersonComission(comission);
            order.setTotalOrderValue(totalOrder);
            order.setDateOrdered(String.valueOf(new Timestamp(System.currentTimeMillis())));
            masterOrderCatalog.addOrder(order);
            customer.getCustomerOrderList().addOrder(order);
            employee.getSalesPersonOrderList().addOrder(order);
            
                        
            isCheckedOut=true;
            JOptionPane.showMessageDialog(null, "Order has been CheckedOut successfully!");
            lblComissionDesc.setText("");
            totalOrder=0;
            comission=0;
            txtComission.setText("");
            txtTotalValue.setText("");
            order = new Order();
            refershOrderTable();
            populateProductTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Order has not been added because there are no items present in the cart!");
        }

    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        int selectedRow = productTable.getSelectedRow();
        Product selectedProduct;
        int salesPrice=0;

        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        else{
            selectedProduct=(Product)productTable.getValueAt(selectedRow, 0);
        }

        try{
            salesPrice = Integer.parseInt(txtSalesPrice.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Sales Price");
        }

        if(salesPrice<selectedProduct.getFloorPrice()){
            JOptionPane.showMessageDialog(null, "Sales price needs to be above floor price");
            return;
        }

        int fetchQty = (Integer)quantitySpinner.getValue();
        if(fetchQty<=0){
            JOptionPane.showMessageDialog(null, "Quantity cant be negative or 0");
        }
        else if(fetchQty<=selectedProduct.getAvail()){
            //JOptionPane.showMessageDialog(null, "INside Elseif before entering loop");
            boolean alreadyPresent= false;
            for(OrderItem orderItem: order.getOrderItems()){
                if(orderItem.getProduct()==selectedProduct ){
                    if(orderItem.getSalesPrice()==salesPrice){
                        int oldAvail = selectedProduct.getAvail();
                        int newAvail = oldAvail - fetchQty;
                        selectedProduct.setAvail(newAvail);
                        orderItem.setQuantity(fetchQty+orderItem.getQuantity());
                        alreadyPresent= true;
                        populateProductTable();
                        refershOrderTable();
                        populateComissionAndTotal(selectedProduct,orderItem, salesPrice, fetchQty);
                        break;
                    }
                    else{
                        String prod=orderItem.toString();
                        JOptionPane.showMessageDialog(null, prod +" have different SalesPrice in this order, Please input the same amount to proceed");
                        alreadyPresent= true;
                   }
                }
                
                    
            }

            if(!alreadyPresent){
                int oldAvail = selectedProduct.getAvail();
                int newAvail = oldAvail - fetchQty;
                selectedProduct.setAvail(newAvail);
                //JOptionPane.showMessageDialog(null, "First time");
                //JOptionPane.showMessageDialog(null, selectedProduct.getAvail() );
                OrderItem oi=order.addOrderItem(selectedProduct, salesPrice, fetchQty);
                
                /*for(OrderItem orderItem: order.getOrderItems()){
                    JOptionPane.showMessageDialog(null,orderItem.getQuantity() );
                }*/
                populateProductTable();
                refershOrderTable();
                populateComissionAndTotal(selectedProduct,oi, salesPrice, fetchQty);
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
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnViewOrderItem;
    private javax.swing.JButton btnViewProdDetails;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblComissionDesc;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblPersontext;
    private javax.swing.JLabel lblSalesPersonName;
    private javax.swing.JTable orderTable;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTextField txtComission;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTextField txtSearchKeyWord;
    private javax.swing.JTextField txtTotalValue;
    // End of variables declaration//GEN-END:variables
}
