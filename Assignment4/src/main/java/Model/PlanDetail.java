/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Model.Applicant.count;
import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class PlanDetail {
    
    public static int count=1000;
   private int planID;
    private String planName;
    private int costperMonth;
    private int costperAnnum = 12 * costperMonth;
     private ArrayList<PlanDetail> petlist;
     private ArrayList<Pet> pet1;
     
    
    public ArrayList<Pet> getPet1() {
        return pet1;
    }

    public void setPet1(ArrayList<Pet> pet1) {
        this.pet1 = pet1;
    }
     
    public PlanDetail()
    {
         super();
        this.petlist = new ArrayList<PlanDetail>();
          PlanDetail.count= count+2;
        this.planID=count;
      
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PlanDetail.count = count;
    }

    public ArrayList<PlanDetail> getPetlist() {
        return petlist;
    }

    public void setPetlist(ArrayList<PlanDetail> petlist) {
        this.petlist = petlist;
    }
  
    

    
  
    public int getPlanID() {
        return planID;
    }

    public void setPlanID(int planID) {
        this.planID = planID;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getCostperMonth() {
        return costperMonth;
    }

    public void setCostperMonth(int costperMonth) {
        this.costperMonth = costperMonth;
    }

    public int getCostperAnnum() {
        return costperAnnum;
    }

    public void setCostperAnnum(int costperAnnum) {
        this.costperAnnum = costperAnnum;
    }
      
    
      public String toString()
    {
        return String.valueOf(planID);
    }
    
   public void addPlanID(PlanDetail o){
        this.petlist.add(o);
    }
      
//   public void addPetName(Pet p)
//   {
//       this.petlist.add(o)
//   }
}
