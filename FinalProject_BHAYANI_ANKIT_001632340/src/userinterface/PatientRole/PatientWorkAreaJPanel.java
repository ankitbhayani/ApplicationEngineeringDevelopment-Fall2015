/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.IndividualUser.Patient;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import Business.VitalSigns.VitalSign;
import Business.WorkQueue.AppointmentWorkRequest;
import Business.WorkQueue.GetDiagnosisWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Ankit Bhayani
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicalAdviceJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    //private Donor donor;
    private PatientOrganization patientOrganization;
    private Enterprise enterprise;
    private EcoSystem ecoSystem;
    private Patient patient;
    private DoctorOrganization doctorOrganization;
    public PatientWorkAreaJPanel(JPanel pnl, UserAccount ua, Organization o, Enterprise e, EcoSystem es) {
        initComponents();
        this.userProcessContainer = pnl;
        this.userAccount = ua;
        this.patientOrganization = (PatientOrganization)o;
        this.enterprise = e;
        this.patient= (Patient)ua.getEmployee();
        this.ecoSystem = es;
        lblDonorName.setText(userAccount.getEmployee().getName()+ "!!");
        profileUpdate();
        if(ecoSystem.getNewsAboutDrug()!=null)
            lblEcosystemDrugNews.setText(ecoSystem.getNewsAboutDrug());
        populateVStable();
        populateWorkReqTable();
        populateAppointments();
    }
    
    
    public void profileUpdate(){
        if(patient.getEmailAddress()==null)
            lblOperation.setText("Please complete your profile information");
        else
            lblOperation.setText("How are you doing today!");
    }
    

    public void populateVStable(){
        DefaultTableModel model = (DefaultTableModel) tblVS.getModel();
        
        model.setRowCount(0);
        for (VitalSign vs : patient.getVitalSignHistory().getVitalSignHistory()){
            Object[] row = new Object[5];
            row[0] = vs;
            row[1] = vs.getRespiratoryRate();
            row[2] = vs.getHeartRate();
            row[3] = vs.getWeight();
            row[4] = vs.getSystolicBloodPressure();
            
            model.addRow(row);
        }
    }
    
    public void populateWorkReqTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof GetDiagnosisWorkRequest){
                Object[] row = new Object[4];
                row[0] = request.getMessage();
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                String result = ((GetDiagnosisWorkRequest)request).getTestResult();
                row[3] = result == null ? "Waiting" : result;

                model.addRow(row);
            }
        }
    }
    
    public void populateAppointments(){
        DefaultTableModel model = (DefaultTableModel) appointMentRequestJTable1.getModel();
        int index=1;
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof AppointmentWorkRequest){
                Object[] row = new Object[4];
                //row[0] = request.getMessage();
                row[0] = index++;
                row[1] = request.getReceiver()== null ? null : request.getReceiver().getEmployee().getName();
                row[2] = ((AppointmentWorkRequest)request).getAppointmentDateTime()== null ? null :((AppointmentWorkRequest)request).getAppointmentDateTime();
                row[3] = request.getStatus();
                String result = ((AppointmentWorkRequest)request).getTestResult();
                //row[4] = result == null ? "Waiting" : result;

                model.addRow(row);
            }
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

        pnlMenu = new javax.swing.JPanel();
        btnSendFeedback = new javax.swing.JButton();
        btnSrchAndSeekMedicalAdvice = new javax.swing.JButton();
        btnAppointmentPanel = new javax.swing.JButton();
        btnProfileAndAccountInfo = new javax.swing.JButton();
        btnPatientOrders = new javax.swing.JButton();
        btnPatientLikeMe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblOperation = new javax.swing.JLabel();
        lblDonorName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVS = new javax.swing.JTable();
        btnViewBars = new javax.swing.JButton();
        btnViewPieChart = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        appointMentRequestJTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEcosystemDrugNews = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 246, 246));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(244, 255, 244));

        btnSendFeedback.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        btnSendFeedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/feedBackButton.png"))); // NOI18N
        btnSendFeedback.setText("Send FeedBack");
        btnSendFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendFeedbackActionPerformed(evt);
            }
        });

        btnSrchAndSeekMedicalAdvice.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        btnSrchAndSeekMedicalAdvice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/searchButton.png"))); // NOI18N
        btnSrchAndSeekMedicalAdvice.setText("Search Physician & Seek Medical Advice");
        btnSrchAndSeekMedicalAdvice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrchAndSeekMedicalAdviceActionPerformed(evt);
            }
        });

        btnAppointmentPanel.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        btnAppointmentPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/appointmentButton.png"))); // NOI18N
        btnAppointmentPanel.setText("View Appointments/Visits ");
        btnAppointmentPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentPanelActionPerformed(evt);
            }
        });

        btnProfileAndAccountInfo.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        btnProfileAndAccountInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/infoButton.png"))); // NOI18N
        btnProfileAndAccountInfo.setText("Profile Information");
        btnProfileAndAccountInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileAndAccountInfoActionPerformed(evt);
            }
        });

        btnPatientOrders.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        btnPatientOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/viewButton.png"))); // NOI18N
        btnPatientOrders.setText("View Orders");
        btnPatientOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientOrdersActionPerformed(evt);
            }
        });

        btnPatientLikeMe.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        btnPatientLikeMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/duplicateButton.png"))); // NOI18N
        btnPatientLikeMe.setText("Patients Like Me");
        btnPatientLikeMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientLikeMeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSrchAndSeekMedicalAdvice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPatientOrders)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAppointmentPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfileAndAccountInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSendFeedback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPatientLikeMe)
                .addGap(48, 48, 48))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSrchAndSeekMedicalAdvice)
                    .addComponent(btnAppointmentPanel)
                    .addComponent(btnProfileAndAccountInfo)
                    .addComponent(btnSendFeedback)
                    .addComponent(btnPatientOrders)
                    .addComponent(btnPatientLikeMe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 91, 1096, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 135, 81));
        jLabel1.setText("Welcome");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 51, -1, -1));

        lblOperation.setFont(new java.awt.Font("Calibri", 2, 16)); // NOI18N
        lblOperation.setForeground(new java.awt.Color(0, 135, 81));
        lblOperation.setText("How are you doing today?");
        add(lblOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 51, -1, -1));

        lblDonorName.setFont(new java.awt.Font("Calibri", 2, 16)); // NOI18N
        lblDonorName.setForeground(new java.awt.Color(0, 135, 81));
        lblDonorName.setText("jLabel1");
        add(lblDonorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 51, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "VitalSigns Captured Using SmartDevice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        tblVS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Timestamp", "RespiRate", "HearRate", "Weight", "BloodPressure"
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
        jScrollPane2.setViewportView(tblVS);
        if (tblVS.getColumnModel().getColumnCount() > 0) {
            tblVS.getColumnModel().getColumn(3).setResizable(false);
        }

        btnViewBars.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        btnViewBars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/barChartButton.png"))); // NOI18N
        btnViewBars.setText("Bar Graphs");
        btnViewBars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBarsActionPerformed(evt);
            }
        });

        btnViewPieChart.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        btnViewPieChart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/pieChartButton.png"))); // NOI18N
        btnViewPieChart.setText("Pie Chart");
        btnViewPieChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPieChartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewPieChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewBars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnViewBars)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewPieChart)
                        .addGap(0, 113, Short.MAX_VALUE)))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1090, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Medical Advice List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jScrollPane1.setBorder(null);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Doctor", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        workRequestJTable.setToolTipText("");
        jScrollPane1.setViewportView(workRequestJTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 404, -1, 209));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "My Appointment List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        appointMentRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "S.No.", "Doctor", "DateAndTime", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane3.setViewportView(appointMentRequestJTable1);
        if (appointMentRequestJTable1.getColumnModel().getColumnCount() > 0) {
            appointMentRequestJTable1.getColumnModel().getColumn(0).setResizable(false);
            appointMentRequestJTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            appointMentRequestJTable1.getColumnModel().getColumn(1).setResizable(false);
            appointMentRequestJTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("Please goto the \"View Appointment and Past Visits\" Tab to see the complete details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 404, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setText("Patient Work Area Panel");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, -1, -1));

        lblEcosystemDrugNews.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        lblEcosystemDrugNews.setForeground(new java.awt.Color(255, 0, 0));
        add(lblEcosystemDrugNews, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientLikeMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientLikeMeActionPerformed

        if(patient.getEmailAddress()==null){
            JOptionPane.showMessageDialog(null, "Please complete your Profile information first");
            return;
            
        }
        
        PatientLikeMeJPanel plmjp = new PatientLikeMeJPanel(userProcessContainer,userAccount,patientOrganization,enterprise,ecoSystem );
        userProcessContainer.add("PatientLikeMeJPanel", plmjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnPatientLikeMeActionPerformed

    private void btnAppointmentPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentPanelActionPerformed

        PatientAppointmentsJPanel patientAppointmentsJPanel = new PatientAppointmentsJPanel(userProcessContainer,userAccount,patientOrganization,enterprise,ecoSystem );
        userProcessContainer.add("PatientDetailsJPanel", patientAppointmentsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAppointmentPanelActionPerformed

    private void btnSrchAndSeekMedicalAdviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrchAndSeekMedicalAdviceActionPerformed
       
        PatientDetailsJPanel patientDetailsJPanel = new PatientDetailsJPanel(userProcessContainer,userAccount,patientOrganization,enterprise,ecoSystem );
        userProcessContainer.add("PatientDetailsJPanel", patientDetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSrchAndSeekMedicalAdviceActionPerformed

    private void btnProfileAndAccountInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileAndAccountInfoActionPerformed

        PatientProfileAndOtherDetails ppaod = new PatientProfileAndOtherDetails(userProcessContainer,userAccount,patientOrganization,enterprise,ecoSystem );
        userProcessContainer.add("PatientProfileAndOtherDetails", ppaod);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProfileAndAccountInfoActionPerformed

    private void btnViewBarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBarsActionPerformed

        if(patient.vitalSignHistory.getVitalSignHistory().size()>0){
            
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


            
            ChartFrame frame  = new ChartFrame("Bar Charts",chart);
            frame.setVisible(true);
            frame.setSize(650, 550);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "There's no Vital Sign reported for this patient");
            return;
        }
       

    }//GEN-LAST:event_btnViewBarsActionPerformed

    private void btnSendFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendFeedbackActionPerformed

        PatientSendFeedBackForm patientSendFeedBackForm = new PatientSendFeedBackForm(userProcessContainer,userAccount,patientOrganization,enterprise,ecoSystem );
        userProcessContainer.add("PatientSendFeedBackForm",patientSendFeedBackForm);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnSendFeedbackActionPerformed

    private void btnViewPieChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPieChartActionPerformed

        
        if(patient.vitalSignHistory.getVitalSignHistory().size()>0){
        int selectedRow = tblVS.getSelectedRow();
        
        if(selectedRow>=0){
                VitalSign vs = (VitalSign)tblVS.getValueAt(selectedRow, 0);
                DefaultPieDataset pieDataset = new DefaultPieDataset();

               pieDataset.setValue("Respiratory Rate", new Float(vs.getRespiratoryRate()));
               pieDataset.setValue("Heart Rate", new Float(vs.getHeartRate()));
               pieDataset.setValue("Blood Pressure", new Float(vs.getSystolicBloodPressure()));
               pieDataset.setValue("Weight", new Float(vs.getWeight()));

               JFreeChart chart = ChartFactory.createPieChart("Pie chart", pieDataset, true, true, true);

               PiePlot P = (PiePlot)chart.getPlot();

               ChartFrame frame  = new ChartFrame("Pie Charrt",chart);
               frame.setVisible(true);
               frame.setSize(450, 500);

           }
           else{
                JOptionPane.showMessageDialog(null, "Please select a Vital Sign row to see the Pie Chart!");
           }
        }
        else{
            JOptionPane.showMessageDialog(null, "There's no Vital Sign reported for this patient");
            return;
        }
        
             
    }//GEN-LAST:event_btnViewPieChartActionPerformed

    private void btnPatientOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientOrdersActionPerformed

        ViewPatientOrders viewPatientOrders = new ViewPatientOrders(userProcessContainer,ecoSystem,userAccount);
        userProcessContainer.add("ViewPatientOrders", viewPatientOrders);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnPatientOrdersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointMentRequestJTable1;
    private javax.swing.JButton btnAppointmentPanel;
    private javax.swing.JButton btnPatientLikeMe;
    private javax.swing.JButton btnPatientOrders;
    private javax.swing.JButton btnProfileAndAccountInfo;
    private javax.swing.JButton btnSendFeedback;
    private javax.swing.JButton btnSrchAndSeekMedicalAdvice;
    private javax.swing.JButton btnViewBars;
    private javax.swing.JButton btnViewPieChart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDonorName;
    private javax.swing.JLabel lblEcosystemDrugNews;
    private javax.swing.JLabel lblOperation;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JTable tblVS;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
