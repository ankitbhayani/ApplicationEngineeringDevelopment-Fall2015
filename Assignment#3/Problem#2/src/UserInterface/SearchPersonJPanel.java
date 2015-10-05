/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Person;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Swati
 */
public class SearchPersonJPanel extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private Person person;
    
    /**
     * Creates new form SearchAccountJPanel
     */
    public SearchPersonJPanel(JPanel upc, Person a) {
        initComponents();
        this.userProcessContainer = upc;
        this.person = a;
        populateFields();
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
        if(person.isCheckPatient())
            lblPatientStatus.setText("This person has Vital Signs details as well,please goto PatientView Panel ");
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
        jLabel7 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtoccupation = new javax.swing.JTextField();
        txtstreetAdress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtmobileNumber = new javax.swing.JTextField();
        txttown = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtzipCode = new javax.swing.JTextField();
        txtemailAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpersonName = new javax.swing.JTextField();
        lblPatientStatus = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Search Person Details");

        btnBackSearchAccountDetails.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBackSearchAccountDetails.setText("<<Back");
        btnBackSearchAccountDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSearchAccountDetailsActionPerformed(evt);
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

        txtstreetAdress.setEditable(false);
        txtstreetAdress.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtstreetAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstreetAdressActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Street Address");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("Zip Code");

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

        txttown.setEditable(false);
        txttown.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txttown.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttownKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Age");

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

        txtemailAddress.setEditable(false);
        txtemailAddress.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtemailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailAddressActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Person Name");

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

        lblPatientStatus.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        lblPatientStatus.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBackSearchAccountDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
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
                                        .addGap(35, 35, 35))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtoccupation)
                            .addComponent(txtemailAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmobileNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtzipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(116, 116, 116)
                    .addComponent(lblPatientStatus)
                    .addContainerGap(466, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
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
                .addGap(38, 38, 38)
                .addComponent(btnBackSearchAccountDetails)
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(lblPatientStatus)
                    .addContainerGap(345, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackSearchAccountDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSearchAccountDetailsActionPerformed

        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackSearchAccountDetailsActionPerformed

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        characterCheck(evt);
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtoccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtoccupationActionPerformed

    private void txtoccupationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtoccupationKeyTyped
        numberCheck(evt);
    }//GEN-LAST:event_txtoccupationKeyTyped

    private void txtstreetAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstreetAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstreetAdressActionPerformed

    private void txtmobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobileNumberActionPerformed

    private void txtmobileNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileNumberKeyTyped
        characterCheck(evt);
    }//GEN-LAST:event_txtmobileNumberKeyTyped

    private void txttownKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttownKeyTyped
        numberCheck(evt);
    }//GEN-LAST:event_txttownKeyTyped

    private void txtzipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtzipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtzipCodeActionPerformed

    private void txtzipCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtzipCodeKeyTyped
        characterCheck(evt);
    }//GEN-LAST:event_txtzipCodeKeyTyped

    private void txtemailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailAddressActionPerformed

    private void txtpersonNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpersonNameKeyTyped
        numberCheck(evt);
    }//GEN-LAST:event_txtpersonNameKeyTyped
        
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
