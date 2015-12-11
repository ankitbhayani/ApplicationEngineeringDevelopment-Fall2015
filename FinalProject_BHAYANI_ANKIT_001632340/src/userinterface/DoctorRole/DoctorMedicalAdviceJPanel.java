/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.IndividualUser.Patient;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Utils.MyAlphanumericVerifier;
import Business.Utils.MyStringVerifier;
import Business.VitalSigns.VitalSign;
import Business.WorkQueue.AppointmentWorkRequest;
import Business.WorkQueue.GetDiagnosisWorkRequest;
import Business.WorkQueue.WorkRequest;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author raunak
 */
public class DoctorMedicalAdviceJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private GetDiagnosisWorkRequest req;
    private EcoSystem ecoSystem;
    private Patient patient;
            
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorMedicalAdviceJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecoSystem= ecoSystem;
        valueLabel.setText(enterprise.getName());
        if(ecoSystem.getNewsAboutDrug()!=null)
            lblEcosystemDrugNews.setText(ecoSystem.getNewsAboutDrug());
        btnSendDiagnosis.setEnabled(false);
        btnEditRequest.setEnabled(false);
        btniTextReport.setEnabled(false);
        populateRequestTable();
        populatePharmaCombo();
        MyAlphanumericVerifier myStringVerifier = new MyAlphanumericVerifier();
        txtResolution.setInputVerifier(myStringVerifier);
        txtDosagePrescribed.setInputVerifier(myStringVerifier);
        txtMedicinesPrescribed.setInputVerifier(myStringVerifier);
        
    }
    
    public void populatePharmaCombo(){
        cmbPharmacies.removeAllItems();
        //Enterprise phEnterprise=null;
        for(Network n: ecoSystem.getNetworkList()){
            for(Enterprise ep: n.getEnterpriseDirectory().getEnterpriseList()){
                if(ep instanceof PharmacyEnterprise){
                    //phEnterprise =ep;
                    cmbPharmacies.addItem(ep);
                    
                }
            }
        }    
        
        
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof GetDiagnosisWorkRequest){
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getRequestDate();
                row[2] = ((GetDiagnosisWorkRequest) request).getPatient().getName();
                row[3] = request.getStatus();
                String result = ((GetDiagnosisWorkRequest) request).getTestResult();
                row[4] = result == null ? "Waiting" : result;

                model.addRow(row);
            }
            /*else if(request instanceof AppointmentWorkRequest){
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = ((AppointmentWorkRequest) request).getAppointmentDateTime();
                row[2] = ((AppointmentWorkRequest) request).getPatient().getName();
                row[3] = request.getStatus();
                String result = ((AppointmentWorkRequest) request).getTestResult();
                row[4] = result == null ? "Waiting" : result;

                model.addRow(row);
                
                
            }*/
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtPatientSymptoms = new javax.swing.JTextField();
        txtPastMedicines = new javax.swing.JTextField();
        txtSystolicBloodPressure = new javax.swing.JTextField();
        lblRespiratoryRate1 = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtRespiratoryRate = new javax.swing.JTextField();
        lblSystolicBloodPressure = new javax.swing.JLabel();
        btnSendDiagnosis = new javax.swing.JButton();
        lblHeartRate1 = new javax.swing.JLabel();
        lblHeartRate = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblRespiratoryRate = new javax.swing.JLabel();
        txtHeartRate = new javax.swing.JTextField();
        lblSystolicBloodPressure1 = new javax.swing.JLabel();
        txtMajorDisease = new javax.swing.JTextField();
        lblWeight1 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        lblSystolicBloodPressure2 = new javax.swing.JLabel();
        txtResolution = new javax.swing.JTextField();
        txtVitalSignNoted = new javax.swing.JTextField();
        lblSystolicBloodPressure3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblHeartRate2 = new javax.swing.JLabel();
        lblSystolicBloodPressure4 = new javax.swing.JLabel();
        lblSystolicBloodPressure5 = new javax.swing.JLabel();
        cmbPharmacies = new javax.swing.JComboBox();
        txtMedicinesPrescribed = new javax.swing.JTextField();
        txtDosagePrescribed = new javax.swing.JTextField();
        lblAlertForDrug = new javax.swing.JLabel();
        btnEditRequest = new javax.swing.JButton();
        btniTextReport = new javax.swing.JButton();
        lblReqStatus = new javax.swing.JLabel();
        lblEcosystemDrugNews = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 246, 246));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "RequestDate", "Patient", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workRequestJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        jPanel2.setBackground(new java.awt.Color(243, 233, 243));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Suggest Resolution", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N

        txtPatientSymptoms.setEditable(false);
        txtPatientSymptoms.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtPatientSymptoms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPatientSymptomsKeyTyped(evt);
            }
        });

        txtPastMedicines.setEditable(false);
        txtPastMedicines.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtPastMedicines.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPastMedicinesKeyTyped(evt);
            }
        });

        txtSystolicBloodPressure.setEditable(false);
        txtSystolicBloodPressure.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblRespiratoryRate1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblRespiratoryRate1.setText("Patient Symptoms");

        lblWeight.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblWeight.setText("Weight (in Pounds)");

        txtRespiratoryRate.setEditable(false);
        txtRespiratoryRate.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblSystolicBloodPressure.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblSystolicBloodPressure.setText("Blood Pressure");

        btnSendDiagnosis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSendDiagnosis.setText("Send Diagnosis");
        btnSendDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendDiagnosisActionPerformed(evt);
            }
        });

        lblHeartRate1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblHeartRate1.setText("Past Medications");

        lblHeartRate.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblHeartRate.setText("Heart Rate");

        txtWeight.setEditable(false);
        txtWeight.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblRespiratoryRate.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblRespiratoryRate.setText("Respiratory Rate");

        txtHeartRate.setEditable(false);
        txtHeartRate.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblSystolicBloodPressure1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblSystolicBloodPressure1.setText("Major Disease");

        txtMajorDisease.setEditable(false);
        txtMajorDisease.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblWeight1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblWeight1.setText("Patient Name");

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblSystolicBloodPressure2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblSystolicBloodPressure2.setText("Resolution");

        txtResolution.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        txtVitalSignNoted.setEditable(false);
        txtVitalSignNoted.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblSystolicBloodPressure3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblSystolicBloodPressure3.setText("Vital Sign TimeStamp");

        jPanel1.setBackground(new java.awt.Color(254, 231, 185));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102))));

        lblHeartRate2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblHeartRate2.setText("Medicines");

        lblSystolicBloodPressure4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblSystolicBloodPressure4.setText("Choose Pharmacy");

        lblSystolicBloodPressure5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblSystolicBloodPressure5.setText("Dosage");

        cmbPharmacies.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmbPharmacies.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtMedicinesPrescribed.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtMedicinesPrescribed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMedicinesPrescribedKeyPressed(evt);
            }
        });

        txtDosagePrescribed.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtDosagePrescribed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDosagePrescribedKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSystolicBloodPressure4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbPharmacies, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeartRate2)
                    .addComponent(lblSystolicBloodPressure5))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDosagePrescribed)
                    .addComponent(txtMedicinesPrescribed, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbPharmacies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSystolicBloodPressure4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeartRate2)
                            .addComponent(txtMedicinesPrescribed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSystolicBloodPressure5)
                            .addComponent(txtDosagePrescribed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        lblAlertForDrug.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblAlertForDrug.setForeground(new java.awt.Color(255, 51, 51));

        btnEditRequest.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnEditRequest.setText("Edit Diagnosis");
        btnEditRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditRequestActionPerformed(evt);
            }
        });

        btniTextReport.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btniTextReport.setText("Report");
        btniTextReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniTextReportActionPerformed(evt);
            }
        });

        lblReqStatus.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        lblReqStatus.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblRespiratoryRate)
                                .addGap(18, 18, 18)
                                .addComponent(txtRespiratoryRate))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblWeight1)
                                .addGap(34, 34, 34)
                                .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblWeight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHeartRate)
                                    .addComponent(lblSystolicBloodPressure))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSystolicBloodPressure))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblSystolicBloodPressure1)
                                .addGap(18, 18, 18)
                                .addComponent(txtMajorDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRespiratoryRate1)
                            .addComponent(lblSystolicBloodPressure3))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPatientSymptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblHeartRate1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPastMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtVitalSignNoted, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblSystolicBloodPressure2)
                        .addGap(48, 48, 48)
                        .addComponent(txtResolution, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(lblAlertForDrug)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(btnSendDiagnosis))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnEditRequest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btniTextReport)
                        .addGap(33, 33, 33)
                        .addComponent(lblReqStatus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditRequest)
                    .addComponent(btniTextReport)
                    .addComponent(lblReqStatus))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight1)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSystolicBloodPressure1)
                    .addComponent(txtMajorDisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSystolicBloodPressure3)
                    .addComponent(txtVitalSignNoted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRespiratoryRate)
                            .addComponent(txtRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRespiratoryRate1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWeight)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblHeartRate1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPastMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPatientSymptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeartRate)
                            .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSystolicBloodPressure)
                            .addComponent(txtSystolicBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSystolicBloodPressure2)
                        .addComponent(txtResolution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblAlertForDrug)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(btnSendDiagnosis)
                .addGap(22, 22, 22))
        );

        lblEcosystemDrugNews.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        lblEcosystemDrugNews.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(refreshTestJButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(337, 337, 337)
                    .addComponent(lblEcosystemDrugNews)
                    .addContainerGap(714, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(refreshTestJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(lblEcosystemDrugNews)
                    .addContainerGap(550, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditRequestActionPerformed

        lblReqStatus.setText("");
        btnSendDiagnosis.setEnabled(true);
                
    }//GEN-LAST:event_btnEditRequestActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void txtPatientSymptomsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientSymptomsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientSymptomsKeyTyped

    private void txtPastMedicinesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPastMedicinesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPastMedicinesKeyTyped

    private void btnSendDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendDiagnosisActionPerformed

        if(!(txtResolution.getText().isEmpty())){
            if(txtDosagePrescribed.getText().isEmpty() && txtMedicinesPrescribed.getText().isEmpty()){
                int dialogResult=JOptionPane.showConfirmDialog(null, "Would you like to send diagnosis without prescription?","Warning",JOptionPane.YES_NO_OPTION);
                
                if(dialogResult== JOptionPane.YES_OPTION){
                    req.setTestResult(txtResolution.getText());
                    req.setStatus("Completed");
                                        
                    txtHeartRate.setText("");
                    txtRespiratoryRate.setText("");
                    txtWeight.setText("");
                    txtSystolicBloodPressure.setText("");
                    txtMajorDisease.setText("");
                    txtPastMedicines.setText("");
                    txtPatientSymptoms.setText("");
                    txtPatientName.setText("");
                    txtResolution.setText("");

                    btnSendDiagnosis.setEnabled(false);
                    
                    populateRequestTable();
                }
                else{
                 
                    lblAlertForDrug.setText("Please enter the drug prescription and dosage details!");
                }
            }
            else{
                    req.setTestResult(txtResolution.getText());
                    req.setStatus("With Pharmacist");
                    
                    req.setPrescribedMedicines(txtMedicinesPrescribed.getText());
                    req.setDosage(txtDosagePrescribed.getText());
                    
                    Enterprise phEnterprise =(Enterprise)cmbPharmacies.getSelectedItem();
                    phEnterprise.getWorkQueue().getWorkRequestList().add(req);
                                        
                    txtHeartRate.setText("");
                    txtRespiratoryRate.setText("");
                    txtWeight.setText("");
                    txtSystolicBloodPressure.setText("");
                    txtMajorDisease.setText("");
                    txtPastMedicines.setText("");
                    txtPatientSymptoms.setText("");
                    txtPatientName.setText("");
                    txtResolution.setText("");
                    txtDosagePrescribed.setText("");
                    txtMedicinesPrescribed.setText("");
                    txtVitalSignNoted.setText("");

                    btnSendDiagnosis.setEnabled(false);
                    
                    populateRequestTable();
                
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Defining resolution is mandatory");
        }

    }//GEN-LAST:event_btnSendDiagnosisActionPerformed

    private void workRequestJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTableMouseClicked
        
        
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
                           
        req = (GetDiagnosisWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        
        patient= req.getPatient();
        txtHeartRate.setText(String.valueOf(req.getAssociatedVitalSign().getHeartRate()));
        txtRespiratoryRate.setText(String.valueOf(req.getAssociatedVitalSign().getRespiratoryRate()));
        txtWeight.setText(String.valueOf(req.getAssociatedVitalSign().getWeight()));
        txtSystolicBloodPressure.setText(String.valueOf(req.getAssociatedVitalSign().getSystolicBloodPressure()));
        txtMajorDisease.setText(req.getPatient().getPatientChronicDisease());
        txtPastMedicines.setText(req.getAssociatedVitalSign().getPastMeds());
        txtPatientSymptoms.setText(req.getAssociatedVitalSign().getSymptoms());
        txtPatientName.setText(req.getPatient().getName());
        txtVitalSignNoted.setText(req.getAssociatedVitalSign().getTimestamp());
        
        btniTextReport.setEnabled(true);
        if(req.getStatus().equalsIgnoreCase("Completed") ||req.getStatus().equalsIgnoreCase("With Pharamacist") ){
            btnSendDiagnosis.setEnabled(false);
            txtResolution.setText(req.getTestResult());
            
        }
        else{lblReqStatus.setText("Please click on edit Request to send the report");
            btnEditRequest.setEnabled(true);}
    }//GEN-LAST:event_workRequestJTableMouseClicked

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        //Component[] componentArray = userProcessContainer.getComponents();
        //Component component = componentArray[componentArray.length - 1];
        //DoctorMedicalAdviceJPanel dwjp = (DoctorMedicalAdviceJPanel) component;
        //dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void txtMedicinesPrescribedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedicinesPrescribedKeyPressed
        lblAlertForDrug.setText("");
    }//GEN-LAST:event_txtMedicinesPrescribedKeyPressed

    private void txtDosagePrescribedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDosagePrescribedKeyPressed
        lblAlertForDrug.setText("");
    }//GEN-LAST:event_txtDosagePrescribedKeyPressed

    private void btniTextReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniTextReportActionPerformed

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("reports/patientReport.pdf"));
            document.open();
            Image image = Image.getInstance("reports/logo_ecare.gif");
            document.add(image);
            
            document.add(new Paragraph(txtPatientName.getText(), FontFactory.getFont(FontFactory.TIMES_BOLDITALIC,18,Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph(new Date().toString()));
            document.add(new Paragraph("------------------------------------------------------------------------------------------------------------------------"));
            
            PdfPTable pdfTable = new PdfPTable(2);
            PdfPCell cell = new PdfPCell(new Paragraph("Below VitalSign taken at " + txtVitalSignNoted.getText()));
            cell.setColspan(4);
            cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell.setPadding(10.0f);
            pdfTable.addCell(cell);
            pdfTable.addCell("Heart Rate");
            pdfTable.addCell(txtHeartRate.getText());
            pdfTable.addCell("Respiratory Rate");
            pdfTable.addCell(txtRespiratoryRate.getText());
            pdfTable.addCell("Blood Pressure");
            pdfTable.addCell(txtSystolicBloodPressure.getText());
            pdfTable.addCell("Weight");
            pdfTable.addCell(txtWeight.getText());
            document.add(pdfTable);
            
            /*com.itextpdf.text.List list = new com.itextpdf.text.List();
            list.add("First Element");
            list.add("Second Element");
            list.add("Third Element");
            list.add("Fourth Element");
            document.add(list);*/
            
            String legend=null;
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            for(VitalSign vs: patient.vitalSignHistory.getVitalSignHistory()){

                /*if(vs.getState().equalsIgnoreCase("ABNORMAL"))
                legend=vs.getTimestamp().concat(" (" +vs.getState()+")");
                else*/
                legend=vs.getTimestamp();

                dataset.addValue(vs.getRespiratoryRate(), legend, "Respiratory Rate");
                dataset.addValue(vs.getHeartRate(), legend, "Heart Rate");
                dataset.addValue(vs.getSystolicBloodPressure(), legend, "Blood Pressure");
                dataset.addValue(vs.getWeight(), legend, "Weight");

            }

            JFreeChart chart = ChartFactory.createBarChart3D("Vital Signs","Vital Signs","Values", dataset,PlotOrientation.VERTICAL,true, true, true);
            CategoryPlot P = chart.getCategoryPlot();
            P.setRangeGridlinePaint(Color.BLACK);

            /*ChartFrame frame  = new ChartFrame("Bar Charts",chart);
            frame.setVisible(true);
            frame.setSize(650, 550);*/

            try{
                final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
                final File file1 = new File("reports/BarGraph.png");
                ChartUtilities.saveChartAsPNG(file1, chart, 600, 400);
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
            document.add(new Paragraph("                                                           "));
            document.add(new Chunk("CHART       ",FontFactory.getFont(FontFactory.TIMES,18,Font.BOLD,BaseColor.BLUE)));
            Image graphImage;
            graphImage = Image.getInstance("reports/BarGraph.png");
            graphImage.scaleAbsolute(450,300);
            document.add(graphImage);
            
            
                       
            
            document.close();
            btniTextReport.setEnabled(false);
            //JOptionPane.showMessageDialog(null, "Report Saved!");
            
              try {

		File pdfFile = new File("reports/patientReport.pdf");
		if (pdfFile.exists()) {

			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				System.out.println("Awt Desktop is not supported!");
			}

		} 
                else {
			JOptionPane.showMessageDialog(null,"File does not exists!");
		}

		//System.out.println("Done");

	  } catch (Exception ex) {
		JOptionPane.showMessageDialog(null,ex);
	  }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btniTextReportActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnEditRequest;
    private javax.swing.JButton btnSendDiagnosis;
    private javax.swing.JButton btniTextReport;
    private javax.swing.JComboBox cmbPharmacies;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlertForDrug;
    private javax.swing.JLabel lblEcosystemDrugNews;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblHeartRate1;
    private javax.swing.JLabel lblHeartRate2;
    private javax.swing.JLabel lblReqStatus;
    private javax.swing.JLabel lblRespiratoryRate;
    private javax.swing.JLabel lblRespiratoryRate1;
    private javax.swing.JLabel lblSystolicBloodPressure;
    private javax.swing.JLabel lblSystolicBloodPressure1;
    private javax.swing.JLabel lblSystolicBloodPressure2;
    private javax.swing.JLabel lblSystolicBloodPressure3;
    private javax.swing.JLabel lblSystolicBloodPressure4;
    private javax.swing.JLabel lblSystolicBloodPressure5;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblWeight1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JTextField txtDosagePrescribed;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtMajorDisease;
    private javax.swing.JTextField txtMedicinesPrescribed;
    private javax.swing.JTextField txtPastMedicines;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientSymptoms;
    private javax.swing.JTextField txtResolution;
    private javax.swing.JTextField txtRespiratoryRate;
    private javax.swing.JTextField txtSystolicBloodPressure;
    private javax.swing.JTextField txtVitalSignNoted;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
