/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uclv.crash.gui.partials;

import com.uclv.crash.gui.AppStorage;
import com.uclv.crash.gui.utils.LayoutUtils;

/**
 *
 * @author Yasiel Cabrera
 */
public final class AFND extends javax.swing.JPanel implements Recordable{

    /**
     * Creates new form AFND
     */
    public AFND() {
        initComponents();
        remember();
    }
    
    @Override
    public void remember() {
        if(AppStorage.getAfnd() == null){
            LayoutUtils.setPanelInto(this, new AFNDStart());
        }else{
            AFNDShow s = new AFNDShow();
            s.remember();
            LayoutUtils.setPanelInto(this,s);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    
}
