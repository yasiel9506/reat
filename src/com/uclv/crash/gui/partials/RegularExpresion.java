/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uclv.crash.gui.partials;

import com.sun.glass.events.KeyEvent;
import com.uclv.crash.core.Automata;
import com.uclv.crash.core.RegularExpresionTraductor;
import com.uclv.crash.gui.AppActions;
import com.uclv.crash.gui.AppStorage;
import com.uclv.crash.gui.utils.LayoutUtils;

/**
 *
 * @author Yasiel Cabrera
 */
public class RegularExpresion extends javax.swing.JPanel implements Recordable {

    /**
     * Creates new form Home
     */
    public RegularExpresion() {
        initComponents();
        LayoutUtils.setPanelInto(banner, new Banner());
        regularExpresionEditor.selectAll();
        
        errorLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banner = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        regularExpresionEditor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();

        banner.setBackground(new java.awt.Color(227, 239, 239));

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 30, 84));

        jPanel3.setBackground(new java.awt.Color(0, 30, 84));

        regularExpresionEditor.setBackground(new java.awt.Color(0, 42, 113));
        regularExpresionEditor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        regularExpresionEditor.setForeground(new java.awt.Color(255, 255, 255));
        regularExpresionEditor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regularExpresionEditor.setText("((Regular).(Expression))+!*");
        regularExpresionEditor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 42, 113), 10));
        regularExpresionEditor.setCaretColor(new java.awt.Color(255, 255, 255));
        regularExpresionEditor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularExpresionEditorActionPerformed(evt);
            }
        });
        regularExpresionEditor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regularExpresionEditorKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 42, 113));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/uclv/crash/gui/img/icons8_Chevron_Right_60px.png"))); // NOI18N
        jLabel2.setToolTipText("Convertir a AFND");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regularExpresionEditor)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regularExpresionEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Escriba una expresión regular y presione ENTER");

        errorLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 51));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setText("La Expresión Regular contiene errores.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(errorLabel)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void regularExpresionEditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularExpresionEditorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regularExpresionEditorActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if(!regularExpresionEditor.getText().trim().equals("")){
            String er = regularExpresionEditor.getText().trim();
            Automata afnd = RegularExpresionTraductor.translate(er);
            if(afnd == null){
                errorLabel.setVisible(true);
                return;
            }
            AppStorage.setRegularExpresion(er);
            AppStorage.setAfnd(afnd);
            AppStorage.setAfd(null);
            AppStorage.setAfdmin(null);
            //AppStorage.getWORK_EDITOR().remember();
            AppActions.showWorkSpace();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void regularExpresionEditorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regularExpresionEditorKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            jLabel2MouseClicked(null);
        }
    }//GEN-LAST:event_regularExpresionEditorKeyTyped


    @Override
    public void remember() {
        regularExpresionEditor.setText(AppStorage.getRegularExpresion());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel banner;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField regularExpresionEditor;
    // End of variables declaration//GEN-END:variables

   
}
