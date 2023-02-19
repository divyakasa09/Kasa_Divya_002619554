/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author divya
 */
public class Vaccine {
    private String vaccinationName;
    private String courseCompleted;
    
    public Vaccine()
    {
        
    }

    public Vaccine(String vaccinationName, String courseCompleted) 
    {
        this.vaccinationName=vaccinationName;
        this.courseCompleted=courseCompleted;
    }

    public String getVaccinationName() {
        return vaccinationName;
    }

    public void setVaccinationName(String vaccinationName) {
        this.vaccinationName = vaccinationName;
    }

    public String getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(String courseCompleted) {
        this.courseCompleted = courseCompleted;
    }

   
 public String toString()
    {
        return vaccinationName;
    }
    
    
}
