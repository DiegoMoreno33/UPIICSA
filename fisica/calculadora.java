/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author badbo
 */
public class calculadora extends javax.swing.JFrame {

    /**
     * Creates new form calculadora
     */
    public calculadora() {
        initComponents();
        this.setResizable(false);
        this.setSize(600,565);
        this.setLocationRelativeTo(null);
        
      
        
        //
         fuerza1.setVisible(false);
        desplazamiento.setVisible(false);
        angulo.setVisible(false);
        fuerza2.setVisible(false);
        trabajo.setVisible(false);
        newton.setVisible(false);
        metro.setVisible(false);
        grado.setVisible(false);
        joule.setVisible(false);
        jouless.setVisible(false);
        newton2.setVisible(false);
        me.setVisible(false);
        des.setVisible(false);
        
        joule.setVisible(false);
        newtons1.setVisible(false);
        metros1.setVisible(false);
        grados1.setVisible(false);
        
        
        calfue.setVisible(false);
        caltra.setVisible(false);
        calang.setVisible(false);
        caldes.setVisible(false);
        
        
        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
        
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        caltra1 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fuerza1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        newton = new javax.swing.JLabel();
        desplazamiento = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        metro = new javax.swing.JLabel();
        angulo = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        grado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        joule = new javax.swing.JLabel();
        caltra = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        resultadin = new javax.swing.JLabel();
        trabajo = new javax.swing.JLabel();
        fuerza2 = new javax.swing.JLabel();
        jouless = new javax.swing.JLabel();
        newton2 = new javax.swing.JLabel();
        me = new javax.swing.JLabel();
        des = new javax.swing.JLabel();
        newtons1 = new javax.swing.JLabel();
        metros1 = new javax.swing.JLabel();
        grados1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        calfue = new javax.swing.JButton();
        caldes = new javax.swing.JButton();
        calang = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        caltra1.setBackground(new java.awt.Color(255, 102, 0));
        caltra1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        caltra1.setText("Calcular");
        caltra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caltra1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 153, 153));
        panel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido a la calculadora");
        panel.add(jLabel1);
        jLabel1.setBounds(145, 11, 340, 41);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pencil (1).png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel.add(jButton5);
        jButton5.setBounds(10, 11, 117, 107);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("W");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1);
        jButton1.setBounds(136, 136, 57, 37);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("F");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel.add(jButton2);
        jButton2.setBounds(231, 136, 60, 37);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("D");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel.add(jButton3);
        jButton3.setBounds(324, 136, 60, 37);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("ϕ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel.add(jButton4);
        jButton4.setBounds(432, 136, 65, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Trabajo");
        panel.add(jLabel2);
        jLabel2.setBounds(137, 108, 47, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fuerza");
        panel.add(jLabel3);
        jLabel3.setBounds(231, 108, 40, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Desplazamiento");
        panel.add(jLabel4);
        jLabel4.setBounds(314, 108, 95, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Angulo");
        panel.add(jLabel5);
        jLabel5.setBounds(441, 108, 42, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingresa los siguientes datos:");
        panel.add(jLabel6);
        jLabel6.setBounds(18, 191, 226, 22);

        fuerza1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fuerza1.setForeground(new java.awt.Color(255, 255, 255));
        fuerza1.setText("Fuerza=");
        panel.add(fuerza1);
        fuerza1.setBounds(20, 230, 57, 17);

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        panel.add(txt2);
        txt2.setBounds(140, 270, 97, 30);

        newton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newton.setForeground(new java.awt.Color(255, 255, 255));
        newton.setText("(Newtons)");
        panel.add(newton);
        newton.setBounds(200, 230, 74, 17);

        desplazamiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        desplazamiento.setForeground(new java.awt.Color(255, 255, 255));
        desplazamiento.setText("Desplazamiento=");
        panel.add(desplazamiento);
        desplazamiento.setBounds(10, 270, 119, 17);

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        panel.add(txt1);
        txt1.setBounds(90, 230, 97, 30);

        metro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        metro.setForeground(new java.awt.Color(255, 255, 255));
        metro.setText("(metros)");
        panel.add(metro);
        metro.setBounds(260, 270, 61, 17);

        angulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        angulo.setForeground(new java.awt.Color(255, 255, 255));
        angulo.setText("Angulo=");
        panel.add(angulo);
        angulo.setBounds(18, 307, 60, 17);

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        panel.add(txt3);
        txt3.setBounds(130, 310, 97, 30);

        grado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grado.setForeground(new java.awt.Color(255, 255, 255));
        grado.setText("(°grados)");
        panel.add(grado);
        grado.setBounds(240, 310, 67, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Resultado:");
        panel.add(jLabel7);
        jLabel7.setBounds(14, 426, 128, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(jLabel8);
        jLabel8.setBounds(148, 426, 0, 0);

        joule.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        joule.setForeground(new java.awt.Color(255, 255, 255));
        joule.setText("(Joules)");
        panel.add(joule);
        joule.setBounds(270, 430, 73, 22);

        caltra.setBackground(new java.awt.Color(255, 102, 0));
        caltra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        caltra.setText("Calcular Trabajo");
        caltra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caltraActionPerformed(evt);
            }
        });
        panel.add(caltra);
        caltra.setBounds(10, 360, 180, 51);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16478_1.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.setName(""); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel.add(jButton7);
        jButton7.setBounds(486, 367, 112, 94);

        jButton8.setBackground(new java.awt.Color(0, 153, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Limpiar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panel.add(jButton8);
        jButton8.setBounds(220, 360, 83, 51);

        resultadin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panel.add(resultadin);
        resultadin.setBounds(150, 430, 100, 30);

        trabajo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        trabajo.setForeground(new java.awt.Color(255, 255, 255));
        trabajo.setText("Trabajo=");
        panel.add(trabajo);
        trabajo.setBounds(20, 230, 65, 20);

        fuerza2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fuerza2.setForeground(new java.awt.Color(255, 255, 255));
        fuerza2.setText("Fuerza=");
        panel.add(fuerza2);
        fuerza2.setBounds(30, 270, 57, 17);

        jouless.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jouless.setForeground(new java.awt.Color(255, 255, 255));
        jouless.setText("(Joules)");
        panel.add(jouless);
        jouless.setBounds(210, 230, 60, 17);

        newton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newton2.setForeground(new java.awt.Color(255, 255, 255));
        newton2.setText("(Newton)");
        panel.add(newton2);
        newton2.setBounds(260, 270, 69, 25);

        me.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        me.setForeground(new java.awt.Color(255, 255, 255));
        me.setText("(metros)");
        panel.add(me);
        me.setBounds(250, 310, 90, 17);

        des.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        des.setForeground(new java.awt.Color(255, 255, 255));
        des.setText("Desplazamiento=");
        panel.add(des);
        des.setBounds(10, 310, 130, 17);

        newtons1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newtons1.setForeground(new java.awt.Color(255, 255, 255));
        newtons1.setText("(Newtons)");
        panel.add(newtons1);
        newtons1.setBounds(270, 430, 96, 22);

        metros1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        metros1.setForeground(new java.awt.Color(255, 255, 255));
        metros1.setText("(metros)");
        panel.add(metros1);
        metros1.setBounds(266, 432, 79, 22);

        grados1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        grados1.setForeground(new java.awt.Color(255, 255, 255));
        grados1.setText("(grados)");
        panel.add(grados1);
        grados1.setBounds(266, 432, 77, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Presiona sobre la letra que gustes calcular. Recuerda que:");
        panel.add(jLabel9);
        jLabel9.setBounds(145, 58, 395, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("W=F∙∆dcosθ");
        panel.add(jLabel10);
        jLabel10.setBounds(260, 80, 115, 22);

        calfue.setBackground(new java.awt.Color(255, 102, 0));
        calfue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calfue.setText("Calcular Fuerza");
        calfue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calfueActionPerformed(evt);
            }
        });
        panel.add(calfue);
        calfue.setBounds(20, 360, 150, 51);

        caldes.setBackground(new java.awt.Color(255, 102, 0));
        caldes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        caldes.setText("Calcular Desplazamiento");
        caldes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caldesActionPerformed(evt);
            }
        });
        panel.add(caldes);
        caldes.setBounds(10, 360, 200, 51);

        calang.setBackground(new java.awt.Color(255, 102, 0));
        calang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calang.setText("Calcular Angulo");
        calang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calangActionPerformed(evt);
            }
        });
        panel.add(calang);
        calang.setBounds(30, 360, 150, 51);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_admin.png"))); // NOI18N
        jButton6.setToolTipText("ayuda");
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panel.add(jButton6);
        jButton6.setBounds(490, 10, 60, 48);

        jMenu1.setText("OPCCIONES");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x1.1.png"))); // NOI18N
        jMenuItem1.setText("CERRAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16478 (1) (1).png"))); // NOI18N
        jMenuItem2.setText("MENU PRINCIPAL");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // TODO add your handling code here:
        fuerza1.setVisible(true);
        desplazamiento.setVisible(true);
        angulo.setVisible(true);
        fuerza2.setVisible(false);
        trabajo.setVisible(false);
        newton.setVisible(true);
        metro.setVisible(true);
        grado.setVisible(true);
        joule.setVisible(true);
        jouless.setVisible(false);
        newton2.setVisible(false);
        me.setVisible(false);
        des.setVisible(false);
        
        joule.setVisible(true);
        newtons1.setVisible(false);
        metros1.setVisible(false);
        grados1.setVisible(false);
        
        calfue.setVisible(false);
        caltra.setVisible(true);
        calang.setVisible(false);
        caldes.setVisible(false);
        
        txt1.setVisible(true);
        txt2.setVisible(true);
        txt3.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        home princi= new home ();
        princi.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        resultadin.setText("");
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void caltraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caltraActionPerformed

        // TODO add your handling code here:
          DecimalFormat formato=new DecimalFormat("#.##");
       double resultado=0;
       double anguloengrados = 0;
       
       //resultado=Math.cos(anguloenradianes);
      double Res;
        double num1 = Double.parseDouble(txt1.getText());
        double num2 = Double.parseDouble(txt2.getText());
        double num3 = Double.parseDouble(txt3.getText());
        double anguloenradianes=Math.toRadians(num3);
          resultado=Math.cos(anguloenradianes);
          double fin=0;
          formato.format(fin);
          fin=resultado*num1*num2;
          String resul = null;
        
          resul=String.valueOf(formato.format(fin));
        //double resangulo=(resultado*num3);
        //txtresultado.setText(String.valueOf(num1*num2*Res));
        if(num3==90){
        resultadin.setText("0");
        }
        else
        {
        resultadin.setText(resul);
        }
        
    }//GEN-LAST:event_caltraActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
fuerza1.setVisible(false);   
trabajo.setVisible(true);
newton.setVisible(false);
joule.setVisible(false);
jouless.setVisible(true);
newton2.setVisible(false);
desplazamiento.setVisible(true);
metro.setVisible(true);
        fuerza2.setVisible(false);
        me.setVisible(false);
        des.setVisible(false);
        angulo.setVisible(true);
        grado.setVisible(true);
        
        joule.setVisible(false);
        newtons1.setVisible(true);
        metros1.setVisible(false);
        grados1.setVisible(false);
        
        calfue.setVisible(true);
        caltra.setVisible(false);
        calang.setVisible(false);
        caldes.setVisible(false);
        
         txt1.setVisible(true);
        txt2.setVisible(true);
        txt3.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        trabajo.setVisible(true);
        fuerza2.setVisible(true);
        newton2.setVisible(true);
        angulo.setVisible(true);
        grado.setVisible(true);
        metros1.setVisible(true);
        fuerza1.setVisible(false); 
        desplazamiento.setVisible(false);
        metro.setVisible(false);
        me.setVisible(false);
        des.setVisible(false);
        joule.setVisible(false);
        newtons1.setVisible(false);
        grados1.setVisible(false);
        jouless.setVisible(true);
        newton.setVisible(false);
        
        calfue.setVisible(false);
        caltra.setVisible(false);
        calang.setVisible(false);
        caldes.setVisible(true);
        
         txt1.setVisible(true);
        txt2.setVisible(true);
        txt3.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        trabajo.setVisible(true);
        fuerza2.setVisible(true);
        fuerza1.setVisible(false); 
        desplazamiento.setVisible(false);
        newton2.setVisible(true);
        metro.setVisible(false);
        angulo.setVisible(false);
        grado.setVisible(false);
        me.setVisible(false);
        des.setVisible(false);
        jouless.setVisible(true);
        
        
        me.setVisible(true);
        des.setVisible(true);
        
        joule.setVisible(false);
        newtons1.setVisible(false);
        metros1.setVisible(false);
        grados1.setVisible(true);
        
        
        calfue.setVisible(false);
        caltra.setVisible(false);
        calang.setVisible(true);
        caldes.setVisible(false);
        
         txt1.setVisible(true);
        txt2.setVisible(true);
        txt3.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void caltra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caltra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caltra1ActionPerformed

    private void calfueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calfueActionPerformed
        // TODO add your handling code here:
        DecimalFormat formato=new DecimalFormat("#.##");
       double resultado=0;
       double anguloengrados = 0;
       
       //resultado=Math.cos(anguloenradianes);
      double Res;
        double num1 = Double.parseDouble(txt1.getText());
        double num2 = Double.parseDouble(txt2.getText());
        double num3 = Double.parseDouble(txt3.getText());
        double anguloenradianes=Math.toRadians(num3);
          resultado=Math.cos(anguloenradianes);
          double fin=0;
          formato.format(fin);
          fin=(num1)/(resultado*num2);
          String resul = null;
        
          resul=String.valueOf(formato.format(fin));
        //double resangulo=(resultado*num3);
        //txtresultado.setText(String.valueOf(num1*num2*Res));
        
        resultadin.setText(resul);
        
        
        //fuerza
    }//GEN-LAST:event_calfueActionPerformed

    private void caldesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caldesActionPerformed
        // TODO add your handling code here:
        DecimalFormat formato=new DecimalFormat("#.##");
       double resultado=0;
       double anguloengrados = 0;
       
       //resultado=Math.cos(anguloenradianes);
      double Res;
        double num1 = Double.parseDouble(txt1.getText());
        double num2 = Double.parseDouble(txt2.getText());
        double num3 = Double.parseDouble(txt3.getText());
        double anguloenradianes=Math.toRadians(num3);
          resultado=Math.cos(anguloenradianes);
          double fin=0;
          formato.format(fin);
          fin=(num1)/(resultado*num2);
          String resul = null;
        
          resul=String.valueOf(formato.format(fin));
        //double resangulo=(resultado*num3);
        //txtresultado.setText(String.valueOf(num1*num2*Res));
        
        resultadin.setText(resul);
    }//GEN-LAST:event_caldesActionPerformed

    private void calangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calangActionPerformed
        // TODO add your handling code here:
         DecimalFormat formato=new DecimalFormat("#.##");
       double resultado=0;
       
       
      double Res;
        double num1 = Double.parseDouble(txt1.getText());
        double num2 = Double.parseDouble(txt2.getText());
        double num3 = Double.parseDouble(txt3.getText());
        Res=Math.acos(num1/(num2*num3));
        resultado=Math.toDegrees(Res);
          formato.format(resultado);
          String resul = null;
        
          resul=String.valueOf(formato.format(resultado));
        //double resangulo=(resultado*num3);
        //txtresultado.setText(String.valueOf(num1*num2*Res));
        
        resultadin.setText(resul);
    }//GEN-LAST:event_calangActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Recuerda llenar todos los datos indicados. Si un valor es nulo, ponerlo como 0. La fuerza normal y gravitacional forman un angulo de 90°, por lo tanto su trabajo es 0");
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel angulo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calang;
    private javax.swing.JButton caldes;
    private javax.swing.JButton calfue;
    private javax.swing.JButton caltra;
    private javax.swing.JButton caltra1;
    private javax.swing.JLabel des;
    private javax.swing.JLabel desplazamiento;
    private javax.swing.JLabel fuerza1;
    private javax.swing.JLabel fuerza2;
    private javax.swing.JLabel grado;
    private javax.swing.JLabel grados1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel joule;
    private javax.swing.JLabel jouless;
    private javax.swing.JLabel me;
    private javax.swing.JLabel metro;
    private javax.swing.JLabel metros1;
    private javax.swing.JLabel newton;
    private javax.swing.JLabel newton2;
    private javax.swing.JLabel newtons1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel resultadin;
    private javax.swing.JLabel trabajo;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
