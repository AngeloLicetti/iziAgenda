/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iziagenda;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Angelo
 */
public class EventoClass extends PendienteClass
{
    private String lugar;

    
    public EventoClass(String nombre, GregorianCalendar paraCuando, int importancia, String rubro, String lugar, String detalles, String correoDeUsuario, Boolean tieneHora)
    {
        this.setNombre(nombre);
        this.setParaCuando(paraCuando);
        this.setImportancia(importancia);
        this.setRubro(rubro);
        this.setDetalles((detalles=="")?"No hay detalles.":detalles);
        this.setLugar(lugar);
        this.setTipo(Tipo.EVENTO);
        this.setHecho(false);
        this.setCorreoDeUsuario(correoDeUsuario);
        this.setTieneHora(tieneHora);
        
        actualizarRegistroExcel();
    }
    
    public void cambiarDatos(String nombre, GregorianCalendar paraCuando, int importancia, String rubro, String lugar, String detalles, Boolean tieneHora)
    {
        this.setNombre(nombre);
        this.setParaCuando(paraCuando);
        this.setImportancia(importancia);
        this.setRubro(rubro);
        this.setDetalles((detalles=="")?"No hay detalles.":detalles);
        this.setTieneHora(tieneHora);
        fabricaClass.getUsuarioLogeado().actualizarPuntaje();
        fabricaClass.getUsuarioLogeado().ordenarPendientes();
        actualizarRegistroExcel();
    }

    @Override
    public String imprimirDatos()
    {
        String datos ="";
        datos += getTipo() + "(" + getImportancia() + "; " + getLugar() + ")" + getNombre() + " - " + getRubro() + "(Hecho = " + getHecho() + "):\n" + getDetalles();
        return datos;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
}
