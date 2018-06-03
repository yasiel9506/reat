/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uclv.crash.gui.partials.afdstep;

import com.uclv.crash.core.State;
import com.uclv.crash.core.Transition;
import java.util.List;

/**
 *
 * @author Yasiel Cabrera
 */
public class Step11 extends javax.swing.JPanel {
    private final Step step;

    /**
     * Creates new form Step11
     * @param step
     */
    public Step11(Step step) {
        initComponents();
        this.step = step;
        
        List<State> T = (List<State>) step.getData()[0];
        char a = (char) step.getData()[1];
        List<State> U = (List<State>) step.getData()[2];
        List<Transition> trans = (List<Transition>) step.getData()[3];
                
        tText.setText("δ'({ "+AFDStep.toComma(T)+" },'"+a+"') = { "+AFDStep.toComma(U)+" }");   
        
        String text = "δ' = [ ";
        for(int i = 0; i < trans.size(); i++){
            Transition t = trans.get(i);
            text += "{ ("+t.getStart().getId()+", '"+t.getInput()+"') = "+t.getTarget().getId() + (i != trans.size()-1?" }, ": " }");
        }
        text += " ]";
        sText.setText(text);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tText = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        sText = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 42, 113));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("δ'(T,a) = U");

        jScrollPane3.setBorder(null);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 42, 113));
        jTextArea2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setLineWrap(true);
        jTextArea2.setTabSize(4);
        jTextArea2.setText("Se crea una nueva transición desde el estado T hasta el estado U con el símbolo a.");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea2);

        jScrollPane4.setBorder(null);

        tText.setEditable(false);
        tText.setBackground(new java.awt.Color(0, 42, 113));
        tText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        tText.setForeground(new java.awt.Color(255, 255, 255));
        tText.setLineWrap(true);
        tText.setTabSize(4);
        tText.setText("δ'(T,a) = U");
        tText.setWrapStyleWord(true);
        jScrollPane4.setViewportView(tText);

        jScrollPane5.setBorder(null);

        sText.setEditable(false);
        sText.setBackground(new java.awt.Color(0, 42, 113));
        sText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        sText.setForeground(new java.awt.Color(255, 255, 255));
        sText.setLineWrap(true);
        sText.setTabSize(4);
        sText.setText("δ' = [ (1, 'a') = 2, (3, 'v') = 7 ]");
        sText.setWrapStyleWord(true);
        jScrollPane5.setViewportView(sText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea sText;
    private javax.swing.JTextArea tText;
    // End of variables declaration//GEN-END:variables
}
