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
public class frmAgregarEvento extends javax.swing.JFrame {

    boolean volverDia=false;
    GregorianCalendar gg;
    GregorianCalendar fecha;
    GregorianCalendar hoy = new GregorianCalendar();
    int añoActual = hoy.get(GregorianCalendar.YEAR);
    int mesActual = hoy.get(GregorianCalendar.MONTH);
    int diaActual = hoy.get(GregorianCalendar.DAY_OF_MONTH);
    int horaActual = hoy.get(GregorianCalendar.HOUR_OF_DAY);
    int minutoActual = hoy.get(GregorianCalendar.MINUTE);
    String [] mesesDelAño = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"};
    /**
     * Creates new form frmAgregarEvento
     */
    public frmAgregarEvento()
    {
        initComponents();
        extraClass.centrarFrame(this);
        generarAños();
        generarRubrosUsados();
    }
    
    public frmAgregarEvento(GregorianCalendar gg)
    {
        initComponents();
        extraClass.centrarFrame(this);
        generarAños();
        generarRubrosUsados();
        
        this.gg=gg;
        
        volverDia=true;
        
        setValores();
    }

    public void setValores()
    {
        cbAño.setSelectedItem(String.valueOf(gg.get(GregorianCalendar.YEAR)));
        cbMes.setSelectedItem(mesesDelAño[gg.get(GregorianCalendar.MONTH)]);
        
        int d = gg.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(d);
        
        String nombreDelDia = fabricaClass.diaDeLaSemana(gg.get(GregorianCalendar.DAY_OF_WEEK));
        String numeroDelDia = (String.valueOf(d).length()==1)?"0"+String.valueOf(d):String.valueOf(d);
        cbDia.setSelectedItem(numeroDelDia + "      (" + nombreDelDia + ")");
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
        btnAgregar = new javax.swing.JButton();
        lblContraseña1 = new javax.swing.JLabel();
        lblCorreo1 = new javax.swing.JLabel();
        cbImportancia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDetalles = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();
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
        lblLugar = new javax.swing.JLabel();
        txtLugar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 800));
        setMinimumSize(new java.awt.Dimension(400, 800));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContenerdor.setBackground(new java.awt.Color(0, 153, 204));
        pnlContenerdor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblLogIn.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        lblLogIn.setForeground(new java.awt.Color(255, 255, 255));
        lblLogIn.setText("Nuevo evento");

        lblCorreo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Nombre del evento:");

        txtNombre.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblContraseña.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Para cuándo es (aaaa/mm/dd):");

        btnAgregar.setBackground(new java.awt.Color(37, 116, 169));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblContraseña1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblContraseña1.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña1.setText("Detalles (opcional)");

        lblCorreo1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCorreo1.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo1.setText("Importancia (del 1 al 10):");

        cbImportancia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbImportancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));

        txaDetalles.setColumns(20);
        txaDetalles.setRows(5);
        jScrollPane1.setViewportView(txaDetalles);

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

        lblContraseña2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblContraseña2.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña2.setText("Rubro / curso:");

        cbAño.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbAño.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAñoItemStateChanged(evt);
            }
        });

        cbMes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMesItemStateChanged(evt);
            }
        });

        cbDia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbDia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDiaItemStateChanged(evt);
            }
        });

        rbUsado.setBackground(new java.awt.Color(0, 153, 204));
        bgRubro.add(rbUsado);
        rbUsado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbUsado.setForeground(new java.awt.Color(255, 255, 255));
        rbUsado.setSelected(true);
        rbUsado.setText("Usado antes:");
        rbUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUsadoActionPerformed(evt);
            }
        });

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

        txtRubroOtro.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtRubroOtro.setEnabled(false);
        txtRubroOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRubroOtroActionPerformed(evt);
            }
        });

        cbRubrosUsados.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

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

        cbMinuto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        cbHora.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "08", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cbHora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbHoraItemStateChanged(evt);
            }
        });

        lblContraseña3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblContraseña3.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña3.setText("Para cuándo es (aaaa/mm/dd):");

        lblCorreo2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCorreo2.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo2.setText(":");

        lblLugar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblLugar.setForeground(new java.awt.Color(255, 255, 255));
        lblLugar.setText("Lugar:");

        txtLugar.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlContenerdorLayout = new javax.swing.GroupLayout(pnlContenerdor);
        pnlContenerdor.setLayout(pnlContenerdorLayout);
        pnlContenerdorLayout.setHorizontalGroup(
            pnlContenerdorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblLogIn))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblCorreo))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlContenerdorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContraseña)
                    .addComponent(lblContraseña3)))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cbAño, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(rbHora)
                .addGap(15, 15, 15)
                .addComponent(cbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlContenerdorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlContenerdorLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cbMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(rbNoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblLugar))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblCorreo1))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cbImportancia, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblContraseña2))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(rbUsado)
                .addGap(7, 7, 7)
                .addComponent(cbRubrosUsados, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(rbOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtRubroOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblContraseña1))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlContenerdorLayout.setVerticalGroup(
            pnlContenerdorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenerdorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblLogIn)
                .addGap(9, 9, 9)
                .addComponent(lblCorreo)
                .addGap(7, 7, 7)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(pnlContenerdorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContraseña)
                    .addComponent(lblContraseña3))
                .addGap(7, 7, 7)
                .addGroup(pnlContenerdorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAño, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlContenerdorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo2)
                    .addComponent(cbMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(rbNoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblLugar)
                .addGap(7, 7, 7)
                .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblCorreo1)
                .addGap(7, 7, 7)
                .addComponent(cbImportancia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblContraseña2)
                .addGap(7, 7, 7)
                .addGroup(pnlContenerdorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRubrosUsados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlContenerdorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRubroOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lblContraseña1)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnAgregar)
                .addGap(25, 25, 25)
                .addComponent(btnVolver))
        );

        getContentPane().add(pnlContenerdor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        try
        {
            if(txtNombre.getText().length()==0)
            {
                txtNombre.requestFocus();
                throw new Exception ("No deje ningún campo vacío. Ingrese el nombre del evento.");
            }
            txtLugar.requestFocus();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Datos incorrectos",0);
        }
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        //cbImportancia.setSelectedIndex(cbImportancia.getSelectedIndex()-1);
        //cbImportancia.removeAllItems();
        //generarDias();
        agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
        if(this.volverDia)
        {
            frmPrincipal frmP = new frmPrincipal();
            frmP.mostrarDia(gg);
            frmP.setVisible(true);
            frmP.getBtnDia().setBackground(frmP.colorSeleccionado);
            frmP.getBtnMes().setBackground(frmP.colorDeseleccionado);
            return;
        }
        new frmElegirPendiente().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

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
                throw new Exception ("No deje ningún campo vacío. Ingrese el rubro o curso del evento.");
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

    private void txtLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarActionPerformed
        // TODO add your handling code here:
        try
        {
            if(txtLugar.getText().length()==0)
            {
                txtLugar.requestFocus();
                throw new Exception ("No deje ningún campo vacío. Ingrese el lugar del evento.");
            }
            if(rbOtro.isSelected()) txtRubroOtro.requestFocus();
            else txaDetalles.requestFocus();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Datos incorrectos",0);
        }
    }//GEN-LAST:event_txtLugarActionPerformed

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
            java.util.logging.Logger.getLogger(frmAgregarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgregarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgregarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgregarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAgregarEvento().setVisible(true);
            }
        });
    }
    
    public void agregar()
    {
        try
        {
            if(txtNombre.getText().length()==0)
            {
                txtNombre.requestFocus();
                throw new Exception ("No deje ningún campo vacío. Ingrese el nombre del evento.");
            }
            else if(txtLugar.getText().length()==0)
            {
                txtLugar.requestFocus();
                throw new Exception ("No deje ningún campo vacío. Ingrese el lugar del evento.");
            }
            else if(rbOtro.isSelected() && txtRubroOtro.getText().length()==0)
            {
                txtRubroOtro.requestFocus();
                throw new Exception ("No deje ningún campo vacío. Ingrese el rubro o curso del evento.");
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
                
                String rubro = (rbOtro.isSelected())?txtRubroOtro.getText():(String)cbRubrosUsados.getSelectedItem();
                fabricaClass.getUsuarioLogeado().agregarEvento(txtNombre.getText(), fecha,
                                                Integer.parseInt((String)cbImportancia.getSelectedItem()),
                                                rubro, txtLugar.getText(), txaDetalles.getText(), incluyeHora);
                
                if(rbOtro.isSelected()) fabricaClass.getUsuarioLogeado().getRubros().add(rubro);
                
                this.dispose();
                fabricaClass.serializarDatos();
                if(this.volverDia)
                {
                    frmPrincipal frmP = new frmPrincipal();
                    frmP.mostrarDia(fecha);
                    frmP.setVisible(true);
                    frmP.getBtnDia().setBackground(frmP.colorSeleccionado);
                    frmP.getBtnMes().setBackground(frmP.colorDeseleccionado);
                    return;
                }
                new frmPrincipal().setVisible(true);
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Datos incorrectos",0);
        }
    }

    public void generarAños()
    {
        int año = añoActual;
        for(int i = 0; i < 15; i++)
        {
            cbAño.addItem(String.valueOf(año++));
        }
    }
    
    public void generarMeses()
    {
        cbMes.removeAllItems();
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
    
    public void generarDias()
    {
        cbDia.removeAllItems();
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
    
    public void generarHoras()
    {
        cbHora.removeAllItems();
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
    
    public void generarMinutos()
    {
        cbMinuto.removeAllItems();
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
        diaActual = hoy.get(GregorianCalendar.DAY_OF_MONTH);
        horaActual = hoy.get(GregorianCalendar.HOUR_OF_DAY);
        minutoActual = hoy.get(GregorianCalendar.MINUTE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgHora;
    private javax.swing.ButtonGroup bgRubro;
    private javax.swing.JButton btnAgregar;
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
    private javax.swing.JLabel lblLugar;
    private javax.swing.JPanel pnlContenerdor;
    private javax.swing.JRadioButton rbHora;
    private javax.swing.JRadioButton rbNoHora;
    private javax.swing.JRadioButton rbOtro;
    private javax.swing.JRadioButton rbUsado;
    private javax.swing.JTextArea txaDetalles;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRubroOtro;
    // End of variables declaration//GEN-END:variables
}