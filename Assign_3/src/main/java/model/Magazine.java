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

public class Magazine extends Material{
    String companyName;    
    String issueType;

    public Magazine() {
    }

    public Magazine(String companyName, String issueType, String name, String regDate, boolean isAvailable) {
        super(name, regDate, isAvailable);
        this.companyName = companyName;
        this.issueType = issueType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }
    
}
