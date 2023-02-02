/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Contact;
import Model.Person;
import Model.Recipe;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author divya
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private Person person;
    public ViewJPanel() {
        initComponents();
        
    }

    ViewJPanel(Person person1) {
       
        this.person = person1;
        initComponents();
        display();
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fFname = new javax.swing.JTextField();
        fLname = new javax.swing.JTextField();
        fUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fPhno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fEmailID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fRecipeName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fNoServings = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fDifficultylevel = new javax.swing.JTextField();
        fNoOfIngredients = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fCategoryOfFood = new javax.swing.JTextField();
        fDescription = new javax.swing.JTextField();
        fIsglutenfree = new javax.swing.JTextField();
        lblimage = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Chef First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 78, -1, -1));

        jLabel2.setText("Chef Last Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 118, -1, -1));

        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 158, -1, -1));

        fFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fFnameActionPerformed(evt);
            }
        });
        jPanel1.add(fFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 107, -1));
        jPanel1.add(fLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 107, -1));
        jPanel1.add(fUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 107, -1));

        jLabel4.setText("Phno.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));
        jPanel1.add(fPhno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 117, -1));

        jLabel5.setText("Email ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));
        jPanel1.add(fEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 111, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Details");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 31, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Recipe Details");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel8.setText("Recipe Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jPanel1.add(fRecipeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 107, -1));

        jLabel9.setText("No. Of Servings");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
        jPanel1.add(fNoServings, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 107, -1));

        jLabel10.setText("Is Gluten Free");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel11.setText("No. of Ingredients");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 449, -1, -1));

        jLabel13.setText("Difficulty Level");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));
        jPanel1.add(fDifficultylevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 107, -1));
        jPanel1.add(fNoOfIngredients, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 101, -1));

        jLabel14.setText("Category of food");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jLabel15.setText("Description");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 72, -1));

        fCategoryOfFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fCategoryOfFoodActionPerformed(evt);
            }
        });
        jPanel1.add(fCategoryOfFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 101, -1));

        fDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fDescriptionActionPerformed(evt);
            }
        });
        jPanel1.add(fDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 101, -1));
        jPanel1.add(fIsglutenfree, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 107, -1));

        lblimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 137, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
  public void display()
    {
        String a = "yes";
        String b = "no";
        fFname.setText(this.person.getcFname());
        fLname.setText(this.person.getcLname());
        fUsername.setText(this.person.getUsername());
        
        Recipe recipe = this.person.getRecipe();
        fRecipeName.setText(recipe.getRecipeTitle());
        fNoServings.setText(String.valueOf(recipe.getNoOfServings()));
        fDifficultylevel.setText(String.valueOf(recipe.getDifficultyLevel()));
        fDescription.setText(recipe.getDescription());
        fCategoryOfFood.setText(recipe.getCatOfFood());
        fNoOfIngredients.setText(String.valueOf(recipe.getNuOfIng()));
        fIsglutenfree.setText(String.valueOf(recipe.isIsGlutenFree()));
                
        lblimage.setIcon(recipe.getPhoto());/*;*/
        
        Contact contact = this.person.getContact();
        fEmailID.setText(contact.getEmail());
        fPhno.setText(String.valueOf(contact.getPhno()));
           
        
    }
    
    private void fFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fFnameActionPerformed

    private void fCategoryOfFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fCategoryOfFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fCategoryOfFoodActionPerformed

    private void fDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fDescriptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fCategoryOfFood;
    private javax.swing.JTextField fDescription;
    private javax.swing.JTextField fDifficultylevel;
    private javax.swing.JTextField fEmailID;
    private javax.swing.JTextField fFname;
    private javax.swing.JTextField fIsglutenfree;
    private javax.swing.JTextField fLname;
    private javax.swing.JTextField fNoOfIngredients;
    private javax.swing.JTextField fNoServings;
    private javax.swing.JTextField fPhno;
    private javax.swing.JTextField fRecipeName;
    private javax.swing.JTextField fUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimage;
    // End of variables declaration//GEN-END:variables
}
