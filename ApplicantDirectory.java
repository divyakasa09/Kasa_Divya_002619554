/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class ApplicantDirectory {

    
    private ArrayList<Applicant> applicantList;
    
    public ApplicantDirectory()
    {
        this.applicantList=new ArrayList<Applicant>();
    }
    
    public ArrayList<Applicant> getApplicantList() {
        return applicantList;
    }

    public void setApplicantList(ArrayList<Applicant> applicantList) {
        this.applicantList = applicantList;
    }
  
    
    public Applicant addApplicant()
    {
        Applicant applicant=new Applicant();
        applicantList.add(applicant);
        return applicant;
    }
    
    public void deleteApplicant(Applicant applicant)
    {
        applicantList.remove(applicant);
    }
    
    
    public Applicant searchApplicantByID(int ApplicantionID)
    {
        for(Applicant applicant : applicantList )
        {
          if(applicant.getApplicationID()== ApplicantionID) 
              return applicant;
        }
        return null;
    }
    
     public Applicant searchApplicantByName(String ownerFirstName)
    {
        for(Applicant applicant : applicantList )
        {
          if(applicant.getOwnerFirstName().equals(ownerFirstName)) 
              return applicant;
        }
        return null;
    }
    
 
    
    
    
    
    
}
