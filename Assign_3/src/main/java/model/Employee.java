/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author divya
 */
public class Employee extends  Users{
    int empId;
    int experience;
    String designation;

    public Employee() {
    }

    public Employee(int experience, String designation) {
        this.experience = experience;
        this.designation = designation;
    }

    public Employee(int experience, String designation, String userName, String passWord, String userType) {
        super(userName, passWord, userType);
        this.experience = experience;
        this.designation = designation;
    }

    

    public int getEmpId() {
        return empId;
    }

    public  void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" + "experience=" + experience + ", designation=" + designation + '}';
    }
        
}
