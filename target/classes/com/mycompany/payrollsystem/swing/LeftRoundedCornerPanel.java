/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.payrollsystem.swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Paul
 */
public class LeftRoundedCornerPanel extends javax.swing.JPanel {

    /**
     * Creates new form LeftRoundedCornerPanel
     */
    public LeftRoundedCornerPanel() {
        initComponents();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics graphics) {

        super.paintComponent(graphics);

        int arcWidth = 15;
        int arcHeight = 15;
        int width = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());

        // Fill the rounded rectangle with rounding only on the left side
        g2.fillRoundRect(0, 0, width, height, arcWidth, arcHeight);

        // Fill rectangles to cover the unwanted rounded corners on the right side
        g2.fillRect(arcWidth, 0, width - arcWidth, arcHeight);
        g2.fillRect(arcWidth, height - arcHeight, width - arcWidth, arcHeight);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
