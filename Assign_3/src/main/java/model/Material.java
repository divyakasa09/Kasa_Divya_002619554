/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
/**
 *
 * @author divya
 */
public class Material {
    int serialNo;
    String name;
    String regDate;
    boolean isAvailable;    

    public Material() {
    }

    public Material(String name, String regDate, boolean isAvailable) {
        this.name = name;
        this.regDate = regDate;
        this.isAvailable = isAvailable;
    }

    public  int getSerialNo() {
        return serialNo;
    }

    public  void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

   
    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
}
