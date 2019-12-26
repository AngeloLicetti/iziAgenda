/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iziagenda;


/**
 *
 * @author alumno
 */
public class IziAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fabricaClass.deserializarDatos();
        new Thread (new frmSplashScreen()).start();
    }
    
}
