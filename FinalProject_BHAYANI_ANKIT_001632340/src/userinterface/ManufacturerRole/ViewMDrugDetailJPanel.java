package userinterface.ManufacturerRole;

import Business.Drug.Drug;
import Business.Enterprise.DrugManufacturerEnterprise;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ViewMDrugDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Drug drug;
    private DrugManufacturerEnterprise enterprise;
    
    public ViewMDrugDetailJPanel(JPanel upc,DrugManufacturerEnterprise enterprise, Drug d) {
        initComponents();
        this.enterprise = (DrugManufacturerEnterprise)enterprise;
        this.userProcessContainer = upc;
        this.drug=d;
        txtName.setText(d.getDrugName());
        txtId.setText(String.valueOf(d.getExpiryDate()));
        txtPrice.setText(String.valueOf(d.getDrugPrice()));
        txtAvailability.setText(String.valueOf(d.getAvail()));
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtAvailability = new javax.swing.JTextField();
        Logo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("View Drug Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Drug Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 30));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 159, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Drug Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 30));

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 159, -1));

        btnUpdate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/updateButton.png"))); // NOI18N
        btnUpdate.setText("Update Drug");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 176, -1));

        btnBack.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/backButton.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 159, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Expiry Date");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 30));

        btnSave.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/saveButton.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 90, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Availability");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 30));

        txtAvailability.setEditable(false);
        txtAvailability.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        add(txtAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 159, -1));
        add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 390, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        //txtId.setEditable(true);
        txtAvailability.setEditable(true);
        txtName.setEditable(true);
        txtPrice.setEditable(true);
        btnSave.setEnabled(true);
}//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

      private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDrugCatalogJPanel manageProductCatalogJPanel = (ManageDrugCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            drug.setDrugPrice(Float.parseFloat(txtPrice.getText()));
            drug.setDrugName(txtName.getText());
            drug.setAvail(Integer.parseInt(txtAvailability.getText()));
            JOptionPane.showMessageDialog(null, "Drug updated successfully!!");
            btnSave.setEnabled(false);
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "Wrong Input");
        }
    }//GEN-LAST:event_btnSaveActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAvailability;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
