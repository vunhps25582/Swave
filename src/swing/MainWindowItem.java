/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import entity.PlayList;
import entity.Song;

/**
 *
 * @author Phan Qui Duc
 */
public class MainWindowItem extends javax.swing.JPanel {

    /**
     * Creates new form MainWindowItem
     */
    private PlayList playList;
    private Song song;

    public MainWindowItem () {
        initComponents();
    }

    public MainWindowItem (PlayList playList) {
        initComponents();
        this.playList = playList;
        setOpaque(false);
        lblPic.setIcon(playList.toIcon());
        lblTitle.setText(playList.getPlaylistName());
        lblTitle.setForeground(Color.white);
    }

    public MainWindowItem (Song song) {
        initComponents();
        this.song = song;
        setOpaque(false);
        lblPic.setIcon(song.toIcon());
        lblTitle.setText(song.getNameSong());
        lblTitle.setForeground(Color.white);
    }

    public JLabel getLblTitle () {
        return lblTitle;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPic = new components.borderImage();
        lblTitle = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(150, 200));
        setMinimumSize(new java.awt.Dimension(150, 200));
        setPreferredSize(new java.awt.Dimension(150, 200));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 15));

        lblPic.setMaximumSize(new java.awt.Dimension(150, 150));
        lblPic.setMinimumSize(new java.awt.Dimension(150, 150));
        lblPic.setSizeImage(new int[] {150, 150});

        javax.swing.GroupLayout lblPicLayout = new javax.swing.GroupLayout(lblPic);
        lblPic.setLayout(lblPicLayout);
        lblPicLayout.setHorizontalGroup(
            lblPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        lblPicLayout.setVerticalGroup(
            lblPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        add(lblPic);

        lblTitle.setText("jLabel1");
        add(lblTitle);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.borderImage lblPic;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}