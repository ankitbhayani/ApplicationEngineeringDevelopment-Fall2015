/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logic;

/**
 *
 * @author Ankit Bhayani
 */
public class UserAccount {
    
    public static final String ADMIN_ROLE="admin";
    public static final String EMPLOYEE_ROLE="employee";
    private static int count=100;
    
    private int userID;
    private String userName;
    private String password;
    private String role;
    private String isActive;
    private Person person;

    public UserAccount() {
        userID = ++count;
       }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return (this.getPerson().getFirstName() +" " + this.getPerson().getLastName());
    }
    
     
    
}
