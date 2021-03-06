package gestionescolar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Conexion.conexionMySql;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CECyT14-PC01
 */
public class Adminprof extends javax.swing.JFrame {

    DefaultTableModel modelo;

    /**
     * Creates new form Admin
     */
    public Adminprof() {
        initComponents();
         this.setLocationRelativeTo(null);
        CargarTabla("");
    }
   
    private void limpiarcajas() {
        txtID.setText(null);
        txtID.setEnabled(true);
        txtNombre.setText(null);
        txtsnom.setText(null);
        txtapP.setText(null);
        txtapM.setText(null);
        txtbol.setText(null);
        txtcalle.setText(null);
        txtcol.setText(null);
        txtalcal.setText(null);
        txtnint.setText(null);
        txtnExt.setText(null);
        txtcp.setText(null);
        txtusuario.setText(null);
        txtcontra.setText(null);

    }

    void CargarTabla(String valor) {
        String[] titulos = {"id", "pnombre", "snombre", "apPaterno", "apMaterno", "matricula", "calle", "colonia","alcaldia","nInterior","nExterior","cp","usuario","contra"};
        String[] registro = new String[14];
        modelo = new DefaultTableModel(null, titulos);

        conexionMySql mySql = new conexionMySql();
        Connection cn = mySql.Conectar();

        String sSQL = "Select id,pnombre,snombre,apPaterno, apMaterno, matricula, calle,colonia,alcaldia,nInterior,nExterior,cp,usuario,contra  FROM profesor WHERE CONCAT(pnombre,'',snombre,'',apPaterno,'',apMaterno,'',matricula,'',calle,'',colonia,'',nInterior,'',nExterior,'',cp,'',usuario,'',contra,'')LIKE'%" + valor + "%'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("pnombre");
                registro[2] = rs.getString("snombre");
                registro[3] = rs.getString("apPaterno");
                registro[4] = rs.getString("apMaterno");
                registro[5] = rs.getString("matricula");
                registro[6] = rs.getString("calle");
                registro[7] = rs.getString("colonia");
                registro[8] = rs.getString("alcaldia");
                registro[9] = rs.getString("nInterior");
                registro[10] = rs.getString("nExterior");
                registro[11] = rs.getString("cp");
                registro[12] = rs.getString("usuario");
                registro[13] = rs.getString("contra");

                modelo.addRow(registro);
            }
            this.tabla1.setModel(modelo);
        } catch (SQLException ex) {
            //Logger.getLogger(nuevo.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, ex);

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

        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        btnBuscar3 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        lblID3 = new javax.swing.JLabel();
        btnModificar3 = new javax.swing.JButton();
        btnEliminar3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApP3 = new javax.swing.JLabel();
        txtsnom = new javax.swing.JTextField();
        lblApM3 = new javax.swing.JLabel();
        txtapP = new javax.swing.JTextField();
        lblUsuario3 = new javax.swing.JLabel();
        txtapM = new javax.swing.JTextField();
        lblContra3 = new javax.swing.JLabel();
        txtbol = new javax.swing.JTextField();
        lblCorreo3 = new javax.swing.JLabel();
        txtcalle = new javax.swing.JTextField();
        lblFechaN3 = new javax.swing.JLabel();
        txtcol = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        txtalcal = new java.awt.TextField();
        txtnInt = new java.awt.TextField();
        txtnExt = new java.awt.TextField();
        txtcp = new java.awt.TextField();
        txtusuario = new java.awt.TextField();
        txtcontra = new java.awt.TextField();
        txtnint = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_back.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnBuscar3.setBackground(new java.awt.Color(255, 153, 0));
        btnBuscar3.setText("BUSCAR");
        btnBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        lblID3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblID3.setForeground(new java.awt.Color(255, 255, 255));
        lblID3.setText("ID:");
        lblID3.setToolTipText("");

        btnModificar3.setBackground(new java.awt.Color(255, 153, 0));
        btnModificar3.setText("MODIFICAR");
        btnModificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar3.setBackground(new java.awt.Color(255, 153, 0));
        btnEliminar3.setText("ELIMINAR");
        btnEliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabla1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Primer nombre");

        lblApP3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApP3.setForeground(new java.awt.Color(255, 255, 255));
        lblApP3.setText("Segundo nombre");

        lblApM3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApM3.setForeground(new java.awt.Color(255, 255, 255));
        lblApM3.setText("Apellido Paterno:");

        txtapP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapPActionPerformed(evt);
            }
        });

        lblUsuario3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsuario3.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario3.setText("Apellido Materno:");

        lblContra3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblContra3.setForeground(new java.awt.Color(255, 255, 255));
        lblContra3.setText("Boleta:");

        lblCorreo3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCorreo3.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo3.setText("Calle:");

        lblFechaN3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFechaN3.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaN3.setText("Colonia:");
        lblFechaN3.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("AR JULIAN", 1, 24)); // NOI18N
        jLabel5.setText("ADMINISTRADOR");

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x1.1.png"))); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Alcaldia:");

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Numero Interior:");

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Numero Exterior:");

        label4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Codigo postal");

        label5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Usuario:");

        label6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Contrase??a:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 248, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(211, 211, 211)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblFechaN3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCorreo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblContra3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblApM3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblApP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblID3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtalcal, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(txtnExt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcontra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsnom, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtapP, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtapM, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbol, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcalle, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcol, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnInt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnEliminar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(105, 105, 105))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtID)
                                            .addComponent(lblID3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblApP3)
                                            .addComponent(txtsnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnBuscar3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(lblApM3)
                                                    .addComponent(txtapP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(lblUsuario3)
                                                    .addComponent(txtapM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnEliminar3))
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblContra3)))
                                            .addComponent(btnModificar3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCorreo3))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblFechaN3)
                                            .addComponent(txtcol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtalcal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtnInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtnint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnExt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtapPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapPActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        conexionMySql mysql = new conexionMySql();
        Connection cn = mysql.Conectar();
        String ID,pnombre, snombre, apPaterno, apMaterno, matricula,calle,colonia,alcal,nInterior,nExterior,cp,usuario,contra;

        ID= this.txtID.getText();
        pnombre = this.txtNombre.getText();
        snombre = this.txtsnom.getText();
        apPaterno = this.txtapP.getText();
        apMaterno = this.txtapM.getText();
        matricula = this.txtbol.getText();
        calle = this.txtcalle.getText();
        colonia = this.txtcol.getText();
        alcal = this.txtalcal.getText();
        nInterior = this.txtnint.getText();
        nExterior = this.txtnExt.getText();
        cp = this.txtcp.getText();
        usuario = this.txtusuario.getText();
        contra = this.txtcontra.getText();

        String sSQL = "DELETE FROM profesor WHERE id=?";
        String mensaje = "Persona ELIMINADA";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, ID);

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, mensaje);
                limpiarcajas();
                CargarTabla("");
            }else{
                JOptionPane.showMessageDialog(null, "Los datos no se pudieron ELIMINAR");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //nombre,apellidoP,apellidoM, usuario, contra, correo, fechaN
        conexionMySql mysql = new conexionMySql();
        Connection cn = mysql.Conectar();
        String ID,pnombre, snombre, apPaterno, apMaterno, matricula,calle,colonia,alcal,nInterior,nExterior,cp,usuario,contra;

        ID= this.txtID.getText();
        pnombre = this.txtNombre.getText();
        snombre = this.txtsnom.getText();
        apPaterno = this.txtapP.getText();
        apMaterno = this.txtapM.getText();
        matricula = this.txtbol.getText();
        calle = this.txtcalle.getText();
        colonia = this.txtcol.getText();
        alcal = this.txtalcal.getText();
        nInterior = this.txtnint.getText();
        nExterior = this.txtnExt.getText();
        cp = this.txtcp.getText();
        usuario = this.txtusuario.getText();
        contra = this.txtcontra.getText();

        String sSQL = "UPDATE profesor SET pnombre=?,snombre=?, apPaterno=?, apMaterno=?, boleta=?, calle=?,colonia=?,alcaldia=?,nInterior=?,nExterior=?,cp=?,usuario=?,contra=?WHERE id=?";
        String mensaje = "Persona Modificada";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, pnombre);
            pst.setString(2, snombre);
            pst.setString(3, apPaterno);
            pst.setString(4, apMaterno);
            pst.setString(5, matricula);
            pst.setString(6, calle);
            pst.setString(7, colonia);
            pst.setString(8, alcal);
            pst.setString(9, nInterior);
            pst.setString(10, nExterior);
            pst.setString(11, cp);
            pst.setString(12, usuario);
            pst.setString(13, contra);
            pst.setString(14, ID);

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, mensaje);
                limpiarcajas();
                CargarTabla("");
            }else{
                JOptionPane.showMessageDialog(null, "Los datos no se pudieron modificar");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        conexionMySql mysql = new conexionMySql();//245:04
        Connection cn = mysql.Conectar();
        String ID,pnombre, snombre, apPaterno, apMaterno, matricula,calle,colonia,alcal,nInterior,nExterior,cp,usuario,contra;

        ID= this.txtID.getText();
        pnombre = this.txtNombre.getText();
        snombre = this.txtsnom.getText();
        apPaterno = this.txtapP.getText();
        apMaterno = this.txtapM.getText();
        matricula = this.txtbol.getText();
        calle = this.txtcalle.getText();
        colonia = this.txtcol.getText();
        alcal = this.txtalcal.getText();
        nInterior = this.txtnint.getText();
        nExterior = this.txtnExt.getText();
        cp = this.txtcp.getText();
        usuario = this.txtusuario.getText();
        contra = this.txtcontra.getText();
        String sSQL = "Select * from profesor where id = ?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, txtID.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtID.setEnabled(false);
                txtNombre.setText(rs.getString("pnombre"));
                txtsnom.setText(rs.getString("snombre"));
                txtapP.setText(rs.getString("apPaterno"));
                txtapM.setText(rs.getString("apMaterno"));
                txtbol.setText(rs.getString("matricula"));
                txtcalle.setText(rs.getString("calle"));
                txtcol.setText(rs.getString("colonia"));
                txtalcal.setText(rs.getString("alcaldia"));
                txtnint.setText(rs.getString("nInterior"));
                txtnExt.setText(rs.getString("nExterior"));
                txtcp.setText(rs.getString("cp"));
                txtusuario.setText(rs.getString("usuario"));
                txtcontra.setText(rs.getString("contra"));
                //cbx.seySelectedItem(rs.gertString("genero"));
            } else {
                JOptionPane.showMessageDialog(null, "el registro no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Bienvenida c= new Bienvenida();
        c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JButton btnEliminar3;
    private javax.swing.JButton btnModificar3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JLabel lblApM3;
    private javax.swing.JLabel lblApP3;
    private javax.swing.JLabel lblContra3;
    private javax.swing.JLabel lblCorreo3;
    private javax.swing.JLabel lblFechaN3;
    private javax.swing.JLabel lblID3;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private java.awt.TextField txtalcal;
    private javax.swing.JTextField txtapM;
    private javax.swing.JTextField txtapP;
    private javax.swing.JTextField txtbol;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtcol;
    private java.awt.TextField txtcontra;
    private java.awt.TextField txtcp;
    private java.awt.TextField txtnExt;
    private java.awt.TextField txtnInt;
    private javax.swing.JTextField txtnint;
    private javax.swing.JTextField txtsnom;
    private java.awt.TextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
