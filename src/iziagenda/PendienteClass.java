/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iziagenda;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Angelo
 */
public abstract class PendienteClass implements Serializable, PendienteInterface
{
    private String correoDeUsuario;
    private String nombre;
    private GregorianCalendar paraCuando;
    private int importancia;
    private String rubro;
    private String detalles;
    private Boolean hecho;
    private Tipo tipo;
    private Boolean tieneHora;
    private Object registroExcel[] = {"xd"};
    
    public static enum Tipo {TODO, TAREA, EXAMEN, EVENTO, RECORDATORIO}
    
    
    public void cambiarDatos(String nombre, GregorianCalendar paraCuando, int importancia, String rubro, String detalles, Boolean tieneHora)
    {
        this.setNombre(nombre);
        this.setParaCuando(paraCuando);
        this.setImportancia(importancia);
        this.setRubro(rubro);
        this.setDetalles((detalles=="")?"No hay detalles.":detalles);
        this.setTieneHora(tieneHora);
        
        fabricaClass.getUsuarioLogeado().actualizarPuntaje();
        
        actualizarRegistroExcel();
        
        fabricaClass.getUsuarioLogeado().ordenarPendientes();
    }

    public void cambiarHecho()
    {
        if(getHecho()==true)setHecho(false);
        else if(getHecho()==false)setHecho(true);
        fabricaClass.getUsuarioLogeado().ordenarPendientes();
        fabricaClass.getUsuarioLogeado().actualizarPuntaje();
    }
    
    public void actualizarRegistroExcel()
    {
        //Nombvre; Tipo; Hora; Importancia; Rubro; Detalles
        String hor=paraCuando.get(GregorianCalendar.HOUR_OF_DAY)+":"+paraCuando.get(GregorianCalendar.MINUTE);
        String soloHora = (this.tieneHora)?hor:"-";
        
        String soloDetalles = (getDetalles().length()==0)?"-":getDetalles();
        
        String soloRubro = (getRubro().length()==0)?"-":getRubro();
        
        String soloLugar= (this.tipo==Tipo.EVENTO)?((EventoClass)(this)).getLugar():"-";
        
        Object registroActualizado[] = {getNombre(),tipoString(),soloHora,String.valueOf(getImportancia()),soloRubro,soloDetalles,soloLugar};
        registroExcel=registroActualizado;
    }
    public String obtenerFecha()
    {
        String r="";
        r = fabricaClass.diaDeLaSemana(paraCuando.get(GregorianCalendar.DAY_OF_WEEK))+ " " +
            String.valueOf(paraCuando.get(GregorianCalendar.DAY_OF_MONTH)) + "-" +
            String.valueOf(paraCuando.get(GregorianCalendar.MONTH)+1) + "-" +
            String.valueOf(paraCuando.get(GregorianCalendar.YEAR));
        if(tieneHora)
        {
            r += "; " +
                String.valueOf(paraCuando.get(GregorianCalendar.HOUR_OF_DAY))+ ":" +
                String.valueOf(paraCuando.get(GregorianCalendar.MINUTE));
        }
        
        return r;
    }
    
    public String obtenerHora()
    {
        String r="";
        if(tieneHora)
        {
            String hora = String.valueOf(paraCuando.get(GregorianCalendar.HOUR_OF_DAY));
            hora = hora.length()==1?"0"+hora:hora;
            String minuto = String.valueOf(paraCuando.get(GregorianCalendar.MINUTE));
            minuto = minuto.length()==1?"0"+minuto:minuto;
            r += "" +
                hora + ":" +
                minuto;
        }
        
        return r;
    }
    
    public String tiempoQueFalta()
    {
        String tiempoFaltante = diasQueFaltan() + " días";
        if(getTieneHora())
        {
            tiempoFaltante+=" y " + horasQueFaltan() + "horas";
            tiempoFaltante+=" con " + minutosQueFaltan() + "minutos";
        }
        return tiempoFaltante;
    }
    
    public int minutosTotalesQueFaltan()
    {
        int m;
        m = (diasQueFaltan() * 24 * 60) + (horasQueFaltan() * 60) + minutosQueFaltan();
        return m;
    }
    
    public int diasQueFaltan ()
    {
        int dias;
        dias = (int)((paraCuando.getTimeInMillis()- (new GregorianCalendar()).getTimeInMillis())/(24*3600*1000));
        return dias;
    }
    public int horasQueFaltan()
    {
        int horas;
        horas = (int)(((paraCuando.getTimeInMillis()- (new GregorianCalendar()).getTimeInMillis())%(24*3600*1000))/(3600*1000));
        return horas;
    }
    
    public int minutosQueFaltan()
    {
        int minutos;
        minutos = (int)(((paraCuando.getTimeInMillis()- (new GregorianCalendar()).getTimeInMillis())%(3600*1000))/(60*1000));
        return minutos;
    }
    
    public String getCorreoDeUsuario() {
        return correoDeUsuario;
    }

    public void setCorreoDeUsuario(String correoDeUsuario) {
        this.correoDeUsuario = correoDeUsuario;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GregorianCalendar getParaCuando() {
        return paraCuando;
    }

    public void setParaCuando(GregorianCalendar paraCuando) {
        this.paraCuando = paraCuando;
    }

    public int getImportancia() {
        return importancia;
    }

    public void setImportancia(int importancia) {
        this.importancia = importancia;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Boolean getHecho() {
        return hecho;
    }

    public void setHecho(Boolean hecho) {
        this.hecho = hecho;
    }

    public Boolean getTieneHora() {
        return tieneHora;
    }

    public void setTieneHora(Boolean tieneHora) {
        this.tieneHora = tieneHora;
    }

    public Object[] getRegistroExcel() {
        return registroExcel;
    }

    public void setRegistroExcel(Object[] registroExcel) {
        this.registroExcel = registroExcel;
    }
    
    public String tipoString()
    {
        switch (getTipo())
        {
            case TAREA:
                return "Tarea";
            case EXAMEN:
                return "Examen";
            case EVENTO:
                return "Evento";
            case RECORDATORIO:
                return "Recordatorio";
            default:
                return "";
        }
    }
}
