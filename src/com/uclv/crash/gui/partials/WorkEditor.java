/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uclv.crash.gui.partials;

import com.sun.glass.events.KeyEvent;
import com.uclv.crash.core.Automata;
import com.uclv.crash.core.AutomataViewer;
import com.uclv.crash.core.RegularExpresionTraductor;
import com.uclv.crash.core.SimplifiedTransition;
import com.uclv.crash.core.State;
import com.uclv.crash.core.Transition;
import com.uclv.crash.gui.AppStorage;
import com.uclv.crash.gui.utils.LayoutUtils;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Yasiel Cabrera
 */
public final class WorkEditor extends javax.swing.JPanel implements Recordable {

    public static WorkEditor REFERENCE;

    /**
     * Creates new form WorkEditor
     */
    @SuppressWarnings("LeakingThisInConstructor")
    public WorkEditor() {
        initComponents();
        WorkEditor.REFERENCE = this;
        clearIndicators();
        this.getAfndIndicator().setVisible(true);

        activeSection = AFND_SECTION;
        EditorEvents.initializeEvents();

        recognitionPanel.setVisible(false);
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
        jLabel7 = new javax.swing.JLabel();
        afdBttn = new javax.swing.JLabel();
        recogniseBttn = new javax.swing.JLabel();
        afndBttn = new javax.swing.JLabel();
        afdminBttn = new javax.swing.JLabel();
        afndIndicator = new javax.swing.JLabel();
        afdIndicator = new javax.swing.JLabel();
        afdminIndicator = new javax.swing.JLabel();
        recogniseIndicator = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        recognitionPanel = new javax.swing.JPanel();
        automataPanel1 = new javax.swing.JPanel();
        regularExpresionEditor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        banner.setBackground(new java.awt.Color(227, 239, 239));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Editor");

        afdBttn.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        afdBttn.setForeground(new java.awt.Color(51, 51, 51));
        afdBttn.setText("AFD");

        recogniseBttn.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        recogniseBttn.setForeground(new java.awt.Color(51, 51, 51));
        recogniseBttn.setText("RECONOCER");

        afndBttn.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        afndBttn.setForeground(new java.awt.Color(51, 51, 51));
        afndBttn.setText("AFND");

        afdminBttn.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        afdminBttn.setForeground(new java.awt.Color(51, 51, 51));
        afdminBttn.setText("AFDMin");

        afndIndicator.setBackground(new java.awt.Color(0, 30, 84));
        afndIndicator.setMinimumSize(new java.awt.Dimension(5, 5));
        afndIndicator.setOpaque(true);

        afdIndicator.setBackground(new java.awt.Color(0, 30, 84));
        afdIndicator.setMinimumSize(new java.awt.Dimension(5, 5));
        afdIndicator.setOpaque(true);

        afdminIndicator.setBackground(new java.awt.Color(0, 30, 84));
        afdminIndicator.setMinimumSize(new java.awt.Dimension(5, 5));
        afdminIndicator.setOpaque(true);

        recogniseIndicator.setBackground(new java.awt.Color(0, 30, 84));
        recogniseIndicator.setMinimumSize(new java.awt.Dimension(5, 5));
        recogniseIndicator.setOpaque(true);

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bannerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(afndIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(afndBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bannerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(afdBttn))
                    .addGroup(bannerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(afdIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bannerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(afdminBttn))
                    .addGroup(bannerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(afdminIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(recogniseIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recogniseBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(afdBttn)
                    .addComponent(recogniseBttn)
                    .addComponent(afndBttn)
                    .addComponent(afdminBttn))
                .addGap(3, 3, 3)
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(afdIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(afdminIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recogniseIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(afndIndicator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBackground(new java.awt.Color(0, 30, 84));

        recognitionPanel.setBackground(new java.awt.Color(0, 30, 84));
        recognitionPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        recognitionPanel.setPreferredSize(new java.awt.Dimension(840, 160));

        javax.swing.GroupLayout recognitionPanelLayout = new javax.swing.GroupLayout(recognitionPanel);
        recognitionPanel.setLayout(recognitionPanelLayout);
        recognitionPanelLayout.setHorizontalGroup(
            recognitionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 923, Short.MAX_VALUE)
        );
        recognitionPanelLayout.setVerticalGroup(
            recognitionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        automataPanel1.setBackground(new java.awt.Color(0, 30, 84));
        automataPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        automataPanel1.setPreferredSize(new java.awt.Dimension(840, 160));

        regularExpresionEditor.setBackground(new java.awt.Color(0, 42, 113));
        regularExpresionEditor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/uclv/crash/gui/img/icons8_Chevron_Right_40px.png"))); // NOI18N
        jLabel2.setToolTipText("Convertir a AFND");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout automataPanel1Layout = new javax.swing.GroupLayout(automataPanel1);
        automataPanel1.setLayout(automataPanel1Layout);
        automataPanel1Layout.setHorizontalGroup(
            automataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(automataPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(regularExpresionEditor)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(50, 50, 50))
        );
        automataPanel1Layout.setVerticalGroup(
            automataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(automataPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(automataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regularExpresionEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        workSpacePanel.setBackground(new java.awt.Color(0, 42, 113));

        javax.swing.GroupLayout workSpacePanelLayout = new javax.swing.GroupLayout(workSpacePanel);
        workSpacePanel.setLayout(workSpacePanelLayout);
        workSpacePanelLayout.setHorizontalGroup(
            workSpacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        workSpacePanelLayout.setVerticalGroup(
            workSpacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recognitionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(automataPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(workSpacePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(automataPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(workSpacePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(recognitionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                LayoutUtils.setPanelInto(workSpacePanel, new ERError());
                return;
            }
            AppStorage.setRegularExpresion(er);
            AppStorage.setAfnd(afnd);
            AppStorage.setAfd(null);
            AppStorage.setAfdmin(null);
            remember();
            EditorActions.afndOnClickActions();
        }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void regularExpresionEditorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regularExpresionEditorKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jLabel2MouseClicked(null);
        }
    }//GEN-LAST:event_regularExpresionEditorKeyTyped

    @Override
    public void remember() {
        recognitionPanel.setVisible(false);
        switch (activeSection) {
            case WorkEditor.AFND_SECTION:
                AppStorage.getAFND().remember();
                LayoutUtils.setPanelInto(workSpacePanel, AppStorage.getAFND());
                break;
            case WorkEditor.AFD_SECTION:
                AppStorage.getAFD().remember();
                LayoutUtils.setPanelInto(workSpacePanel, AppStorage.getAFD());
                break;
            case WorkEditor.AFDM_SECTION:
                AppStorage.getAFD_MIN().remember();
                LayoutUtils.setPanelInto(workSpacePanel, AppStorage.getAFD_MIN());
                break;
            case WorkEditor.RECOGNISE_SECTION:

                break;

        }

        regularExpresionEditor.setText(AppStorage.getRegularExpresion());
    }

    /**
     * Muestra el panel de reconocimiento de cadenas si este esta oculto, lo
     * oculta en caso contrario.
     *
     * @return true si despues de esta llamada el panel es visible, false en
     * caso contrario.
     */
    public boolean toggleRecognitionPanel() {
        boolean r = !recognitionPanel.isVisible();
        recognitionPanel.setVisible(r);
        return r;
    }

    /**
     * Oculta todos los indicadores del WorkEditor
     */
    public void clearIndicators() {
        afndIndicator.setVisible(false);
        afdIndicator.setVisible(false);
        afdminIndicator.setVisible(false);
        recogniseIndicator.setVisible(false);
    }

    public int activeSection;

    public static final int AFND_SECTION = 0;
    public static final int AFD_SECTION = 1;
    public static final int AFDM_SECTION = 2;
    public static final int RECOGNISE_SECTION = 3;

    //GETTERS AND SETTERS
    public JLabel getAfdBttn() {
        return afdBttn;
    }

    public JLabel getAfdIndicator() {
        return afdIndicator;
    }

    public JLabel getAfdminBttn() {
        return afdminBttn;
    }

    public JLabel getAfdminIndicator() {
        return afdminIndicator;
    }

    public JLabel getAfndBttn() {
        return afndBttn;
    }

    public JLabel getAfndIndicator() {
        return afndIndicator;
    }

    public JLabel getRecogniseBttn() {
        return recogniseBttn;
    }

    public JLabel getRecogniseIndicator() {
        return recogniseIndicator;
    }

    public JPanel getRecognitionPanel() {
        return recognitionPanel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel afdBttn;
    private javax.swing.JLabel afdIndicator;
    private javax.swing.JLabel afdminBttn;
    private javax.swing.JLabel afdminIndicator;
    private javax.swing.JLabel afndBttn;
    private javax.swing.JLabel afndIndicator;
    private javax.swing.JPanel automataPanel1;
    private javax.swing.JPanel banner;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel recogniseBttn;
    private javax.swing.JLabel recogniseIndicator;
    private javax.swing.JPanel recognitionPanel;
    private javax.swing.JTextField regularExpresionEditor;
    public final javax.swing.JPanel workSpacePanel = new javax.swing.JPanel();
    // End of variables declaration//GEN-END:variables

}
