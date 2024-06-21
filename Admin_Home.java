/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.Image;
import java.io.File;
import java.util.StringTokenizer;
import javax.swing.*;
import javax.swing.JFileChooser;

/**
 *
 * @author DELL
 */
public class Admin_Home extends javax.swing.JFrame {

    File ph, ph1,movie;
    JFileChooser jfc;
    public Admin_Home(String name) {
        initComponents();
        setSize(900,600);
        lb.setText("Welcome " +name);
        loadCategories();
        
    }
     void loadCategories()
    {
        String ans=myClient_3.fetchcategories();
        StringTokenizer st=new StringTokenizer(ans,";;");
        int n=st.countTokens();
        for(int i=1 ;i<=n ;i++)
        {
            cb.addItem(st.nextToken());
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

        lb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        catname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        moviename = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        director = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cast = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        photo1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        youtube_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Welcome");
        getContentPane().add(lb);
        lb.setBounds(0, 0, 800, 50);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Category");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 60, 130, 30);

        jLabel2.setText("Category Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 140, 110, 18);

        catname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catnameActionPerformed(evt);
            }
        });
        getContentPane().add(catname);
        catname.setBounds(180, 140, 150, 24);

        jLabel3.setText("Photo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 220, 100, 18);
        getContentPane().add(photo);
        photo.setBounds(180, 210, 150, 140);

        jButton1.setText("Choose Photo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(187, 380, 150, 24);

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 430, 140, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Movies");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(600, 60, 120, 22);

        jLabel5.setText("Select Category");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(460, 100, 110, 18);

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", " " }));
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });
        getContentPane().add(cb);
        cb.setBounds(590, 90, 190, 40);

        jLabel6.setText("Movie Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(470, 150, 90, 40);

        moviename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movienameActionPerformed(evt);
            }
        });
        getContentPane().add(moviename);
        moviename.setBounds(590, 150, 190, 30);

        jLabel7.setText("Director");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 210, 90, 30);

        director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorActionPerformed(evt);
            }
        });
        getContentPane().add(director);
        director.setBounds(590, 200, 190, 30);

        jLabel8.setText("Cast");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(470, 260, 90, 30);
        getContentPane().add(cast);
        cast.setBounds(590, 260, 190, 30);

        jLabel9.setText("Photo");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(470, 450, 80, 30);
        getContentPane().add(photo1);
        photo1.setBounds(580, 430, 130, 80);

        jButton3.setText("Choose");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(750, 460, 74, 24);

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(660, 530, 90, 30);

        jLabel11.setText("Trailer");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(470, 310, 90, 30);
        getContentPane().add(youtube_id);
        youtube_id.setBounds(590, 310, 190, 30);

        jLabel10.setText("Choose Movie");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(470, 370, 90, 20);

        jButton4.setText("Choose Movie");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(600, 360, 140, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jfc=new JFileChooser();
        int ans=jfc.showOpenDialog(this);
     if(JFileChooser.APPROVE_OPTION==ans)
     {
         ph=jfc.getSelectedFile();
         ImageIcon ic =new ImageIcon(ph.getPath());
         Image img=ic.getImage().getScaledInstance(photo.getWidth(),photo.getHeight(),Image.SCALE_SMOOTH);
         ImageIcon ic1=new ImageIcon(img);
         photo.setIcon(ic1);
     }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String category=catname.getText();
        if(category.equals("")|| ph==null)
        {
            JOptionPane.showMessageDialog(rootPane, "All Fields are Mandatory");
        }
        else
        {
            String ans=myClient_3.addcat(category, ph);
            if(ans.equals("success"))
            {
                JOptionPane.showMessageDialog(rootPane, "Added Successfully");
            }
            else if(ans.equals("exists"))
            {
                 JOptionPane.showMessageDialog(rootPane, "Category already exists");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Filed");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
        
            jfc=new JFileChooser();
        int ans=jfc.showOpenDialog(this);
     if(JFileChooser.APPROVE_OPTION==ans)
     {
         ph1=jfc.getSelectedFile();
         ImageIcon ic =new ImageIcon(ph1.getPath());
         Image img=ic.getImage().getScaledInstance(photo1.getWidth(),photo1.getHeight(),Image.SCALE_SMOOTH);
         ImageIcon ic1=new ImageIcon(img);
         photo1.setIcon(ic1);
     }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
            String category= (String)cb.getSelectedItem();
            String movie_name=moviename.getText();
            String direct=director.getText();
            String starcast=cast.getText();
            String youtube=youtube_id.getText();
            
            if(category.equals("")||movie_name.equals("")||direct.equals("")||starcast.equals("")||youtube.equals("")||ph1==null||movie==null)
            {
                JOptionPane.showMessageDialog(this, "All Fiels are mandatory");
            }  
            else
            {
                String ans=myClient_3.addmovie(category,movie_name,direct,starcast,youtube,ph1,movie);
                if(ans.equals("success"))
                {
                     JOptionPane.showMessageDialog(rootPane, "Added Successfully");
                }
                else
                {
                     JOptionPane.showMessageDialog(rootPane, "Failed");
                }
            }
        
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                jfc= new JFileChooser();
                int ans=jfc.showOpenDialog(this);
                if(ans==JFileChooser.APPROVE_OPTION)
                {
                    movie=jfc.getSelectedFile();
                }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActionPerformed

    private void movienameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movienameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movienameActionPerformed

    private void catnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catnameActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Home("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JTextField cast;
    private javax.swing.JTextField catname;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JTextField director;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb;
    private javax.swing.JTextField moviename;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel photo1;
    private javax.swing.JTextField youtube_id;
    // End of variables declaration//GEN-END:variables
}
