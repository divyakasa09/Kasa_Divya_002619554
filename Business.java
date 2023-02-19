/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author divya
 */
public class Business
{
    ApplicantDirectory  dir;
    InsurancePlans plan;
    
    
    public Business()
    {
        this.dir= new ApplicantDirectory();
        this.plan=new InsurancePlans();
        
    }

    public ApplicantDirectory getDir() {
        return dir;
    }

    public void setDir(ApplicantDirectory dir) {
        this.dir = dir;
    }

   
    public InsurancePlans getPlan() {
        return plan;
    }

    public void setPlan(InsurancePlans plan) {
        this.plan = plan;
    }
    
    
    
}
