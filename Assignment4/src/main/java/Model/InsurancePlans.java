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
public class InsurancePlans {
   
    private ArrayList<PlanDetail> planList;

    
    
    public InsurancePlans()
    {
        this.planList = new ArrayList<PlanDetail>();
    }
    
    public ArrayList<PlanDetail> getPlanList() {
        return planList;
    }

    public void setPlanList(ArrayList<PlanDetail> planList) {
        this.planList = planList;
    }
//    
   public PlanDetail addplan()
  {
       PlanDetail plan1 = new PlanDetail();
    planList.add(plan1);
       return plan1;
   }
  
    public void deletePlan(PlanDetail plan1)
    {
        planList.remove(plan1);
    }
//    
//      public void addplan(PlanDetail o){
//        this.planList.add(o);
//    }
//    
//     public void addPlanID(PlanDetail p) {
//        this.planList.add(p);
//    } 
  
}
