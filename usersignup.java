/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class usersignup extends javax.swing.JFrame {
    JFileChooser jfc;
    File ph;
    /**
     * Creates new form userSignup
     */
    public usersignup() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jfc=new JFileChooser();
        setSize(600,800);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        pf = new javax.swing.JPasswordField();
        email1 = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        preview = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER SIGNUP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 50);

        jLabel2.setText("Email");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 90, 70, 18);

        jLabel3.setText("password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 140, 57, 18);

        jLabel4.setText("Mobile");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 190, 41, 18);

        jLabel5.setText("Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 240, 48, 18);

        jLabel6.setText("Photo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 300, 34, 18);
        getContentPane().add(mobile);
        mobile.setBounds(180, 190, 270, 40);

        pf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfActionPerformed(evt);
            }
        });
        getContentPane().add(pf);
        pf.setBounds(180, 140, 270, 40);

        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });
        getContentPane().add(email1);
        email1.setBounds(180, 90, 270, 40);

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address);
        address.setBounds(180, 240, 270, 40);

        jButton1.setText("Choose Photo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 300, 120, 40);

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(147, 434, 180, 50);

        preview.setText("jLabel7");
        getContentPane().add(preview);
        preview.setBounds(180, 300, 140, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            int ans= jfc.showOpenDialog(this);
            if(ans==JFileChooser.APPROVE_OPTION)
            {
                ph=jfc.getSelectedFile();
                ImageIcon ic= new ImageIcon(ph.getPath());
                Image img  =ic.getImage().getScaledInstance(preview.getWidth(),preview.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon ic1 =new ImageIcon(img);
                preview.setIcon(ic1);
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String email=email1.getText();
        String password=pf.getText();
        String phone=mobile.getText();
        String add=address.getText();
        
        if(email.equals("")||password.equals("")||phone.equals("")||add.equals("")|| ph==null)
        {
            JOptionPane.showMessageDialog(this,"All Fields are Mandatory");
        }
        
       else
       {
           
       String ans = myClient_3.verifyEmail(email);

          if(ans.equals("exist"))   
         {
              JOptionPane.showMessageDialog(rootPane, "Email already Taken!");
            
         }
        
          String otp =   JOptionPane.showInputDialog(rootPane, "Enter Otp to Verify");
          
             //System.out.println("---->"+gv.getMyotp());
          if(otp.trim().equals(ans.trim()))
          {
                String ans1 = myClient_3.userSignup(email, password, phone, add, ph);
                if(ans1.equals("success"))
                {
                    JOptionPane.showMessageDialog(rootPane, "Signup Success");
                    userlogin_5 obj = new userlogin_5();
                    obj.setVisible(true);
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Signup Failed");
                }
          }
          else
          {
             JOptionPane.showMessageDialog(rootPane, "Otp Not Matched");  
          }
         
       
                    
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(usersignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usersignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField email1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField mobile;
    private javax.swing.JPasswordField pf;
    private javax.swing.JLabel preview;
    // End of variables declaration//GEN-END:variables
}
