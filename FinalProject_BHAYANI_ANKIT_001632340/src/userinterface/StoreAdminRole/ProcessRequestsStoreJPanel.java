/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StoreAdminRole;

import userinterface.PharmaManagerRole.*;
import Business.Drug.Drug;
import userinterface.ReceptionistRole.*;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.IndividualUser.Doctor;
import Business.IndividualUser.Manufacturer;
import Business.IndividualUser.PharmaManager;
import Business.IndividualUser.StorePharmacist;
import Business.Network.Network;
import Business.Organization.PatientOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmaManagerOrganization;
import Business.Organization.ReceptionistOrganization;
import Business.Organization.StorePharmacistOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentWorkRequest;
import Business.WorkQueue.GetDiagnosisWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author raunak
 */
public class ProcessRequestsStoreJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private StorePharmacistOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private AppointmentWorkRequest appointmentWorkRequest;
    private String appointmentTimeRequested;
    private Doctor doctor;
    private EcoSystem ecoSystem;
    private StorePharmacist storePharmacist;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public ProcessRequestsStoreJPanel(JPanel userProcessContainer, UserAccount account, StorePharmacistOrganization organization, Enterprise enterprise, EcoSystem ecoSystem) {
            initComponents();
            
            this.userProcessContainer = userProcessContainer;
            this.organization = organization;
            this.enterprise = enterprise;
            this.userAccount = account;
            this.storePharmacist = (StorePharmacist)userAccount.getEmployee();
            //this.manufacturerDirectory = pharmacist.getManufacturerDirectory();
            this.ecoSystem = ecoSystem;
            valueLabel.setText(enterprise.getName());
            populateRequestTable();
            populateDonorTable();
            refreshStoreListTable();
            //deleteWorkRequests();
            //userAccount.getWorkQueue().getWorkRequestList().remove
            //int i=0;
            //btnPlaceAnAppointment.setEnabled(false);
            //btnSuggestTime.setEnabled(false);
         
    }
    
    public void deleteWorkRequests(){
        int l =userAccount.getWorkQueue().getWorkRequestList().size();
            while(l!=0) {
                userAccount.getWorkQueue().getWorkRequestList().remove(l-1);
                l--;
            }
            JOptionPane.showMessageDialog(null, userAccount.getWorkQueue().getWorkRequestList());
            
    }
    
    
    public void refreshStoreListTable(){
        /*int rowCount = tblStoreList.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblStoreList.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        Organization o= null;
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org instanceof StorePharmacistOrganization){
                o=org;
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, o.getEmployeeDirectory().getEmployeeList());
        for (Employee e : o.getEmployeeDirectory().getEmployeeList()) {
            if(e instanceof StorePharmacist){
                Object row[] = new Object[1];
                row[0] = e;
                model.addRow(row);
            }
        }*/
    }

    
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof GetDiagnosisWorkRequest){
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = ((GetDiagnosisWorkRequest) request).getReceiver().getEmployee().getName();
                row[2] = ((GetDiagnosisWorkRequest) request).getPatient().getName();
                //row[2] = ((AppointmentWorkRequest) request).getDoctor().getName()== null ? null : ((AppointmentWorkRequest) request).getDoctor().getName();
                row[3] = ((GetDiagnosisWorkRequest) request).getPrescribedMedicines();
                row[4] = ((GetDiagnosisWorkRequest) request).getDosage();
                row[5] = request.getStatus();
                String result = ((GetDiagnosisWorkRequest) request).getTestResult();
                row[6] = result == null ? "Waiting" : result;

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
        status = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        btnProcessRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        enterpriseLabel.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        valueLabel.setText("<value>");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)), "Drug Requests", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request", "Doctor", "Patient", "PrescribedMeds", "Dosage", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            workRequestJTable.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addContainerGap())
        );

        status.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        status.setForeground(new java.awt.Color(255, 0, 0));

        backJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/backButton.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnProcessRequest.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnProcessRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/solutionButton.png"))); // NOI18N
        btnProcessRequest.setText("Process Request");
        btnProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(btnProcessRequest)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(status)
                    .addContainerGap(942, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(backJButton)
                    .addContainerGap(928, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProcessRequest)
                .addContainerGap(327, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(326, 326, 326)
                    .addComponent(status)
                    .addContainerGap(469, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(585, 585, 585)
                    .addComponent(backJButton)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void workRequestJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTableMouseClicked
              
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
                           
/*        appointmentWorkRequest = (AppointmentWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        appointmentTimeRequested = appointmentWorkRequest.getAppointmentDateTime();
        doctor = appointmentWorkRequest.getDoctor();
      
        if(doctor.getScheduleList().size()>1)       
            lblDoctorName.setText("Dr. "+doctor.getName() + " has following " + doctor.getScheduleList().size() + " appointments :");
        else
            lblDoctorName.setText("Dr. "+doctor.getName() + " has " + doctor.getScheduleList().size() + " appointment :");
        //JOptionPane.showMessageDialog(null, doctor.getScheduleList().size());
        if(appointmentWorkRequest.getStatus().equalsIgnoreCase("Scheduled")){
            populateschedule(false);
            lblScheduled.setText("Successfully Scheduled");
        }
        else{
            populateschedule(true);
            lblScheduled.setText("");
        }
*/     
     
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

    private void btnProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRequestActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        GetDiagnosisWorkRequest workRequest= (GetDiagnosisWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        
        if(workRequest.getStatus().startsWith("Assigned")){
            BookPatientOrderJPanel bookPatientOrderJPanel = new BookPatientOrderJPanel(userProcessContainer,workRequest, userAccount,organization,enterprise,ecoSystem);
            userProcessContainer.add("BookPatientOrderJPanel",bookPatientOrderJPanel);
            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
            cardLayout.next(userProcessContainer);
            
        }
        else if(workRequest.getStatus().startsWith("Completed")) {
            JOptionPane.showMessageDialog(null, "Already Completed");
            return;
        }
        



    }//GEN-LAST:event_btnProcessRequestActionPerformed

    public void populateschedule(boolean check){
/*         DefaultTableModel model = (DefaultTableModel) tblAppointmentTiming.getModel();
          model.setRowCount(0);
           if(doctor.getScheduleList().isEmpty()){btnPlaceAnAppointment.setEnabled(true);}
           else{btnPlaceAnAppointment.setEnabled(false);
           btnSuggestTime.setEnabled(false);}
           
           for(String s: doctor.getScheduleList()){
                   //JOptionPane.showMessageDialog(null, doctor.getName() +" "+s +" with "+ " "+ appointmentWorkRequest.getPatient() + " " +appointmentWorkRequest.getStatus() );
                    //doctor.getScheduleList().remove(s);
                      Object[] row = new Object[1];
                      row[0] = s;
                      model.addRow(row);
                    //    btnPlaceAnAppointment.setEnabled(true);
                     lblTimeClash.setText("");
                     if(check){
                        if(s.equalsIgnoreCase(appointmentTimeRequested)){
                            lblTimeClash.setText("Doctor already have an appointment at this time with another patient");
                            btnPlaceAnAppointment.setEnabled(false);
                            btnSuggestTime.setEnabled(true);
                            break;
                        }
                        else{
                            btnPlaceAnAppointment.setEnabled(true);
                            lblTimeClash.setText("");
                        }
                    }  
            
        }
        
     */   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnProcessRequest;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel status;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
