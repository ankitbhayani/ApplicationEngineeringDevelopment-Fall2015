package UserInterface.ManufacturerRole;

import Business.Drug;
import Business.Manufacturer;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class CreateNewDrugJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Manufacturer manufacturer;
    public CreateNewDrugJPanel(JPanel upc, Manufacturer s){
        initComponents();
        userProcessContainer = upc;
        manufacturer = s;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAvailability = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtExpiryDate = new javax.swing.JTextField();
        Logo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDissolution = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSerialNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDosage = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMfgDate = new javax.swing.JTextField();
        status = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create New Drug");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setText("Drug Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 30));

        txtPrice.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 140, 30));

        btnAdd.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btnAdd.setText("Add Drug");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        btnBack.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setText("Drug Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        txtName.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 140, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setText("Availability:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 30));

        txtAvailability.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txtAvailability.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAvailabilityKeyTyped(evt);
            }
        });
        add(txtAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 140, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setText("Expiry Date:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, 30));

        txtExpiryDate.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txtExpiryDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExpiryDateKeyTyped(evt);
            }
        });
        add(txtExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 140, 30));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ankit Bhayani\\Desktop\\logo.gif")); // NOI18N
        Logo.setText("jLabel2");
        add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 390, 90));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel8.setText("Dissolution");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 110, 30));

        txtDissolution.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        add(txtDissolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 140, 30));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel9.setText("Serial No");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, 30));

        txtSerialNo.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txtSerialNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSerialNoKeyTyped(evt);
            }
        });
        add(txtSerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 140, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel10.setText("Dosage");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 110, 30));

        txtDosage.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        add(txtDosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 140, 30));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel11.setText("Mfg. Date:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 80, 30));

        txtMfgDate.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txtMfgDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMfgDateKeyTyped(evt);
            }
        });
        add(txtMfgDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 140, 30));

        status.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        status.setForeground(new java.awt.Color(255, 0, 0));
        add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 0, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if(!(txtName.getText().isEmpty() || txtName.getText().contains(" ") ||
            txtPrice.getText().isEmpty() || txtPrice.getText().contains(" ") ||
            txtAvailability.getText().isEmpty() || txtAvailability.getText().contains(" ")||
            txtDissolution.getText().isEmpty() || txtDissolution.getText().contains(" ") ||
            txtDosage.getText().isEmpty() || txtDosage.getText().contains(" ") ||
            txtExpiryDate.getText().isEmpty() || txtExpiryDate.getText().contains(" ") ||
            txtSerialNo.getText().isEmpty() || txtSerialNo.getText().contains(" ") ||
            txtMfgDate.getText().isEmpty() || txtMfgDate.getText().contains(" "))){
                Drug drug = manufacturer.getManufacturerDrugCatalog().addDrug();
                drug.setDrugName(txtName.getText());
                drug.setAvail(Integer.parseInt(txtAvailability.getText()));
                //JOptionPane.showMessageDialog(null, txtExpiryDate.getText());
                drug.setExpiryDate(txtExpiryDate.getText());
                drug.setManufacturerName(manufacturer.getManufactrerName());
                //JOptionPane.showMessageDialog(null, drug.getExpiryDate());
                String stringPrice = txtPrice.getText();
                if(stringPrice.isEmpty()==false){
                    int price = Integer.parseInt(stringPrice);
                    drug.setDrugPrice(price);
                }
                JOptionPane.showMessageDialog(null, "Drug added!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Spaces or Null in one of the fields!!");
        }
}//GEN-LAST:event_btnAddActionPerformed

    public void numberCheck(java.awt.event.KeyEvent e){
         char ch = e.getKeyChar();
            if (Character.isDigit(ch) && ch!=8 && ch!=46){
                status.setText("Please enter characters only!");
                e.consume();
            }
            else
                status.setText("");
                
        
    }
    
    public void characterCheck(java.awt.event.KeyEvent e){
         char ch = e.getKeyChar();
            if (!Character.isDigit(ch) && ch!=8 && ch!=46 && ch!=45 && ch!=47){
                status.setText("Please enter Numbers only!");
                e.consume();
            }
            else{
                status.setText("");
                //lblVitalSignStatus.setText("");
            }
    }    
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDrugCatalogJPanel manageProductCatalogJPanel = (ManageDrugCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        numberCheck(evt);
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        characterCheck(evt);
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtAvailabilityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvailabilityKeyTyped
        characterCheck(evt);
    }//GEN-LAST:event_txtAvailabilityKeyTyped

    private void txtExpiryDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExpiryDateKeyTyped
        characterCheck(evt);
    }//GEN-LAST:event_txtExpiryDateKeyTyped

    private void txtMfgDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMfgDateKeyTyped
        characterCheck(evt);
    }//GEN-LAST:event_txtMfgDateKeyTyped

    private void txtSerialNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialNoKeyTyped
        characterCheck(evt);
    }//GEN-LAST:event_txtSerialNoKeyTyped
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel status;
    private javax.swing.JTextField txtAvailability;
    private javax.swing.JTextField txtDissolution;
    private javax.swing.JTextField txtDosage;
    private javax.swing.JTextField txtExpiryDate;
    private javax.swing.JTextField txtMfgDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSerialNo;
    // End of variables declaration//GEN-END:variables
}
