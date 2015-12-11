/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PatientRole.PatientDetailsJPanel;
import userinterface.NurseRole.NurseWorkAreaJPanel;
import userinterface.PatientRole.PatientWorkAreaJPanel;

/**
 *
 * @author Ankit Bhayani
 */
public class PatientRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel pnl, UserAccount ua, Organization o, Enterprise e, EcoSystem es) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new PatientWorkAreaJPanel(pnl, ua, o, e, es);
    }
    
}
