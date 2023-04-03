/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing.swavecomponent;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Phan Qui Duc
 */
public class UserToolComponent extends javax.swing.JPanel {

    public JLabel getLblPanelName () {
        return lblPanelName;
    }

    /**
     * Creates new form UserToolComponent
     */
    public void setLblPanelName (JLabel lblPanelName) {
        this.lblPanelName = lblPanelName;
    }

    public UserToolComponent () {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPanelName = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(248, 50));
        setMinimumSize(new java.awt.Dimension(248, 50));
        setPreferredSize(new java.awt.Dimension(248, 50));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 15));

        lblPanelName.setText("jLabel1");
        add(lblPanelName);
    }// </editor-fold>//GEN-END:initComponents

    private void init(){
        setBackground(new Color(0,0,0,255));
        lblPanelName.setForeground(new Color(199,199,199));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblPanelName;
    // End of variables declaration//GEN-END:variables
}
