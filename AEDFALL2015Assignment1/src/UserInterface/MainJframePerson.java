/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Person;

/**
 *
 * @author Swati
 */
public class MainJframePerson extends javax.swing.JFrame {

    private Person person;
    /**
     * Creates new form MainJframePerson
     */
    public MainJframePerson() {
        initComponents();
        person = new Person();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftPane = new javax.swing.JPanel();
        btnCreatePersonProfile = new javax.swing.JButton();
        btnViewPersonProfile = new javax.swing.JButton();
        rightPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(250, 150));
        setName("Personal Information"); // NOI18N

        leftPane.setBackground(new java.awt.Color(153, 102, 255));

        btnCreatePersonProfile.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnCreatePersonProfile.setText("Create Person's Profile");
        btnCreatePersonProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonProfileActionPerformed(evt);
            }
        });

        btnViewPersonProfile.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnViewPersonProfile.setText("View Person's Profile");
        btnViewPersonProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPersonProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPaneLayout = new javax.swing.GroupLayout(leftPane);
        leftPane.setLayout(leftPaneLayout);
        leftPaneLayout.setHorizontalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreatePersonProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewPersonProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        leftPaneLayout.setVerticalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnCreatePersonProfile)
                .addGap(51, 51, 51)
                .addComponent(btnViewPersonProfile)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(leftPane);

        javax.swing.GroupLayout rightPaneLayout = new javax.swing.GroupLayout(rightPane);
        rightPane.setLayout(rightPaneLayout);
        rightPaneLayout.setHorizontalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        rightPaneLayout.setVerticalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(rightPane);

        getContentPane().add(splitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePersonProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonProfileActionPerformed
        // TODO add your handling code here:
        CreatePersonJPanel createPersonJPanel = new CreatePersonJPanel(person);
        splitPane.setRightComponent(createPersonJPanel);
    }//GEN-LAST:event_btnCreatePersonProfileActionPerformed

    private void btnViewPersonProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPersonProfileActionPerformed
        // TODO add your handling code here:
        ViewPersonJPanel viewPersonJPanel = new ViewPersonJPanel(person);
        splitPane.setRightComponent(viewPersonJPanel);
    }//GEN-LAST:event_btnViewPersonProfileActionPerformed

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
            java.util.logging.Logger.getLogger(MainJframePerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframePerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframePerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframePerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframePerson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePersonProfile;
    private javax.swing.JButton btnViewPersonProfile;
    private javax.swing.JPanel leftPane;
    private javax.swing.JPanel rightPane;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
