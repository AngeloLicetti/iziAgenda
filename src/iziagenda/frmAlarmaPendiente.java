/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iziagenda;

import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author Angelo
 */
public class frmAlarmaPendiente extends javax.swing.JFrame {

    /**
     * Creates new form frmAlarmaPendiente
     */
    
    URL url;
    AudioClip ac;
    
    PendienteClass pendiente;
    
    public frmAlarmaPendiente(){}
    
    public frmAlarmaPendiente(PendienteClass pendiente)
    {
        initComponents();
        extraClass.centrarFrame(this);
        inicializarAlarma();
        this.pendiente=pendiente;
        lblNombre.setText("\""+this.pendiente.getNombre()+"\"");
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
        btnPosponer = new javax.swing.JButton();
        lblQue = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblYaPaso = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnMarcar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 270));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogIn.setBackground(new java.awt.Color(0, 153, 204));
        pnlLogIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnlLogIn.setMinimumSize(new java.awt.Dimension(400, 270));
        pnlLogIn.setPreferredSize(new java.awt.Dimension(400, 270));
        pnlLogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPosponer.setBackground(new java.awt.Color(37, 116, 169));
        btnPosponer.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        btnPosponer.setForeground(new java.awt.Color(255, 255, 255));
        btnPosponer.setText("Posponer");
        btnPosponer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnPosponer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPosponer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosponerActionPerformed(evt);
            }
        });
        pnlLogIn.add(btnPosponer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 200, -1));

        lblQue.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        lblQue.setForeground(new java.awt.Color(255, 255, 255));
        lblQue.setText("¿Qué desea hacer?");
        pnlLogIn.add(lblQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        lblNombre.setText(" ");
        pnlLogIn.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 350, -1));

        lblYaPaso.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        lblYaPaso.setForeground(new java.awt.Color(255, 255, 255));
        lblYaPaso.setText("Ya pasó la fecha límite para:");
        pnlLogIn.add(lblYaPaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblReloj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iziagenda/54612.gif"))); // NOI18N
        pnlLogIn.add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, 100));

        btnEliminar.setBackground(new java.awt.Color(37, 116, 169));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlLogIn.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 200, -1));

        btnMarcar.setBackground(new java.awt.Color(37, 116, 169));
        btnMarcar.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        btnMarcar.setForeground(new java.awt.Color(255, 255, 255));
        btnMarcar.setText("Marcar como hecho");
        btnMarcar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnMarcar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarActionPerformed(evt);
            }
        });
        pnlLogIn.add(btnMarcar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 200, -1));

        getContentPane().add(pnlLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarActionPerformed
        // TODO add your handling code here:
        pendiente.cambiarHecho();
        fabricaClass.serializarDatos();
        cerrar();
    }//GEN-LAST:event_btnMarcarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminarPendiente(pendiente);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPosponerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosponerActionPerformed
        // TODO add your handling code here:
        ac.stop();
        this.dispose();
        new frmPosponer(pendiente).setVisible(true);
    }//GEN-LAST:event_btnPosponerActionPerformed

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
            java.util.logging.Logger.getLogger(frmAlarmaPendiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlarmaPendiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlarmaPendiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlarmaPendiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAlarmaPendiente().setVisible(true);
            }
        });
    }
    
    public void inicializarAlarma()
    {
        try
        {
            url = this.getClass().getResource(fabricaClass.getUsuarioLogeado().getUrlCancionAlarma());
            ac =  alarmaAplet.newAudioClip(url);
            ac.loop();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private void eliminarPendiente(PendienteClass pendiente)
    {
        int confirmar = JOptionPane.showConfirmDialog(this, (String)"¿Seguro que desea eliminar el pendiente " + pendiente.getNombre() + "?" , "¡Atención!", 2, 2);
        if(confirmar==0)
        {
            
            fabricaClass.getUsuarioLogeado().getPendientes().remove(pendiente);
            fabricaClass.serializarDatos();
            //aqui debe ir algo
            cerrar();
        }
        else return;
    }
    public void cerrar()
    {
        ac.stop();
        this.dispose();
        new frmPrincipal().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMarcar;
    private javax.swing.JButton btnPosponer;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblQue;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblYaPaso;
    private javax.swing.JPanel pnlLogIn;
    // End of variables declaration//GEN-END:variables
}
