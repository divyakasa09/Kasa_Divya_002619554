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
public class VaccineL {
    
     private ArrayList<Vaccine> vaccineList;
    
    
     public VaccineL(){
       this.vaccineList=new ArrayList<Vaccine>();
   }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }
     public Vaccine addVaccine()
    {
        Vaccine vac=new Vaccine();
        vaccineList.add(vac);
        return vac;
    }
      public Vaccine findVaccine(String name) {
        for(Vaccine v: this.vaccineList) {
            if(v.getVaccinationName().equals(name)) {
                return v;
            }
        }
        
        return null;
    }
    
}
