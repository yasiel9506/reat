/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uclv.crash.gui.pnewa;

import com.sun.glass.events.KeyEvent;

/**
 *
 * @author Yasiel Cabrera
 */
public class NewState extends javax.swing.JPanel {
    
    private final NewAutomata REFERENCE;
    /**
     * Creates new form NewState
     * @param reference
     */
    public NewState(NewAutomata reference) {
        REFERENCE = reference;
        initComponents();
        errorLb.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        inicialCh = new javax.swing.JCheckBox();
        finalCh = new javax.swing.JCheckBox();
        cancelBttn = new javax.swing.JLabel();
        acceptBttn = new javax.swing.JLabel();
        errorLb = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 42, 113));
        setPreferredSize(new java.awt.Dimension(300, 350));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVO ESTADO");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre (Solo números)");

        nameTf.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        nameTf.setForeground(new java.awt.Color(0, 42, 113));
        nameTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        nameTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTfKeyTyped(evt);
            }
        });

        inicialCh.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        inicialCh.setForeground(new java.awt.Color(255, 255, 255));
        inicialCh.setText("Estado Inicial");
        inicialCh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicialCh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/uclv/crash/gui/img/icons8_Delete_24px.png"))); // NOI18N
        inicialCh.setOpaque(false);
        inicialCh.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/uclv/crash/gui/img/icons8_Checkmark_24px.png"))); // NOI18N

        finalCh.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        finalCh.setForeground(new java.awt.Color(255, 255, 255));
        finalCh.setText("Estado Final");
        finalCh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        finalCh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/uclv/crash/gui/img/icons8_Delete_24px.png"))); // NOI18N
        finalCh.setOpaque(false);
        finalCh.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/uclv/crash/gui/img/icons8_Checkmark_24px.png"))); // NOI18N

        cancelBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/uclv/crash/gui/img/icons8_Cancel_36px.png"))); // NOI18N
        cancelBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBttnMouseClicked(evt);
            }
        });

        acceptBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/uclv/crash/gui/img/icons8_Ok_36px.png"))); // NOI18N
        acceptBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acceptBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptBttnMouseClicked(evt);
            }
        });

        errorLb.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        errorLb.setForeground(new java.awt.Color(255, 0, 51));
        errorLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLb.setText("El estado ya existe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(errorLb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(finalCh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inicialCh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTf, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelBttn)
                        .addGap(18, 18, 18)
                        .addComponent(acceptBttn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLb)
                .addGap(20, 20, 20)
                .addComponent(inicialCh)
                .addGap(18, 18, 18)
                .addComponent(finalCh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelBttn)
                    .addComponent(acceptBttn))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTfKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            acceptBttnMouseClicked(null);
        }
        if(nameTf.getText().length() == 3 || !Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_nameTfKeyTyped

    private void cancelBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBttnMouseClicked
        REFERENCE.changeCover(new Init(REFERENCE));
    }//GEN-LAST:event_cancelBttnMouseClicked

    private void acceptBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptBttnMouseClicked
        int id = Integer.parseInt(nameTf.getText());
        boolean inicial = inicialCh.isSelected();
        boolean finalS = finalCh.isSelected();
        switch(REFERENCE.addState(id, inicial, finalS)){
            case 0://all ok
                REFERENCE.changeCover(new Init(REFERENCE));
                break;
            case 1://the state exist...
                errorLb.setVisible(true);
                break;
        }
    }//GEN-LAST:event_acceptBttnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acceptBttn;
    private javax.swing.JLabel cancelBttn;
    private javax.swing.JLabel errorLb;
    private javax.swing.JCheckBox finalCh;
    private javax.swing.JCheckBox inicialCh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameTf;
    // End of variables declaration//GEN-END:variables
}