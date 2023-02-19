/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author divya
 */
public class PlanDetail {
    
   private int planID;
    private String planName;
    private int costperMonth;
    private int costperAnnum = 12 * costperMonth;
  
    
    public PlanDetail()
    {
        this.planID = planID;
      
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
    
    
    
    
}
