/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesPerson;

import Business.Logic.Business;
import Business.Logic.Customer;
import Business.Logic.SalesPerson;
import Business.Logic.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Ankit Bhayani
 */
public class ServeCustomer extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Business business;
    //private SalesPerson employee;
    private UserAccount ua;
    private Customer customer;
        
    /**
     * Creates new form ServeCustomer
     */
    public ServeCustomer(JPanel userProcessContainer,Business business,UserAccount ua,Customer customer) {
        initComponents();
        this.business=business;
        this.userProcessContainer=userProcessContainer;
        this.customer=customer;
        this.ua=ua;
        SalesPerson employee = (SalesPerson)ua.getPerson();
        lblSalesPersonName.setText(employee.getFirstName().concat(" " +employee.getLastName()));
        lblCustomerName.setText(customer.getCustomerName());
        lblActivity.setText("Serve Customer");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCustomerOrder = new javax.swing.JButton();
        btnOrderStatus = new javax.swing.JButton();
        lblSalesPersonName = new javax.swing.JLabel();
        btnBrowseCatalog = new javax.swing.JButton();
        lblPersontext = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblCustomerName = new javax.swing.JLabel();
        lblPersontext1 = new javax.swing.JLabel();
        lblActivity4 = new javax.swing.JLabel();
        lblActivity = new javax.swing.JLabel();

        btnCustomerOrder.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCustomerOrder.setText("Book Customer Order");
        btnCustomerOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerOrderActionPerformed(evt);
            }
        });

        btnOrderStatus.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnOrderStatus.setText("Check Order Status");
        btnOrderStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderStatusActionPerformed(evt);
            }
        });

        lblSalesPersonName.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        lblSalesPersonName.setForeground(new java.awt.Color(0, 0, 255));
        lblSalesPersonName.setText("SalesPerson Name");

        btnBrowseCatalog.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBrowseCatalog.setText("Browse Product Catalog");
        btnBrowseCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseCatalogActionPerformed(evt);
            }
        });

        lblPersontext.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPersontext.setText("Sales Person Name:");

        btnBack.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setText("Xerox Sales Employee Work Area");

        jSeparator1.setPreferredSize(new java.awt.Dimension(80, 10));

        lblCustomerName.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(153, 51, 0));
        lblCustomerName.setText("Customer Name:");

        lblPersontext1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPersontext1.setText("Customer's Name:");

        lblActivity4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblActivity4.setText("Activity: ");

        lblActivity.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        lblActivity.setForeground(new java.awt.Color(255, 0, 0));
        lblActivity.setText("Activity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPersontext1)
                                    .addComponent(lblPersontext))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSalesPersonName)
                                    .addComponent(lblCustomerName)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnCustomerOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnOrderStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBrowseCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblActivity4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblActivity)
                                .addGap(8, 8, 8)))
                        .addGap(50, 50, 50)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblActivity)
                        .addComponent(lblActivity4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSalesPersonName)
                        .addComponent(lblPersontext)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerName)
                    .addComponent(lblPersontext1))
                .addGap(30, 30, 30)
                .addComponent(btnCustomerOrder)
                .addGap(18, 18, 18)
                .addComponent(btnBrowseCatalog)
                .addGap(18, 18, 18)
                .addComponent(btnOrderStatus)
                .addGap(49, 49, 49)
                .addComponent(btnBack)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerOrderActionPerformed

        BookCustomerOrder bco = new BookCustomerOrder(userProcessContainer, business,ua,customer);
        userProcessContainer.add("BookCustomerOrder",bco);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnCustomerOrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBrowseCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseCatalogActionPerformed
        
        BrowseProductCatalog bpc = new BrowseProductCatalog(userProcessContainer, business,ua);
        userProcessContainer.add("BrowseProductCatalog",bpc);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBrowseCatalogActionPerformed

    private void btnOrderStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderStatusActionPerformed
        OrderStatus os = new OrderStatus(userProcessContainer, business,ua,customer);
        userProcessContainer.add("OrderStatus",os);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrderStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrowseCatalog;
    private javax.swing.JButton btnCustomerOrder;
    private javax.swing.JButton btnOrderStatus;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblActivity;
    private javax.swing.JLabel lblActivity4;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblPersontext;
    private javax.swing.JLabel lblPersontext1;
    private javax.swing.JLabel lblSalesPersonName;
    // End of variables declaration//GEN-END:variables
}
