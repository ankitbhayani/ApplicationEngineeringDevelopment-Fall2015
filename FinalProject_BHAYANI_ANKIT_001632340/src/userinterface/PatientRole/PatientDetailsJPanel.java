/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

//import Business.BloodDonation;
//import Business.Employee.Donor;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.IndividualUser.Doctor;
import Business.IndividualUser.Patient;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.PatientOrganization;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import Business.Utils.MyStringVerifier;
import Business.VitalSigns.VitalSign;
import Business.WorkQueue.AppointmentWorkRequest;
import Business.WorkQueue.GetDiagnosisWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankit Bhayani
 */
public class PatientDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Patient patient;
    private Doctor doc;
    private PatientOrganization patientOrganization;
    private Enterprise enterprise;
    private Enterprise docUAenterprise;
    private EcoSystem ecoSystem;
    private VitalSign vs;
    private DoctorOrganization doctorOrganization;
    private UserAccount docUA =null; 
    
    /**
     * Creates new form DonorDetailsJPanel
     */
    public PatientDetailsJPanel(JPanel pnl, UserAccount ua, Organization o, Enterprise e, EcoSystem es) {
        initComponents();
        this.userProcessContainer = pnl;
        this.userAccount = ua;
        this.patientOrganization = (PatientOrganization)o;
        this.enterprise = e;
        this.ecoSystem = es;
        this.patient= (Patient)ua.getEmployee();
        lblDonorName.setText(userAccount.getEmployee().getName()+ "!!");
        lblAction.setText("Please select a doctor");
        txtAppointmentChooser.getDateEditor().setEnabled(false);
        popululateSearchDoc();
        btnGetDocLocation.setEnabled(false);
        btnCaptureVitalSign.setEnabled(false);
        btnScheduleAppointment.setEnabled(false);
        btnGetDiagnosis.setEnabled(false);
        
        MyStringVerifier myStringVerifier = new MyStringVerifier();
        txtPatientSymptoms.setInputVerifier(myStringVerifier);
        txtPastMedicines.setInputVerifier(myStringVerifier);
    }
    
    public void popululateSearchDoc(){
        
        DefaultTableModel model = (DefaultTableModel)docTable.getModel();
        model.setRowCount(0);
        
         for(Network n: ecoSystem.getNetworkList()){
            for(Enterprise ep: n.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o : ep.getOrganizationDirectory().getOrganizationList()){
                    if(o.getName().equalsIgnoreCase(Organization.Type.Doctor.getValue())){
                        //doctorOrganization = (DoctorOrganization)o;
                      for(Employee e: o.getEmployeeDirectory().getEmployeeList()){
                            Object[] row = new Object[4];
                            /*if(e instanceof Doctor){
                                Doctor d =(Doctor) e;
                                //d.setHospitalEnterpriseName(ep.getEnterpriseCity());
                                //d.setHospitalMapLocation(ep.getEnterpriseMap());
                            }*/
                            row[0] = (Doctor)e;
                            row[1] = ep.getEnterpriseCity();
                            row[2] = ep.getName();
                            row[3] = ep.getEnterpriseAddress();
                            model.addRow(row);
                        }
                        
                    }    
                }

             }
        }
    }

    public void populateDonorDetails(){
//        DefaultTableModel model = (DefaultTableModel)tblDonorDetails.getModel();
                
  //      model.setRowCount(0);
        
        //LabTestWorkRequest ltwruserAccount.getWorkQueue().getWorkRequestList();
        
          /*  for(BloodDonation bd: donor.getBloodDonationList()){
                //JOptionPane.showMessageDialog(null, request1.getSender());
                //String abc = ((GetDiagnosisWorkRequest) request1).getTestResult();
                //Employee e = ((GetDiagnosisWorkRequest) request1).getDonor();
                //JOptionPane.showMessageDialog(null,e.getName());
                //JOptionPane.showMessageDialog(null,abc);
                
                
                Object[] row = new Object[4];
                row[0] = bd;
                row[1] = bd.getNurse();
                row[2] = bd.getQuantity();
                row[3] = bd.getBarCode();
                

            
            model.addRow(row);
            }*/
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDonorName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSelectedDoc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSelectedDocCity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtDocSrch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        docTable = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnDoctorSrch = new javax.swing.JButton();
        lblAction = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtPatientSymptoms = new javax.swing.JTextField();
        txtPastMedicines = new javax.swing.JTextField();
        txtSystolicBloodPressure = new javax.swing.JTextField();
        lblRespiratoryRate1 = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtRespiratoryRate = new javax.swing.JTextField();
        lblSystolicBloodPressure = new javax.swing.JLabel();
        btnGetDiagnosis = new javax.swing.JButton();
        lblHeartRate1 = new javax.swing.JLabel();
        lblHeartRate = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblRespiratoryRate = new javax.swing.JLabel();
        txtHeartRate = new javax.swing.JTextField();
        btnCaptureVitalSign = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnScheduleAppointment = new javax.swing.JButton();
        txtAppointmentChooser = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbAppointmentTime = new javax.swing.JComboBox();
        btnGetDocLocation = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 246, 246));

        lblDonorName.setFont(new java.awt.Font("Calibri", 2, 16)); // NOI18N
        lblDonorName.setForeground(new java.awt.Color(0, 135, 81));
        lblDonorName.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 135, 81));
        jLabel1.setText("Welcome");

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 135, 81));
        jLabel2.setText("How are you doing today?");

        txtSelectedDoc.setEditable(false);
        txtSelectedDoc.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtSelectedDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectedDocActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("Selected Doctor");

        txtSelectedDocCity.setEditable(false);
        txtSelectedDocCity.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtSelectedDocCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectedDocCityActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setText("Doctor's City");

        backJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/backButton.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nearest Doctor Search (With Name or City) ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        docTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "City", "Hospital", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        docTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docTableMouseClicked(evt);
            }
        });
        docTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                docTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(docTable);
        if (docTable.getColumnModel().getColumnCount() > 0) {
            docTable.getColumnModel().getColumn(0).setResizable(false);
            docTable.getColumnModel().getColumn(1).setResizable(false);
            docTable.getColumnModel().getColumn(2).setResizable(false);
            docTable.getColumnModel().getColumn(3).setResizable(false);
        }

        btnRefresh.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/updateButton.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnDoctorSrch.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnDoctorSrch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/searchButton.png"))); // NOI18N
        btnDoctorSrch.setText("Search");
        btnDoctorSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorSrchActionPerformed(evt);
            }
        });

        lblAction.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        lblAction.setForeground(new java.awt.Color(102, 102, 255));
        lblAction.setText("How are you doing today?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDocSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDoctorSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAction)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDocSrch)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDoctorSrch)
                        .addComponent(btnRefresh)
                        .addComponent(lblAction)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(201, 235, 210));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Seek Online Advice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N

        txtPatientSymptoms.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtPatientSymptoms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPatientSymptomsKeyTyped(evt);
            }
        });

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

        btnGetDiagnosis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnGetDiagnosis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/solutionButton.png"))); // NOI18N
        btnGetDiagnosis.setText("Get Diagnosis");
        btnGetDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDiagnosisActionPerformed(evt);
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

        btnCaptureVitalSign.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCaptureVitalSign.setForeground(new java.awt.Color(0, 0, 255));
        btnCaptureVitalSign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/captureButton.png"))); // NOI18N
        btnCaptureVitalSign.setText("Capture Current VitalSign Using SmartDevice");
        btnCaptureVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaptureVitalSignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnCaptureVitalSign)
                .addGap(0, 158, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWeight)
                            .addComponent(lblRespiratoryRate)
                            .addComponent(lblRespiratoryRate1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientSymptoms, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(txtWeight)
                            .addComponent(txtRespiratoryRate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSystolicBloodPressure)
                                    .addComponent(lblHeartRate))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSystolicBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblHeartRate1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPastMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnGetDiagnosis)))
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnCaptureVitalSign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespiratoryRate)
                    .addComponent(txtRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeartRate)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSystolicBloodPressure)
                    .addComponent(txtSystolicBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeartRate1)
                    .addComponent(lblRespiratoryRate1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPastMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPatientSymptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnGetDiagnosis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(245, 226, 205));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Schedule Appointment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N

        btnScheduleAppointment.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnScheduleAppointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/appointmentButton.png"))); // NOI18N
        btnScheduleAppointment.setText("Get Appointment");
        btnScheduleAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleAppointmentActionPerformed(evt);
            }
        });

        txtAppointmentChooser.setDateFormatString("yyyy-MM-dd");
        txtAppointmentChooser.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setText("Select Time");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setText("Select Date");

        cmbAppointmentTime.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbAppointmentTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "(Select One)", "09:00AM", "09:30AM", "10:00AM", "10:30AM", "11:00AM", "11:30AM", "12:00PM", "12:30PM", "01:00PM", "01:30PM", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAppointmentChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbAppointmentTime, 0, 132, Short.MAX_VALUE))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(btnScheduleAppointment)
                .addGap(64, 64, 64))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAppointmentChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbAppointmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnScheduleAppointment)
                .addGap(46, 46, 46))
        );

        btnGetDocLocation.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnGetDocLocation.setForeground(new java.awt.Color(255, 0, 0));
        btnGetDocLocation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/mapButton.png"))); // NOI18N
        btnGetDocLocation.setText("Get Doctor Location (Google Map)");
        btnGetDocLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDocLocationActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel8.setText("Patient's Search Doctor And Seek Medical Advice Panel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(backJButton))
                                .addGap(0, 309, Short.MAX_VALUE)))
                        .addGap(55, 55, 55))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSelectedDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSelectedDocCity, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGetDocLocation))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDonorName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDonorName)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSelectedDocCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSelectedDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetDocLocation)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backJButton)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCaptureVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaptureVitalSignActionPerformed
        
        if(patient.getEmailAddress()==null){
            JOptionPane.showMessageDialog(null, "Please complete your Profile information first");
            return;
            
        }
        
        
            Random rand = new Random();
                   
           //JOptionPane.showMessageDialog(null, randomNum);
            txtRespiratoryRate.setText(String.valueOf(rand.nextInt(150) + 120));
            txtHeartRate.setText(String.valueOf(rand.nextInt(150) + 120));
            txtWeight.setText(String.valueOf(rand.nextInt(150) + 120));
            txtSystolicBloodPressure.setText(String.valueOf(rand.nextInt(150) + 120));
            String tStamp = String.valueOf(new Timestamp(System.currentTimeMillis()));
            
            if(!(txtRespiratoryRate.getText().isEmpty() || txtHeartRate.getText().isEmpty() ||
            txtSystolicBloodPressure.getText().isEmpty() || txtWeight.getText().isEmpty())){
            
                vs = patient.vitalSignHistory.addVitalSign();
                vs.setHeartRate(Float.valueOf(txtHeartRate.getText()));
                vs.setRespiratoryRate(Float.valueOf(txtRespiratoryRate.getText()));
                vs.setSystolicBloodPressure(Float.valueOf(txtSystolicBloodPressure.getText()));
                vs.setWeight(Float.valueOf(txtWeight.getText()));
                vs.setTimestamp(tStamp);
                btnGetDiagnosis.setEnabled(true);
                patient.setLastVitalSign(vs);
            }
                    
        /*for(VitalSign vs: patient.getVitalSignHistory().getVitalSignHistory()){
            JOptionPane.showMessageDialog(null, vs.getHeartRate());
        }*/
        
    }//GEN-LAST:event_btnCaptureVitalSignActionPerformed

    private void txtSelectedDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectedDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectedDocActionPerformed

    private void btnDoctorSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorSrchActionPerformed

        if(!txtDocSrch.getText().isEmpty()){
            DefaultTableModel model = (DefaultTableModel) docTable.getModel();
            model.setRowCount(0);
            
            Employee docs[]= new Employee[100];
            int i=0;
            String srchString=txtDocSrch.getText().toLowerCase();
            
            
            for(Network n: ecoSystem.getNetworkList()){
                for(Enterprise ep: n.getEnterpriseDirectory().getEnterpriseList()){
                    for(Organization o : ep.getOrganizationDirectory().getOrganizationList()){
                        if(o.getName().equalsIgnoreCase(Organization.Type.Doctor.getValue())){
                            for(Employee doctor: o.getEmployeeDirectory().getEmployeeList()){
                                if(doctor.getName().equalsIgnoreCase(srchString) ||
                                    doctor.getCity().equalsIgnoreCase(srchString) ||
                                    doctor.getName().toLowerCase().startsWith(srchString) ||
                                    doctor.getCity().toLowerCase().startsWith(srchString)){
                                         //JOptionPane.showMessageDialog(null,doctor.getCity());
                                         docs[i]=  doctor;
                                         
                                         i++;
                                }
                            }

                        }    
                    }

                 }
            }
            

            if(docs==null){
                JOptionPane.showMessageDialog(null, "Doctor/City not found, please try again");

            }
            else{
                model.setRowCount(0);

                for(int j=0;j!=i;j++){

                    Object[] row = new Object[3];
                   
                    row[0] = docs[j];
                    row[1] = docs[j].getCity();
                    row[2] = docs[j].getEnterpriseName();
                    model.addRow(row);
                }
            }    
        }
        else{
            JOptionPane.showMessageDialog(null, "Please input a doctor name to search");
        }
    }//GEN-LAST:event_btnDoctorSrchActionPerformed

    private void docTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_docTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_docTableKeyPressed

    private void docTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docTableMouseClicked

        lblAction.setText("");
        try{

            int selectedRow = docTable.getSelectedRow();
            doc = (Doctor)docTable.getValueAt(selectedRow, 0);
            
            txtSelectedDoc.setText(String.valueOf(doc.getName()));
            txtSelectedDocCity.setText(doc.getCity());
            //JOptionPane.showMessageDialog(null, doc.getUserAccount().getWorkQueue().getWorkRequestList());
            //JOptionPane.showMessageDialog(null, doc.getEnterpriseMapLocation());
            popululateSearchDoc();
            txtDocSrch.setText("");
            btnGetDocLocation.setEnabled(true);
            btnCaptureVitalSign.setEnabled(true);
            btnScheduleAppointment.setEnabled(true);
            
            for(Network n: ecoSystem.getNetworkList()){
                for(Enterprise ep: n.getEnterpriseDirectory().getEnterpriseList()){
                    for(Organization o : ep.getOrganizationDirectory().getOrganizationList()){
                            for(UserAccount ua : o.getUserAccountDirectory().getUserAccountList()){
                                if(ua.getEmployee().getName().equalsIgnoreCase(doc.getName())){
                                    docUA=ua;
                                    docUAenterprise= ep;
                                    break;
                                    //request.setReceiver(docUA);
                                    //JOptionPane.showMessageDialog(null, doc.getEnterpriseName());
                                }
                            }
                    }
                }    
            }

            
            

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_docTableMouseClicked

    private void txtSelectedDocCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectedDocCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectedDocCityActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PatientWorkAreaJPanel pwajp = (PatientWorkAreaJPanel) component;
        pwajp.populateVStable();
        pwajp.populateWorkReqTable();
        pwajp.populateAppointments();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        popululateSearchDoc();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnGetDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDiagnosisActionPerformed

        if(patient.getEmailAddress()==null){
            JOptionPane.showMessageDialog(null, "Please complete your Profile information first");
            return;
            
        }
        
            if(!(txtPastMedicines.getText().isEmpty() || txtPastMedicines.getText().startsWith(" ")||
                 txtPatientSymptoms.getText().isEmpty() || txtPatientSymptoms.getText().startsWith(" "))){
        
                GetDiagnosisWorkRequest request = new GetDiagnosisWorkRequest();

                Date date = new Date();

                request.setSender(userAccount);
                request.setMessage("Advice");
                request.setStatus("Sent");
                request.setPatient(patient);
                request.setRequestDate(date);

                //JOptionPane.showMessageDialog(null, doc.getName());
                //JOptionPane.showMessageDialog(null, docUA.getUsername());   
                request.setReceiver(docUA);
        //        patient.setPatientChronicDisease((String) cmbMajorDisease.getSelectedItem());
                vs.setPastMeds(txtPastMedicines.getText());
                vs.setSymptoms(txtPatientSymptoms.getText());
                request.setAssociatedVitalSign(vs);
                patient.getGetDiagnosisWorkRequestList().add(request);
                /*for(Network n: ecoSystem.getNetworkList()){
                    for(Enterprise ep: n.getEnterpriseDirectory().getEnterpriseList()){
                        for(Organization o : ep.getOrganizationDirectory().getOrganizationList()){
                                for(UserAccount ua : o.getUserAccountDirectory().getUserAccountList()){
                                    if(ua.getEmployee().getName().equalsIgnoreCase(doc.getName())){
                                        docUA=ua;
                                        request.setReceiver(docUA);
                                        JOptionPane.showMessageDialog(null, doc.getEnterpriseName());
                                    }
                                }
                        }
                    }    
                }*/

                if(docUA!=null){                 
                    
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    docUA.getWorkQueue().getWorkRequestList().add(request);
                    txtRespiratoryRate.setText("");
                    txtHeartRate.setText("");
                    txtWeight.setText("");
                    txtSystolicBloodPressure.setText("");
                    txtPastMedicines.setText("");
                    txtPatientSymptoms.setText("");
                    JOptionPane.showMessageDialog(null, "Request placed successfully");
                    btnGetDiagnosis.setEnabled(false);
                }    
            }     
            else{
                JOptionPane.showMessageDialog(null, "All fields are mandatory");
            }
     
    }//GEN-LAST:event_btnGetDiagnosisActionPerformed

    private void txtPatientSymptomsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientSymptomsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientSymptomsKeyTyped

    private void txtPastMedicinesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPastMedicinesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPastMedicinesKeyTyped

    private void btnScheduleAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleAppointmentActionPerformed

        
        if(cmbAppointmentTime.getSelectedIndex()==0){
          JOptionPane.showMessageDialog(null, "Please select a time for appointment");
          return;
        }
        
        if(patient.getEmailAddress()==null){
            JOptionPane.showMessageDialog(null, "Please complete your Profile information first");
            return;
            
        }
        
        String selectedDate= ((JTextField)txtAppointmentChooser.getDateEditor().getUiComponent()).getText() ;
        String selectedTime= (String) cmbAppointmentTime.getSelectedItem();
           
        if(!(selectedDate.isEmpty() || selectedTime.isEmpty())){ 
            AppointmentWorkRequest request = new AppointmentWorkRequest();

            Date date = new Date();
                                   
            //request.setSender(userAccount);
            request.setMessage("Appointment Request");
            request.setStatus("Under Process");
            request.setPatient(patient);
            request.setRequestDate(date);
              
           //JOptionPane.showMessageDialog(null, doc.getName());
            //UserAccount docUA =null;    
            for(Organization o : docUAenterprise.getOrganizationDirectory().getOrganizationList()){
                if(o instanceof ReceptionistOrganization){
                      o.getWorkQueue().getWorkRequestList().add(request);
                      request.setDoctor(doc);
                      request.setReceiver(docUA);
                      userAccount.getWorkQueue().getWorkRequestList().add(request);
                      break;
                }
            }
 
           request.setAppointmentDateTime(selectedDate+ " "+selectedTime);
           //JOptionPane.showMessageDialog(null,selectedDate+ " "+selectedTime);
           JOptionPane.showMessageDialog(null, "Appointment Request Placed Successfully"); 
           //btnGetDocLocation.setEnabled(false);
           // btnCaptureVitalSign.setEnabled(true);
           btnScheduleAppointment.setEnabled(false);
            
           
        }
        else{JOptionPane.showMessageDialog(null, "Please select an appointment date and time"); }
    }//GEN-LAST:event_btnScheduleAppointmentActionPerformed

    private void btnGetDocLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDocLocationActionPerformed

      if(!(doc.getEnterpriseMapLocation().isEmpty())){
            if(!(txtSelectedDoc.getText().isEmpty()|| txtSelectedDoc.getText().startsWith(" "))){ 
                JFrame test = new JFrame("Google Maps");

                try {
                    //JOptionPane.showMessageDialog(null, doc.getEnterpriseMapLocation());
                    String imageUrl = doc.getEnterpriseMapLocation();
                    String destinationFile = "images/image.jpg";
                    String str = destinationFile;
                    URL url = new URL(imageUrl);
                    InputStream is = url.openStream();
                    OutputStream os = new FileOutputStream(destinationFile);

                    byte[] b = new byte[2048];
                    int length;

                    while ((length = is.read(b)) != -1) {
                        os.write(b, 0, length);
                    }

                    is.close();
                    os.close();
                } catch (IOException e) {
                    //e.printStackTrace();
                    //System.exit(1);
                    JOptionPane.showMessageDialog(null, "Please check your internet connection!!"+e);
                }

                test.add(new JLabel(new ImageIcon((new ImageIcon("images/image.jpg")).getImage().getScaledInstance(630, 600,java.awt.Image.SCALE_SMOOTH))));

                test.setVisible(true);
                test.pack();
            }
            else{
                JOptionPane.showMessageDialog(null, "Please select a doctor to get the location");
            }
        }
        else{ JOptionPane.showMessageDialog(null, "Hospital Map is not defined in the system, please try after sometime");}
    }//GEN-LAST:event_btnGetDocLocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnCaptureVitalSign;
    private javax.swing.JButton btnDoctorSrch;
    private javax.swing.JButton btnGetDiagnosis;
    private javax.swing.JButton btnGetDocLocation;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnScheduleAppointment;
    private javax.swing.JComboBox cmbAppointmentTime;
    private javax.swing.JTable docTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAction;
    private javax.swing.JLabel lblDonorName;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblHeartRate1;
    private javax.swing.JLabel lblRespiratoryRate;
    private javax.swing.JLabel lblRespiratoryRate1;
    private javax.swing.JLabel lblSystolicBloodPressure;
    private javax.swing.JLabel lblWeight;
    private com.toedter.calendar.JDateChooser txtAppointmentChooser;
    private javax.swing.JTextField txtDocSrch;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtPastMedicines;
    private javax.swing.JTextField txtPatientSymptoms;
    private javax.swing.JTextField txtRespiratoryRate;
    private javax.swing.JTextField txtSelectedDoc;
    private javax.swing.JTextField txtSelectedDocCity;
    private javax.swing.JTextField txtSystolicBloodPressure;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
