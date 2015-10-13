/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */

package UserInterface.StoreAdminRole;

import Business.CVSAdministrator;
import Business.Drug;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rushabh
 */
public class ViewDrugDetailJPanel extends javax.swing.JPanel {


      private JPanel userProcessContainer;
      private Drug drug;
          /** Creates new form CreateProductJPanel */
    public ViewDrugDetailJPanel(JPanel userProcessContainer,Drug drug) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.drug=drug;
        nameField.setText(drug.getDrugName());
        txtPrice.setText(String.valueOf(drug.getDrugPrice()));
        txtAvail.setText(String.valueOf(drug.getAvail()));
        idField.setText(String.valueOf(drug.getExpiryDate()));
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
        Logo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Drug Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Drug Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 159, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 30));

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 159, -1));

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< BACK");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 159, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Drug ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Availability");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        txtAvail.setEditable(false);
        txtAvail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 160, -1));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ankit Bhayani\\Desktop\\logo.gif")); // NOI18N
        Logo.setText("jLabel2");
        add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 390, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_backButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton backButton1;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
    
}
