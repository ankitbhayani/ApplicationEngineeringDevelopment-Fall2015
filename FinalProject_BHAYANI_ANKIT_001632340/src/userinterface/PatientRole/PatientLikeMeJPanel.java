/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;


import Business.Drug.Drug;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.DrugAdministrationEnterprise;
import Business.Enterprise.DrugManufacturerEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.IndividualUser.Doctor;
import Business.IndividualUser.Manufacturer;
import Business.IndividualUser.Patient;
import Business.Network.Network;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import Business.VitalSigns.VitalSign;
import Business.WorkQueue.GetDiagnosisWorkRequest;
import Business.WorkQueue.InspectionRequest;
import Business.WorkQueue.WorkRequest;
import com.orsoncharts.Chart3DPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Ankit Bhayani
 */
public class PatientLikeMeJPanel extends javax.swing.JPanel {

    
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
    private UserAccount selectedUA =null; 
    private Patient selectedPatient;
    
    
    /**
     * Creates new form CreateUserAccountJPanel
     */
    public PatientLikeMeJPanel(JPanel pnl, UserAccount ua, Organization o, Enterprise e, EcoSystem es) {
        initComponents();
        this.userProcessContainer = pnl;
        this.userAccount = ua;
        this.patientOrganization = (PatientOrganization)o;
        this.enterprise = e;
        this.ecoSystem = es;
        this.patient= (Patient)ua.getEmployee();
        populateDrug();
        populateRequestTable();
        frameLineGraph.setVisible(false);
        //deleteWorkRequests();
        
    }
    
    public void deleteWorkRequests(){
        
        int l =userAccount.getWorkQueue().getWorkRequestList().size();
            while(l!=0) {
                userAccount.getWorkQueue().getWorkRequestList().remove(l-1);
                l--;
            }
            JOptionPane.showMessageDialog(null, userAccount.getWorkQueue().getWorkRequestList());
            
    }
    
    
        
    public void populateRequestTable(){
        
        DefaultTableModel model = (DefaultTableModel)tblPatients.getModel();
        
        model.setRowCount(0);
        
        for(Network n: ecoSystem.getNetworkList()){
            for(Enterprise ep: n.getEnterpriseDirectory().getEnterpriseList()){
                if (ep instanceof HospitalEnterprise){
                    for(Organization o : ep.getOrganizationDirectory().getOrganizationList()){
                        if(o instanceof PatientOrganization){
                            for(Employee e: o.getEmployeeDirectory().getEmployeeList()){
                                if(e instanceof Patient){
                                    if(((Patient)e).getPatientChronicDisease()!=null){
                                        if(((Patient)e).getPatientChronicDisease().equalsIgnoreCase(patient.getPatientChronicDisease())){
                                            if(e.getId()!=patient.getId()){
                                                Object[] row = new Object[3];
                                                row[0] = (Patient)e;
                                                row[1] = ((Patient)e).getCity();
                                                row[2] = ((Patient)e).getOccupation();
                                                model.addRow(row);
             //                               JOptionPane.showMessageDialog(null, "Hurray found!! " + e.getName());
                                            }
                                        }
                                    }
                                }     
                            }

                        }    
                    }
                }

            }
        }
        
        
        
        
        
       /* DefaultTableModel model = (DefaultTableModel)tblPatients.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof InspectionRequest){
                Object[] row = new Object[6];
                //row[0] = request;
                row[0] = ((InspectionRequest)request).getDrug();
                row[1] = request.getRequestDate();
                row[2] = ((InspectionRequest)request).getDrugManufacturerEnterprise();
                row[3] = ((InspectionRequest)request).getProblemExperienced();
                row[4] = request.getStatus();
                String result = ((InspectionRequest) request).getTestResult();
                row[5] = result == null ? "Waiting" : result;
                
                //row[4] = request.getStatus();
                model.addRow(row);
            }
        }*/
    }
    
    

    public void populateDrug(){
        
        //Drug d[] = new Drug[100];
        
        /*cmbDrugName.removeAllItems();
        //cmbDrugName.addItem("Please select a Drug");
        for(Order o: patient.getPatientDrugOrders().getOrders()){
            for(OrderItem oi : o.getOrderItems()){
                //JOptionPane.showMessageDialog(null, "Storing Values "+ oi.getDrug());
                //d[i]=oi.getDrug();
                cmbDrugName.addItem(oi.getDrug());
                //JOptionPane.showMessageDialog(null, "Manufacturer Name "+ oi.getDrug().getManufacturerName());
            }
        }
        */
        
        //cmbDrugName.addItem(oi.getDrug());
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        btnBackUA = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        frameLineGraph = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel4.setText("Patients With Similar Problems");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        btnBackUA.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBackUA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/backButton.png"))); // NOI18N
        btnBackUA.setText("Back");
        btnBackUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackUAActionPerformed(evt);
            }
        });
        add(btnBackUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Patient with Similar Problems", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), new java.awt.Color(0, 153, 0))); // NOI18N

        tblPatients.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient", "City", "Occupation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPatients);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 370, 350));

        frameLineGraph.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        frameLineGraph.setTitle("Line Graph");
        frameLineGraph.setVisible(true);
        add(frameLineGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 650, 540));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Please click one of the patient below to see their history");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    

    
    private void btnBackUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackUAActionPerformed
        //muajp.refreshTable();
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackUAActionPerformed

    private void tblPatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientsMouseClicked

        frameLineGraph.setVisible(false);
        int selectedRow = tblPatients.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
                           
        selectedPatient = (Patient)tblPatients.getValueAt(selectedRow, 0);
        selectedUA = selectedPatient.getUserAccount();
   
        
        //JOptionPane.showMessageDialog(null, selectedPatient + " " +selectedPatient.vitalSignHistory.getVitalSignHistory());
        if(selectedPatient.vitalSignHistory.getVitalSignHistory().size()>0){
                
            String legend=null;
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            for(VitalSign vs: selectedPatient.vitalSignHistory.getVitalSignHistory()){

                /*if(vs.getState().equalsIgnoreCase("ABNORMAL"))
                legend=vs.getTimestamp().concat(" (" +vs.getState()+")");
                else*/
                legend=vs.getTimestamp();
                ///JOptionPane.showMessageDialog(null,vs);

                dataset.addValue(vs.getRespiratoryRate(), legend, "Respiratory Rate");
                dataset.addValue(vs.getHeartRate(), legend, "Heart Rate");
                dataset.addValue(vs.getSystolicBloodPressure(), legend, "Blood Pressure");
                dataset.addValue(vs.getWeight(), legend, "Weight");

            }

            JFreeChart chart = ChartFactory.createLineChart3D("Vital Signs","Vital Signs","Values", dataset,PlotOrientation.VERTICAL,true, true, true);
            CategoryPlot P = chart.getCategoryPlot();
            P.setRangeGridlinePaint(Color.BLACK);

            frameLineGraph.getContentPane().removeAll();
            //ChartFrame frame  = new ChartFrame("Bar Charts",chart);
            ChartPanel cp = new ChartPanel(chart);
            frameLineGraph.getContentPane().add(cp);
            //frameLineGraph.repaint();
            //frameLineGraph.setSize(650, 550);            
            frameLineGraph.setVisible(true);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "There's no Vital Sign reported for this patient");
            return;
        }
        
        
    }//GEN-LAST:event_tblPatientsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackUA;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JInternalFrame frameLineGraph;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPatients;
    // End of variables declaration//GEN-END:variables
}
