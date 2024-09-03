/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.payrollsystem.cell;

import com.mycompany.payrollsystem.event.OtherIncomeManagementActionEvent;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;

/**
 *
 * @author Paul
 */
public class TestPanel extends javax.swing.JPanel {

    /**
     * Creates new form TestPanel
     */
    public TestPanel() {
        initComponents();
                      
        edit_button.setDefaultColor(new Color(2,142,255));
        add_edit_employee_button.setDefaultColor(new Color(51,204,0));
    }
    
    public void initEvent(OtherIncomeManagementActionEvent event, int row) {
        edit_button.addActionListener((ActionEvent e) -> {
            event.onEdit(row);
        });
        
        add_edit_employee_button.addActionListener((ActionEvent e) -> {
            event.onAddAndEditEmployee(row);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        add_edit_employee_button = new com.mycompany.payrollsystem.cell.ActionButton();
        edit_button = new com.mycompany.payrollsystem.cell.ActionButton();

        setLayout(new java.awt.GridBagLayout());

        add_edit_employee_button.setForeground(new java.awt.Color(255, 255, 255));
        add_edit_employee_button.setText("Add/Edit Employee");
        add_edit_employee_button.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        add_edit_employee_button.setPreferredSize(new java.awt.Dimension(70, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        add(add_edit_employee_button, gridBagConstraints);

        edit_button.setForeground(new java.awt.Color(255, 255, 255));
        edit_button.setText("Edit");
        edit_button.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        edit_button.setPreferredSize(new java.awt.Dimension(70, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(edit_button, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.payrollsystem.cell.ActionButton add_edit_employee_button;
    private com.mycompany.payrollsystem.cell.ActionButton edit_button;
    // End of variables declaration//GEN-END:variables
}
