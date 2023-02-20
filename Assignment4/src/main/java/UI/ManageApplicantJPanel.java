/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Applicant;
import Model.ApplicantDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author divya
 */
public class ManageApplicantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageApplicantJPanel
     */
     private JPanel userProcessContainer;
     private ApplicantDirectory dir;
     private Applicant applicant;
     
    public ManageApplicantJPanel() 
    {
        initComponents();
    }

    ManageApplicantJPanel(JPanel userProcessContainer, ApplicantDirectory dir) {
       initComponents();
       this.userProcessContainer=userProcessContainer;
       this.dir= dir;
      // populateTable1();
       populateTable();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableApplicant = new javax.swing.JTable();
        searchByID = new javax.swing.JButton();
        viewDetails = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        fappID = new javax.swing.JTextField();
        searchByName = new javax.swing.JButton();
        fByName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        tableApplicant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Application ID", "Owner First Name", "Owner Last Name", "Application Date", "pet name", "pet age", "pet gender", "pet type", "pet breed"
            }
        ));
        jScrollPane1.setViewportView(tableApplicant);

        searchByID.setText("search");
        searchByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIDActionPerformed(evt);
            }
        });

        viewDetails.setText("view details");
        viewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsActionPerformed(evt);
            }
        });

        jButton3.setText("delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        fappID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fappIDActionPerformed(evt);
            }
        });

        searchByName.setText("search");
        searchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(searchByID)
                .addGap(43, 43, 43)
                .addComponent(fappID, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(searchByName)
                .addGap(49, 49, 49)
                .addComponent(fByName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(473, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(418, 418, 418))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewDetails)
                        .addGap(438, 438, 438))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchByID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fappID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchByName)
                        .addComponent(fByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(viewDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow=tableApplicant.getSelectedRow();
        if(selectedRow>=0)
        {
            int dialogBtn = JOptionPane.YES_NO_OPTION;
            int dialogResult=JOptionPane.showConfirmDialog(null, "Would you like to delete the data ? ", "Warning",dialogBtn );
            if(dialogResult ==JOptionPane.YES_OPTION)
            {
                Applicant applicant= (Applicant) tableApplicant.getValueAt(selectedRow,0);
                dir.deleteApplicant(applicant);
              
                populateTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Select a Row");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIDActionPerformed
        // TODO add your handling code here:
        Applicant result = dir.searchApplicantByID(Integer.valueOf(fappID.getText()));
        if(result == null)
        {
           JOptionPane.showMessageDialog(null,"Application id you enter does not exist");
        }
        else{
             DisplayJPanel panel = new DisplayJPanel(userProcessContainer, result);
             userProcessContainer.add("DisplayJPanel",panel);
             CardLayout layout = (CardLayout)userProcessContainer.getLayout();
             layout.next(userProcessContainer);
        }
         
    }//GEN-LAST:event_searchByIDActionPerformed

    private void fappIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fappIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fappIDActionPerformed

    private void viewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableApplicant.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null,"Select a Row");
        }
        else{
            Applicant applicant =(Applicant)tableApplicant.getValueAt(selectedRow, 0);
            DisplayJPanel panel = new DisplayJPanel(userProcessContainer, applicant);
            userProcessContainer.add("DisplayJPanel",panel);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewDetailsActionPerformed

    private void searchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNameActionPerformed
        // TODO add your handling code here:
        Applicant result = dir.searchApplicantByName(fByName.getText());
        if(result == null)
        {
           JOptionPane.showMessageDialog(null,"Application name you enter does not exist");
        }
        else{
             DisplayJPanel panel = new DisplayJPanel(userProcessContainer, result);
             userProcessContainer.add("DisplayJPanel",panel);
             CardLayout layout = (CardLayout)userProcessContainer.getLayout();
             layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_searchByNameActionPerformed

public void populateTable1()
{
    DefaultTableModel dtm= (DefaultTableModel) tableApplicant.getModel();
    dtm.setRowCount(0);    
   
     for (int i = 0; i < 9; i++) 
      {
            boolean rowFilled = true;         
            for (int j = 0; j < dtm.getColumnCount(); j++)
            {
                if (dtm.getValueAt(i, j) == null) 
                {
                   rowFilled = false;
                   break;
                   
               }
            }
            if (!rowFilled)
            {
                     dtm.removeRow(i);
                    populateTable();
            }
               
      }
      
}
    
   public void populateTable() {      
      
    DefaultTableModel dtm= (DefaultTableModel) tableApplicant.getModel();
    dtm.setRowCount(0);
      
    for (Applicant applicant : this.dir.getApplicantList()) {
        Object[] row = new Object[9];
        row[0] = applicant;
        row[1] = applicant.getOwnerFirstName();
        row[2] = applicant.getOwnerLastName();
        row[3] = applicant.getApplicationDate();
        row[4] = applicant.getPet().getPetName();
        row[5] = applicant.getPet().getAge();
        row[6] = applicant.getPet().getGender();
        row[7] = applicant.getPet().getPetType();
        row[8] = applicant.getPet().getBreed();
        
        // check if any value in the row is null
        boolean hasNullValue = false;
        for (Object value : row) {
            if (value == null) {
                hasNullValue = true;
                break;
            }
        }
        
        // add the row to the table if all values are non-null
        if (!hasNullValue) {
            dtm.addRow(row);
        }
    }
}

  

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fByName;
    private javax.swing.JTextField fappID;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchByID;
    private javax.swing.JButton searchByName;
    private javax.swing.JTable tableApplicant;
    private javax.swing.JButton viewDetails;
    // End of variables declaration//GEN-END:variables
}
