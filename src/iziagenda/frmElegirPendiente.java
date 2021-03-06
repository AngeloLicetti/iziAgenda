/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iziagenda;

/**
 *
 * @author Angelo
 */
public class frmElegirPendiente extends javax.swing.JFrame {

    /**
     * Creates new form frmElegirPendiente
     */
    public frmElegirPendiente()
    {
        initComponents();
        extraClass.centrarFrame(this);
        
        colorearBotones();
    }

    public void colorearBotones()
    {
        btnTarea.setBackground(fabricaClass.getUsuarioLogeado().getColorTarea());
        btnExamen.setBackground(fabricaClass.getUsuarioLogeado().getColorExamen());
        btnEvento.setBackground(fabricaClass.getUsuarioLogeado().getColorEvento());
        btnRecordatorio.setBackground(fabricaClass.getUsuarioLogeado().getColorRecordatorio());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        pnlPendientes = new javax.swing.JPanel();
        btnEvento = new javax.swing.JButton();
        btnTarea = new javax.swing.JButton();
        btnExamen = new javax.swing.JButton();
        btnRecordatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlContenedor.setBackground(new java.awt.Color(0, 153, 255));
        pnlContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnCancelar.setBackground(new java.awt.Color(37, 116, 169));
        btnCancelar.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        pnlPendientes.setBackground(new java.awt.Color(0, 153, 255));
        pnlPendientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        btnEvento.setBackground(new java.awt.Color(37, 116, 169));
        btnEvento.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        btnEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnEvento.setText("Evento");
        btnEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventoActionPerformed(evt);
            }
        });

        btnTarea.setBackground(new java.awt.Color(37, 116, 169));
        btnTarea.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        btnTarea.setForeground(new java.awt.Color(255, 255, 255));
        btnTarea.setText("Tarea");
        btnTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTareaActionPerformed(evt);
            }
        });

        btnExamen.setBackground(new java.awt.Color(37, 116, 169));
        btnExamen.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        btnExamen.setForeground(new java.awt.Color(255, 255, 255));
        btnExamen.setText("Examen");
        btnExamen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamenActionPerformed(evt);
            }
        });

        btnRecordatorio.setBackground(new java.awt.Color(37, 116, 169));
        btnRecordatorio.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        btnRecordatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnRecordatorio.setText("Recordatorio");
        btnRecordatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecordatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPendientesLayout = new javax.swing.GroupLayout(pnlPendientes);
        pnlPendientes.setLayout(pnlPendientesLayout);
        pnlPendientesLayout.setHorizontalGroup(
            pnlPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPendientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPendientesLayout.createSequentialGroup()
                        .addComponent(btnTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPendientesLayout.createSequentialGroup()
                        .addComponent(btnEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRecordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlPendientesLayout.setVerticalGroup(
            pnlPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPendientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTareaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmAgregarTarea().setVisible(true);
    }//GEN-LAST:event_btnTareaActionPerformed

    private void btnEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmAgregarEvento().setVisible(true);
    }//GEN-LAST:event_btnEventoActionPerformed

    private void btnRecordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordatorioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmAgregarRecordatorio().setVisible(true);
    }//GEN-LAST:event_btnRecordatorioActionPerformed

    private void btnExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamenActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmAgregarExamen().setVisible(true);
    }//GEN-LAST:event_btnExamenActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmPrincipal().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(frmElegirPendiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmElegirPendiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmElegirPendiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmElegirPendiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmElegirPendiente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEvento;
    private javax.swing.JButton btnExamen;
    private javax.swing.JButton btnRecordatorio;
    private javax.swing.JButton btnTarea;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlPendientes;
    // End of variables declaration//GEN-END:variables
}
