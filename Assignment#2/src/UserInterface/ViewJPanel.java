/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Patient;
import Business.VitalSign;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewJPanel extends javax.swing.JPanel {


    private Patient patient;    
    
    public ViewJPanel(Patient p){
    initComponents();
    this.patient=p;
    populateTable();
    populatePatientDetails(p);
    }

   
   private void populateTable(){
        
       DefaultTableModel dtm = (DefaultTableModel)tblVitalSigns.getModel();
        int rowCount = dtm.getRowCount();

        for (int x=rowCount-1;x>=0; x--){
            dtm.removeRow(x);
         }

        for (VitalSign vs: patient.vitalSignHistory.getVitalSignHistory()){
            Object row [] = new Object[2];
            row[0] = vs;
            row [1]= vs.getState();
            
            dtm.addRow(row);
        }
                   
    }
   
   
   private void populatePatientDetails(Patient p){
    txtPatientName.setText(p.getPatientName());
    txtPatientId.setText(p.getPatientId());
    txtPreferredPharmacy.setText(p.getPreferredPharmacy());
    txtPrimaryDoctorName.setText(p.getPrimaryDocName());
    txtAge.setText(String.valueOf(p.getAge()));
     
   }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        btnViewVitalSign = new javax.swing.JButton();
        btnDeleteVitalSign = new javax.swing.JButton();
        lblWeight = new javax.swing.JLabel();
        txtSystolicBloodPressure = new javax.swing.JTextField();
        txtRespiratoryRate = new javax.swing.JTextField();
        txtHeartRate = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        lblRespiratoryRate = new javax.swing.JLabel();
        lblHeartRate = new javax.swing.JLabel();
        lblSystolicBloodPressure = new javax.swing.JLabel();
        txtPrimaryDoctorName = new javax.swing.JTextField();
        lblPreferredPharmacy = new javax.swing.JLabel();
        txtPreferredPharmacy = new javax.swing.JTextField();
        lblPatientName = new javax.swing.JLabel();
        lblPatientId = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblPrimaryDoctorName = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();

        lblCreate.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblCreate.setText("View Panel");

        tblVitalSigns.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TimeStamp", "State"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitalSigns);
        if (tblVitalSigns.getColumnModel().getColumnCount() > 0) {
            tblVitalSigns.getColumnModel().getColumn(0).setResizable(false);
            tblVitalSigns.getColumnModel().getColumn(1).setResizable(false);
        }

        btnViewVitalSign.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnViewVitalSign.setText("View");
        btnViewVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalSignActionPerformed(evt);
            }
        });

        btnDeleteVitalSign.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnDeleteVitalSign.setText("Delete");
        btnDeleteVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteVitalSignActionPerformed(evt);
            }
        });

        lblWeight.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblWeight.setText("Weight (in Pounds)");

        txtSystolicBloodPressure.setEditable(false);
        txtSystolicBloodPressure.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtRespiratoryRate.setEditable(false);
        txtRespiratoryRate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtHeartRate.setEditable(false);
        txtHeartRate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtWeight.setEditable(false);
        txtWeight.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lblRespiratoryRate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblRespiratoryRate.setText("Respiratory Rate");

        lblHeartRate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblHeartRate.setText("Heart Rate");

        lblSystolicBloodPressure.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblSystolicBloodPressure.setText("Systolic Blood Pressure");

        txtPrimaryDoctorName.setEditable(false);
        txtPrimaryDoctorName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lblPreferredPharmacy.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPreferredPharmacy.setText("Preferred Pharmacy");

        txtPreferredPharmacy.setEditable(false);
        txtPreferredPharmacy.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lblPatientName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPatientName.setText("Patient Name");

        lblPatientId.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPatientId.setText("Patient ID");

        lblAge.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblAge.setText("Age");

        lblPrimaryDoctorName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPrimaryDoctorName.setText("Primary Doctor Name");

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtPatientId.setEditable(false);
        txtPatientId.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtAge.setEditable(false);
        txtAge.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(lblCreate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPatientName)
                                    .addComponent(lblPreferredPharmacy)
                                    .addComponent(lblPatientId))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPatientId)
                                    .addComponent(txtPreferredPharmacy)
                                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrimaryDoctorName)
                                    .addComponent(lblAge))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrimaryDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHeartRate)
                                            .addComponent(lblRespiratoryRate))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(54, 54, 54))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnViewVitalSign)
                                        .addGap(85, 85, 85)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDeleteVitalSign)
                                    .addComponent(lblWeight)
                                    .addComponent(lblSystolicBloodPressure))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSystolicBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreate)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientName)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientId)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrimaryDoctorName)
                            .addComponent(txtPrimaryDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreferredPharmacy)
                    .addComponent(txtPreferredPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewVitalSign)
                    .addComponent(btnDeleteVitalSign))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWeight)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSystolicBloodPressure)
                            .addComponent(txtSystolicBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRespiratoryRate)
                            .addComponent(txtRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeartRate)
                            .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalSignActionPerformed
        int selectedRow = tblVitalSigns.getSelectedRow();
        
        if(selectedRow>=0){
             VitalSign vs = (VitalSign)tblVitalSigns.getValueAt(selectedRow, 0);
             txtWeight.setText(String.valueOf(vs.getWeight()));
             txtHeartRate.setText(String.valueOf(vs.getHeartRate()));
             txtSystolicBloodPressure.setText(String.valueOf(vs.getSystolicBloodPressure()));
             txtRespiratoryRate.setText(String.valueOf(vs.getRespiratoryRate()));
        }
        else{
             JOptionPane.showMessageDialog(null, "Please select a row to View!");
        }
        
                
    }//GEN-LAST:event_btnViewVitalSignActionPerformed

    private void btnDeleteVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteVitalSignActionPerformed

        int selectedRow = tblVitalSigns.getSelectedRow();
        
        if(selectedRow>=0){
         int dialogButton= JOptionPane.YES_NO_OPTION;
         int dialogResult= JOptionPane.showConfirmDialog(null, "Would you like to delete this?", "Warning", dialogButton);
          
         if (dialogResult==JOptionPane.YES_OPTION){
             VitalSign vs = (VitalSign)tblVitalSigns.getValueAt(selectedRow, 0);
             patient.vitalSignHistory.removeVitalSign(vs);
             populateTable();
             resetFields();
          }
        }
        else{
             JOptionPane.showMessageDialog(null, "Please select a row to delete!");
        }
        
    }//GEN-LAST:event_btnDeleteVitalSignActionPerformed

 public void resetFields(){
        txtHeartRate.setText("");
        txtSystolicBloodPressure.setText("");
        txtRespiratoryRate.setText("");
        txtWeight.setText("");
      }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteVitalSign;
    private javax.swing.JButton btnViewVitalSign;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPreferredPharmacy;
    private javax.swing.JLabel lblPrimaryDoctorName;
    private javax.swing.JLabel lblRespiratoryRate;
    private javax.swing.JLabel lblSystolicBloodPressure;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPreferredPharmacy;
    private javax.swing.JTextField txtPrimaryDoctorName;
    private javax.swing.JTextField txtRespiratoryRate;
    private javax.swing.JTextField txtSystolicBloodPressure;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
