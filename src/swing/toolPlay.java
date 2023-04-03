package swing;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import entity.Song;
import swave.MainFrame;

/**
 *
 * @author NGUYEN VAN SI
 */
public class toolPlay extends javax.swing.JPanel {

    /**
     * Creates new form toolPlay
     */
    boolean running = false;
    boolean shuffle = false;
    boolean replay = false;
    boolean lyrics = false;
    boolean library = false;

    private Song data;
    public MainFrame main;

    public boolean isShuffle() {
        return shuffle;
    }

    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }

    public boolean isLibrary() {
        return library;
    }

    public void setLibrary(boolean library) {
        this.library = library;
    }

    public Song getData() {
        return data;
    }

    public void setData(Song data) {
        this.data = data;
    }

    public JSlider getjSlider1() {
        return jSlider1;
    }

    public void setjSlider1(JSlider jSlider1) {
        this.jSlider1 = jSlider1;
    }

    public JSlider getjSlider2() {
        return jSlider2;
    }

    public void setjSlider2(JSlider jSlider2) {
        this.jSlider2 = jSlider2;
    }

    public JLabel getLblAVTSong() {
        return lblAVTSong;
    }

    public void setLblAVTSong(JLabel lblAVTSong) {
        this.lblAVTSong = lblAVTSong;
    }

    public JLabel getLblCmt() {
        return lblCmt;
    }

    public void setLblCmt(JLabel lblCmt) {
        this.lblCmt = lblCmt;
    }

    public JLabel getLblLibary() {
        return lblLibary;
    }

    public void setLblLibary(JLabel lblLibary) {
        this.lblLibary = lblLibary;
    }

    public JLabel getLblLibary1() {
        return lblLibary1;
    }

    public void setLblLibary1(JLabel lblLibary1) {
        this.lblLibary1 = lblLibary1;
    }

    public JLabel getLblLoveSong() {
        return lblLoveSong;
    }

    public void setLblLoveSong(JLabel lblLoveSong) {
        this.lblLoveSong = lblLoveSong;
    }

    public JLabel getLblLyrics() {
        return lblLyrics;
    }

    public void setLblLyrics(JLabel lblLyrics) {
        this.lblLyrics = lblLyrics;
    }

    public JLabel getLblNameSong() {
        return lblNameSong;
    }

    public void setLblNameSong(JLabel lblNameSong) {
        this.lblNameSong = lblNameSong;
    }

    public JLabel getLblNext() {
        return lblNext;
    }

    public void setLblNext(JLabel lblNext) {
        this.lblNext = lblNext;
    }

    public JLabel getLblPrev() {
        return lblPrev;
    }

    public void setLblPrev(JLabel lblPrev) {
        this.lblPrev = lblPrev;
    }

    public JLabel getLblRePlay() {
        return lblRePlay;
    }

    public void setLblRePlay(JLabel lblRePlay) {
        this.lblRePlay = lblRePlay;
    }

    public JLabel getLblRun() {
        return lblRun;
    }

    public void setLblRun(JLabel lblRun) {
        this.lblRun = lblRun;
    }

    public JLabel getLblShuffel() {
        return lblShuffel;
    }

    public void setLblShuffel(JLabel lblShuffel) {
        this.lblShuffel = lblShuffel;
    }

    public JLabel getLblSinger() {
        return lblSinger;
    }

    public void setLblSinger(JLabel lblSinger) {
        this.lblSinger = lblSinger;
    }

    public JLabel getLblTimeStart() {
        return lblTimeStart;
    }

    public void setLblTimeStart(JLabel lblTimeStart) {
        this.lblTimeStart = lblTimeStart;
    }

    public JLabel getLblTimeStart1() {
        return lblTimeStart1;
    }

    public void setLblTimeStart1(JLabel lblTimeStart1) {
        this.lblTimeStart1 = lblTimeStart1;
    }

    public JPanel getPnlItemPlay() {
        return pnlItemPlay;
    }

    public void setPnlItemPlay(JPanel pnlItemPlay) {
        this.pnlItemPlay = pnlItemPlay;
    }

    public toolPlay() {
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

        lblAVTSong = new javax.swing.JLabel();
        lblNameSong = new javax.swing.JLabel();
        lblSinger = new javax.swing.JLabel();
        lblLoveSong = new javax.swing.JLabel();
        lblCmt = new javax.swing.JLabel();
        lblTimeStart = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        lblTimeStart1 = new javax.swing.JLabel();
        pnlItemPlay = new javax.swing.JPanel();
        lblRePlay = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        lblRun = new javax.swing.JLabel();
        lblPrev = new javax.swing.JLabel();
        lblShuffel = new javax.swing.JLabel();
        lblLyrics = new javax.swing.JLabel();
        lblLibary = new javax.swing.JLabel();
        lblLibary1 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();

        setBackground(new java.awt.Color(24, 24, 24));
        setPreferredSize(new java.awt.Dimension(1532, 150));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAVTSong.setPreferredSize(new java.awt.Dimension(100, 100));
        add(lblAVTSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 25, -1, -1));

        lblNameSong.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblNameSong.setForeground(new java.awt.Color(255, 255, 255));
        lblNameSong.setText("Mây hồng đưa lối");
        lblNameSong.setPreferredSize(new java.awt.Dimension(130, 25));
        add(lblNameSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        lblSinger.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSinger.setForeground(new java.awt.Color(125, 125, 125));
        lblSinger.setText("Đạt Ka");
        lblSinger.setPreferredSize(new java.awt.Dimension(122, 18));
        add(lblSinger, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 81, -1, -1));

        lblLoveSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/timSongSelected.png"))); // NOI18N
        lblLoveSong.setPreferredSize(new java.awt.Dimension(25, 25));
        add(lblLoveSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 64, -1, -1));

        lblCmt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comment.png"))); // NOI18N
        lblCmt.setPreferredSize(new java.awt.Dimension(25, 25));
        add(lblCmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 65, -1, -1));

        lblTimeStart.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblTimeStart.setForeground(new java.awt.Color(125, 125, 125));
        lblTimeStart.setText("03:10");
        add(lblTimeStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 90, 40, -1));

        jSlider1.setBackground(new java.awt.Color(255, 255, 255));
        jSlider1.setPreferredSize(new java.awt.Dimension(598, 5));
        add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 94, 670, 10));

        lblTimeStart1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblTimeStart1.setForeground(new java.awt.Color(125, 125, 125));
        lblTimeStart1.setText("00:00");
        add(lblTimeStart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 92, 40, -1));

        pnlItemPlay.setOpaque(false);
        pnlItemPlay.setPreferredSize(new java.awt.Dimension(368, 43));
        pnlItemPlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRePlay.setForeground(new java.awt.Color(255, 255, 255));
        lblRePlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/autoPlay.png"))); // NOI18N
        lblRePlay.setPreferredSize(new java.awt.Dimension(19, 43));
        lblRePlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRePlayMouseClicked(evt);
            }
        });
        pnlItemPlay.add(lblRePlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 40));

        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Next.png"))); // NOI18N
        lblNext.setText("pre");
        lblNext.setMinimumSize(new java.awt.Dimension(19, 43));
        lblNext.setPreferredSize(new java.awt.Dimension(19, 43));
        pnlItemPlay.add(lblNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 4, 30, 40));

        lblRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/StopSong.png"))); // NOI18N
        lblRun.setText("jLabel2");
        lblRun.setMinimumSize(new java.awt.Dimension(43, 43));
        lblRun.setPreferredSize(new java.awt.Dimension(43, 43));
        lblRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRunMouseClicked(evt);
            }
        });
        pnlItemPlay.add(lblRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 0, -1, -1));

        lblPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Prev.png"))); // NOI18N
        lblPrev.setText("pre");
        lblPrev.setPreferredSize(new java.awt.Dimension(19, 43));
        pnlItemPlay.add(lblPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 0, 30, 40));

        lblShuffel.setForeground(new java.awt.Color(255, 255, 255));
        lblShuffel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/replay.png"))); // NOI18N
        lblShuffel.setPreferredSize(new java.awt.Dimension(19, 43));
        lblShuffel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShuffelMouseClicked(evt);
            }
        });
        pnlItemPlay.add(lblShuffel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 30, 40));

        add(pnlItemPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 32, -1, -1));

        lblLyrics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lyrics.png"))); // NOI18N
        lblLyrics.setText("jLabel1");
        lblLyrics.setPreferredSize(new java.awt.Dimension(18, 19));
        lblLyrics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLyricsMouseClicked(evt);
            }
        });
        add(lblLyrics, new org.netbeans.lib.awtextra.AbsoluteConstraints(1306, 64, -1, -1));

        lblLibary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/soundLow.png"))); // NOI18N
        lblLibary.setPreferredSize(new java.awt.Dimension(20, 20));
        add(lblLibary, new org.netbeans.lib.awtextra.AbsoluteConstraints(1384, 65, -1, -1));

        lblLibary1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/liblary.png"))); // NOI18N
        lblLibary1.setPreferredSize(new java.awt.Dimension(20, 20));
        lblLibary1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLibary1MouseClicked(evt);
            }
        });
        add(lblLibary1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1346, 64, -1, -1));
        add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1406, 65, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRunMouseClicked
        running = !running;
        setRunning(running);
    }//GEN-LAST:event_lblRunMouseClicked

    private void lblShuffelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShuffelMouseClicked
        shuffle = !shuffle;
        setShuffel(shuffle);
    }//GEN-LAST:event_lblShuffelMouseClicked

    private void lblRePlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRePlayMouseClicked
        replay = !replay;
        setReplay(replay);
    }//GEN-LAST:event_lblRePlayMouseClicked

    private void lblLibary1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLibary1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLibary1MouseClicked

    private void lblLyricsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLyricsMouseClicked
        lyrics = !lyrics;
        setLyrics(lyrics);
        if (lyrics) {
            main.getPnlLyrics().show();
        } else {
            main.getPnlLyrics().hide();
        }
    }//GEN-LAST:event_lblLyricsMouseClicked

    public void setRunning(boolean check) {
        if (check) {
            lblRun.setIcon(new ImageIcon(getClass().getResource("/img/stopSong.png")));
        } else {
            lblRun.setIcon(new ImageIcon(getClass().getResource("/img/playing.png")));
        }
    }

    public void setShuffel(boolean check) {
        if (check) {
            lblShuffel.setIcon(new ImageIcon(getClass().getResource("/img/shuffel_selected.png")));
        } else {
            lblShuffel.setIcon(new ImageIcon(getClass().getResource("/img/replay.png")));
        }
    }

    public void setReplay(boolean check) {
        if (check) {
            lblRePlay.setIcon(new ImageIcon(getClass().getResource("/img/replay_selected.png")));
        } else {
            lblRePlay.setIcon(new ImageIcon(getClass().getResource("/img/autoPlay.png")));
        }
    }

    public void setLyrics(boolean check) {
        if (check) {
            lblLyrics.setIcon(new ImageIcon(getClass().getResource("/img/lyrics_selected.png")));
        } else {
            lblLyrics.setIcon(new ImageIcon(getClass().getResource("/img/lyrics.png")));
        }
    }

    public void fillData(Song data) {
        lblAVTSong.setIcon(new ImageIcon(getClass().getResource("/img/" + data.getAVT())));
        lblNameSong.setText(data.getNameSong());
        lblSinger.setText(data.getSinger());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JLabel lblAVTSong;
    private javax.swing.JLabel lblCmt;
    private javax.swing.JLabel lblLibary;
    private javax.swing.JLabel lblLibary1;
    private javax.swing.JLabel lblLoveSong;
    private javax.swing.JLabel lblLyrics;
    private javax.swing.JLabel lblNameSong;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblPrev;
    private javax.swing.JLabel lblRePlay;
    private javax.swing.JLabel lblRun;
    private javax.swing.JLabel lblShuffel;
    private javax.swing.JLabel lblSinger;
    private javax.swing.JLabel lblTimeStart;
    private javax.swing.JLabel lblTimeStart1;
    private javax.swing.JPanel pnlItemPlay;
    // End of variables declaration//GEN-END:variables
}
