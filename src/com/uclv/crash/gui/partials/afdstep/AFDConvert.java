/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uclv.crash.gui.partials.afdstep;

import com.uclv.crash.gui.partials.afdstep.AFDStep;
import com.uclv.crash.core.Automata;
import com.uclv.crash.gui.AppStorage;
import com.uclv.crash.gui.partials.afdstep.Step;
import com.uclv.crash.gui.utils.LayoutUtils;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yasiel Cabrera
 */
public class AFDConvert extends javax.swing.JPanel {

    /**
     * Creates new form AFDConvert
     */
    public AFDConvert() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        directBttn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        stepbttn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 42, 113));

        jLabel1.setBackground(new java.awt.Color(0, 42, 113));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿Desea convertir el automata paso a paso o directamente?");

        jPanel1.setBackground(new java.awt.Color(0, 42, 113));

        directBttn.setBackground(new java.awt.Color(0, 30, 84));
        directBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                directBttnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                directBttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                directBttnMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DIRECTAMENTE");

        javax.swing.GroupLayout directBttnLayout = new javax.swing.GroupLayout(directBttn);
        directBttn.setLayout(directBttnLayout);
        directBttnLayout.setHorizontalGroup(
            directBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, directBttnLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        directBttnLayout.setVerticalGroup(
            directBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(directBttnLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(15, 15, 15))
        );

        stepbttn.setBackground(new java.awt.Color(0, 30, 84));
        stepbttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stepbttnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stepbttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stepbttnMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASO A PASO");

        javax.swing.GroupLayout stepbttnLayout = new javax.swing.GroupLayout(stepbttn);
        stepbttn.setLayout(stepbttnLayout);
        stepbttnLayout.setHorizontalGroup(
            stepbttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stepbttnLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        stepbttnLayout.setVerticalGroup(
            stepbttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stepbttnLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(stepbttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(directBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stepbttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(directBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void directBttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directBttnMouseEntered
        directBttn.setBackground(new Color(0, 34, 96));
    }//GEN-LAST:event_directBttnMouseEntered

    private void directBttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directBttnMouseExited
        directBttn.setBackground(new Color(0, 30, 84));
    }//GEN-LAST:event_directBttnMouseExited

    private void stepbttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stepbttnMouseEntered
        stepbttn.setBackground(new Color(0, 34, 96));
    }//GEN-LAST:event_stepbttnMouseEntered

    private void stepbttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stepbttnMouseExited
        stepbttn.setBackground(new Color(0, 30, 84));
    }//GEN-LAST:event_stepbttnMouseExited

    private void directBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directBttnMouseClicked
        List<Step> list = new ArrayList<>();
        Automata a = AppStorage.getAfnd().transformToDFA(list);
        AppStorage.setAfd(a);
        AppStorage.getAFD().remember();
    }//GEN-LAST:event_directBttnMouseClicked

    private void stepbttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stepbttnMouseClicked
        //generar los pasos y el automata...
        List<Step> list = new ArrayList<>();
        Automata a = AppStorage.getAfnd().transformToDFA(list);
        AppStorage.setAfd(a);
        LayoutUtils.setPanelInto(AppStorage.getAFD(), new AFDStep(list));
    }//GEN-LAST:event_stepbttnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel directBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel stepbttn;
    // End of variables declaration//GEN-END:variables
}
