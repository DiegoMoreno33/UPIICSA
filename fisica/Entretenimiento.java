/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chava
 */
import java.io.*;
import javax.swing.*;
import java.awt.*;
public class Entretenimiento extends javax.swing.JFrame {

    /**
     * Creates new form Entretenimiento
     */
    public Entretenimiento() {
        initComponents();
        initComponents();
        this.setSize(1240,700);
        this.setResizable(false);
    this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Area de entretenimiento");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(520, 90, 214, 30);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Musica");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 200, 109, 26);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Video");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1010, 190, 94, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Story.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 260, 101, 109);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Devuelveme_a_mi_chica.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 260, 101, 101);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Love me do.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(150, 480, 99, 109);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thor.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(880, 230, 73, 147);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jigsaw.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1120, 240, 97, 147);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Los increibles.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(1000, 440, 97, 148);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDO TEATRO.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 1250, 810);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1247, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try
  		{
  		File music=new File ("E://QUINTO SEMESTRE MATERIAS//PROGRAMACION//POO/THOR 3 Ragnarok - Trailer SUBTITULADO en Espa??ol (HD) Marvel 2017.mp4");
  		
  		  	
  		Desktop.getDesktop().open(music);
  		
  		
  		}
   		catch(Exception e)
   		{
   			e.printStackTrace();
   			System.out.println("error"+e);
   		}
    	 		    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try
  		{
  		File music=new File ("E://QUINTO SEMESTRE MATERIAS//PROGRAMACION//POO/Jigsaw (Saw 8) - Trailer Espa??ol Latino 2017.mp4");
  		
  		  	
  		Desktop.getDesktop().open(music);
  		
  		
  		}
   		catch(Exception e)
   		{
   			e.printStackTrace();
   			System.out.println("error"+e);
   		}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try
  		{
  		File music=new File ("E://QUINTO SEMESTRE MATERIAS//PROGRAMACION//POO/LOS INCREIBLES 2 Trailer Espa??ol (2018).mp4");
  		
  		  	
  		Desktop.getDesktop().open(music);
  		
  		
  		}
   		catch(Exception e)
   		{
   			e.printStackTrace();
   			System.out.println("error"+e);
   		}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
  		{
  		File music=new File ("E://QUINTO SEMESTRE MATERIAS//PROGRAMACION//POO/One Direction - Story Of My Life Subtitulado en Espa??ol.mp3");
  		
  		  	
  		Desktop.getDesktop().open(music);
  		
  		
  		}
   		catch(Exception e)
   		{
   			e.printStackTrace();
   			System.out.println("error"+e);
   		}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
  		{
  		File music=new File ("E://QUINTO SEMESTRE MATERIAS//PROGRAMACION//POO/C--hombres_g-devuelveme_a_mi_chica.mp3");
  		
  		  	
  		Desktop.getDesktop().open(music);
  		
  		
  		}
   		catch(Exception e)
   		{
   			e.printStackTrace();
   			System.out.println("error"+e);
   		}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try
  		{
  		File music=new File ("E://QUINTO SEMESTRE MATERIAS//PROGRAMACION//POO/The Beatles - Love Me Do.mp3");
  		
  		  	
  		Desktop.getDesktop().open(music);
  		
  		
  		}
   		catch(Exception e)
   		{
   			e.printStackTrace();
   			System.out.println("error"+e);
   		}
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Entretenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entretenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entretenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entretenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entretenimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
