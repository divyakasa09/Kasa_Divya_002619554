/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author divya
 */

public class Customer extends Users{
    int custID;
    String CuistName;

    public Customer() {
    }

    
    public Customer(String CuistName, String userName, String passWord, String userType) {
        super(userName, passWord, userType);
        this.CuistName = CuistName;
    }

    public  int getCustID() {
        return custID;
    }

    public  void setCustID(int custID) {
        this.custID = custID;
    }

    public String getCuistName() {
        return CuistName;
    }

    public void setCuistName(String CuistName) {
        this.CuistName = CuistName;
    }
    
    
}
