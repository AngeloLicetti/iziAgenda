/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iziagenda;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AngeloAlCubo
 */
public class frmConfiguracion extends javax.swing.JFrame {

    /**
     * Creates new form frmConfiguracion
     */
    public frmConfiguracion()
    {
        initComponents();
        extraClass.centrarFrame(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogIn = new javax.swing.JPanel();
        lblYaPaso = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnMisDatos = new javax.swing.JButton();
        btnEditarColores = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        btnEliminarTodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(510, 450));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogIn.setBackground(new java.awt.Color(0, 153, 204));
        pnlLogIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnlLogIn.setMinimumSize(new java.awt.Dimension(510, 450));
        pnlLogIn.setPreferredSize(new java.awt.Dimension(510, 450));
        pnlLogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblYaPaso.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        lblYaPaso.setForeground(new java.awt.Color(255, 255, 255));
        lblYaPaso.setText("Configuración");
        pnlLogIn.add(lblYaPaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        btnVolver.setBackground(new java.awt.Color(37, 116, 169));
        btnVolver.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        pnlLogIn.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 420, 50));

        btnMisDatos.setBackground(new java.awt.Color(37, 116, 169));
        btnMisDatos.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        btnMisDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnMisDatos.setText("Mis datos");
        btnMisDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnMisDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMisDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisDatosActionPerformed(evt);
            }
        });
        pnlLogIn.add(btnMisDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 420, 50));

        btnEditarColores.setBackground(new java.awt.Color(37, 116, 169));
        btnEditarColores.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        btnEditarColores.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarColores.setText("Editar colores");
        btnEditarColores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnEditarColores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarColoresActionPerformed(evt);
            }
        });
        pnlLogIn.add(btnEditarColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 420, 50));

        btnEliminarCuenta.setBackground(new java.awt.Color(37, 116, 169));
        btnEliminarCuenta.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        btnEliminarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCuenta.setText("Eliminar cuenta");
        btnEliminarCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnEliminarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });
        pnlLogIn.add(btnEliminarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 420, 50));

        btnEliminarTodo.setBackground(new java.awt.Color(37, 116, 169));
        btnEliminarTodo.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        btnEliminarTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarTodo.setText("Eliminar todo");
        btnEliminarTodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnEliminarTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoActionPerformed(evt);
            }
        });
        pnlLogIn.add(btnEliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 420, 50));

        getContentPane().add(pnlLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmPrincipal().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnMisDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisDatosActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmEditarUsuario().setVisible(true);
    }//GEN-LAST:event_btnMisDatosActionPerformed

    private void btnEditarColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarColoresActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmEditarColores().setVisible(true);
    }//GEN-LAST:event_btnEditarColoresActionPerformed

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
        // TODO add your handling code here:
        int confirmar = JOptionPane.showConfirmDialog(this, (String)"Su cuenta se eliminará de forma total y permanente. ¿Desea continuar?" , "¡Atención!", 2, 2);
        if(confirmar==0)
        {
            fabricaClass.getUsuarios().remove(fabricaClass.getUsuarioLogeado());
            fabricaClass.logOut();
            fabricaClass.serializarDatos();
            this.dispose();
            new frmLogIn().setVisible(true);
        }
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
        // TODO add your handling code here:
        int confirmar = JOptionPane.showConfirmDialog(this, (String)"Todas sus actividades se eliminarán permanentemente. ¿Desea continuar?" , "¡Atención!", 2, 2);
        if(confirmar==0)
        {
            fabricaClass.getUsuarioLogeado().setPendientes(new ArrayList<PendienteClass>());
            fabricaClass.getUsuarioLogeado().actualizarPuntaje();
            fabricaClass.getUsuarioLogeado().setRubros(new ArrayList <String>());
            fabricaClass.serializarDatos();
        }
            
    }//GEN-LAST:event_btnEliminarTodoActionPerformed

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
            java.util.logging.Logger.getLogger(frmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConfiguracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarColores;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnEliminarTodo;
    private javax.swing.JButton btnMisDatos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblYaPaso;
    private javax.swing.JPanel pnlLogIn;
    // End of variables declaration//GEN-END:variables
}