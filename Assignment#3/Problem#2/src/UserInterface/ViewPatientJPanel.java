/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Patient;
import Business.Person;
import Business.VitalSign;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.Timestamp;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetGroup;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;


public class ViewPatientJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Patient patient;    
    private Person person;
    private ManagePersonPatientJPanel mppjp;
    
    public ViewPatientJPanel(JPanel upc,Patient p, Person ps, ManagePersonPatientJPanel mppjp){
    initComponents();
    this.patient=p;
    this.userProcessContainer=upc;
    this.person=ps;
    this.mppjp=mppjp;
    //JOptionPane.showMessageDialog(this, p.getPatientId());
    btnSaveVS.setEnabled(false);
    populateTable();
    populatePatientDetails(p);
    
    //btnViewBars.setEnabled(false);
    btnViewPieChart.setEnabled(false);
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
    txtPatientName.setText(person.getPersonName());
    txtPatientId.setText(String.valueOf(p.getPatientId()));
    txtPreferredPharmacy.setText(p.getPreferredPharmacy());
    txtPrimaryDoctorName.setText(p.getPrimaryDocName());
    txtAge.setText(String.valueOf(person.getAge()));
     
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
        btnAddMoreVitalSign = new javax.swing.JButton();
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
        btnBackToPS = new javax.swing.JButton();
        btnViewPieChart = new javax.swing.JButton();
        btnUpdateVitalSign = new javax.swing.JButton();
        btnViewBars = new javax.swing.JButton();
        lblPatientStatus = new javax.swing.JLabel();
        btnViewUpdatePD = new javax.swing.JButton();
        lblCreate1 = new javax.swing.JLabel();
        btnSaveVS = new javax.swing.JButton();

        lblCreate.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblCreate.setText("Patient Details");

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
        tblVitalSigns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVitalSignsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVitalSigns);
        if (tblVitalSigns.getColumnModel().getColumnCount() > 0) {
            tblVitalSigns.getColumnModel().getColumn(0).setResizable(false);
            tblVitalSigns.getColumnModel().getColumn(1).setResizable(false);
        }

        btnAddMoreVitalSign.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAddMoreVitalSign.setText("Add More");
        btnAddMoreVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMoreVitalSignActionPerformed(evt);
            }
        });

        btnDeleteVitalSign.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnDeleteVitalSign.setText("Delete VS");
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

        btnBackToPS.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBackToPS.setText("<<Back");
        btnBackToPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToPSActionPerformed(evt);
            }
        });

        btnViewPieChart.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnViewPieChart.setText("Pie Chart");
        btnViewPieChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPieChartActionPerformed(evt);
            }
        });

        btnUpdateVitalSign.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnUpdateVitalSign.setText("Update VS");
        btnUpdateVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateVitalSignActionPerformed(evt);
            }
        });

        btnViewBars.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnViewBars.setText("Bar Graphs");
        btnViewBars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBarsActionPerformed(evt);
            }
        });

        lblPatientStatus.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        lblPatientStatus.setForeground(new java.awt.Color(204, 0, 0));

        btnViewUpdatePD.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnViewUpdatePD.setText("View/Update Personal Details");
        btnViewUpdatePD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUpdatePDActionPerformed(evt);
            }
        });

        lblCreate1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblCreate1.setText("Vital Sign (VS) Details");

        btnSaveVS.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSaveVS.setText("Save");
        btnSaveVS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveVSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrimaryDoctorName)
                                    .addComponent(lblAge))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrimaryDoctorName, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(txtAge)))
                            .addComponent(btnViewUpdatePD)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(lblCreate))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(btnAddMoreVitalSign)
                                        .addGap(38, 38, 38)
                                        .addComponent(btnDeleteVitalSign)
                                        .addGap(42, 42, 42)
                                        .addComponent(btnViewBars))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblWeight)
                                            .addComponent(lblSystolicBloodPressure)
                                            .addComponent(lblHeartRate)
                                            .addComponent(lblRespiratoryRate))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSystolicBloodPressure)
                                            .addComponent(txtWeight)
                                            .addComponent(txtHeartRate)
                                            .addComponent(txtRespiratoryRate)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnViewPieChart)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpdateVitalSign)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSaveVS))))
                            .addComponent(btnBackToPS)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(lblCreate1)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(419, 419, 419)
                    .addComponent(lblPatientStatus)
                    .addContainerGap(283, Short.MAX_VALUE)))
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
                    .addComponent(txtPreferredPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewUpdatePD))
                .addGap(21, 21, 21)
                .addComponent(lblCreate1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddMoreVitalSign)
                            .addComponent(btnDeleteVitalSign)
                            .addComponent(btnViewBars)
                            .addComponent(btnViewPieChart)
                            .addComponent(btnUpdateVitalSign)
                            .addComponent(btnSaveVS)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRespiratoryRate)
                            .addComponent(txtRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeartRate)
                            .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWeight)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSystolicBloodPressure)
                            .addComponent(txtSystolicBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addGap(41, 41, 41)
                .addComponent(btnBackToPS)
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(174, 174, 174)
                    .addComponent(lblPatientStatus)
                    .addContainerGap(359, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMoreVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMoreVitalSignActionPerformed
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
        
                
    }//GEN-LAST:event_btnAddMoreVitalSignActionPerformed

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

    private void btnBackToPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToPSActionPerformed
                userProcessContainer.remove(this);
      /* Component[] components = userProcessContainer.getComponents();
       Component component = components[components.length - 1];
       ManagePersonPatientJPanel manageAccountJPanel = (ManagePersonPatientJPanel)component;
        manageAccountJPanel.refreshtable(); */
        //managePersonPatientJPanel.refreshtable();
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackToPSActionPerformed

    private void tblVitalSignsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVitalSignsMouseClicked
        try{
            
            lblPatientStatus.setText("");
            int selectedRow = tblVitalSigns.getSelectedRow();
        
             VitalSign vs = (VitalSign)tblVitalSigns.getValueAt(selectedRow, 0);
             txtWeight.setText(String.valueOf(vs.getWeight()));
             txtHeartRate.setText(String.valueOf(vs.getHeartRate()));
             txtSystolicBloodPressure.setText(String.valueOf(vs.getSystolicBloodPressure()));
             txtRespiratoryRate.setText(String.valueOf(vs.getRespiratoryRate()));
        
             if(vs.getState().equalsIgnoreCase("ABNORMAL"))
                 lblPatientStatus.setText("ALERT!!! ABNORMAL VITAL SIGN..");
             
             btnViewPieChart.setEnabled(true);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tblVitalSignsMouseClicked

    private void btnViewPieChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPieChartActionPerformed
        
             String weight=txtWeight.getText();
             String hrtRate=txtHeartRate.getText();
             String bp=txtSystolicBloodPressure.getText();
             String respiRate=txtRespiratoryRate.getText();
             
             DefaultPieDataset pieDataset = new DefaultPieDataset();
            
             pieDataset.setValue("Respiratory Rate", new Float(respiRate));
             pieDataset.setValue("Heart Rate", new Float(hrtRate));
             pieDataset.setValue("Blood Pressure", new Float(bp));
             pieDataset.setValue("Weight", new Float(weight));
             
             JFreeChart chart = ChartFactory.createPieChart("Pie chart", pieDataset, true, true, true);
                        
             PiePlot P = (PiePlot)chart.getPlot();
             
             ChartFrame frame  = new ChartFrame("Pie Charrt",chart);
             frame.setVisible(true);
             frame.setSize(450, 500);
                     
             
             
    }//GEN-LAST:event_btnViewPieChartActionPerformed

    private void btnUpdateVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateVitalSignActionPerformed

        lblPatientStatus.setText("");
        int selectedRow = tblVitalSigns.getSelectedRow();
        
        if(selectedRow>=0){
         int dialogButton= JOptionPane.YES_NO_OPTION;
         int dialogResult= JOptionPane.showConfirmDialog(null, "Would you like to update this?", "Warning", dialogButton);
          
         if (dialogResult==JOptionPane.YES_OPTION){
             txtRespiratoryRate.setEditable(true);
             txtHeartRate.setEditable(true);
             txtSystolicBloodPressure.setEditable(true);
             txtWeight.setEditable(true);
             btnSaveVS.setEnabled(true);
             btnUpdateVitalSign.setEnabled(false);

          }
        }
        else{
             JOptionPane.showMessageDialog(null, "Please select a row to update!");
        }
    }//GEN-LAST:event_btnUpdateVitalSignActionPerformed

    private void btnViewBarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBarsActionPerformed
        
             String legend=null;
             DefaultCategoryDataset dataset = new DefaultCategoryDataset();
             
                for(VitalSign vs: patient.vitalSignHistory.getVitalSignHistory()){
                        
                    if(vs.getState().equalsIgnoreCase("ABNORMAL"))    
                        legend=vs.getTimestamp().concat(" (" +vs.getState()+")");
                    else
                        legend=vs.getTimestamp();
                    
                    dataset.addValue(vs.getRespiratoryRate(), legend, "Respiratory Rate");
                    dataset.addValue(vs.getHeartRate(), legend, "Heart Rate");
                    dataset.addValue(vs.getSystolicBloodPressure(), legend, "Blood Pressure");
                    dataset.addValue(vs.getWeight(), legend, "Weight");
 
                }
            
            JFreeChart chart = ChartFactory.createBarChart3D("Vital Signs","Vital Signs","Values", dataset,PlotOrientation.VERTICAL,true, true, true);
            CategoryPlot P = chart.getCategoryPlot();
            P.setRangeGridlinePaint(Color.BLACK);
                       
            ChartFrame frame  = new ChartFrame("Bar Charts",chart);
            frame.setVisible(true);
            frame.setSize(650, 550);
                     
             
    }//GEN-LAST:event_btnViewBarsActionPerformed

    private void btnViewUpdatePDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUpdatePDActionPerformed

                ViewPersonJPanel viewAccountJPanel = new ViewPersonJPanel(userProcessContainer,person,mppjp);
                userProcessContainer.add("ViewAccountJPanel",viewAccountJPanel);
                CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
                cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewUpdatePDActionPerformed

    private void btnSaveVSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveVSActionPerformed
        
        int selectedRow = tblVitalSigns.getSelectedRow();
        if(!(txtRespiratoryRate.getText().isEmpty() || txtHeartRate.getText().isEmpty() ||
              txtSystolicBloodPressure.getText().isEmpty() || txtWeight.getText().isEmpty())){
           
                int age = person.getAge();
                String tStamp = String.valueOf(new Timestamp(System.currentTimeMillis()));
                float respiRate = Float.valueOf(txtRespiratoryRate.getText());
                float hrtRate = Float.valueOf(txtHeartRate.getText());
                float sysBP = Float.valueOf(txtSystolicBloodPressure.getText());
                float wt = Float.valueOf(txtWeight.getText());
                

                VitalSign vitalSign = (VitalSign)tblVitalSigns.getValueAt(selectedRow, 0);

                if(age>=1 && age<=3){
                    if((respiRate>=20 && respiRate<=30) && (hrtRate>=80 && hrtRate<=130) &&
                       (sysBP>=80 && sysBP<=110) && (wt>=22 && wt<=31)){
                      //  JOptionPane.showMessageDialog(null, "Inside Toddler");
                        vitalSign.setState("NORMAL");
                    }
                    else {vitalSign.setState("ABNORMAL");}
                }
                else if(age>=4 && age<=5){
                    if((respiRate>=20 && respiRate<=30) && (hrtRate>=80 && hrtRate<=120) &&
                       (sysBP>=80 && sysBP<=110) && (wt>=31 && wt<=40)){
                      //  JOptionPane.showMessageDialog(null, "Inside Preschooler");
                        vitalSign.setState("NORMAL");
                    }
                    else {vitalSign.setState("ABNORMAL");}
                }
                else if(age>=6 && age<=12){
                    if((respiRate>=20 && respiRate<=30) && (hrtRate>=70 && hrtRate<=110) &&
                       (sysBP>=80 && sysBP<=120) && (wt>=41 && wt<=92)){
                       // JOptionPane.showMessageDialog(null, "Inside School Age");
                        vitalSign.setState("NORMAL");
                    }
                    else {vitalSign.setState("ABNORMAL");}
                }
                else if(age>=13){
                    if((respiRate>=12 && respiRate<=20) && (hrtRate>=55 && hrtRate<=105) &&
                       (sysBP>=110 && sysBP<=120) && (wt>=110)){
                       // JOptionPane.showMessageDialog(null, "Inside Adolescent");
                        vitalSign.setState("NORMAL");
                    }
                    else {vitalSign.setState("ABNORMAL");}
                }

                vitalSign.setRespiratoryRate(respiRate);
                vitalSign.setHeartRate(hrtRate);
                vitalSign.setSystolicBloodPressure(sysBP);
                vitalSign.setWeight(wt);
                vitalSign.setTimestamp(tStamp);
             
             populateTable();
             //resetFields();
             //lblPatientStatus.setText("Patient Vital Signs updated successfully!");
             JOptionPane.showMessageDialog(null, "Please select a row to update!");
             btnSaveVS.setEnabled(false);
             btnUpdateVitalSign.setEnabled(true);
             txtRespiratoryRate.setEditable(false);
             txtHeartRate.setEditable(false);
             txtSystolicBloodPressure.setEditable(false);
             txtWeight.setEditable(false);
             
             }
    }//GEN-LAST:event_btnSaveVSActionPerformed

 public void resetFields(){
        txtHeartRate.setText("");
        txtSystolicBloodPressure.setText("");
        txtRespiratoryRate.setText("");
        txtWeight.setText("");
      }     
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMoreVitalSign;
    private javax.swing.JButton btnBackToPS;
    private javax.swing.JButton btnDeleteVitalSign;
    private javax.swing.JButton btnSaveVS;
    private javax.swing.JButton btnUpdateVitalSign;
    private javax.swing.JButton btnViewBars;
    private javax.swing.JButton btnViewPieChart;
    private javax.swing.JButton btnViewUpdatePD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblCreate1;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientStatus;
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
