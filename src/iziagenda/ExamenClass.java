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
public class ExamenClass extends PendienteClass
{
    
    public ExamenClass(String nombre, GregorianCalendar paraCuando, int importancia, String rubro, String detalles, String correoDeUsuario, Boolean tieneHora)
    {
        this.setNombre(nombre);
        this.setParaCuando(paraCuando);
        this.setImportancia(importancia);
        this.setRubro(rubro);
        this.setDetalles((detalles=="")?"No hay detalles.":detalles);
        this.setTipo(Tipo.EXAMEN);
        this.setHecho(false);
        this.setCorreoDeUsuario(correoDeUsuario);
        this.setTieneHora(tieneHora);
        
        actualizarRegistroExcel();
    }

    @Override
    public String imprimirDatos()
    {
        String datos ="";
        datos += getTipo() + "(" + getImportancia() + "; " + ")" + getNombre() + " - " + getRubro() + "(Hecho = " + getHecho() + "):\n" + getDetalles();
        return datos;
    }
    
}
