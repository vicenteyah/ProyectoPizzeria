/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;

/**
 *
 * @author Alberto
 */
public class FrmAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form FrmAdministrador
     */
    public FrmAdministrador() {
        this.getContentPane().setBackground(Color.white);
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

        btAgregarUsuario = new javax.swing.JButton();
        btEliminarUsuario = new javax.swing.JButton();
        btAgregarProducto = new javax.swing.JButton();
        btEliminarProducto = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        btAgregarCliente = new javax.swing.JButton();
        btEliminarCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btAgregarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modelo/imagenes/add-user.png"))); // NOI18N
        btAgregarUsuario.setText("Agregar Usuario");
        btAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarUsuarioActionPerformed(evt);
            }
        });

        btEliminarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modelo/imagenes/delete-user.png"))); // NOI18N
        btEliminarUsuario.setText("Eliminar Usuario");
        btEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarUsuarioActionPerformed(evt);
            }
        });

        btAgregarProducto.setBackground(new java.awt.Color(255, 255, 255));
        btAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modelo/imagenes/agregar-producto.png"))); // NOI18N
        btAgregarProducto.setText("Agregar Producto");
        btAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarProductoActionPerformed(evt);
            }
        });

        btEliminarProducto.setBackground(new java.awt.Color(255, 255, 255));
        btEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modelo/imagenes/eliminar-producto.png"))); // NOI18N
        btEliminarProducto.setText("Eliminar Producto");
        btEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarProductoActionPerformed(evt);
            }
        });

        btSalir.setBackground(new java.awt.Color(255, 255, 255));
        btSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modelo/imagenes/salir.png"))); // NOI18N
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        btAgregarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modelo/imagenes/agregar-cliente.png"))); // NOI18N
        btAgregarCliente.setText("Agregar Cliente");
        btAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarClienteActionPerformed(evt);
            }
        });

        btEliminarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modelo/imagenes/eliminar-cliente.png"))); // NOI18N
        btEliminarCliente.setText("Eliminar Cliente");
        btEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarClienteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Harrington", 1, 36)); // NOI18N
        jLabel1.setText("Bienvenido Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btAgregarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btEliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btAgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))))
                .addGap(30, 30, 30))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregarUsuario)
                    .addComponent(btAgregarProducto)
                    .addComponent(btAgregarCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEliminarUsuario)
                    .addComponent(btEliminarProducto)
                    .addComponent(btEliminarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarUsuarioActionPerformed
        this.dispose();
        new FrmAgregarUsuario().setVisible(true);
    }//GEN-LAST:event_btAgregarUsuarioActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarProductoActionPerformed
        this.dispose();
        new FrmAgregarProducto().setVisible(true);
    }//GEN-LAST:event_btAgregarProductoActionPerformed

    private void btEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEliminarProductoActionPerformed

    private void btAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarClienteActionPerformed
        this.dispose();
        new FrmAgregarCliente().setVisible(true);
    }//GEN-LAST:event_btAgregarClienteActionPerformed

    private void btEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarClienteActionPerformed
        this.dispose();
        new FrmEliminarCliente().setVisible(true);
    }//GEN-LAST:event_btEliminarClienteActionPerformed

    private void btEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarUsuarioActionPerformed
        this.setVisible(false);
        new FrmEliminarUsuario().setVisible(true);
    }//GEN-LAST:event_btEliminarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarCliente;
    private javax.swing.JButton btAgregarProducto;
    private javax.swing.JButton btAgregarUsuario;
    private javax.swing.JButton btEliminarCliente;
    private javax.swing.JButton btEliminarProducto;
    private javax.swing.JButton btEliminarUsuario;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
