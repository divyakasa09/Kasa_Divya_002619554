/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
/**
 *
 * @author divya
 */
public class Branch {

    int branchID;
    String branchName;
    ArrayList<Library> libraries;
    ArrayList<Users> users;
    ArrayList<Branch> branchlist;

    public Branch() {
        libraries = new ArrayList<>();
        users = new ArrayList<>();  
        branchlist = new ArrayList<>();
    }

    public Branch(String name, ArrayList<Library> libraries, ArrayList<Users> users) {
        this.branchName = name;
        this.libraries = libraries;
        this.users = users;
    }

    public ArrayList<Branch> getBranchlist() {
        return branchlist;
    }

    public void setBranchlist(ArrayList<Branch> branchlist) {
        this.branchlist = branchlist;
    }

    public  int getBranchID() {
        return branchID;
    }

    public  void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String name) {
        this.branchName = name;
    }

    public ArrayList<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(ArrayList<Library> libraries) {
        this.libraries = libraries;
    }

    public ArrayList<Users> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Users> users) {
        this.users = users;
    }
    
    
}
