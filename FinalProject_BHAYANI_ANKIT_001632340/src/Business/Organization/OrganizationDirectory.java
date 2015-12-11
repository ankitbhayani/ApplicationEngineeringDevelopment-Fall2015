/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Receptionist.getValue())){
            organization = new ReceptionistOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PharmaManager.getValue())){
            organization = new PharmaManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.StorePharmacist.getValue())){
            organization = new StorePharmacistOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Manufacturer.getValue())){
            organization = new ManufacturerOrganization();
            organizationList.add(organization);
        }
        /*else if (type.getValue().equals(Type.DrugInspector.getValue())){
            organization = new DrugInspectorOrganization();
            organizationList.add(organization);
        }*/
        else if (type.getValue().equals(Type.DrugController.getValue())){
            organization = new DrugControllerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    /*public Enterprise searchEnterprise(String eName){
        for (Enterprise e : enterpriseList) {
            if(e.getName().equals(eName)){
                return e;
            }
        }
        return null;
    }*/
    
    public void removeOrganization(Organization o){
        organizationList.remove(o);
    }
    
    
}