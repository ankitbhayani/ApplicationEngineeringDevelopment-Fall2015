package userinterface.PharmaManagerRole;


import Business.Drug.Drug;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.DrugManufacturerEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.IndividualUser.Manufacturer;
import Business.IndividualUser.PharmaManager;
import Business.Network.Network;
import Business.Organization.PharmaManagerOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ManageEnterPriseDrugJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PharmaManagerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private PharmaManager pharmacist;
    private DrugManufacturerEnterprise drugManufacturerEnterprise;
    private PharmacyEnterprise pharmacyEnterprise;
    
    public ManageEnterPriseDrugJPanel(JPanel userProcessContainer, UserAccount account, PharmaManagerOrganization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecoSystem = ecoSystem;
        this.pharmacist=(PharmaManager)userAccount.getEmployee();
        this.pharmacyEnterprise = (PharmacyEnterprise)enterprise;
        lblStatus.setText("Please click one of the Manufacturers to see the drug details");
        
        if(ecoSystem.getNewsAboutDrug()!=null)
            lblEcosystemDrugNews.setText(ecoSystem.getNewsAboutDrug());
        //manufacturerDirectory = cVSAdministrator.manufacturerDirectory;
        //this.cVSAdministrator=cVSAdministrator;
        refreshTable();
        refershdrugInventoryTable();
              
    }
  
   
    
    public void refreshTable(){
        int rowCount = manufacturerTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) manufacturerTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        
        for(Network n: ecoSystem.getNetworkList()){
            for(Enterprise ep: n.getEnterpriseDirectory().getEnterpriseList()){
                if(ep instanceof DrugManufacturerEnterprise){
                    Object row[] = new Object[1];
		    row[0] = ep;
		    model.addRow(row);
                    
                }
            }
        }
        

    }
        
    /*/public void refreshDrugTable(){
        int rowCount = drugCatalogTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) drugCatalogTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Manufacturer s : pharmacist.manufacturerDirectory.getManufacturerlist()) {
            Object row[] = new Object[1];
            row[0] = s;
            model.addRow(row);
        }
    }

    */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        manufacturerTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        drugCatalogTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbldrugInventory = new javax.swing.JTable();
        btnCVSAddToCart = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblEcosystemDrugNews = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        manufacturerTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manufacturerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Manufacturer Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        manufacturerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manufacturerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(manufacturerTable);

        btnBack.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/backButton.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        drugCatalogTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        drugCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Drug Price", "Availability", "Expiry Date", "Manu"
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
        jScrollPane2.setViewportView(drugCatalogTable);

        tbldrugInventory.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        tbldrugInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Drug Price", "Availability", "Total Price", "Manufacturer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbldrugInventory);

        btnCVSAddToCart.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCVSAddToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/1449760376_ic_add_shopping_cart_48px.png"))); // NOI18N
        btnCVSAddToCart.setText("ADD TO CART");
        btnCVSAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCVSAddToCartActionPerformed(evt);
            }
        });

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Drug Inventory");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Manage Manufacturers");

        status.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        status.setForeground(new java.awt.Color(255, 0, 0));

        lblStatus.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(204, 0, 0));

        lblEcosystemDrugNews.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        lblEcosystemDrugNews.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(btnCVSAddToCart)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(lblStatus)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(status)
                    .addContainerGap(686, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(185, 185, 185)
                    .addComponent(lblEcosystemDrugNews)
                    .addContainerGap(604, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatus)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCVSAddToCart)))
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnBack)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(status)
                    .addContainerGap(476, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblEcosystemDrugNews)
                    .addContainerGap(554, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void manufacturerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manufacturerTableMouseClicked
            
            lblStatus.setText("");
            int selectedRow = manufacturerTable.getSelectedRow();
            //Manufacturer manufacturer = (Manufacturer)manufacturerTable.getValueAt(selectedRow, 0);
            drugManufacturerEnterprise = (DrugManufacturerEnterprise)manufacturerTable.getValueAt(selectedRow, 0);
            populateDrugTable(drugManufacturerEnterprise);
           /* int rowCount = drugCatalogTable.getRowCount();
            DefaultTableModel dtm = (DefaultTableModel) drugCatalogTable.getModel();
            for(int i=rowCount-1;i>=0;i--){
                dtm.removeRow(i);
            }
    
            for(Drug drug : manufacturer.getManufacturerDrugCatalog().getDrugList()){
                Object row[] = new Object[4];
                row[0]=drug;
                row[1]=drug.getDrugPrice();
                row[2]=drug.getAvail();
                row[3]=drug.getExpiryDate();
                
                dtm.addRow(row);
            }*/
            
            
            
    }//GEN-LAST:event_manufacturerTableMouseClicked

    public void populateDrugTable(DrugManufacturerEnterprise dme){
        
            int rowCount = drugCatalogTable.getRowCount();
            DefaultTableModel dtm = (DefaultTableModel) drugCatalogTable.getModel();
                for(int i=rowCount-1;i>=0;i--){
                    dtm.removeRow(i);
                }
        
                for(Drug drug : dme.getManuFacturerDrugCatalog().getDrugList()){
                Object row[] = new Object[5];
                row[0]=drug;
                row[1]=drug.getDrugPrice();
                row[2]=drug.getAvail();
                row[3]=drug.getExpiryDate();
                row[4]=drug.getManufacturerName();    
                dtm.addRow(row);
            }
            
    }
    
    
    private void btnCVSAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCVSAddToCartActionPerformed
        int selectedRow = drugCatalogTable.getSelectedRow();
        Drug selectedDrug;
        //Enterprise selectedEnterprise;
        int salesPrice=0;

        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        else{
            selectedDrug=(Drug)drugCatalogTable.getValueAt(selectedRow, 0);
        }

        int fetchQty = (Integer)quantitySpinner.getValue();
        if(fetchQty<=0){
            JOptionPane.showMessageDialog(null, "Quantity cant be negative or 0");
        }
        else if (fetchQty>selectedDrug.getAvail()){
            JOptionPane.showMessageDialog(null, "No sufficient drugs availale this time");
        }
        else if (fetchQty>50 || fetchQty<5){
            JOptionPane.showMessageDialog(null, "Drug Order Quantity should be minimum 5 or maximum 50");
        }
        else if(fetchQty<=selectedDrug.getAvail()){
            boolean alreadyPresent= false;
            for(Drug d: pharmacyEnterprise.getPharmaDrugCatalog().getDrugList()){
                if(d == selectedDrug){
                    //JOptionPane.showMessageDialog(null, d.getDrugName());
                    int oldAvail = selectedDrug.getAvail();
                    int newAvail = oldAvail - fetchQty;
                    selectedDrug.setAvail(newAvail);
                    //orderItem.setQuantity(fetchQty+orderItem.getQuantity());
                    d.setCount(fetchQty+d.getCount());
                    alreadyPresent= true;
                    populateDrugTable(drugManufacturerEnterprise);
                    refershdrugInventoryTable();
                    break;
                }
            }

            if(!alreadyPresent){
                //Drug drug =cVSAdministrator.cvsAdminDrugCatalog.addDrug();
                int oldAvail = selectedDrug.getAvail();
                int newAvail = oldAvail - fetchQty;
                selectedDrug.setAvail(newAvail);
                selectedDrug.setCount(fetchQty);
                pharmacyEnterprise.getPharmaDrugCatalog().getDrugList().add(selectedDrug);
                populateDrugTable(drugManufacturerEnterprise);
                refershdrugInventoryTable();
            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Quantity requested is not available");
        }

    }//GEN-LAST:event_btnCVSAddToCartActionPerformed

    private void refershdrugInventoryTable(){
        
        int rowCount = tbldrugInventory.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)tbldrugInventory.getModel();
        
        for(int i=rowCount-1; i>=0;i--){
                dtm.removeRow(i);
        }
        
        //JOptionPane.showMessageDialog(null, pharmacyEnterprise.getPharmaDrugCatalog().getDrugList());
        for(Drug d: pharmacyEnterprise.getPharmaDrugCatalog().getDrugList()){
                Object row[] = new Object[5];
                row[0]=d;
                row[1]=d.getDrugPrice();
                row[2]=d.getCount();
                row[3]=d.getDrugPrice()*d.getCount();
                row[4]=d.getManufacturerName();
                dtm.addRow(row);
        }

        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCVSAddToCart;
    private javax.swing.JTable drugCatalogTable;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblEcosystemDrugNews;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable manufacturerTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JLabel status;
    private javax.swing.JTable tbldrugInventory;
    // End of variables declaration//GEN-END:variables

}
