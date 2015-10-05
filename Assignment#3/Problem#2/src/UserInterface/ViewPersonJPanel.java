/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Person;
import Business.PersonDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Swati
 */
public class ViewPersonJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Person person;
    private ManagePersonPatientJPanel managePersonPatientJPanel;
    
    /**
     * Creates new form ViewAccountJPanel
     */
    public ViewPersonJPanel(JPanel upc, Person p, ManagePersonPatientJPanel mppjp) {
        initComponents();
        this.userProcessContainer = upc;
        this.person = p;
        this.managePersonPatientJPanel = mppjp;
        populateFields();
        btnSave.setEnabled(false);
        
    }

    
    public void populateFields(){
        txtpersonName.setText(person.getPersonName());
        txtAge.setText(String.valueOf(person.getAge()));
        txtemailAddress.setText(person.getEmailAddress());
        txtmobileNumber.setText(String.valueOf(person.getMobileNumber()));
        txtoccupation.setText(person.getOccupation());
        txtstreetAdress.setText(person.getStreetAdress());
        txttown.setText(person.getTown());
        txtzipCode.setText(String.valueOf(person.getZipCode()));
        
                
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBackSearchAccountDetails = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtoccupation = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmobileNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtemailAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpersonName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtstreetAdress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txttown = new javax.swing.JTextField();
        txtzipCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblPatientStatus = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("View Person Details");

        btnBackSearchAccountDetails.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBackSearchAccountDetails.setText("<<Back");
        btnBackSearchAccountDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSearchAccountDetailsActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtoccupation.setEditable(false);
        txtoccupation.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtoccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtoccupationActionPerformed(evt);
            }
        });
        txtoccupation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtoccupationKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Street Address");

        txtmobileNumber.setEditable(false);
        txtmobileNumber.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtmobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobileNumberActionPerformed(evt);
            }
        });
        txtmobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmobileNumberKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Age");

        txtemailAddress.setEditable(false);
        txtemailAddress.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtemailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailAddressActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Town");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Mobile Number");

        txtpersonName.setEditable(false);
        txtpersonName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtpersonName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpersonNameKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Email Address");

        txtAge.setEditable(false);
        txtAge.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Occupation");

        txtstreetAdress.setEditable(false);
        txtstreetAdress.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtstreetAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstreetAdressActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("Zip Code");

        txttown.setEditable(false);
        txttown.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txttown.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttownKeyTyped(evt);
            }
        });

        txtzipCode.setEditable(false);
        txtzipCode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtzipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtzipCodeActionPerformed(evt);
            }
        });
        txtzipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtzipCodeKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Person Name");

        lblPatientStatus.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        lblPatientStatus.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtpersonName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtstreetAdress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttown, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtoccupation)
                            .addComponent(txtemailAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmobileNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtzipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnBackSearchAccountDetails)))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(238, 238, 238)
                    .addComponent(lblPatientStatus)
                    .addContainerGap(323, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtpersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtstreetAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtzipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtoccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtmobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addComponent(btnBackSearchAccountDetails)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(lblPatientStatus)
                    .addContainerGap(353, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackSearchAccountDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSearchAccountDetailsActionPerformed
        
        userProcessContainer.remove(this);
      /* Component[] components = userProcessContainer.getComponents();
       Component component = components[components.length - 1];
       ManagePersonPatientJPanel manageAccountJPanel = (ManagePersonPatientJPanel)component;
        manageAccountJPanel.refreshtable(); */
        managePersonPatientJPanel.refreshtable();
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
        
        
        
    }//GEN-LAST:event_btnBackSearchAccountDetailsActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

     lblPatientStatus.setText("");
        
        
     if(!(txtAge.getText().isEmpty() || txtAge.getText().contains(" ") ||
          txtzipCode.getText().isEmpty() || txtzipCode.getText().contains(" ") ||
          txtoccupation.getText().isEmpty() || txtoccupation.getText().contains(" ") ||
          txtemailAddress.getText().isEmpty() || txtemailAddress.getText().contains(" ") ||
          txttown.getText().isEmpty() || txttown.getText().contains(" ") ||
          txtmobileNumber.getText().isEmpty() || txtmobileNumber.getText().contains(" ") ||
          txtpersonName.getText().isEmpty() || 
          txtstreetAdress.getText().isEmpty())){  
        
        person.setPersonName(txtpersonName.getText());
        person.setAge(Integer.valueOf(txtAge.getText()));
        person.setEmailAddress(txtemailAddress.getText());
        person.setMobileNumber(Integer.valueOf(txtmobileNumber.getText()));
        person.setOccupation(txtoccupation.getText());
        person.setStreetAdress(txtstreetAdress.getText());
        person.setTown(txttown.getText());
        person.setZipCode(Integer.valueOf(txtzipCode.getText()));
    
        JOptionPane.showMessageDialog(null, "Person record updated successfully","Information Message",JOptionPane.INFORMATION_MESSAGE);
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
        
        userProcessContainer.add("ManageAccountJPanel",managePersonPatientJPanel);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
     }
     else{
            //JOptionPane.showMessageDialog(null, "Spaces or Null");
            lblPatientStatus.setText("Spaces or Null in the one of the Input fields!");
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    
        txtpersonName.setEditable(true);  
        txtAge.setEditable(true);
        txtemailAddress.setEditable(true);
        txtmobileNumber.setEditable(true);
        txtoccupation.setEditable(true);
        txtstreetAdress.setEditable(true);
        txttown.setEditable(true);
        txtzipCode.setEditable(true);

        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtoccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtoccupationActionPerformed

    private void txtoccupationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtoccupationKeyTyped
        numberCheck(evt);
    }//GEN-LAST:event_txtoccupationKeyTyped

    private void txtmobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobileNumberActionPerformed

    private void txtmobileNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileNumberKeyTyped
        characterCheck(evt);
    }//GEN-LAST:event_txtmobileNumberKeyTyped

    private void txtemailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailAddressActionPerformed

    private void txtpersonNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpersonNameKeyTyped
        numberCheck(evt);
    }//GEN-LAST:event_txtpersonNameKeyTyped

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        characterCheck(evt);
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtstreetAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstreetAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstreetAdressActionPerformed

    private void txttownKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttownKeyTyped
        numberCheck(evt);
    }//GEN-LAST:event_txttownKeyTyped

    private void txtzipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtzipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtzipCodeActionPerformed

    private void txtzipCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtzipCodeKeyTyped
        characterCheck(evt);
    }//GEN-LAST:event_txtzipCodeKeyTyped

        public void numberCheck(java.awt.event.KeyEvent e){
         char ch = e.getKeyChar();
            if (Character.isDigit(ch) && ch!=8 && ch!=46){
                lblPatientStatus.setText("Please enter characters only!");
                e.consume();
            }
            else
                lblPatientStatus.setText("");
                
        
    }
    
    public void characterCheck(java.awt.event.KeyEvent e){
         char ch = e.getKeyChar();
            if (!Character.isDigit(ch) && ch!=8 && ch!=46){
                lblPatientStatus.setText("Please enter Numbers only!");
                e.consume();
            }
            else{
                lblPatientStatus.setText("");
                //lblVitalSignStatus.setText("");
            }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackSearchAccountDetails;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblPatientStatus;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtemailAddress;
    private javax.swing.JTextField txtmobileNumber;
    private javax.swing.JTextField txtoccupation;
    private javax.swing.JTextField txtpersonName;
    private javax.swing.JTextField txtstreetAdress;
    private javax.swing.JTextField txttown;
    private javax.swing.JTextField txtzipCode;
    // End of variables declaration//GEN-END:variables
}