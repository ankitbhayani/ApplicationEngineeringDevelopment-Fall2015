/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ManufacturerOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ManufacturerRole.ManageDrugCatalogJPanel;
import userinterface.ManufacturerRole.ManufacturerWorkAreaJPanel;


/**
 *
 * @author Ankit Bhayani
 */
public class ManufacturerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ManufacturerWorkAreaJPanel(userProcessContainer, account, (ManufacturerOrganization)organization, enterprise,business);
    }
    
}
