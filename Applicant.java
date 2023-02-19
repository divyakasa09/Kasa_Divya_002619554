/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author divya
 */
public class Applicant {
    private int ApplicationID;
    private String ownerFirstName;
    private String ownerLastName;
    private Date applicationDate;
    Pet pet;
  
    
    
    public Applicant()
    {
        this.applicationDate=new Date();
        this.pet= new Pet();
        
    }

    public int getApplicationID() {
        return ApplicationID;
    }

    public void setApplicationID(int ApplicationID) {
        this.ApplicationID = ApplicationID;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

  
    
    
    public String toString()
    {
        return String.valueOf(ApplicationID);
    }
    
}
