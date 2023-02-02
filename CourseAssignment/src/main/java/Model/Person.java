/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author divya
 */
public class Person {
    String cFname;
    String cLname;
    String username;
    Contact contact;
    Recipe recipe;
    
    public Person()
    {
        
        this.recipe=new Recipe();
        this.contact=new Contact();
        
        
    }

    public String getcFname() {
        return cFname;
    }

    public void setcFname(String cFname) {
        this.cFname = cFname;
    }

    public String getcLname() {
        return cLname;
    }

    public void setcLname(String cLname) {
        this.cLname = cLname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

   
    
    
    
    
}

