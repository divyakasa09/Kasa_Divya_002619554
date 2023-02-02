/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author divya
 */
public class Recipe {
    String recipeTitle;
    int noOfServings;
    boolean isGlutenFree;
    float difficultyLevel;
    int nuOfIng;
    String catOfFood;
    String description;
   // int recipiepic;
      private ImageIcon photo;

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }

  
    
   
  

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public int getNoOfServings() {
        return noOfServings;
    }

    public void setNoOfServings(int noOfServings) {
        this.noOfServings = noOfServings;
    }

    public boolean isIsGlutenFree() {
        return isGlutenFree;
    }

    public void setIsGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

  

   
    
    public float getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(float difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getNuOfIng() {
        return nuOfIng;
    }

    public void setNuOfIng(int nuOfIng) {
        this.nuOfIng = nuOfIng;
    }

    public String getCatOfFood() {
        return catOfFood;
    }

    public void setCatOfFood(String catOfFood) {
        this.catOfFood = catOfFood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
        
    
}

