/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.Color;
import java.util.ArrayList;
import entity.PlayList;
import entity.Song;

/**
 *
 * @author CAMERA VIET PHAT
 */
public class SearchAll extends javax.swing.JPanel {

    public static ArrayList<Song> listSong = new ArrayList<>();
    public static ArrayList<PlayList> listPlaylist = new ArrayList<>();
    
    /**
     * Creates new form SearchAll
     */
    public SearchAll() {
        initComponents();
        setBackground(Color.BLACK);
//        listSong.clear();
//        for (int i = 0; i < 10; i++) {
//            listSong.add(new Song(i, "Thị mầu " + i, "Hòa minzy", "Hòa Minzy", "Vpop", "", "songIcon.png", "", true, i));
//        }
//        listPlaylist.clear();
//        for (int i = 0; i < 10; i++) {
//            listPlaylist.add(new PlayList(1, "abc", 2, true, "playlist.png"));
//        }
    }
    
    //Thêm Song và pnl Của Tôi
    public void addSong(Song song) {
        pnlSongOfSearchAll.addSong(song);
        revalidate();
    }

    //Load danh sách Song của tôi
    public void loadSong() {
        for (Song song : listSong) {
            addSong(song);
        }
    }
    
    //Thêm PlayList và pnl Của Tôi
    public void addPlaylist(PlayList playlist) {
        pnlPlaylistOfSearchAll.addPlayList(playlist);
        revalidate();
    }

    //Load danh sách playlist của tôi
    public void loadPlaylist() {
        for (PlayList playList : listPlaylist) {
            addPlaylist(playList);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        pnlContent = new javax.swing.JPanel();
        pnlSongOfSearchAll = new swing.SongOfSearchAll();
        pnlPlaylistOfSearchAll = new swing.PlaylistOfSearchAll();
        scrollBar1 = new components.ScrollBar();

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1239, 508));
        jScrollPane1.setVerticalScrollBar(scrollBar1);

        pnlContent.setPreferredSize(new java.awt.Dimension(1239, 750));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSongOfSearchAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPlaylistOfSearchAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addComponent(pnlSongOfSearchAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlPlaylistOfSearchAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnlContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(scrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlContent;
    private swing.PlaylistOfSearchAll pnlPlaylistOfSearchAll;
    private swing.SongOfSearchAll pnlSongOfSearchAll;
    private components.ScrollBar scrollBar1;
    // End of variables declaration//GEN-END:variables
}
