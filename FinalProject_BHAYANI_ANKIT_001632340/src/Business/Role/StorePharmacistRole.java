/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PharmaManagerOrganization;
import Business.Organization.StorePharmacistOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PharmaManagerRole.DrugLookUpStoreAssignJPanel;
import userinterface.StoreAdminRole.ManageInventoryStoreJPanel;
import userinterface.StoreAdminRole.StorePharmacistWorkAreaJPanel;

/**
 *
 * @author Ankit Bhayani
 */
public class StorePharmacistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new StorePharmacistWorkAreaJPanel(userProcessContainer, account, (StorePharmacistOrganization)organization, enterprise, business);
    }
    
}
