/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Drug.Drug;
import Business.Employee.Employee;
import Business.Enterprise.DrugManufacturerEnterprise;
import Business.IndividualUser.Manufacturer;
import Business.IndividualUser.Patient;
import Business.Orders.Order;
import Business.VitalSigns.VitalSign;

/**
 *
 * @author raunak
 */
public class InspectionRequest extends WorkRequest{
    
    private String testResult;
    private String problemExperienced;
    private String requestAdditionalTest;
    private Drug drug;
    private Patient patient;
    private DrugManufacturerEnterprise drugManufacturerEnterprise;

    public String getProblemExperienced() {
        return problemExperienced;
    }

    public void setProblemExperienced(String problemExperienced) {
        this.problemExperienced = problemExperienced;
    }

    public String getRequestAdditionalTest() {
        return requestAdditionalTest;
    }

    public void setRequestAdditionalTest(String requestAdditionalTest) {
        this.requestAdditionalTest = requestAdditionalTest;
    }

    
    
    public DrugManufacturerEnterprise getDrugManufacturerEnterprise() {
        return drugManufacturerEnterprise;
    }

    public void setDrugManufacturerEnterprise(DrugManufacturerEnterprise drugManufacturerEnterprise) {
        this.drugManufacturerEnterprise = drugManufacturerEnterprise;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }


    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
}
