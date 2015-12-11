/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PharmaManagerRole;
import Business.Role.Role;
import Business.Role.StorePharmacistRole;
import java.util.ArrayList;

/**
 *
 * @author Ankit Bhayani
 */
public class StorePharmacistOrganization extends Organization{

    public StorePharmacistOrganization() {
        super(Organization.Type.StorePharmacist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StorePharmacistRole());
        return roles;
        
    }
    
}
