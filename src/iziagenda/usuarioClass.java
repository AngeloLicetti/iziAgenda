/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iziagenda;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Angelo
 */
public class usuarioClass implements Serializable
{
    private static usuarioClass usuarioRecordado;
    
    private boolean recordado;
    
    private static boolean recordar = false;
    
    private Color colorTarea;
    private Color colorExamen;
    private Color colorEvento;
    private Color colorRecordatorio;
    
    private static int numeroDeUsuarios = 0;
    
    private String nombre, correo, contraseña;
    
    private List <PendienteClass> pendientes = new ArrayList <PendienteClass>();
    
    private List <String> rubros = new ArrayList <String>();
    
    public int x;
    
    private int puntaje;
    
    private String urlCancionAlarma;
    
    
    public usuarioClass(String nombre, String correo, String contraseña)
    {
        setNombre(nombre);
        setCorreo(correo);
        setContraseña(contraseña);
        
        puntaje=0;
        
        setColorTarea(fabricaClass.turquesa);
        setColorExamen(fabricaClass.verde);
        setColorEvento(fabricaClass.amarillo);
        setColorRecordatorio(fabricaClass.anaranjado);
        
        setUrlCancionAlarma("alarma.wav");
        
        numeroDeUsuarios++;
    }
    
    public void modificarDatos(String nombre, String correo, String contraseña)
    {
        setNombre(nombre);
        setCorreo(correo);
        setContraseña(contraseña);
    }
    
    public void setPuntaje(int i)
    {
        puntaje=i;
    }
    
    public void agregarTarea(String nombre, GregorianCalendar paraCuando, int importancia, String rubro, String detalles, Boolean tieneHora)
    {
        TareaClass t = new TareaClass(nombre, paraCuando, importancia, rubro, detalles, this.getCorreo(), tieneHora);
        getPendientes().add(t);
        ordenarPendientes();
    }
    
    public void agregarExamen(String nombre, GregorianCalendar paraCuando, int importancia, String rubro, String detalles, Boolean tieneHora)
    {
        ExamenClass ex = new ExamenClass(nombre, paraCuando, importancia, rubro, detalles, this.getCorreo(), tieneHora);
        getPendientes().add(ex);
        ordenarPendientes();
    }
    
    public void agregarEvento(String nombre, GregorianCalendar paraCuando, int importancia, String rubro, String lugar, String detalles, Boolean tieneHora)
    {
        EventoClass ev = new EventoClass(nombre, paraCuando, importancia, rubro, lugar, detalles, this.getCorreo(), tieneHora);
        getPendientes().add(ev);
        ordenarPendientes();
    }
    
    public void agregarRecordatorio(String nombre, GregorianCalendar paraCuando, int importancia, String rubro, String detalles, Boolean tieneHora)
    {
        RecordatorioClass r = new RecordatorioClass(nombre, paraCuando, importancia, rubro, detalles, this.getCorreo(), tieneHora);
        getPendientes().add(r);
        ordenarPendientes();
    }
    
    public void ordenarPendientes()
    {
        Collections.sort(pendientes, new Comparator<PendienteClass>()
        {
            @Override
            public int compare(PendienteClass p1, PendienteClass p2)
            {
                return p1.minutosTotalesQueFaltan() - p2.minutosTotalesQueFaltan(); // Ascending
            }
        });
    }
    
    //metodo de pruebas:
    public void pruebaImprimirTareas()
    {
        for(PendienteClass pendiente : getPendientes())
        {
            if(pendiente.getTipo()== PendienteClass.Tipo.TAREA) System.out.println(pendiente.imprimirDatos());
        }
    }
    
    public static int getNumeroDeUsuarios() {
        return numeroDeUsuarios;
    }

    public static void setNumeroDeUsuarios(int aNumeroDeUsuarios) {
        numeroDeUsuarios = aNumeroDeUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List <PendienteClass> getPendientes() {
        return pendientes;
    }

    public void setPendientes(List <PendienteClass> pendientes) {
        this.pendientes = pendientes;
    }

    public List <String> getRubros() {
        return rubros;
    }

    public void setRubros(List <String> rubros) {
        this.rubros = rubros;
    }

    public Color getColorTarea() {
        return colorTarea;
    }

    public void setColorTarea(Color colorTarea) {
        this.colorTarea = colorTarea;
    }

    public Color getColorExamen() {
        return colorExamen;
    }

    public void setColorExamen(Color colorExamen) {
        this.colorExamen = colorExamen;
    }

    public Color getColorEvento() {
        return colorEvento;
    }

    public void setColorEvento(Color colorEvento) {
        this.colorEvento = colorEvento;
    }

    public Color getColorRecordatorio() {
        return colorRecordatorio;
    }

    public void setColorRecordatorio(Color colorRecordatorio) {
        this.colorRecordatorio = colorRecordatorio;
    }

    public static usuarioClass getUsuarioRecordado() {
        return usuarioRecordado;
    }

    public static void setUsuarioRecordado(usuarioClass aUsuarioRecordado) {
        usuarioRecordado = aUsuarioRecordado;
    }

    public static boolean getRecordar() {
        return recordar;
    }

    public static void setRecordar(boolean aRecordar) {
        recordar = aRecordar;
    }

    public boolean getRecordado() {
        return recordado;
    }

    public void setRecordado(boolean recordado) {
        this.recordado = recordado;
    }

    public String getUrlCancionAlarma() {
        return urlCancionAlarma;
    }

    public void setUrlCancionAlarma(String urlCancionAlarma) {
        this.urlCancionAlarma = urlCancionAlarma;
    }
    
    public void actualizarPuntaje()
    {
        puntaje = 0;
        if(getPendientes().isEmpty())return;
        for(PendienteClass pendiente:getPendientes())
        {
            if(pendiente.getHecho()==true)
            {
                puntaje+=pendiente.getImportancia();
            }
        }
        fabricaClass.serializarDatos();
    }
    public int getPuntaje()
    {
        return puntaje;
    }
}
