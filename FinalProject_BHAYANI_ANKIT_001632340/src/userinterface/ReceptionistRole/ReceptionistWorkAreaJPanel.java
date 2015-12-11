/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReceptionistRole;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.*;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.IndividualUser.Doctor;
import Business.IndividualUser.Patient;
import Business.Network.Network;
import Business.Organization.PatientOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentWorkRequest;
import Business.WorkQueue.GetDiagnosisWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ReceptionistOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private AppointmentWorkRequest appointmentWorkRequest;
    private String appointmentTimeRequested;
    private Doctor doctor;
    private Employee nurse;
    private Patient patient;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public ReceptionistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ReceptionistOrganization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
        populateDonorTable();
        btnPlaceAnAppointment.setEnabled(false);
        btnMail.setEnabled(false);
        btnSuggestTime.setEnabled(false);
        cmbAppointmentTime.setEnabled(false);
        txtAppointmentChooser.setEnabled(false);
        
        populateNurseCombo();
    }
    
    public void populateNurseCombo(){
        
      DefaultTableModel model = (DefaultTableModel) NurseTable.getModel();
        model.setRowCount(0);
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof NurseOrganization){
                org = organization;
                break;
            }
        }
        
        int no=0;
        for (Employee nurse : org.getEmployeeDirectory().getEmployeeList()){
             for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                if(ua.getEmployee().getName().equals(nurse.getName())){
                    no=ua.getWorkQueue().getWorkRequestList().size();
                    break;
                }
            }
            
            Object[] row = new Object[2];
            row[0] = nurse;
            row[1] = no;
            model.addRow(row);
        }


    }
        
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            if(request instanceof AppointmentWorkRequest){
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = ((AppointmentWorkRequest) request).getDoctor();
                row[2] = ((AppointmentWorkRequest) request).getPatient().getName();
                //row[2] = ((AppointmentWorkRequest) request).getDoctor().getName()== null ? null : ((AppointmentWorkRequest) request).getDoctor().getName();
                row[3] = ((AppointmentWorkRequest) request).getAppointmentDateTime();
                row[4] = request.getStatus();
                String result = ((AppointmentWorkRequest) request).getTestResult();
                row[5] = result == null ? "Waiting" : result;

                model.addRow(row);
                
            }
        }
    }
    
    public void populateDonorTable(){
      /*  DefaultTableModel model = (DefaultTableModel) DonorTable.getModel();
        
        model.setRowCount(0);        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof PatientOrganization){
                org = organization;
                break;
            }
        }
                
        for (Employee donor : org.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = donor;
            //row[1] = donor.getReceiver();
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

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnNurseSrch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        NurseTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtNurseSrch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAppointmentTiming = new javax.swing.JTable();
        lblDoctorName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPlaceAnAppointment = new javax.swing.JButton();
        btnSuggestTime = new javax.swing.JButton();
        lblTimeClash = new javax.swing.JLabel();
        lblScheduled = new javax.swing.JLabel();
        cmbAppointmentTime = new javax.swing.JComboBox();
        txtAppointmentChooser = new com.toedter.calendar.JDateChooser();
        txtSelectedNurse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnMail = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 249, 249));

        enterpriseLabel.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        valueLabel.setText("<value>");

        jPanel1.setBackground(new java.awt.Color(255, 249, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)), "Appointment Requests", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request", "Doctor", "Patient", "DateAndTime", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            workRequestJTable.getColumnModel().getColumn(5).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(5).setPreferredWidth(280);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 249, 249));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255)));

        btnNurseSrch.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnNurseSrch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/searchButton.png"))); // NOI18N
        btnNurseSrch.setText("Search");
        btnNurseSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNurseSrchActionPerformed(evt);
            }
        });

        NurseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nurse Name", "Request Count"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        NurseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NurseTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(NurseTable);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Select Nurse");

        txtNurseSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNurseSrchActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 249, 249));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        tblAppointmentTiming.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date and Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAppointmentTiming);
        if (tblAppointmentTiming.getColumnModel().getColumnCount() > 0) {
            tblAppointmentTiming.getColumnModel().getColumn(0).setResizable(false);
        }

        lblDoctorName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblDoctorName.setForeground(new java.awt.Color(51, 102, 0));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Booked Slots :");

        btnPlaceAnAppointment.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnPlaceAnAppointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/appointmentButton.png"))); // NOI18N
        btnPlaceAnAppointment.setText("Place an Appointment");
        btnPlaceAnAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceAnAppointmentActionPerformed(evt);
            }
        });

        btnSuggestTime.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSuggestTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/1449760826_add.png"))); // NOI18N
        btnSuggestTime.setText("Suggest New Time");
        btnSuggestTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuggestTimeActionPerformed(evt);
            }
        });

        lblTimeClash.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTimeClash.setForeground(new java.awt.Color(255, 0, 0));

        lblScheduled.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblScheduled.setForeground(new java.awt.Color(0, 0, 204));

        cmbAppointmentTime.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbAppointmentTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00AM", "09:30AM", "10:00AM", "10:30AM", "11:00AM", "11:30AM", "12:00PM", "12:30PM", "01:00PM", "01:30PM", " " }));

        txtAppointmentChooser.setDateFormatString("yyyy-MM-dd");
        txtAppointmentChooser.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        txtSelectedNurse.setEditable(false);
        txtSelectedNurse.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtSelectedNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectedNurseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Selected Nurse");

        btnMail.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/1449760875_mail.png"))); // NOI18N
        btnMail.setText("Mail");
        btnMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDoctorName))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAppointmentChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnPlaceAnAppointment)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnSuggestTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSelectedNurse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAppointmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblScheduled)
                            .addComponent(lblTimeClash))
                        .addGap(299, 299, 299))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMail, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDoctorName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtSelectedNurse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnPlaceAnAppointment)
                                .addComponent(lblTimeClash))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblScheduled)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAppointmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAppointmentChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSuggestTime)
                        .addGap(18, 18, 18)
                        .addComponent(btnMail)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(196, 196, 196))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNurseSrch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNurseSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 796, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNurseSrch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNurseSrch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaceAnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceAnAppointmentActionPerformed

        if(txtSelectedNurse.getText().trim().length()==0){
            lblTimeClash.setText("Please select a nurse to perform the physical exam");
            return;
        }
        
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount ua : o.getUserAccountDirectory().getUserAccountList()){
                if(ua.getEmployee().getName().equalsIgnoreCase(doctor.getName())){
                    //JOptionPane.showMessageDialog(null, ua.getWorkQueue().getWorkRequestList().size());
                    ua.getWorkQueue().getWorkRequestList().add(appointmentWorkRequest);
                    break;
                }
            }
        }
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof NurseOrganization){
                    org = organization;
                    break;
            }
        }

        UserAccount nurseUa=null;
        for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
            if(ua.getEmployee().getName().equals(txtSelectedNurse.getText())){
                    nurseUa = ua;
            }
        }
        
        
        if(nurseUa!=null){
            nurseUa.getWorkQueue().getWorkRequestList().add(appointmentWorkRequest);
            doctor.getScheduleList().add(appointmentTimeRequested);
            appointmentWorkRequest.setStatus("Scheduled");
            appointmentWorkRequest.setSender(userAccount);
            btnPlaceAnAppointment.setEnabled(false);
            txtSelectedNurse.setText("");
            btnMail.setEnabled(true);
            populateNurseCombo();
            populateschedule(false);
            populateRequestTable();
        }
    }//GEN-LAST:event_btnPlaceAnAppointmentActionPerformed

    private void workRequestJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTableMouseClicked
              
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
                           
        appointmentWorkRequest = (AppointmentWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        appointmentTimeRequested = appointmentWorkRequest.getAppointmentDateTime();
        doctor = appointmentWorkRequest.getDoctor();
        patient = appointmentWorkRequest.getPatient();
        
        if(doctor.getScheduleList().size()>1)       
            lblDoctorName.setText("Dr. "+doctor.getName() + " has following " + doctor.getScheduleList().size() + " appointments :");
        else
            lblDoctorName.setText("Dr. "+doctor.getName() + " has " + doctor.getScheduleList().size() + " appointment :");
        //JOptionPane.showMessageDialog(null, doctor.getScheduleList().size());
        if(appointmentWorkRequest.getStatus().equalsIgnoreCase("Scheduled")){
            populateschedule(false);
            lblScheduled.setText("Successfully Scheduled");
            lblTimeClash.setText("");
        }
        else if(appointmentWorkRequest.getStatus().equalsIgnoreCase("Declined")){
            populateschedule(false);
            lblScheduled.setText("Time suggested to reschedule");
            lblTimeClash.setText("");
        }
        else if(appointmentWorkRequest.getStatus().equalsIgnoreCase("Completed")){
            populateschedule(false);
            lblScheduled.setText("Completed");
            lblTimeClash.setText("");
        }
        else{
            populateschedule(true);
            lblScheduled.setText("");
            //lblTimeClash.setText("");
        }
     
     
    }//GEN-LAST:event_workRequestJTableMouseClicked

    private void btnSuggestTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuggestTimeActionPerformed
        
        String selectedDate= ((JTextField)txtAppointmentChooser.getDateEditor().getUiComponent()).getText() ;
        String selectedTime= (String) cmbAppointmentTime.getSelectedItem();
        
        if(!(selectedDate.isEmpty() || selectedTime.isEmpty())){
            
            appointmentWorkRequest.setStatus("Declined");
            appointmentWorkRequest.setTestResult("Pls book appointment on "+ selectedDate + " "+ selectedTime);
            btnSuggestTime.setEnabled(false);
            lblTimeClash.setText("");
            lblScheduled.setText("Suggestion Sent");
            populateRequestTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select an appointment date and time");
        }
        
    }//GEN-LAST:event_btnSuggestTimeActionPerformed

    private void NurseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NurseTableMouseClicked

        try{
            lblTimeClash.setText("");

            int selectedRow = NurseTable.getSelectedRow();
            nurse = (Employee)NurseTable.getValueAt(selectedRow, 0);
            txtSelectedNurse.setText(String.valueOf(nurse.getName()));
            populateNurseCombo();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_NurseTableMouseClicked

    private void txtNurseSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNurseSrchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNurseSrchActionPerformed

    private void btnNurseSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNurseSrchActionPerformed

        if(!txtNurseSrch.getText().isEmpty()){
            DefaultTableModel model = (DefaultTableModel) NurseTable.getModel();
            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof NurseOrganization){
                    org = organization;
                    break;
                }
            }

            Employee nur=null;
            int no=0;
            for (Employee nurse : org.getEmployeeDirectory().getEmployeeList()){
                if(nurse.getName().equalsIgnoreCase(txtNurseSrch.getText())){
                    //JOptionPane.showMessageDialog(null, "Nurse found");
                    nur= nurse;
                    for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                        if(ua.getEmployee().getName().equals(nurse.getName())){
                            no=ua.getWorkQueue().getWorkRequestList().size();
                            break;
                        }
                    }
                }

            }

            if(nur==null){
                JOptionPane.showMessageDialog(null, "Nurse not found, please try again");

            }

            if(nur!=null){
                model.setRowCount(0);
                Object[] row = new Object[2];
                row[0] = nur;
                row[1] = no;
                //row[1] = donor.getReceiver();
                model.addRow(row);
            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Please input a nurse name to search");
        }

    }//GEN-LAST:event_btnNurseSrchActionPerformed

    private void txtSelectedNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectedNurseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectedNurseActionPerformed

    private void btnMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMailActionPerformed

        /*if(patient.getEmailAddress().endsWith("gmail.com")){
            JOptionPane.showMessageDialog(null, "Found it for "+patient + " "+ patient.getEmailAddress());
            sendMail(patient.getEmailAddress());
        }
        else{
            JOptionPane.showMessageDialog(null, "Mail cannot be sent at this moment! please use gmail for mail services");
            sendMail(patient.getEmailAddress());
        }*/
            
        
        try {
            sendMail(patient.getEmailAddress());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
        btnMail.setEnabled(false);
        
    }//GEN-LAST:event_btnMailActionPerformed

    
    public void sendMail(String recipientId){
        
        final String username = "ecare.ecosystem@gmail.com";
        final String password = "ecosystem";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("ecare.ecosystem@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(recipientId));
            message.setSubject("Your Appointment has been scheduled!!!");
            message.setText("Dear "+patient+","
                + "\n\n Your appointment has been scheduled at "+ appointmentTimeRequested +"! \n\nThank you for using e-Care!");

            Transport.send(message);

            JOptionPane.showMessageDialog(null,"Mail Sent Successfully");

        } 

        catch (MessagingException e) 
        {
            JOptionPane.showMessageDialog(null,e);
            // throw new RuntimeException(e);
            //System.out.println("Username or Password are incorrect ... exiting !");
        }
        
        
    }
    
    
    
    public void populateschedule(boolean check){
         DefaultTableModel model = (DefaultTableModel) tblAppointmentTiming.getModel();
          model.setRowCount(0);
           if(doctor.getScheduleList().isEmpty()){btnPlaceAnAppointment.setEnabled(true);}
           else{ 
               btnPlaceAnAppointment.setEnabled(false);
               btnSuggestTime.setEnabled(false);
               cmbAppointmentTime.setEnabled(false);
               txtAppointmentChooser.setEnabled(false);
                            
           }
           
           for(String s: doctor.getScheduleList()){
                   //JOptionPane.showMessageDialog(null, doctor.getName() +" "+s +" with "+ " "+ appointmentWorkRequest.getPatient() + " " +appointmentWorkRequest.getStatus() );
                    //doctor.getScheduleList().remove(s);
                      Object[] row = new Object[1];
                      row[0] = s;
                      model.addRow(row);
                    //    btnPlaceAnAppointment.setEnabled(true);
                    // lblTimeClash.setText("");
                     if(check){
                        if(s.equalsIgnoreCase(appointmentTimeRequested)){
                            lblTimeClash.setText("Doctor already have an appointment at this time");
                            btnPlaceAnAppointment.setEnabled(false);
                            btnSuggestTime.setEnabled(true);
                            cmbAppointmentTime.setEnabled(true);
                            txtAppointmentChooser.setEnabled(true);
                            txtAppointmentChooser.getDateEditor().getUiComponent().setEnabled(false);
                            check=false;
                        }
                        else{
                            btnPlaceAnAppointment.setEnabled(true);
                            lblTimeClash.setText("");
                        }
                    }  
            
        }
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable NurseTable;
    private javax.swing.JButton btnMail;
    private javax.swing.JButton btnNurseSrch;
    private javax.swing.JButton btnPlaceAnAppointment;
    private javax.swing.JButton btnSuggestTime;
    private javax.swing.JComboBox cmbAppointmentTime;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblScheduled;
    private javax.swing.JLabel lblTimeClash;
    private javax.swing.JTable tblAppointmentTiming;
    private com.toedter.calendar.JDateChooser txtAppointmentChooser;
    private javax.swing.JTextField txtNurseSrch;
    private javax.swing.JTextField txtSelectedNurse;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
