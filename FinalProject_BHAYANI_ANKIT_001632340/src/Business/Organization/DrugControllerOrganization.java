/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DrugControllerRole;
import Business.Role.PharmaManagerRole;
import Business.Role.Role;
import Business.Role.StorePharmacistRole;
import java.util.ArrayList;

/**
 *
 * @author Ankit Bhayani
 */
public class DrugControllerOrganization extends Organization{

    public DrugControllerOrganization() {
        super(Organization.Type.DrugController.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DrugControllerRole());
        return roles;
        
    }
    
}
