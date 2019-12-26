/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iziagenda;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class frmEditarRecordatorio extends javax.swing.JFrame {

    GregorianCalendar fecha;
    GregorianCalendar hoy = new GregorianCalendar();
    int añoActual = hoy.get(GregorianCalendar.YEAR);
    int mesActual = hoy.get(GregorianCalendar.MONTH);
    int diaActual = hoy.get(GregorianCalendar.DAY_OF_MONTH);
    int horaActual = hoy.get(GregorianCalendar.HOUR_OF_DAY);
    int minutoActual = hoy.get(GregorianCalendar.MINUTE);
    String [] mesesDelAño = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"};
    
    public PendienteClass pendiente;

    
    GregorianCalendar fechaPadre;
    /**
     * Creates new form frmEditarRecordatorio
     */
    public frmEditarRecordatorio(){}
    
    public frmEditarRecordatorio(PendienteClass pendiente, GregorianCalendar fechaPadre)
    {
        initComponents();
        extraClass.centrarFrame(this);
        
        this.pendiente=pendiente;
        this.fechaPadre=fechaPadre;
        
        generarAños();
        generarRubrosUsados();
        
        if(pendiente.getTieneHora()==true)
        {
            rbHora.setSelected(true);
            rbNoHora.setSelected(false);
        }
        else if (pendiente.getTieneHora()==false)
        {
            rbHora.setSelected(false);
            rbNoHora.setSelected(true);
        }
        
        if(pendiente.getHecho()==true)
        {
            if(pendiente.getTieneHora()==true)
            {
                rbNoHora.setEnabled(false);
            }
            else
            {
                rbHora.setEnabled(false);
            }
        }
        setValores();
    }
    
    public PendienteClass getPendiente() {
        return pendiente;
    }

    public void setPendiente(PendienteClass pendiente) {
        this.pendiente = pendiente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgRubro = new javax.swing.ButtonGroup();
        bgHora = new javax.swing.ButtonGroup();
        pnlContenerdor = new javax.swing.JPanel();
        lblLogIn = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        lblContraseña1 = new javax.swing.JLabel();
        lblCorreo1 = new javax.swing.JLabel();
        cbImportancia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDetalles = new javax.swing.JTextArea();
        lblContraseña2 = new javax.swing.JLabel();
        cbAño = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        cbDia = new javax.swing.JComboBox<>();
        rbUsado = new javax.swing.JRadioButton();
        rbOtro = new javax.swing.JRadioButton();
        txtRubroOtro = new javax.swing.JTextField();
        cbRubrosUsados = new javax.swing.JComboBox<>();
        rbHora = new javax.swing.JRadioButton();
        rbNoHora = new javax.swing.JRadioButton();
        cbMinuto = new javax.swing.JComboBox<>();
        cbHora = new javax.swing.JComboBox<>();
        lblContraseña3 = new javax.swing.JLabel();
        lblCorreo2 = new javax.swing.JLabel();
        rbNoIncluirRubro = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 790));
        setMinimumSize(new java.awt.Dimension(400, 790));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContenerdor.setBackground(new java.awt.Color(0, 153, 204));
        pnlContenerdor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnlContenerdor.setMaximumSize(new java.awt.Dimension(400, 790));
        pnlContenerdor.setMinimumSize(new java.awt.Dimension(400, 790));
        pnlContenerdor.setPreferredSize(new java.awt.Dimension(400, 790));
        pnlContenerdor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogIn.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        lblLogIn.setForeground(new java.awt.Color(255, 255, 255));
        lblLogIn.setText("Editar recordatorio");
        pnlContenerdor.add(lblLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Nombre del recordatorio:");
        pnlContenerdor.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txtNombre.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlContenerdor.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 321, -1));

        lblContraseña.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Para cuándo es (aaaa/mm/dd):");
        pnlContenerdor.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lblContraseña1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblContraseña1.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña1.setText("Detalles (opcional)");
        pnlContenerdor.add(lblContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        lblCorreo1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCorreo1.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo1.setText("Importancia (del 1 al 10):");
        pnlContenerdor.add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        cbImportancia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbImportancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        pnlContenerdor.add(cbImportancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 320, 30));

        txaDetalles.setColumns(20);
        txaDetalles.setRows(5);
        jScrollPane1.setViewportView(txaDetalles);

        pnlContenerdor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 320, 110));

        lblContraseña2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblContraseña2.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña2.setText("Rubro / curso:");
        pnlContenerdor.add(lblContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        cbAño.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbAño.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAñoItemStateChanged(evt);
            }
        });
        pnlContenerdor.add(cbAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 30));

        cbMes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMesItemStateChanged(evt);
            }
        });
        pnlContenerdor.add(cbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, 30));

        cbDia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbDia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDiaItemStateChanged(evt);
            }
        });
        pnlContenerdor.add(cbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 130, 30));

        rbUsado.setBackground(new java.awt.Color(0, 153, 204));
        bgRubro.add(rbUsado);
        rbUsado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbUsado.setForeground(new java.awt.Color(255, 255, 255));
        rbUsado.setText("Usado antes:");
        rbUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUsadoActionPerformed(evt);
            }
        });
        pnlContenerdor.add(rbUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, 28));

        rbOtro.setBackground(new java.awt.Color(0, 153, 204));
        bgRubro.add(rbOtro);
        rbOtro.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbOtro.setForeground(new java.awt.Color(255, 255, 255));
        rbOtro.setText("Otro:");
        rbOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOtroActionPerformed(evt);
            }
        });
        pnlContenerdor.add(rbOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 140, 28));

        txtRubroOtro.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtRubroOtro.setEnabled(false);
        txtRubroOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRubroOtroActionPerformed(evt);
            }
        });
        pnlContenerdor.add(txtRubroOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 170, -1));

        cbRubrosUsados.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbRubrosUsados.setEnabled(false);
        pnlContenerdor.add(cbRubrosUsados, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 170, 30));

        rbHora.setBackground(new java.awt.Color(0, 153, 204));
        bgHora.add(rbHora);
        rbHora.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbHora.setForeground(new java.awt.Color(255, 255, 255));
        rbHora.setSelected(true);
        rbHora.setText("Hora:");
        rbHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHoraActionPerformed(evt);
            }
        });
        pnlContenerdor.add(rbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 28));

        rbNoHora.setBackground(new java.awt.Color(0, 153, 204));
        bgHora.add(rbNoHora);
        rbNoHora.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbNoHora.setForeground(new java.awt.Color(255, 255, 255));
        rbNoHora.setText("No incluír hora");
        rbNoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoHoraActionPerformed(evt);
            }
        });
        pnlContenerdor.add(rbNoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, 28));

        cbMinuto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        pnlContenerdor.add(cbMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 100, 30));

        cbHora.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "08", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cbHora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbHoraItemStateChanged(evt);
            }
        });
        pnlContenerdor.add(cbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, 30));

        lblContraseña3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblContraseña3.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña3.setText("Para cuándo es (aaaa/mm/dd):");
        pnlContenerdor.add(lblContraseña3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lblCorreo2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCorreo2.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo2.setText(":");
        pnlContenerdor.add(lblCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 50, -1));

        rbNoIncluirRubro.setBackground(new java.awt.Color(0, 153, 204));
        bgRubro.add(rbNoIncluirRubro);
        rbNoIncluirRubro.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbNoIncluirRubro.setForeground(new java.awt.Color(255, 255, 255));
        rbNoIncluirRubro.setSelected(true);
        rbNoIncluirRubro.setText("No incluir rubro");
        rbNoIncluirRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoIncluirRubroActionPerformed(evt);
            }
        });
        pnlContenerdor.add(rbNoIncluirRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 160, 28));

        btnGuardar.setBackground(new java.awt.Color(37, 116, 169));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlContenerdor.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 320, -1));

        btnVolver.setBackground(new java.awt.Color(37, 116, 169));
        btnVolver.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        pnlContenerdor.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 740, 320, -1));

        getContentPane().add(pnlContenerdor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        try
        {
            if(txtNombre.getText().length()==0)
            {
                txtNombre.requestFocus();
                throw new Exception ("No deje ningún campo vacío. Ingrese el nombre del recordatorio.");
            }
            if(rbOtro.isSelected()) txtRubroOtro.requestFocus();
            else txaDetalles.requestFocus();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Datos incorrectos",0);
        }
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cbAñoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAñoItemStateChanged
        // TODO add your handling code here:
        actualizarTiempo();
        if(evt.getStateChange()==1){generarMeses();}
    }//GEN-LAST:event_cbAñoItemStateChanged

    private void cbMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMesItemStateChanged
        // TODO add your handling code here:
        actualizarTiempo();
        if(evt.getStateChange()==1){generarDias();}
    }//GEN-LAST:event_cbMesItemStateChanged

    private void cbDiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDiaItemStateChanged
        // TODO add your handling code here:
        actualizarTiempo();
        if(evt.getStateChange()==1){generarHoras();}
    }//GEN-LAST:event_cbDiaItemStateChanged

    private void rbUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUsadoActionPerformed
        // TODO add your handling code here:
        txtRubroOtro.setEnabled(false);
        cbRubrosUsados.setEnabled(true);
        cbRubrosUsados.requestFocus();
    }//GEN-LAST:event_rbUsadoActionPerformed

    private void rbOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOtroActionPerformed
        // TODO add your handling code here:
        cbRubrosUsados.setEnabled(false);
        txtRubroOtro.setEnabled(true);
        txtRubroOtro.requestFocus();
    }//GEN-LAST:event_rbOtroActionPerformed

    private void txtRubroOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRubroOtroActionPerformed
        // TODO add your handling code here:
        try
        {
            if(txtRubroOtro.getText().length()==0)
            {
                txtRubroOtro.requestFocus();
                throw new Exception ("No deje ningún campo vacío. Ingrese el rubro o curso del recordatorio.");
            }
            txaDetalles.requestFocus();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Datos incorrectos",0);
        }
    }//GEN-LAST:event_txtRubroOtroActionPerformed

    private void rbHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHoraActionPerformed
        // TODO add your handling code here:
        cbHora.setEnabled(true);
        cbMinuto.setEnabled(true);
    }//GEN-LAST:event_rbHoraActionPerformed

    private void rbNoHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoHoraActionPerformed
        // TODO add your handling code here:
        cbHora.setEnabled(false);
        cbMinuto.setEnabled(false);
    }//GEN-LAST:event_rbNoHoraActionPerformed

    private void cbHoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbHoraItemStateChanged
        // TODO add your handling code here:
        actualizarTiempo();
        if(evt.getStateChange()==1){generarMinutos();}
    }//GEN-LAST:event_cbHoraItemStateChanged

    private void rbNoIncluirRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoIncluirRubroActionPerformed
        // TODO add your handling code here:
        txtRubroOtro.setEnabled(false);
        cbRubrosUsados.setEnabled(false);
    }//GEN-LAST:event_rbNoIncluirRubroActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        //cbImportancia.setSelectedIndex(cbImportancia.getSelectedIndex()-1);
        //cbImportancia.removeAllItems();
        //generarDias();
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmPrincipal frmP = new frmPrincipal();
        frmP.mostrarDia(fechaPadre);
        frmP.getBtnDia().setBackground(frmP.colorSeleccionado);
        frmP.getBtnMes().setBackground(frmP.colorDeseleccionado);
        frmP.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(frmEditarRecordatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEditarRecordatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEditarRecordatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEditarRecordatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEditarRecordatorio().setVisible(true);
            }
        });
    }

    public void guardar()
    {
        try
        {
            if(txtNombre.getText().length()==0)
            {
                txtNombre.requestFocus();
                throw new Exception ("No deje ningún campo vacío. Ingrese el nombre del recordatorio.");
            }
            else if(rbOtro.isSelected() && txtRubroOtro.getText().length()==0)
            {
                txtRubroOtro.requestFocus();
                throw new Exception ("No deje ningún campo vacío. Ingrese el rubro o curso del recordatorio.");
            }
            else
            {
                String dia = String.valueOf(cbDia.getSelectedItem()).substring(0,2);
                int hora = (rbNoHora.isSelected())?0:Integer.parseInt((String)cbHora.getSelectedItem());
                int minuto = (rbNoHora.isSelected())?0:Integer.parseInt((String)cbMinuto.getSelectedItem());
                Boolean incluyeHora = (rbNoHora.isSelected())?false:true;
                fecha = new GregorianCalendar(Integer.parseInt((String)cbAño.getSelectedItem()),
                                                getIndexOfMesDelAño((String)cbMes.getSelectedItem()),
                                                Integer.parseInt(dia),hora,minuto);
                
                String rubro = "";
                if(rbNoIncluirRubro.isSelected())rubro="";
                else rubro = (rbOtro.isSelected())?txtRubroOtro.getText():(String)cbRubrosUsados.getSelectedItem();
                
                //CAMBIAR ESTA PARTE!!!:
                ((RecordatorioClass)pendiente).cambiarDatos(txtNombre.getText(), fecha,
                                                Integer.parseInt((String)cbImportancia.getSelectedItem()),
                                                rubro, txaDetalles.getText(), incluyeHora);
                
                if(rbOtro.isSelected()) fabricaClass.getUsuarioLogeado().getRubros().add(rubro);
                
                
                this.dispose();
                fabricaClass.serializarDatos();
                
                frmPrincipal frmP = new frmPrincipal();
                frmP.mostrarDia(fechaPadre);
                frmP.getBtnDia().setBackground(frmP.colorSeleccionado);
                frmP.getBtnMes().setBackground(frmP.colorDeseleccionado);
                
                frmP.setVisible(true);
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Datos incorrectos",0);
        }
    }

    public void generarAños()
    {
        if(pendiente.getHecho()==true)
        {
            int año = pendiente.getParaCuando().get(GregorianCalendar.YEAR);
            cbAño.addItem(String.valueOf(año));
            cbAño.setEnabled(false);
        }
        else if(pendiente.getHecho()==false)
        {
            int año = añoActual;
            for(int i = 0; i < 15; i++)
            {
                cbAño.addItem(String.valueOf(año++));
            }
        }
        
    }
    
    public void generarMeses()
    {
        cbMes.removeAllItems();
        
        if(pendiente.getHecho()==true)
        {
            for(String mes : mesesDelAño)
            {
                cbMes.addItem(mes);
            }
            cbMes.setEnabled(false);
        }
        else if(pendiente.getHecho()==false)
        {
            if(Integer.parseInt((String)cbAño.getSelectedItem())==añoActual)
            {
                for(int i = mesActual; i<12; i++)
                {
                    cbMes.addItem(mesesDelAño[i]);
                }
            }
            else
            {
                for(String mes : mesesDelAño)
                {
                    cbMes.addItem(mes);
                }
            }
        }
            
    }
    
    public void generarDias()
    {
        cbDia.removeAllItems();
        
        if(pendiente.getHecho()==true)
        {
            GregorianCalendar gc = new GregorianCalendar(Integer.parseInt((String)cbAño.getSelectedItem()),getIndexOfMesDelAño((String)cbMes.getSelectedItem()),1,0,0);
            int diaMaximo = gc.getActualMaximum(Calendar.DAY_OF_MONTH);

            int diaInicial=1;
            
            for(int i = diaInicial; i <= diaMaximo; i++)
            {
                int año = Integer.parseInt((String)cbAño.getSelectedItem());
                int mes = getIndexOfMesDelAño((String)cbMes.getSelectedItem());
                String nombreDelDia = fabricaClass.diaDeLaSemana(new GregorianCalendar(año,mes,i).get(GregorianCalendar.DAY_OF_WEEK));
                String numeroDelDia = (String.valueOf(i).length()==1)?"0"+String.valueOf(i):String.valueOf(i);
                cbDia.addItem(numeroDelDia + "      (" + nombreDelDia + ")");
            }
            cbDia.setEnabled(false);
        }
        else if(pendiente.getHecho()==false)
        {
            GregorianCalendar gc = new GregorianCalendar(Integer.parseInt((String)cbAño.getSelectedItem()),getIndexOfMesDelAño((String)cbMes.getSelectedItem()),1,0,0);
            int diaMaximo = gc.getActualMaximum(Calendar.DAY_OF_MONTH);

            int diaInicial=1;
            if(Integer.parseInt((String)cbAño.getSelectedItem()) == añoActual && getIndexOfMesDelAño((String)cbMes.getSelectedItem())==mesActual)
            {
                diaInicial = diaActual;
            }
            for(int i = diaInicial; i <= diaMaximo; i++)
            {
                int año = Integer.parseInt((String)cbAño.getSelectedItem());
                int mes = getIndexOfMesDelAño((String)cbMes.getSelectedItem());
                String nombreDelDia = fabricaClass.diaDeLaSemana(new GregorianCalendar(año,mes,i).get(GregorianCalendar.DAY_OF_WEEK));
                String numeroDelDia = (String.valueOf(i).length()==1)?"0"+String.valueOf(i):String.valueOf(i);
                cbDia.addItem(numeroDelDia + "      (" + nombreDelDia + ")");
            }
        }
            
    }
    
    public void generarHoras()
    {
        cbHora.removeAllItems();
        
        if(pendiente.getHecho()==true)
        {
            int horaInicial=0;
            for(int i = horaInicial; i <= 23; i++)
            {
                String hora = (String.valueOf(i).length()==1)?"0"+String.valueOf(i):String.valueOf(i);
                cbHora.addItem(hora);
            }
            cbHora.setEnabled(false);
        }
        else if(pendiente.getHecho()==false)
        {
            int horaInicial=0;
            if(Integer.parseInt((String)cbAño.getSelectedItem()) == añoActual && 
                    getIndexOfMesDelAño((String)cbMes.getSelectedItem())==mesActual &&
                    Integer.parseInt(String.valueOf(cbDia.getSelectedItem()).substring(0,2)) == diaActual)
            {
                horaInicial = horaActual;
            }
            for(int i = horaInicial; i <= 23; i++)
            {
                String hora = (String.valueOf(i).length()==1)?"0"+String.valueOf(i):String.valueOf(i);
                cbHora.addItem(hora);
            }  
        }
    }
    
    public void generarMinutos()
    {
        cbMinuto.removeAllItems();
        
        if(pendiente.getHecho()==true)
        {
            int minutoInicial=0;
            for(int i = minutoInicial; i <= 59; i++)
            {
                String minuto = (String.valueOf(i).length()==1)?"0"+String.valueOf(i):String.valueOf(i);
                cbMinuto.addItem(minuto);
            }
            cbMinuto.setEnabled(false);
        }
        else if(pendiente.getHecho()==false)
        {
            int minutoInicial=0;
            if(Integer.parseInt((String)cbAño.getSelectedItem()) == añoActual && 
                    getIndexOfMesDelAño((String)cbMes.getSelectedItem())==mesActual &&
                    Integer.parseInt(String.valueOf(cbDia.getSelectedItem()).substring(0,2)) == diaActual &&
                    Integer.parseInt((String)cbHora.getSelectedItem())== horaActual)
            {
                minutoInicial = minutoActual+1;
            }
            for(int i = minutoInicial; i <= 59; i++)
            {
                String minuto = (String.valueOf(i).length()==1)?"0"+String.valueOf(i):String.valueOf(i);
                cbMinuto.addItem(minuto);
            }
        }
    }
    
    public int getIndexOfMesDelAño(String mes)
    {
        switch (mes)
        {
            case "Enero": {return 0;}
            case "Febrero": {return 1;}
            case "Marzo": {return 2;}
            case "Abril": {return 3;}
            case "Mayo": {return 4;}
            case "Junio": {return 5;}
            case "Julio": {return 6;}
            case "Agosto": {return 7;}
            case "Setiembre": {return 8;}
            case "Octubre": {return 9;}
            case "Noviembre": {return 10;}
            case "Diciembre": {return 11;}
            
            default : {return 0;}
        }
    }
    
    public void generarRubrosUsados()
    {
        if(fabricaClass.getUsuarioLogeado().getRubros().size()==0)
        {
            rbOtro.setSelected(true);
            rbUsado.setEnabled(false);
            cbRubrosUsados.setEnabled(false);
            txtRubroOtro.setEnabled(true);
        }
        else
        {
            for(String rubro : fabricaClass.getUsuarioLogeado().getRubros())
            {
                cbRubrosUsados.addItem(rubro);
            }
        }
    }
    
    public void actualizarTiempo()
    {
        hoy = new GregorianCalendar();
        añoActual = hoy.get(GregorianCalendar.YEAR);
        mesActual = hoy.get(GregorianCalendar.MONTH);
        System.out.println(mesActual);
        diaActual = hoy.get(GregorianCalendar.DAY_OF_MONTH);
        horaActual = hoy.get(GregorianCalendar.HOUR_OF_DAY);
        minutoActual = hoy.get(GregorianCalendar.MINUTE);
    }
    
    public void setValores()
    {
        //FALTA SETEAR TODO ESTO!
        txtNombre.setText(pendiente.getNombre());
        
        cbAño.setSelectedItem(String.valueOf(pendiente.getParaCuando().get(GregorianCalendar.YEAR)));
        cbMes.setSelectedItem(mesesDelAño[pendiente.getParaCuando().get(GregorianCalendar.MONTH)]);
        
        int d = pendiente.getParaCuando().get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(d);
        String nombreDelDia = fabricaClass.diaDeLaSemana(pendiente.getParaCuando().get(GregorianCalendar.DAY_OF_WEEK));
        String numeroDelDia = (String.valueOf(d).length()==1)?"0"+String.valueOf(d):String.valueOf(d);
        cbDia.setSelectedItem(numeroDelDia + "      (" + nombreDelDia + ")");
        
        //holi
        if(pendiente.getTieneHora()==true)
        {
            int h = pendiente.getParaCuando().get(GregorianCalendar.HOUR_OF_DAY);
            String hora = (String.valueOf(h).length()==1)?"0"+String.valueOf(h):String.valueOf(h);
            cbHora.setSelectedItem(hora);
        
            int m = pendiente.getParaCuando().get(GregorianCalendar.MINUTE);
            String min = (String.valueOf(m).length()==1)?"0"+String.valueOf(m):String.valueOf(m);
            cbMinuto.setSelectedItem(min);
        }
        else
        {
            rbNoHora.setSelected(true);
            cbHora.setEnabled(false);
            cbMinuto.setEnabled(false);
        }
        
        
        cbImportancia.setSelectedIndex(pendiente.getImportancia()-1);
        
        if(pendiente.getRubro()!="")
        {
            rbUsado.setSelected(true);
            txtRubroOtro.setEnabled(false);
            cbRubrosUsados.setEnabled(true);
            cbRubrosUsados.requestFocus();
            cbRubrosUsados.setSelectedItem(pendiente.getRubro());
        }
        else
        {
            rbNoIncluirRubro.setSelected(true);
            txtRubroOtro.setEnabled(false);
            cbRubrosUsados.setEnabled(false);
        }
        
        txaDetalles.setText(pendiente.getDetalles());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgHora;
    private javax.swing.ButtonGroup bgRubro;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbAño;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbHora;
    private javax.swing.JComboBox<String> cbImportancia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbMinuto;
    private javax.swing.JComboBox<String> cbRubrosUsados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblContraseña1;
    private javax.swing.JLabel lblContraseña2;
    private javax.swing.JLabel lblContraseña3;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblCorreo2;
    private javax.swing.JLabel lblLogIn;
    private javax.swing.JPanel pnlContenerdor;
    private javax.swing.JRadioButton rbHora;
    private javax.swing.JRadioButton rbNoHora;
    private javax.swing.JRadioButton rbNoIncluirRubro;
    private javax.swing.JRadioButton rbOtro;
    private javax.swing.JRadioButton rbUsado;
    private javax.swing.JTextArea txaDetalles;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRubroOtro;
    // End of variables declaration//GEN-END:variables
}