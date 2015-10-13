package UserInterface.AdminstrativeRole;

import Business.CVSAdministrator;
import Business.Drug;
import Business.Manufacturer;
import Business.ManufacturerDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ManageManufacturers extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ManufacturerDirectory manufacturerDirectory;
    private CVSAdministrator cVSAdministrator;
    
    public ManageManufacturers(JPanel upc, CVSAdministrator cVSAdministrator) {
        initComponents();
        userProcessContainer = upc;
        manufacturerDirectory = cVSAdministrator.manufacturerDirectory;
        this.cVSAdministrator=cVSAdministrator;
        refreshTable();
        refershdrugInventoryTable();
    }
  
    public void refreshTable(){
        int rowCount = manufacturerTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) manufacturerTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Manufacturer s : cVSAdministrator.manufacturerDirectory.getManufacturerlist()) {
            Object row[] = new Object[1];
            row[0] = s;
            model.addRow(row);
        }
    }
        
    public void refreshDrugTable(){
        int rowCount = drugCatalogTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) drugCatalogTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Manufacturer s : cVSAdministrator.manufacturerDirectory.getManufacturerlist()) {
            Object row[] = new Object[1];
            row[0] = s;
            model.addRow(row);
        }
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        manufacturerTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAddSupplier = new javax.swing.JButton();
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
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.setEnabled(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnView.setText("View Manufacturer");
        btnView.setEnabled(false);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAddSupplier.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAddSupplier.setText("Add Manufacturer");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });

        drugCatalogTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        drugCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Drug Price", "Availability", "Expiry Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
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
        jScrollPane2.setViewportView(drugCatalogTable);

        tbldrugInventory.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        tbldrugInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Drug Price", "Availability", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbldrugInventory);

        btnCVSAddToCart.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
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
        jLabel6.setText("CVS Drug Inventory");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Manage Manufacturers");

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ankit Bhayani\\Desktop\\logo.gif")); // NOI18N
        Logo.setText("jLabel2");

        status.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        status.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemove)
                                .addGap(17, 17, 17)
                                .addComponent(btnView)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddSupplier))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel5)
                                .addGap(12, 12, 12)
                                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnCVSAddToCart))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(status)
                    .addContainerGap(434, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCVSAddToCart))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRemove)
                    .addComponent(btnView)
                    .addComponent(btnAddSupplier))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(status)
                    .addContainerGap(452, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed

        AddManufacturer as = new AddManufacturer(userProcessContainer, manufacturerDirectory);
        userProcessContainer.add("AddSupplier", as);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddSupplierActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int row = manufacturerTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Manufacturer s = (Manufacturer)manufacturerTable.getValueAt(row,0);
    /*    ViewSupplier vs = new ViewSupplier(userProcessContainer, s);
        userProcessContainer.add("ViewSupplier", vs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        */
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        int row = manufacturerTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Manufacturer s = (Manufacturer) manufacturerTable.getValueAt(row, 0);
        manufacturerDirectory.removeManufacturer(s);
        refreshTable();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void manufacturerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manufacturerTableMouseClicked
            
            int selectedRow = manufacturerTable.getSelectedRow();
            Manufacturer manufacturer = (Manufacturer)manufacturerTable.getValueAt(selectedRow, 0);
    
            populateDrugTable(manufacturer);
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

    public void populateDrugTable(Manufacturer manufacturer){
        
            int rowCount = drugCatalogTable.getRowCount();
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
            }
            
    }
    
    
    private void btnCVSAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCVSAddToCartActionPerformed
        int selectedRow = drugCatalogTable.getSelectedRow();
        Drug selectedDrug;
        Manufacturer selectedManufacturer;
        int salesPrice=0;

        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        else{
            selectedDrug=(Drug)drugCatalogTable.getValueAt(selectedRow, 0);
            selectedManufacturer=cVSAdministrator.manufacturerDirectory.searchManufacturer(selectedDrug.getManufacturerName());
        }

        /*try{
            salesPrice = Integer.parseInt(txtSalesPrice.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Sales Price");
        }

        if(salesPrice<selectedProduct.getPrice()){
            JOptionPane.showMessageDialog(null, "Sales price needs to be above base price");
            return;
        }*/

        int fetchQty = (Integer)quantitySpinner.getValue();
        if(fetchQty<=0){
            JOptionPane.showMessageDialog(null, "Quantity cant be negative or 0");
        }
        else if (fetchQty>selectedDrug.getAvail()){
            JOptionPane.showMessageDialog(null, "No sufficient drugs availale this time");
        }
        else if(fetchQty<=selectedDrug.getAvail()){
            boolean alreadyPresent= false;
            for(Drug d: cVSAdministrator.getCvsAdminDrugCatalog().getDrugList()){
                if(d == selectedDrug){
                    JOptionPane.showMessageDialog(null, d.getDrugName());
                    int oldAvail = selectedDrug.getAvail();
                    int newAvail = oldAvail - fetchQty;
                    selectedDrug.setAvail(newAvail);
                    //orderItem.setQuantity(fetchQty+orderItem.getQuantity());
                    d.setCount(fetchQty+d.getCount());
                    alreadyPresent= true;
                    populateDrugTable(selectedManufacturer);
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
                cVSAdministrator.cvsAdminDrugCatalog.drugList.add(selectedDrug);
                populateDrugTable(selectedManufacturer);
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
        
        for(Drug d: cVSAdministrator.getCvsAdminDrugCatalog().getDrugList()){
                Object row[] = new Object[4];
                row[0]=d;
                row[1]=d.getDrugPrice();
                row[2]=d.getCount();
                row[3]=d.getDrugPrice()*d.getCount();
                dtm.addRow(row);
        }

        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCVSAddToCart;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnView;
    private javax.swing.JTable drugCatalogTable;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable manufacturerTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JLabel status;
    private javax.swing.JTable tbldrugInventory;
    // End of variables declaration//GEN-END:variables

}
