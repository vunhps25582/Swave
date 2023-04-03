
package panelMain;

import java.awt.CardLayout;
import java.util.ArrayList;
import entity.PlayList;

/**
 *
 * @author NGUYEN VAN SI
 */
public class PlaylistPaneSearch extends javax.swing.JPanel {

    /**
     * Creates new form PlaylistPane
     */
    public static ArrayList<PlayList> list = new ArrayList<>();
    public static ArrayList<PlayList> listLove = new ArrayList<>();
    public CardLayout c;

    public PlaylistPaneSearch() {
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

        jLabel2 = new javax.swing.JLabel();
        lblMyPlaylist = new javax.swing.JLabel();
        lblPlaylistLove = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        playlistSearch1 = new swing.PlaylistSearch();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Line 4.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        lblMyPlaylist.setFont(lblMyPlaylist.getFont().deriveFont(lblMyPlaylist.getFont().getStyle() | java.awt.Font.BOLD, 24));
        lblMyPlaylist.setForeground(new java.awt.Color(249, 57, 234));
        lblMyPlaylist.setText("Playlist của tôi");
        lblMyPlaylist.setPreferredSize(new java.awt.Dimension(173, 31));
        lblMyPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMyPlaylistMouseClicked(evt);
            }
        });
        add(lblMyPlaylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 5, -1, -1));

        lblPlaylistLove.setFont(lblPlaylistLove.getFont().deriveFont(lblPlaylistLove.getFont().getStyle() | java.awt.Font.BOLD, 24));
        lblPlaylistLove.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaylistLove.setText("Playlist yêu thích");
        lblPlaylistLove.setPreferredSize(new java.awt.Dimension(173, 31));
        lblPlaylistLove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlaylistLoveMouseClicked(evt);
            }
        });
        add(lblPlaylistLove, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 5, 200, -1));

        pnlContent.setOpaque(false);
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlContent.add(playlistSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1280, 510));
    }// </editor-fold>//GEN-END:initComponents


    private void lblMyPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMyPlaylistMouseClicked
        lblMyPlaylist.setForeground(new java.awt.Color(249, 57, 234));
        lblPlaylistLove.setForeground(new java.awt.Color(255, 255, 255));
        c.first(pnlContent);
    }//GEN-LAST:event_lblMyPlaylistMouseClicked

    private void lblPlaylistLoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlaylistLoveMouseClicked
        lblMyPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaylistLove.setForeground(new java.awt.Color(249, 57, 234));
        c.last(pnlContent);
    }//GEN-LAST:event_lblPlaylistLoveMouseClicked

    //Thêm PlayList và pnl Của Tôi
    public void addList(PlayList playlist) {
        playlistSearch1.addPlayList(playlist);
        revalidate();
    }

    //Thêm PlayList vào pnl Love
    public void addListLove(PlayList playlist) {
        playlistSearch1.addPlayList(playlist);
        revalidate();
    }

    //Load danh sách playlist của tôi
    public void loadPlaylist() {
        for (PlayList playList : list) {
            addList(playList);
        }
    }

    //Load danh sách playlist yêu thích
    public void loadPlaylistLove() {
        for (PlayList playList : listLove) {
            addListLove(playList);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblMyPlaylist;
    private javax.swing.JLabel lblPlaylistLove;
    private swing.PlaylistSearch playlistSearch1;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}