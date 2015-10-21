/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */

package UserInterface.SalesPerson;

import UserInterface.Customer.*;
import Business.Logic.Business;
import Business.Logic.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rushabh
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {


      private JPanel userProcessContainer;
      private Product product;
    /** Creates new form CreateProductJPanel */
    public ViewProductDetailJPanel(JPanel userProcessContainer,Product product) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.product=product;
        nameField.setText(product.getProdName());
        txtPrice.setText(String.valueOf(product.getPrice()));
        txtAvail.setText(String.valueOf(product.getAvail()));
        idField.setText(String.valueOf(product.getModelNumber()));
        txtFloorPrice.setText(String.valueOf(product.getFloorPrice()));
        txtCeilingPrice.setText(String.valueOf(product.getCeilingPrice()));
        txtAreaDesc.setText(product.getProdDesc());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAvail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCeilingPrice = new javax.swing.JTextField();
        txtFloorPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDesc = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Product Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nameField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 159, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 159, -1));

        backButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        backButton1.setText("<< BACK");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        idField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 159, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Product ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Availability");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txtAvail.setEditable(false);
        txtAvail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtAvail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 159, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Ceiling Price");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 30));

        txtCeilingPrice.setEditable(false);
        txtCeilingPrice.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCeilingPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtCeilingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 159, -1));

        txtFloorPrice.setEditable(false);
        txtFloorPrice.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtFloorPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtFloorPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 159, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Floor Price");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Description");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        txtAreaDesc.setEditable(false);
        txtAreaDesc.setColumns(20);
        txtAreaDesc.setRows(5);
        jScrollPane1.setViewportView(txtAreaDesc);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextArea txtAreaDesc;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTextField txtCeilingPrice;
    private javax.swing.JTextField txtFloorPrice;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
    
}
