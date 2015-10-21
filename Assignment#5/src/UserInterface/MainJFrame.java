/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Logic.Business;
import Business.Logic.ConfigureBusiness;
import Business.Logic.Customer;
import Business.Logic.Order;
import Business.Logic.OrderItem;
import Business.Logic.SalesPerson;
import Business.Logic.Person;
import Business.Logic.Product;
import Business.Logic.UserAccount;
import UserInterface.Admin.AdminWorkAreaJPanel;
import UserInterface.SalesPerson.EmployeeWorkAreaJPanel;
import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Ankit Bhayani
 */
public class MainJFrame extends javax.swing.JFrame {

    private Business business;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() throws JDOMException, IOException {
        
        initComponents();
        business=ConfigureBusiness.initializeBusiness();
        loadDataFromXML();
        setSize(1000, 800);
    }

    
       public void loadDataFromXML() throws JDOMException, IOException{
          SAXBuilder builder = new SAXBuilder();
	
          File employeeXMLFile = new File("C:\\Users\\Ankit Bhayani\\Documents\\NetBeansProjects\\AEDFALL2015Assignment5\\data\\SalesEmployee.xml");
          Document d1 = (Document) builder.build(employeeXMLFile);
          Element mrootNode = d1.getRootElement();
	  List list1 = mrootNode.getChildren("Employee");

            for (int i = 0; i < list1.size(); i++) {
                Element node = (Element) list1.get(i);

                    SalesPerson employee = business.getEmployeeDirectory().addEmployee();
                    employee.setFirstName(node.getChildText("fname"));
                    employee.setLastName(node.getChildText("lname"));
                    employee.setOrganization(node.getChildText("organization"));
                    Person person = employee;
                    
                    UserAccount ua = business.getUserDirectory().addUserAccount();
                    ua.setUserName(node.getChildText("uname"));
                    ua.setPassword(node.getChildText("pwd"));
                    ua.setPerson(person);
                    ua.setRole(UserAccount.EMPLOYEE_ROLE);
                    ua.setIsActive("Yes");
                }   
                
          File prodXMLFile = new File("C:\\Users\\Ankit Bhayani\\Documents\\NetBeansProjects\\AEDFALL2015Assignment5\\data\\ProductList.xml");
          Document d2 = (Document) builder.build(prodXMLFile);
          Element drootnode = d2.getRootElement();    
          List list = drootnode.getChildren("Product");
          
                    for (int j = 0; j < list.size(); j++) {          
                        Element nodes = (Element) list.get(j);
                        Product product = business.getXeroxProductCatalog().addProduct();
                        product.setProdName(nodes.getChildText("prodName"));
                        product.setProdDesc(nodes.getChildText("description"));
                        product.setFloorPrice(Float.valueOf(nodes.getChildText("floorPrice")));
                        product.setTargetPrice(Float.valueOf(nodes.getChildText("targetPrice")));
                        product.setCeilingPrice(Float.valueOf(nodes.getChildText("ceilingPrice")));
                        product.setAvail(Integer.valueOf(nodes.getChildText("avail")));
                    
                    }
                
	  File customerXMLfile = new File("C:\\Users\\Ankit Bhayani\\Documents\\NetBeansProjects\\AEDFALL2015Assignment5\\data\\Customer.xml");
          Document d3 = (Document) builder.build(customerXMLfile);
          Element srootNode = d3.getRootElement();
	  List list2 = srootNode.getChildren("Customer");

		for (int i = 0; i < list2.size(); i++) {
                    Element node = (Element) list2.get(i);
                    Customer customer = business.getCustomerDirectory().addCustomer();
                    customer.setCustomerName(node.getChildText("customerName"));
                  
                }   
          
          /*File orderXMLfile = new File("C:\\Users\\Ankit Bhayani\\Documents\\NetBeansProjects\\AEDFALL2015Assignment5\\data\\Order.xml");
          Document d4 = (Document) builder.build(orderXMLfile);
          Element rnode = d4.getRootElement();
	  List list3 = rnode.getChildren("OrderItem");

		for (int i = 0; i < list3.size(); i++) {
                    Element node = (Element) list3.get(i);
                    Order order = new Order();
                    Product p=(Product)node.getChildText("pname");
                    OrderItem oi = order.addOrderItem(order, i, i);
                    customer.setCustomerName(node.getChildText("customerName"));
                  
                }          
         */       
                

    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setEnabled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        txtUserName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("UserName");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(txtPassword))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnLogout))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        boolean flag=false;
        
        for(UserAccount ua : business.getUserDirectory().getUserAccountList()){
            //JOptionPane.showMessageDialog(null, "Pata nai");
            if(ua.getUserName().equals(userName) && ua.getPassword().equals(password)){
                    
                //JOptionPane.showMessageDialog(null, "user/pwd match");
                //JOptionPane.showMessageDialog(null, ua.getUserName());    
                
                if(ua.getRole().equalsIgnoreCase(UserAccount.ADMIN_ROLE)){
                    //JOptionPane.showMessageDialog(null, "Inside admin");
                    userProcessContainer.removeAll();
                    AdminWorkAreaJPanel awajp = new AdminWorkAreaJPanel(userProcessContainer, business);
                    userProcessContainer.add("AdminWorkAreaJPanel",awajp);
                    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                    flag=true;
                    break;
                }
            
                else if(ua.getRole().equalsIgnoreCase(UserAccount.EMPLOYEE_ROLE)){
                    //JOptionPane.showMessageDialog(null, "Inside employee");
                    
                    /*for(Customer c: business.getCustomerDirectory().getCustomerList()){
                        JOptionPane.showMessageDialog(null, c.getCustomerName());
                    }*/
                        
                    
                    userProcessContainer.removeAll();
                    EmployeeWorkAreaJPanel ewajp = new EmployeeWorkAreaJPanel(userProcessContainer, business,ua);
                    userProcessContainer.add("EmployeeWorkAreaJPanel",ewajp);
                    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                    flag=true;
                    break;  
                }
            }
        }    
        
        if(flag==false){
            JOptionPane.showMessageDialog(null, "Invalid UserName/Password");
            return;
        }
        
        btnLogout.setEnabled(true);
        txtUserName.setEditable(false);
        txtPassword.setEditable(false);
        btnLogin.setEnabled(false);
        
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        btnLogout.setEnabled(false);
        txtUserName.setEditable(true);
        txtPassword.setEditable(true);
        btnLogin.setEnabled(true);
        
        txtUserName.setText("");
        txtPassword.setText("");
        
        userProcessContainer.removeAll();
        JPanel blank = new JPanel();
        userProcessContainer.add("blank",blank);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
                    
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainJFrame().setVisible(true);
                } catch (JDOMException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
