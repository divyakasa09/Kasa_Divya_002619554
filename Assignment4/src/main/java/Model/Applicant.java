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
    public static int count=0;
    private int ApplicationID;
    private String ownerFirstName;
    private String ownerLastName;
    private String applicationDate;
    Pet pet;
  
    
    
    public Applicant()
    {
        //this.ApplicationID= count++;
        this.applicationDate=applicationDate;
        this.pet= new Pet();
        Applicant.count= count+2;
        this.ApplicationID=count;
        
    }

    public Applicant(String ownerFirstName, String ownerLastName)
    {
        
        this.ApplicationID = count;
         Applicant.count=count+4;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName= ownerLastName;
        
        
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Applicant.count = count;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
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
