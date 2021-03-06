/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManufacturerRole;

import userinterface.StoreAdminRole.*;
import userinterface.DoctorRole.*;
import Business.EcoSystem;
import Business.Enterprise.DrugManufacturerEnterprise;
import Business.Enterprise.Enterprise;
import Business.IndividualUser.Manufacturer;
import Business.Organization.DoctorOrganization;
import Business.Organization.ManufacturerOrganization;
import Business.Organization.StorePharmacistOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.DoctorRole.DoctorMedicalAdviceJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.PatientRole.ViewPatientOrders;

/**
 *
 * @author Ankit Bhayani
 */
public class ManufacturerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ManufacturerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private Manufacturer manufacturer;
    private DrugManufacturerEnterprise dme;
    
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public ManufacturerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ManufacturerOrganization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecoSystem= ecoSystem;
        this.dme = (DrugManufacturerEnterprise)enterprise;
        this.manufacturer = (Manufacturer)userAccount.getEmployee();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageInventory = new javax.swing.JButton();
        btnSearchDrug = new javax.swing.JButton();
        btnMonitorComplaints = new javax.swing.JButton();

        btnManageInventory.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btnManageInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/1449760285_Global_manager.png"))); // NOI18N
        btnManageInventory.setText("Manage Drug Inventory");
        btnManageInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageInventoryActionPerformed(evt);
            }
        });

        btnSearchDrug.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btnSearchDrug.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/searchButton.png"))); // NOI18N
        btnSearchDrug.setText("Search Paticular Drug");
        btnSearchDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDrugActionPerformed(evt);
            }
        });

        btnMonitorComplaints.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btnMonitorComplaints.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/1449761080_29.Mac.png"))); // NOI18N
        btnMonitorComplaints.setText("Monitor Drug Complaints");
        btnMonitorComplaints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonitorComplaintsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearchDrug, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMonitorComplaints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnManageInventory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchDrug)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMonitorComplaints)
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMonitorComplaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitorComplaintsActionPerformed

        DrugFeedbackJPanel dfjp = new DrugFeedbackJPanel(userProcessContainer, userAccount, organization,enterprise,ecoSystem );
        userProcessContainer.add("DrugFeedbackJPanel", dfjp);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnMonitorComplaintsActionPerformed

    private void btnManageInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageInventoryActionPerformed
        
        ManageDrugCatalogJPanel manageDrugCatalogJPanel = new ManageDrugCatalogJPanel(userProcessContainer, userAccount, organization,enterprise,ecoSystem );
        userProcessContainer.add("ManageDrugCatalogJPanel",manageDrugCatalogJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageInventoryActionPerformed

    private void btnSearchDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDrugActionPerformed
        
        SearchForProductJPanel sfpjp = new SearchForProductJPanel(userProcessContainer, manufacturer,dme);
        userProcessContainer.add("SearchForProductJPanel", sfpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSearchDrugActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageInventory;
    private javax.swing.JButton btnMonitorComplaints;
    private javax.swing.JButton btnSearchDrug;
    // End of variables declaration//GEN-END:variables
}
