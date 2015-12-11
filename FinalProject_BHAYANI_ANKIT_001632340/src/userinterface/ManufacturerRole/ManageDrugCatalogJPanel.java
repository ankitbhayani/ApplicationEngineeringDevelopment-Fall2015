package userinterface.ManufacturerRole;

import Business.Drug.Drug;
import Business.EcoSystem;
import Business.Enterprise.DrugManufacturerEnterprise;
import Business.Enterprise.Enterprise;
import Business.IndividualUser.Doctor;
import Business.IndividualUser.Manufacturer;
import Business.Organization.ManufacturerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Rushabh
 */
public class ManageDrugCatalogJPanel extends javax.swing.JPanel {

    
  
    /** Creates new form ManageDrugCatalogJPanel */
    private JPanel userProcessContainer;
    private Manufacturer manufacturer;
    private ManufacturerOrganization organization;
    private DrugManufacturerEnterprise enterprise;
    private UserAccount userAccount;
    private AppointmentWorkRequest appointmentWorkRequest;
    private String appointmentTimeRequested;
    private Doctor doctor;
    private EcoSystem ecoSystem;
    
    public ManageDrugCatalogJPanel(JPanel userProcessContainer, UserAccount account, ManufacturerOrganization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = (DrugManufacturerEnterprise)enterprise;
        this.userAccount = account;
        this.ecoSystem = ecoSystem;
        this.manufacturer = (Manufacturer)userAccount.getEmployee();
        //valueLabel.setText(enterprise.getName());
        
        txtName.setText(manufacturer.getEnterpriseName());
        refreshTable();
    }

     public void refreshTable() {
        int rowCount = drugCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel)drugCatalog.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
             
        
        for(Drug drug : enterprise.getManuFacturerDrugCatalog().getDrugList()){
                Object row[] = new Object[5];
                row[0]=drug;
                row[1]=drug.getDrugPrice();
                row[2]=drug.getAvail();
                row[3]=drug.getExpiryDate();
                row[4]=drug.getManufacturerName();
                
                model.addRow(row);
        }
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugCatalog = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Manage Product Catalog");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        drugCatalog.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        drugCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Drug Name", "Drug Price", "Availability", "Expiry Date", "Drug Manufacturer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(drugCatalog);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 570, 170));

        btnView.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/1449761188_view6.png"))); // NOI18N
        btnView.setText("View Drug Detail >>");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 220, -1));

        btnCreate.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/1449760826_add.png"))); // NOI18N
        btnCreate.setText("Create New Drug >>");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 220, -1));

        btnSearch.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/searchButton.png"))); // NOI18N
        btnSearch.setText("Search >>");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 130, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setText("Manufacturer:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 170, -1));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 150, 30));

        btnDelete.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/1449760334_Cancel.png"))); // NOI18N
        btnDelete.setText("Delete Drug(s)");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 180, -1));
        add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 390, 90));

        btnBack1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/backButton.png"))); // NOI18N
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 90, 30));
    }// </editor-fold>//GEN-END:initComponents
    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int row = drugCatalog.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        Drug d = (Drug)drugCatalog.getValueAt(row, 0);
        ViewMDrugDetailJPanel vpdjp = new ViewMDrugDetailJPanel(userProcessContainer,enterprise, d);
        userProcessContainer.add("ViewProductDetailJPanel", vpdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
       
        CreateNewDrugJPanel cnpjp = new CreateNewDrugJPanel(userProcessContainer, manufacturer,enterprise);
        userProcessContainer.add("CreateNewProductJPanel", cnpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        SearchForProductJPanel sfpjp = new SearchForProductJPanel(userProcessContainer, manufacturer,enterprise);
        userProcessContainer.add("SearchForProductJPanel", sfpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int row = drugCatalog.getSelectedRow();
        
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int dialogResult=JOptionPane.showConfirmDialog(null, "Would you like to delete this drug?","Warning",JOptionPane.YES_NO_OPTION);
        
        if(dialogResult==JOptionPane.YES_OPTION){
            Drug drug = (Drug)drugCatalog.getValueAt(row, 0);
            enterprise.getManuFacturerDrugCatalog().removeDrug(drug);
            refreshTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JTable drugCatalog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
