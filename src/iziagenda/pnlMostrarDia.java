/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iziagenda;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Angelo
 */
public class pnlMostrarDia extends javax.swing.JPanel {

    List pendientes;
    GregorianCalendar fecha;
    int año, mes, dia;
    
    GregorianCalendar diaMostrado;
    
    frmPrincipal formPadre;
    /**
     * Creates new form pnlMostrarDia
     */
    public pnlMostrarDia(List pendientes, GregorianCalendar gc, frmPrincipal formPadre)
    {
        initComponents();
        this.pendientes = pendientes;
        fecha = gc;
        //llenarAños();
        generarDias();
        establecerDia();
        actualizarPendientes();
        
        colorearBotones();
        
        this.formPadre=formPadre;
        
    }
    
    public void colorearBotones()
    {
        btnTarea.setBackground(fabricaClass.getUsuarioLogeado().getColorTarea());
        btnExamen.setBackground(fabricaClass.getUsuarioLogeado().getColorExamen());
        btnEvento.setBackground(fabricaClass.getUsuarioLogeado().getColorEvento());
        btnRecordatorio.setBackground(fabricaClass.getUsuarioLogeado().getColorRecordatorio());
    }
    
    public void generarDias()
    {
        int indexDiaSeleccionado = cbDia.getSelectedIndex();
        cbDia.removeAllItems();
        GregorianCalendar gc = new GregorianCalendar(Integer.parseInt((String)cbAño.getSelectedItem()),cbMes.getSelectedIndex(),1);
        int diaMaximo = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        for(int i = 1; i<=diaMaximo;i++)
        {
            String nombreDelDia = fabricaClass.diaDeLaSemana(new GregorianCalendar(año,mes,i).get(GregorianCalendar.DAY_OF_WEEK));
            String numeroDelDia = (String.valueOf(i).length()==1)?"0"+String.valueOf(i):String.valueOf(i);
            cbDia.addItem(numeroDelDia + "      (" + nombreDelDia + ")");
        }
        
        if(indexDiaSeleccionado<diaMaximo) cbDia.setSelectedIndex(indexDiaSeleccionado);
        else cbDia.setSelectedIndex(diaMaximo-1);
    }
    
    public void llenarAños()
    {
        GregorianCalendar g = new GregorianCalendar();
        int año = g.get(GregorianCalendar.YEAR);
        for(int i = 0; i < 40; i++)
        {
            cbAño.addItem(String.valueOf(año++));
        }
    }
    
    public void actualizarPendientes()
    {
        int n=0;
        
        pnlPendientesDia.removeAll();
        pnlPendientesDiaHechos.removeAll();
        año = Integer.parseInt((String)cbAño.getSelectedItem());
        mes = cbMes.getSelectedIndex();
        dia = cbDia.getSelectedIndex()+1;
        
        diaMostrado = new GregorianCalendar(año,mes,dia);
        
        System.out.println(diaMostrado.getTime());
        for(PendienteClass pendiente : fabricaClass.getUsuarioLogeado().getPendientes())
        {
            if(fabricaClass.compararFechas(diaMostrado, pendiente.getParaCuando()))
            {
                n++;
                pnlPendiente panel = new pnlPendiente(pendiente);
                
                panel.addMouseListener(new java.awt.event.MouseAdapter()
                {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt)
                    {
                        pendienteSeleccionadoMouseClicked(pendiente, fecha);
                    }
                }
                );
                
                ((pnlPendiente)(panel)).getBtnEliminar().addMouseListener(new java.awt.event.MouseAdapter()
                {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt)
                    {
                        eliminarPendiente(pendiente);
                    }
                }
                );
                
                ((pnlPendiente)(panel)).getCbHecho().addItemListener(new java.awt.event.ItemListener()
                {
                    @Override
                    public void itemStateChanged(java.awt.event.ItemEvent ie)
                    {
                        
                        cambiarCheckBox(pendiente);
                    }
                }
                );
                
                if(panel.getPendiente().getHecho()==true)
                {
                    pnlPendientesDiaHechos.add(panel);
                }
                else if(panel.getPendiente().getHecho()==false)
                {
                    pnlPendientesDia.add(panel);
                }
            }
        }
        if(n==0)
        {
           pnlPendientesDia.add(new pnlDiaSinPendientes());
            pnlPendientesDiaHechos.add(new pnlDiaSinPedientes2());
        }
        pnlPendientesDia.updateUI();
        pnlPendientesDiaHechos.updateUI();
    }
    
    public void establecerDia()
    {
        cbAño.setSelectedItem(String.valueOf(fecha.get(GregorianCalendar.YEAR)));
        cbMes.setSelectedIndex(fecha.get(GregorianCalendar.MONTH));
        cbDia.setSelectedIndex(fecha.get(GregorianCalendar.DAY_OF_MONTH)-1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFechaActual = new javax.swing.JPanel();
        lblVista = new javax.swing.JLabel();
        cbMes = new javax.swing.JComboBox<>();
        lblDel = new javax.swing.JLabel();
        cbAño = new javax.swing.JComboBox<>();
        lblVista8 = new javax.swing.JLabel();
        cbDia = new javax.swing.JComboBox<>();
        lblAñoAnt = new javax.swing.JLabel();
        lblMesAnt = new javax.swing.JLabel();
        lblAñoSig = new javax.swing.JLabel();
        lblMesSig = new javax.swing.JLabel();
        lblDiaSig = new javax.swing.JLabel();
        lblDiaAnt = new javax.swing.JLabel();
        lblVista9 = new javax.swing.JLabel();
        lblVista10 = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnSendToMail = new javax.swing.JButton();
        btnTarea = new javax.swing.JButton();
        btnExamen = new javax.swing.JButton();
        btnEvento = new javax.swing.JButton();
        btnRecordatorio = new javax.swing.JButton();
        spListaPendientes = new javax.swing.JScrollPane();
        pnlPendientesDia = new javax.swing.JPanel();
        spListaPendientesHechos = new javax.swing.JScrollPane();
        pnlPendientesDiaHechos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFechaActual.setBackground(new java.awt.Color(255, 255, 255));

        lblVista.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblVista.setText("Mes:");

        cbMes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMesItemStateChanged(evt);
            }
        });

        lblDel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblDel.setText("Año:");

        cbAño.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080" }));
        cbAño.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAñoItemStateChanged(evt);
            }
        });

        lblVista8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblVista8.setText("Día:");

        cbDia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbDia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDiaItemStateChanged(evt);
            }
        });

        lblAñoAnt.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblAñoAnt.setText("<<<");
        lblAñoAnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAñoAnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAñoAntMouseClicked(evt);
            }
        });

        lblMesAnt.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblMesAnt.setText("<<");
        lblMesAnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMesAnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesAntMouseClicked(evt);
            }
        });

        lblAñoSig.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblAñoSig.setText(">>>");
        lblAñoSig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAñoSig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAñoSigMouseClicked(evt);
            }
        });

        lblMesSig.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblMesSig.setText(">>");
        lblMesSig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMesSig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesSigMouseClicked(evt);
            }
        });

        lblDiaSig.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblDiaSig.setText(">");
        lblDiaSig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDiaSig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDiaSigMouseClicked(evt);
            }
        });

        lblDiaAnt.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblDiaAnt.setText("<");
        lblDiaAnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDiaAnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDiaAntMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlFechaActualLayout = new javax.swing.GroupLayout(pnlFechaActual);
        pnlFechaActual.setLayout(pnlFechaActualLayout);
        pnlFechaActualLayout.setHorizontalGroup(
            pnlFechaActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFechaActualLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(lblAñoAnt)
                .addGap(18, 18, 18)
                .addComponent(lblMesAnt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(lblDiaAnt)
                .addGap(18, 18, 18)
                .addComponent(lblVista8)
                .addGap(18, 18, 18)
                .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(lblVista)
                .addGap(18, 18, 18)
                .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(lblDel)
                .addGap(18, 18, 18)
                .addComponent(cbAño, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lblDiaSig)
                .addGap(18, 18, 18)
                .addComponent(lblMesSig)
                .addGap(18, 18, 18)
                .addComponent(lblAñoSig)
                .addGap(87, 87, 87))
        );
        pnlFechaActualLayout.setVerticalGroup(
            pnlFechaActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFechaActualLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFechaActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDel)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVista)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFechaActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblVista8)
                        .addComponent(lblMesAnt)
                        .addComponent(lblAñoAnt)
                        .addComponent(lblDiaAnt))
                    .addGroup(pnlFechaActualLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnlFechaActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFechaActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMesSig)
                                .addComponent(lblAñoSig)
                                .addComponent(lblDiaSig))
                            .addComponent(cbAño, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        add(pnlFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 50));

        lblVista9.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lblVista9.setForeground(new java.awt.Color(255, 255, 255));
        lblVista9.setText("CUMPLIDOS:");
        add(lblVista9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, -1, -1));

        lblVista10.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lblVista10.setForeground(new java.awt.Color(255, 255, 255));
        lblVista10.setText("PENDIENTES:");
        add(lblVista10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        pnlBotones.setBackground(new java.awt.Color(0, 153, 204));

        btnSendToMail.setBackground(new java.awt.Color(0, 153, 204));
        btnSendToMail.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        btnSendToMail.setForeground(new java.awt.Color(255, 255, 255));
        btnSendToMail.setText("Enviar a mi correo");
        btnSendToMail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnSendToMail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSendToMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendToMailActionPerformed(evt);
            }
        });

        btnTarea.setBackground(new java.awt.Color(0, 153, 204));
        btnTarea.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        btnTarea.setForeground(new java.awt.Color(255, 255, 255));
        btnTarea.setText("Tarea");
        btnTarea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTareaActionPerformed(evt);
            }
        });

        btnExamen.setBackground(new java.awt.Color(0, 153, 204));
        btnExamen.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        btnExamen.setForeground(new java.awt.Color(255, 255, 255));
        btnExamen.setText("Examen");
        btnExamen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnExamen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamenActionPerformed(evt);
            }
        });

        btnEvento.setBackground(new java.awt.Color(0, 153, 204));
        btnEvento.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        btnEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnEvento.setText("Evento");
        btnEvento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventoActionPerformed(evt);
            }
        });

        btnRecordatorio.setBackground(new java.awt.Color(0, 153, 204));
        btnRecordatorio.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        btnRecordatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnRecordatorio.setText("Recordatorio");
        btnRecordatorio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnRecordatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecordatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRecordatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSendToMail, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRecordatorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExamen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSendToMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 1180, 110));

        spListaPendientes.setBorder(null);
        spListaPendientes.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlPendientesDia.setBackground(new java.awt.Color(255, 255, 255));
        pnlPendientesDia.setLayout(new javax.swing.BoxLayout(pnlPendientesDia, javax.swing.BoxLayout.Y_AXIS));
        spListaPendientes.setViewportView(pnlPendientesDia);

        add(spListaPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 580, 360));

        spListaPendientesHechos.setBorder(null);
        spListaPendientesHechos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlPendientesDiaHechos.setBackground(new java.awt.Color(255, 255, 255));
        pnlPendientesDiaHechos.setLayout(new javax.swing.BoxLayout(pnlPendientesDiaHechos, javax.swing.BoxLayout.Y_AXIS));
        spListaPendientesHechos.setViewportView(pnlPendientesDiaHechos);

        add(spListaPendientesHechos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 580, 360));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 20, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void cbAñoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAñoItemStateChanged
        // TODO add your handling code here:
        generarDias();
        actualizarPendientes();
    }//GEN-LAST:event_cbAñoItemStateChanged

    private void cbMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMesItemStateChanged
        // TODO add your handling code here:
        generarDias();
        actualizarPendientes();
    }//GEN-LAST:event_cbMesItemStateChanged

    private void cbDiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDiaItemStateChanged
        // TODO add your handling code here:
        actualizarPendientes();
    }//GEN-LAST:event_cbDiaItemStateChanged

    private void btnSendToMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendToMailActionPerformed
        // TODO add your handling code here:
        try
        {
            int n = 0;
            for(PendienteClass pendiente : fabricaClass.getUsuarioLogeado().getPendientes())
            {
                if(fabricaClass.compararFechas(diaMostrado, pendiente.getParaCuando())) n++;
            }
            if(n==0)
            {
                JOptionPane.showMessageDialog(this, "No puede enviar un reporte ya que no hay actividaddes pendientes para este día.", "Error!", 0);
                return;
            }
            sendExcel();
            JOptionPane.showMessageDialog(this, "Reporte enviado con éxito.", "Operación exitos", 1);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error. Por favor inténtelo más tarde o contacte al administrador.", "Error", 0);
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnSendToMailActionPerformed


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
    
    public GregorianCalendar obtenerFecha()
    {
        String dia = String.valueOf(cbDia.getSelectedItem()).substring(0,2);
        return new GregorianCalendar(Integer.parseInt((String)cbAño.getSelectedItem()),
                                                getIndexOfMesDelAño((String)cbMes.getSelectedItem()),
                                                Integer.parseInt(dia));
    }
    
    private void btnTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTareaActionPerformed
        // TODO add your handling code here:
        if(yaPaso())return;
        formPadre.dispose();
        new frmAgregarTarea(obtenerFecha()).setVisible(true);
    }//GEN-LAST:event_btnTareaActionPerformed

    private void btnExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamenActionPerformed
        // TODO add your handling code here:
        if(yaPaso())return;
        formPadre.dispose();
        new frmAgregarExamen(obtenerFecha()).setVisible(true);
    }//GEN-LAST:event_btnExamenActionPerformed

    private void btnEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventoActionPerformed
        // TODO add your handling code here:
        if(yaPaso())return;
        formPadre.dispose();
        new frmAgregarEvento(obtenerFecha()).setVisible(true);
    }//GEN-LAST:event_btnEventoActionPerformed

    private void btnRecordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordatorioActionPerformed
        // TODO add your handling code here:
        if(yaPaso())return;
        formPadre.dispose();
        new frmAgregarRecordatorio(obtenerFecha()).setVisible(true);
    }//GEN-LAST:event_btnRecordatorioActionPerformed

    private void lblAñoAntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAñoAntMouseClicked
        // TODO add your handling code here:
        int min=0;
        int max=cbAño.getItemCount()-1;
        int i = cbAño.getSelectedIndex();
        if(i>min)i--;
        cbAño.setSelectedIndex(i);
    }//GEN-LAST:event_lblAñoAntMouseClicked

    private void lblMesAntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesAntMouseClicked
        // TODO add your handling code here:
        int min=0;
        int max=cbMes.getItemCount()-1;
        int i = cbMes.getSelectedIndex();
        if(i>min)
        {
            cbMes.setSelectedIndex(i-1);
        }
        else if(i==min)
        {
            if(cbAño.getSelectedIndex()>0)
            {
                cbAño.setSelectedIndex(cbAño.getSelectedIndex()-1);
                cbMes.setSelectedIndex(max);
            }
        }
    }//GEN-LAST:event_lblMesAntMouseClicked

    private void lblMesSigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesSigMouseClicked
        // TODO add your handling code here:
        int min=0;
        int max=cbMes.getItemCount()-1;
        int i = cbMes.getSelectedIndex();
        if(i<max)
        {
            cbMes.setSelectedIndex(i+1);
        }
        else if(i==max)
        {
            if(cbAño.getSelectedIndex()<cbAño.getItemCount()-1)
            {
                cbAño.setSelectedIndex(cbAño.getSelectedIndex()+1);
                cbMes.setSelectedIndex(min);
            }
        }
    }//GEN-LAST:event_lblMesSigMouseClicked

    private void lblAñoSigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAñoSigMouseClicked
        // TODO add your handling code here:
        int min=0;
        int max=cbAño.getItemCount()-1;
        int i = cbAño.getSelectedIndex();
        if(i<max)i++;
        cbAño.setSelectedIndex(i);
    }//GEN-LAST:event_lblAñoSigMouseClicked

    private void lblDiaSigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiaSigMouseClicked
        // TODO add your handling code here:
        int min=0;
        int max=cbDia.getItemCount()-1;
        int i = cbDia.getSelectedIndex();
        if(i<max)
        {
            cbDia.setSelectedIndex(i+1);
        }
        else if(i==max)
        {
            if(cbMes.getSelectedIndex()<cbMes.getItemCount()-1)
            {
                cbMes.setSelectedIndex(cbMes.getSelectedIndex()+1);
                cbDia.setSelectedIndex(0);
            }
            else if(cbMes.getSelectedIndex()==cbMes.getItemCount()-1)
            {
                if(cbAño.getSelectedIndex()<cbAño.getItemCount()-1)
                {
                    cbAño.setSelectedIndex(cbAño.getSelectedIndex()+1);
                    cbMes.setSelectedIndex(0);
                    cbDia.setSelectedIndex(0);
                }
            }
        }
    }//GEN-LAST:event_lblDiaSigMouseClicked

    private void lblDiaAntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiaAntMouseClicked
        // TODO add your handling code here:
        int min=0;
        int max=cbDia.getItemCount()-1;
        int i = cbDia.getSelectedIndex();
        if(i>min)
        {
            cbDia.setSelectedIndex(i-1);
        }
        else if(i==min)
        {
            if(cbMes.getSelectedIndex()>0)
            {
                cbMes.setSelectedIndex(cbMes.getSelectedIndex()-1);
                cbDia.setSelectedIndex(cbDia.getItemCount()-1);
            }
            else if(cbMes.getSelectedIndex()==0)
            {
                if(cbAño.getSelectedIndex()>0)
                {
                    cbAño.setSelectedIndex(cbAño.getSelectedIndex()-1);
                    cbMes.setSelectedIndex(cbMes.getItemCount()-1);
                    cbDia.setSelectedIndex(cbDia.getItemCount()-1);
                }
            }
        }
    }//GEN-LAST:event_lblDiaAntMouseClicked

    public boolean yaPaso()
    {
        boolean r=false;
        if(fabricaClass.gcMayor(new GregorianCalendar(),obtenerFecha())==1)
        {
            JOptionPane.showMessageDialog(this, "No puede agregar actividades para este día; ya pasó.", "Error!", 0);
            r=true;
        }
        return r;
    }
    private void eliminarPendiente(PendienteClass pendiente)
    {
        int confirmar = JOptionPane.showConfirmDialog(this, (String)"¿Seguro que desea eliminar el pendiente " + pendiente.getNombre() + "?" , "¡Atención!", 2, 2);
        if(confirmar==0)
        {
            
            fabricaClass.getUsuarioLogeado().getPendientes().remove(pendiente);
            fabricaClass.getUsuarioLogeado().actualizarPuntaje();
            fabricaClass.serializarDatos();
            //aqui debe ir algo
            actualizarPendientes();
        }
    }
    private void cambiarCheckBox(PendienteClass pendiente)
    {
        pendiente.cambiarHecho();
        fabricaClass.serializarDatos();
        //aqui debe ir algo
        actualizarPendientes();
    }
    
    
    public void pendienteSeleccionadoMouseClicked(PendienteClass pendiente, GregorianCalendar gc)
    {
        formPadre.dispose();
        PendienteClass.Tipo tipo = pendiente.getTipo();
        switch(tipo)
        {
            case TAREA:
                new frmEditarTarea(pendiente,gc).setVisible(true);
                break;
            case EXAMEN:
                new frmEditarExamen(pendiente,gc).setVisible(true);
                break;
                
            case EVENTO:
                new frmEditarEvento(pendiente,gc).setVisible(true);
                break;
            case RECORDATORIO:
                new frmEditarRecordatorio(pendiente,gc).setVisible(true);
                break;
        }
        
        //System.out.println(pendiente.getNombre());
    }

    public void sendExcel()
    {
        try
        {
            sendExcelToMail.enviar(diaMostrado);
        }
        catch(javax.mail.MessagingException e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Ha ocurrido un error con la conexión. Por favor inténtelo más tarde o contacte al administrador.", 0);
            e.printStackTrace();
        }
        catch (FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", 0);
            e.printStackTrace();
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", 0);
            e.printStackTrace();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 0);
            ex.printStackTrace();
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEvento;
    private javax.swing.JButton btnExamen;
    private javax.swing.JButton btnRecordatorio;
    private javax.swing.JButton btnSendToMail;
    private javax.swing.JButton btnTarea;
    private javax.swing.JComboBox<String> cbAño;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAñoAnt;
    private javax.swing.JLabel lblAñoSig;
    private javax.swing.JLabel lblDel;
    private javax.swing.JLabel lblDiaAnt;
    private javax.swing.JLabel lblDiaSig;
    private javax.swing.JLabel lblMesAnt;
    private javax.swing.JLabel lblMesSig;
    private javax.swing.JLabel lblVista;
    private javax.swing.JLabel lblVista10;
    private javax.swing.JLabel lblVista8;
    private javax.swing.JLabel lblVista9;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlFechaActual;
    private javax.swing.JPanel pnlPendientesDia;
    private javax.swing.JPanel pnlPendientesDiaHechos;
    private javax.swing.JScrollPane spListaPendientes;
    private javax.swing.JScrollPane spListaPendientesHechos;
    // End of variables declaration//GEN-END:variables
}
