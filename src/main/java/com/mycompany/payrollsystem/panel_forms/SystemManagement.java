/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.payrollsystem.panel_forms;

import com.mycompany.payrollsystem.component.*;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import java.awt.Dimension;

/**
 *
 * @author Paul
 */
public class SystemManagement extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
//    private final Font headerFont;
//    private final JTableHeader other_income_management_table_header;
   
    

    public SystemManagement() {
//        this.headerFont = new Font("Arial", Font.BOLD, 20);
        initComponents();
        setOpaque(false);
        
//        other_income_management_table_header = other_income_management_table.getTableHeader();
//        other_income_management_table_header.setFont(headerFont);
        
        setPreferredSize(new Dimension(900, 1130));
        init();
    }

    private void init() {
       
        breadcrumb.setupBreadcrumb("System Management");
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        breadcrumb = new com.mycompany.payrollsystem.component.Breadcrumb();

        setPreferredSize(new java.awt.Dimension(900, 935));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(breadcrumb, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(breadcrumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1023, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.payrollsystem.component.Breadcrumb breadcrumb;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
