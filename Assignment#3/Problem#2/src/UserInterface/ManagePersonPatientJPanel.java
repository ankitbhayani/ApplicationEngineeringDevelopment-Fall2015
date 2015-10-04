/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Patient;
import Business.PatientDirectory;
import Business.Person;
import Business.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Swati
 */
public class ManagePersonPatientJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private PatientDirectory patientDirectory;
    /**
     * Creates new form ManageAccountJPanel
     */
    public ManagePersonPatientJPanel(JPanel upc, PersonDirectory pd, PatientDirectory ptd) {
        initComponents();
       this.userProcessContainer = upc;
       this.personDirectory = pd;
       this.patientDirectory = ptd;
       refreshtable();
    }
    
    public void refreshtable(){
        DefaultTableModel dtm = (DefaultTableModel)tblAccountDetails.getModel();
        dtm.setRowCount(0);
        
        for(Person a: personDirectory.getPersonList()){
            Object[] row = new Object[5];
            row[0] = a;
            row[1] = a.getID();
            row[2] = a.getAddedOn();
            row[3] = a.getAge();
            row[4] = a.isCheckPatient();
            
            dtm.addRow(row);
                    
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccountDetails = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtSeachPersonID = new javax.swing.JTextField();
        btnSearchByPID = new javax.swing.JButton();
        btnDeleteAccount = new javax.swing.JButton();
        btnViewDetail = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Manage Person");

        tblAccountDetails.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tblAccountDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Person Name", "Person ID", "Added On", "Age", "IsPatient"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
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
        jScrollPane1.setViewportView(tblAccountDetails);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Person ID");

        txtSeachPersonID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtSeachPersonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeachPersonIDActionPerformed(evt);
            }
        });

        btnSearchByPID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSearchByPID.setText("Search ByPersonID");
        btnSearchByPID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByPIDActionPerformed(evt);
            }
        });

        btnDeleteAccount.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnDeleteAccount.setText("Delete Person");
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });

        btnViewDetail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnViewDetail.setText("View Detail");
        btnViewDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtSeachPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnDeleteAccount)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewDetail)
                            .addComponent(btnSearchByPID)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSeachPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchByPID))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetail)
                    .addComponent(btnDeleteAccount))
                .addGap(26, 26, 26)
                .addComponent(btnBack)
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailActionPerformed
        
        int selectedRow  = tblAccountDetails.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row first!");
        }
        else{
            
            //Person p =(Person)tblAccountDetails.getValueAt(selectedRow, WIDTH);
            Person person = (Person)tblAccountDetails.getValueAt(selectedRow, 0);
            //JOptionPane.showMessageDialog(this, person.getPersonName(),"Showing Name",JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(this, person.getID(),"afeter rowselect",JOptionPane.INFORMATION_MESSAGE);
            int id = person.getID();
            
            if(!person.isCheckPatient()){
                ViewPersonJPanel viewAccountJPanel = new ViewPersonJPanel(userProcessContainer,person,this);
                userProcessContainer.add("ViewAccountJPanel",viewAccountJPanel);
                CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
                cardLayout.next(userProcessContainer);
            }
            else if(person.isCheckPatient()){
                Patient patient = patientDirectory.searchPatientByID(id);
              //  JOptionPane.showMessageDialog(this, patient.getPatientId(),"Taking PatID here",JOptionPane.INFORMATION_MESSAGE);
                
                ViewPatientJPanel viewPatientJPanel = new ViewPatientJPanel(userProcessContainer,patient,person);  
                userProcessContainer.add("ViewPatientJPanel", viewPatientJPanel);
                CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
                cardLayout.next(userProcessContainer);
            }
                
        }
    }//GEN-LAST:event_btnViewDetailActionPerformed

    private void btnSearchByPIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByPIDActionPerformed
      
        
        if (txtSeachPersonID.getText().isEmpty() || txtSeachPersonID.getText().contains(" ") ){
            JOptionPane.showMessageDialog(this, "please enter an account nuber");
        }
        else{
            Person person = personDirectory.searchPersonByID(Integer.valueOf(txtSeachPersonID.getText()));
            if(person !=null){
                SearchPersonJPanel searchAccountJPanel = new SearchPersonJPanel(userProcessContainer,person);
                userProcessContainer.add("SearchAccountJPanel",searchAccountJPanel);
                CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
                cardLayout.next(userProcessContainer);
            }
            else
                JOptionPane.showMessageDialog(this, "No person exist with this ID");
                    
        }
    }//GEN-LAST:event_btnSearchByPIDActionPerformed

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed

        int selectedRow = tblAccountDetails.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row first!");
        }
        else{
            
         int dialogButton= JOptionPane.YES_NO_OPTION;
         int dialogResult= JOptionPane.showConfirmDialog(null, "Would you like to delete this?", "Warning", dialogButton);
          
         if (dialogResult==JOptionPane.YES_OPTION){
          
            Person account = (Person)tblAccountDetails.getValueAt(selectedRow, 0);
            personDirectory.deletePerson(account);
            refreshtable();
         }
        }

        
    }//GEN-LAST:event_btnDeleteAccountActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSeachPersonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeachPersonIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeachPersonIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JButton btnSearchByPID;
    private javax.swing.JButton btnViewDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAccountDetails;
    private javax.swing.JTextField txtSeachPersonID;
    // End of variables declaration//GEN-END:variables
}
