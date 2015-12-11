/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.IndividualUser.Patient;
import Business.Orders.Order;
import Business.VitalSigns.VitalSign;

/**
 *
 * @author raunak
 */
public class GetDiagnosisWorkRequest extends WorkRequest{
    
    private String testResult;
    private Patient patient;
    private VitalSign associatedVitalSign;
    private Order order;
    private String prescribedMedicines;
    private String dosage;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    
    public String getPrescribedMedicines() {
        return prescribedMedicines;
    }

    public void setPrescribedMedicines(String prescribedMedicines) {
        this.prescribedMedicines = prescribedMedicines;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public VitalSign getAssociatedVitalSign() {
        return associatedVitalSign;
    }

    public void setAssociatedVitalSign(VitalSign associatedVitalSign) {
        this.associatedVitalSign = associatedVitalSign;
    }
    
    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
}
