/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.Drug.Drug;
import Business.EcoSystem;
import Business.Enterprise.DrugManufacturerEnterprise;
import Business.Enterprise.Enterprise;
import Business.IndividualUser.Manufacturer;
import Business.Network.Network;
import Business.Utils.MyStringVerifier;
import java.awt.CardLayout;
import java.awt.Component;
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
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        MyStringVerifier myStringVerifier = new MyStringVerifier();
        nameJTextField.setInputVerifier(myStringVerifier);
        cityJTextField1.setInputVerifier(myStringVerifier);

        populateTable();
        populateComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[4];
                row[0] = enterprise.getName();
                row[1] = network.getName();
                row[3] = enterprise.getEnterpriseType().getValue();
                row[2] = enterprise.getEnterpriseCity();
                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (Network network : system.getNetworkList()) {
            networkJComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cityJTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressJTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mapJTextField3 = new javax.swing.JTextField();
        btnLoadManufacturer = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 246, 246));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "City", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 523, 300));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        networkJComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 136, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        nameJTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 136, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Enterprise Type");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        enterpriseTypeJComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 136, -1));

        submitJButton.setBackground(new java.awt.Color(242, 242, 246));
        submitJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, -1));

        backJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("City");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        cityJTextField1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        add(cityJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 148, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Address");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        addressJTextField2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        add(addressJTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 148, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Map Location");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        mapJTextField3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        add(mapJTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 148, -1));

        btnLoadManufacturer.setBackground(new java.awt.Color(242, 242, 246));
        btnLoadManufacturer.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnLoadManufacturer.setText("Load Manufacturer");
        btnLoadManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadManufacturerActionPerformed(evt);
            }
        });
        add(btnLoadManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        if(nameJTextField.getText().trim().length()==0 || cityJTextField1.getText().trim().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter some values.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        String name = nameJTextField.getText();
        
        boolean check=true;
        Enterprise en = null;
        for(Network n: system.getNetworkList()){
                en = n.getEnterpriseDirectory().searchEnterprise(name);
                if(en!=null){
                    JOptionPane.showMessageDialog(null, "Enterprise already existing, please try again with diff name");
                    check=false;
                    break;
                }
            
        }
                
        if(check){
            Enterprise enterprise = network.getEnterpriseDirectory().createEnterprise(name, type);
            enterprise.setEnterpriseCity(cityJTextField1.getText());
            enterprise.setEnterpriseAddress(addressJTextField2.getText());
            enterprise.setEnterpriseMap(mapJTextField3.getText());
            populateTable();
            nameJTextField.setText("");
            cityJTextField1.setText("");
        }

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void btnLoadManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadManufacturerActionPerformed
        
        try {
            SAXBuilder builder = new SAXBuilder();
            File manufacturerXMLFile = new File("data/Manufacturer.xml");
            File drugCatalogXMLFile = new File("data/Drugs.xml");
            Document doc = (Document) builder.build(drugCatalogXMLFile);
            Element drootnode = doc.getRootElement();
            
            
            Document d1 = (Document) builder.build(manufacturerXMLFile);
            Element mrootNode = d1.getRootElement();
            List list1 = mrootNode.getChildren("Manufacturer");
            
            DrugManufacturerEnterprise enterprise = null;
            Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();
            Network network = (Network) networkJComboBox.getSelectedItem();
            
            if(type != Enterprise.EnterpriseType.DrugManufacturer){
                JOptionPane.showMessageDialog(null, "NOT MANUFACTURER");
                return; }
            
            for (int i = 0; i < list1.size(); i++) {
                Element node = (Element) list1.get(i);
                
                enterprise = new DrugManufacturerEnterprise(node.getChildText("name"));
                enterprise.setEnterpriseCity(node.getChildText("city"));
                network.getEnterpriseDirectory().getEnterpriseList().add(enterprise);
                  
                
                List list = drootnode.getChildren(enterprise.getName());
                for (int j = 0; j < list.size(); j++) {
                    Element nodes = (Element) list.get(j);
                    
                    Drug drug = new Drug();
                    drug.setDrugName(nodes.getChildText("name"));
                    drug.setDrugPrice(Integer.parseInt(nodes.getChildText("price")));
                    drug.setAvail(Integer.parseInt(nodes.getChildText("quantity")));
                    drug.setExpiryDate(nodes.getChildText("expirydate"));
                    drug.setManufacturerName(enterprise.getName());
                    enterprise.getManuFacturerDrugCatalog().getDrugList().add(drug);
                }
                   
            }
        } catch (JDOMException ex) {
            Logger.getLogger(ManageEnterpriseJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManageEnterpriseJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Manufacurer Data Loaded");
        populateTable();
        btnLoadManufacturer.setEnabled(false);

    }//GEN-LAST:event_btnLoadManufacturerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJTextField2;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnLoadManufacturer;
    private javax.swing.JTextField cityJTextField1;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mapJTextField3;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
