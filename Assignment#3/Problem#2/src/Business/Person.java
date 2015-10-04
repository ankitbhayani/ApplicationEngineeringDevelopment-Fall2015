/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;


public class Person {

    //-----------------------------------------
    private static int counter=0;
    private int ID;
    private boolean checkPatient=false;
    private String addedOn;
    protected String personName;
    protected int age;
    private String streetAdress;
    private String town;
    private int zipCode;
    private String occupation;
    private String emailAddress;
    private int mobileNumber;

    public void CounterAddPerson() {
        counter++;
        this.ID=counter;
    }
    
    /*public Person() {
        counter++;
        this.ID=counter;
    }*/

    public String getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(String addedOn) {
        this.addedOn = addedOn;
    }

  
    public boolean isCheckPatient() {
        return checkPatient;
    }

    public void setCheckPatient(boolean checkPatient) {
        this.checkPatient = checkPatient;
    }

    public int getID() {
        return ID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    @Override
    public String toString(){
    return personName;             
    }
    
}
