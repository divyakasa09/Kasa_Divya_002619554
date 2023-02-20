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
    VaccineL vac1;
    
    
    public Business()
    {
        this.dir= new ApplicantDirectory();
        this.plan=new InsurancePlans();
        
    }

    public VaccineL getVac1() {
        return vac1;
    }

    public void setVac1(VaccineL vac1) {
        this.vac1 = vac1;
    }

    public ApplicantDirectory getDir() {
        return dir;
    }

    public void setDir(ApplicantDirectory dir) 
    {
        this.dir = dir;
    }

   
    public InsurancePlans getPlan() {
        return plan;
    }

    public void setPlan(InsurancePlans plan) {
        this.plan = plan;
    }
    
     public PlanDetail findInsurance(int iid){
        for (PlanDetail i : plan.getPlanList()){
            if (i.getPlanID() == iid)
            {
                return i;
            }
       
        }
        return null;
    }
     public Applicant findApplicant(int aid){
        for (Applicant a: dir.getApplicantList()){
            if (a.getApplicationID() == aid){
                return a;
            }
       
        }
        return null;
    }
}
