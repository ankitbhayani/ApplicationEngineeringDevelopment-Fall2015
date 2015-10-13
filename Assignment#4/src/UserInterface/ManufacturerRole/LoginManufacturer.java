package UserInterface.ManufacturerRole;

import Business.Manufacturer;
import Business.ManufacturerDirectory;
import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.text.Document;
import javax.swing.text.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
//import org.jdom2.Element;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class LoginManufacturer extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private ManufacturerDirectory manufacturerDirectory;
    
    public LoginManufacturer(JPanel upc, ManufacturerDirectory sd) {
        initComponents();
        userProcessContainer = upc;
        manufacturerDirectory = sd;
        
       // loadManufacturerFromXML();
        
        supplierComboBox.removeAllItems();;
        for (Manufacturer supplier : manufacturerDirectory.getManufacturerlist()) {
            supplierComboBox.addItem(supplier);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        supplierComboBox = new javax.swing.JComboBox();
        Logo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Manufacturer Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 30));

        btnFind.setText("GO>>");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Manufacturer Login");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        supplierComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        supplierComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierComboBoxActionPerformed(evt);
            }
        });
        add(supplierComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 150, 30));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ankit Bhayani\\Desktop\\logo.gif")); // NOI18N
        Logo.setText("jLabel2");
        add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 390, 90));
    }// </editor-fold>//GEN-END:initComponents

   /* public void loadManufacturerFromXML(){
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
    }*/
    
    
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        Manufacturer supplier = (Manufacturer) supplierComboBox.getSelectedItem();
        ManufacturerWorkAreaJPanel swajp = new ManufacturerWorkAreaJPanel(userProcessContainer, supplier);
        userProcessContainer.add("SupplierWorkAreaJPanel", swajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFindActionPerformed

    private void supplierComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboBoxActionPerformed

    }//GEN-LAST:event_supplierComboBoxActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox supplierComboBox;
    // End of variables declaration//GEN-END:variables
    
}
