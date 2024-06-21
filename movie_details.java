/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URI;
import java.util.StringTokenizer;
import javax.swing.*;
import javax.swing.Action;
import javax.swing.AbstractButton;

/**
 *
 * @author DELL
 */
public class movie_details extends javax.swing.JFrame {

    /**
     * Creates new form movie_details
     */
    int movie_id;
    public movie_details(int id) {
        initComponents();
        setSize(650,500);
        movie_id=id;
        moviename.setEnabled(false);
        castlb.setEnabled(false);
        directorlb.setEnabled(false);
         loadmovie();
    }
    void loadmovie()
    {
        String ans=myClient_3.moviedetails(movie_id);
        StringTokenizer st=new StringTokenizer(ans,"$");
        
        String name=st.nextToken();
        String director=st.nextToken();
        String cast=st.nextToken();
        String youtube_id=st.nextToken();
        String photo=st.nextToken();
        String movie_link=st.nextToken();
        ImageIcon ic=new ImageIcon(photo);
        Image img=ic.getImage().getScaledInstance(photolb.getWidth(), photolb.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ic1=new ImageIcon(img);
        photolb.setIcon(ic1);
        
        moviename.setText(name);
       directorlb.setText(director);
        castlb.setText(cast);
        
      
        
        
        
        
        
        trailerlb.addActionListener(new ActionListener()
                {
                    String yt=youtube_id;
                    @Override
                    public void actionPerformed(ActionEvent e)
                            
                    {
                        try
                        {
                             URI uri=new URI("https://www.youtube.com/watch?v="+yt);
                            Desktop d=Desktop.getDesktop();
                             d.browse(uri);
                        } 
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }
 
                    }
                }
        );
        
        bt.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                            
                    {
                        try
                        {
                            File f=new File(movie_link);
                            Desktop d=Desktop.getDesktop();
                             d.open(f);
                        } 
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }
 
                    }
                }
                
        );
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        photolb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        moviename = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        castlb = new javax.swing.JTextField();
        bt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        directorlb = new javax.swing.JTextField();
        trailerlb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        photolb.setText("jLabel1");
        getContentPane().add(photolb);
        photolb.setBounds(0, 0, 300, 400);

        jLabel1.setText("Movie name: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 40, 110, 20);

        moviename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movienameActionPerformed(evt);
            }
        });
        getContentPane().add(moviename);
        moviename.setBounds(330, 70, 280, 30);

        jLabel2.setText("Star Cast:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 130, 90, 20);
        getContentPane().add(castlb);
        castlb.setBounds(330, 160, 280, 30);

        bt.setText("PLAY MOVIE");
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt);
        bt.setBounds(380, 410, 170, 60);

        jLabel3.setText("Director: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 210, 120, 20);
        getContentPane().add(directorlb);
        directorlb.setBounds(330, 250, 280, 30);

        trailerlb.setText("PLAY TRAILER");
        trailerlb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trailerlbActionPerformed(evt);
            }
        });
        getContentPane().add(trailerlb);
        trailerlb.setBounds(380, 330, 170, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movienameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movienameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movienameActionPerformed

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btActionPerformed

    private void trailerlbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trailerlbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trailerlbActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(movie_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(movie_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(movie_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(movie_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new movie_details(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt;
    private javax.swing.JTextField castlb;
    private javax.swing.JTextField directorlb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField moviename;
    private javax.swing.JLabel photolb;
    private javax.swing.JButton trailerlb;
    // End of variables declaration//GEN-END:variables
}
