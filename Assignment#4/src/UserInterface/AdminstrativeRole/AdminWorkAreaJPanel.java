package UserInterface.AdminstrativeRole;

import Business.CVSAdministrator;
import Business.ManufacturerDirectory;
import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JPanel;
//import org.jdom2.Document;
//import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author  Mihir Mehta / Hechen Gao
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private ManufacturerDirectory supplierDirectory;
    private CVSAdministrator cVSAdministrator;
    
    public AdminWorkAreaJPanel(JPanel userProcessContainer,CVSAdministrator cVSAdministrator) {
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.supplierDirectory=supplierDirectory;
        this.cVSAdministrator=cVSAdministrator;
        //loadManufacturerFromXML();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageDrugManufacturers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSearchDrugs = new javax.swing.JButton();
        btnCreateManageStores = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageDrugManufacturers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageDrugManufacturers.setText("Manage Drugs/Manufacturers>>");
        btnManageDrugManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDrugManufacturersActionPerformed(evt);
            }
        });
        add(btnManageDrugManufacturers, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 300, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        btnSearchDrugs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchDrugs.setText("Search Drugs in the Stores>>");
        btnSearchDrugs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDrugsActionPerformed(evt);
            }
        });
        add(btnSearchDrugs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 300, -1));

        btnCreateManageStores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCreateManageStores.setText("Create/Manage Stores>>");
        btnCreateManageStores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateManageStoresActionPerformed(evt);
            }
        });
        add(btnCreateManageStores, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 300, -1));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ankit Bhayani\\Desktop\\logo.gif")); // NOI18N
        Logo.setText("jLabel2");
        add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 390, 90));
    }// </editor-fold>//GEN-END:initComponents
   /*  private void loadManufacturerFromXML(){
          SAXBuilder builder = new SAXBuilder();
	  File xmlFile = new File("c:\\file.xml");

	  try {

		Document document = (Document) builder.build(xmlFile);
		Element rootNode = document.getRootElement();
		List list = rootNode.getChildren("staff");

		for (int i = 0; i < list.size(); i++) {

		   Element node = (Element) list.get(i);

		   System.out.println("First Name : " + node.getChildText("firstname"));
		   System.out.println("Last Name : " + node.getChildText("lastname"));
		   System.out.println("Nick Name : " + node.getChildText("nickname"));
		   System.out.println("Salary : " + node.getChildText("salary"));

		}

	  } catch (IOException io) {
		System.out.println(io.getMessage());
	  } catch (JDOMException jdomex) {
		System.out.println(jdomex.getMessage());
	  }
	}
    }  
    */
    
    private void btnManageDrugManufacturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDrugManufacturersActionPerformed
    ManageManufacturers ms = new ManageManufacturers(userProcessContainer, cVSAdministrator);
    userProcessContainer.add("ManageSupplierAdministrative", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDrugManufacturersActionPerformed

    private void btnSearchDrugsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDrugsActionPerformed
    SearchStoresInventoryJPanel ms = new SearchStoresInventoryJPanel(userProcessContainer, cVSAdministrator);
    userProcessContainer.add("SearchStoresInventoryJPanel", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSearchDrugsActionPerformed

    private void btnCreateManageStoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateManageStoresActionPerformed

            ManageStores ms = new ManageStores(userProcessContainer, cVSAdministrator);
            userProcessContainer.add("ManageStores", ms);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateManageStoresActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnCreateManageStores;
    private javax.swing.JButton btnManageDrugManufacturers;
    private javax.swing.JButton btnSearchDrugs;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}