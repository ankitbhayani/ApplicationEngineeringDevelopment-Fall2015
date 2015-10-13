package UserInterface.ManufacturerRole;

import Business.Manufacturer;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ManufacturerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Manufacturer manufacturer;
    public ManufacturerWorkAreaJPanel(JPanel upc, Manufacturer s) {
        initComponents();
        userProcessContainer = upc;
        manufacturer = s;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageDButton = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area (Manufactuer Role)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        manageDButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageDButton.setText("Manage Drug Catalog >>");
        manageDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDButtonActionPerformed(evt);
            }
        });
        add(manageDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ankit Bhayani\\Desktop\\logo.gif")); // NOI18N
        Logo.setText("jLabel2");
        add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 390, 90));
    }// </editor-fold>//GEN-END:initComponents
    private void manageDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDButtonActionPerformed

        ManageDrugCatalogJPanel mpcjp = new ManageDrugCatalogJPanel(userProcessContainer, manufacturer);
        userProcessContainer.add("ManageProductCatalogJPanel", mpcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageDButton;
    // End of variables declaration//GEN-END:variables
}
