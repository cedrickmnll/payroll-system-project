    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.payrollsystem.cell;

import com.mycompany.payrollsystem.event.TableEditActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;

/**
 *
 * @author Paul
 */
public class PanelEditAction extends javax.swing.JPanel {

    /**
     * Creates new form PanelAction
     */
    public PanelEditAction() {
        initComponents();
        GridBagConstraints gbc = new GridBagConstraints();
        edit_button.setPreferredSize(new Dimension(80, 37));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.NONE;
        
        this.add(edit_button, gbc);
        
        edit_button.setButtonPressedColor(new Color(2, 144, 204));
        edit_button.setDefaultColor(new Color(2,142,255));
        
    }
    
    public void initEvent(TableEditActionEvent event, int row) {
        edit_button.addActionListener((ActionEvent e) -> {
            event.onEdit(row);
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

        edit_button = new com.mycompany.payrollsystem.cell.ActionButton();

        setLayout(new java.awt.GridBagLayout());

        edit_button.setBackground(new java.awt.Color(2, 142, 255));
        edit_button.setForeground(new java.awt.Color(255, 255, 255));
        edit_button.setText("EDIT");
        edit_button.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        edit_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        edit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_buttonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(edit_button, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void edit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.payrollsystem.cell.ActionButton edit_button;
    // End of variables declaration//GEN-END:variables
}
