package moverpelota;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author edcarlitosxd Juan Carlos Uch Dzib
 */
public class Frame extends javax.swing.JFrame {

    public Timer tiempo;
    boolean up, down, left, right;

    public ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {

            mover();

        }

    };

    Image img1 = new ImageIcon(getClass().getResource("Pelota.png")).getImage();
    ImageIcon pelota;

    public Frame() {
        initComponents();

        tiempo = new Timer(50, al);

        pelota = new ImageIcon(img1.getScaledInstance(lblPelota.getWidth(), lblPelota.getHeight(), Image.SCALE_SMOOTH));
        lblPelota.setIcon(pelota);
    }

    private void mover() {
        if (up == true) {
            lblPelota.setLocation(lblPelota.getLocation().x, lblPelota.getLocation().y - 10);
            if (lblPelota.getLocation().y < 0) {
                up = false;
                down = true;
            }

        } else if (down == true) {
            lblPelota.setLocation(lblPelota.getLocation().x, lblPelota.getLocation().y + 10);
            if (lblPelota.getLocation().y > 500) {
                up = true;
                down = false;
            }
        } else if (left == true) {
            lblPelota.setLocation(lblPelota.getLocation().x - 10, lblPelota.getLocation().y);
            if (lblPelota.getLocation().x < 0) {
                right = true;
                left = false;
            }
        } else if (right == true) {
            lblPelota.setLocation(lblPelota.getLocation().x + 10, lblPelota.getLocation().y);
            if (lblPelota.getLocation().x >500) {
                right = false;
                left = true;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLeft = new javax.swing.JButton();
        btnTop = new javax.swing.JButton();
        btnBot = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        lblPelota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        btnLeft.setText("Left");
        btnLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLeftMouseClicked(evt);
            }
        });
        getContentPane().add(btnLeft);
        btnLeft.setBounds(0, 207, 79, 58);

        btnTop.setText("TOP");
        btnTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTopMouseClicked(evt);
            }
        });
        getContentPane().add(btnTop);
        btnTop.setBounds(261, 0, 71, 40);

        btnBot.setText("Bot");
        btnBot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBotMouseClicked(evt);
            }
        });
        getContentPane().add(btnBot);
        btnBot.setBounds(280, 510, 80, 44);

        btnRight.setText("Right");
        btnRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRightMouseClicked(evt);
            }
        });
        getContentPane().add(btnRight);
        btnRight.setBounds(530, 210, 81, 58);
        getContentPane().add(lblPelota);
        lblPelota.setBounds(261, 223, 92, 66);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTopMouseClicked
        // TODO add your handling code here:
        left = false;
        right = false;

        up = true;
        down = false;
        tiempo.start();
    }//GEN-LAST:event_btnTopMouseClicked

    private void btnBotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBotMouseClicked
        // TODO add your handling code here:
        left = false;
        right = false;
        up = false;
        down = true;
        tiempo.start();
    }//GEN-LAST:event_btnBotMouseClicked

    private void btnLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLeftMouseClicked

        up = false;
        down = false;

        left = true;
        right = false;
        tiempo.start();
    }//GEN-LAST:event_btnLeftMouseClicked

    private void btnRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRightMouseClicked
        up = false;
        down = false;
        
        left = false;
        right = true;
        tiempo.start();

    }//GEN-LAST:event_btnRightMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBot;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnTop;
    private javax.swing.JLabel lblPelota;
    // End of variables declaration//GEN-END:variables
}
