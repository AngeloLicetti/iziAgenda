/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iziagenda;

import static iziagenda.sendExcelToMail.dia;
import static iziagenda.sendExcelToMail.getString;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Angelo
 */
public class fabricaClass
{
    private static List <usuarioClass> usuarios = new ArrayList <usuarioClass>();
    
    private static usuarioClass usuarioLogeado;
    
    private static PendienteClass pendienteSeleccionado;
    
    public static Color celeste = new Color(25, 181, 254);
    public static Color rojo = new Color(239, 72, 54);
    public static Color verde = new Color(0, 255, 0);
    public static Color anaranjado = new Color(255, 128, 0);
    public static Color amarillo = new Color(255, 255, 0);
    public static Color turquesa = new Color(54, 215, 183);
    public static Color morado = new Color(154, 18, 179);
    public static Color plateado = new Color(191, 191, 191);
    public static Color fuxia = new Color(255, 0, 255);
    public static Color gris = new Color(108, 122, 137);
    
    
    public static Color[] colores = {rojo,verde,anaranjado,amarillo,turquesa,celeste,morado,fuxia,plateado,gris};
    
    
    static GregorianCalendar fechaActual;
    
    static String [] mesesDelAño = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"};
    
    public static void  enviarCorreo(String para, String Asunto, String Mensaje)
    {
        String Username = "iziagenda.backup@gmail.com";
        String PassWord = "drvroxzibzatzqdy";
        String To = para;
        String Subject = Asunto;
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(Username, PassWord);
                    }
                });
        try
        {

            //Creo el BodyPart:
            BodyPart bpTexto = new MimeBodyPart();
            // Texto del mensaje
            bpTexto.setText(Mensaje);
            
            // Cargamos los archivos
            //BodyPart bpAdjunto = new MimeBodyPart();
            //bpAdjunto.setDataHandler(new DataHandler(new FileDataSource(fileName)));
            // nombre de fichero.
            //bpAdjunto.setFileName(getString(dia)+".xlsx");
            
            //defino las partes del mensaje multi-parte
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(bpTexto);
            //multiParte.addBodyPart(bpAdjunto);
            
            // Define message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(To));
            message.setSubject(Subject);
            
            //agregando mensaje normal:
            //message.setText(Mensage);
            
            //agregando el mensaje multiparte:
            message.setContent(multiParte);

            //enviar mensage:
            Transport.send(message);
            
            System.out.println("Mensaje enviado con éxito.");

        }
        catch (MessagingException e)
        {
            System.out.println("Error.");
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
    
    public static boolean esCorreoValido(String corr)
    {
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        Matcher mather = pattern.matcher(corr);
 
        if (mather.find() == true) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean correoYaExiste(String correo)
    {
        boolean existe = false;
        for(usuarioClass user:getUsuarios())
        {
            if(user.getCorreo().equals(correo))
            {
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    public static void agregarUsuario(usuarioClass user)
    {
        getUsuarios().add(user);
    }
    
    public static boolean logIn(String correo, String contraseña)
    {
        boolean ingreso = false;
        for(usuarioClass user:getUsuarios())
        {
            if(user.getCorreo().equals(correo) && user.getContraseña().equals(contraseña))
            {
                ingreso=true;
                setUsuarioLogeado(user);
                break;
            }
        }
        return ingreso;
    }
    public static void logOut()
    {
        setUsuarioLogeado(null);
    }
    
    //metodo de pruebas:
    public static String imprimirUsuarios()
    {
        String s="";
        for(usuarioClass user : getUsuarios())
        {
            s += user.getNombre() + " - " + user.getCorreo() + "_" + user.getContraseña()+ user.getRubros().toString() + "\n";
        }
        return s;
    }
    
    public static boolean adminLogeado()
    {
        if(usuarioLogeado.getCorreo().equals("iziagenda.adm@gmail.com"))
        {
            return true;
        }
        else return false;
    }
    
    public static String diaDeLaSemana(int dia)
    {
        switch(dia)
        {
            case 1: {return "Domingo";}
            case 2: {return "Lunes";}
            case 3: {return "Martes";}
            case 4: {return "Miercoles";}
            case 5: {return "Jueves";}
            case 6: {return "Viernes";}
            case 7: {return "Sabado";}
            default: {return "Domingo";}
        }  
    }
    
    public static void serializarDatos()
    {
        try
        {
            FileOutputStream fos= new FileOutputStream("usuarios.ser");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(getUsuarios());
            oos.close();
            fos.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
    
    public static void deserializarDatos()
    {
        try
        {
            File ser = new File("usuarios.ser");
            if(ser.exists())
            {
                FileInputStream fis = new FileInputStream("usuarios.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);
                setUsuarios((List<usuarioClass>) (ArrayList) ois.readObject());
                ois.close();
                fis.close();
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        catch(ClassNotFoundException c)
        {
             System.out.println("Class not found");
             c.printStackTrace();
             return;
          }
    }

    public static List <usuarioClass> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(List <usuarioClass> aUsuarios) {
        usuarios = aUsuarios;
    }

    public static usuarioClass getUsuarioLogeado() {
        return usuarioLogeado;
    }

    public static void setUsuarioLogeado(usuarioClass aUsuarioLoegado) {
        usuarioLogeado = aUsuarioLoegado;
    }

    public static PendienteClass getPendienteSeleccionado() {
        return pendienteSeleccionado;
    }

    public static void setPendienteSeleccionado(PendienteClass aPendienteSeleccionado) {
        pendienteSeleccionado = aPendienteSeleccionado;
    }
    
   
    public static String imprimirFechaYHora(GregorianCalendar g)
    {
        String retornar = "";
        int diaDeLaS, dia, mes, año, hora, minuto, segundo;
        
        diaDeLaS = g.get((GregorianCalendar.DAY_OF_WEEK));
        String diaDeLaSem = fabricaClass.diaDeLaSemana(diaDeLaS);
        
        dia = g.get((GregorianCalendar.DAY_OF_MONTH));
        String d = String.valueOf(dia);
        
        mes = g.get((GregorianCalendar.MONTH));
        String m = mesesDelAño[mes];
        
        año = g.get((GregorianCalendar.YEAR));
        String a = String.valueOf(año);
        
        hora = g.get((GregorianCalendar.HOUR_OF_DAY));
        String ho = String.valueOf(hora);
        String h = (ho.length()==1)? "0" + ho : "" + ho;
        
        minuto = g.get((GregorianCalendar.MINUTE));
        String mi = String.valueOf(minuto);
        String min = (mi.length()==1)? "0" + mi : "" + mi;
        
        segundo = g.get((GregorianCalendar.SECOND));
        String seg = String.valueOf(segundo);
        String s = (seg.length()==1)? "0" + seg : "" + seg;
        
        retornar = diaDeLaSem + ", " + d + " de " + m + " del " + a + " " + ho + ":" + min + ":" + s;
        
        return retornar;
    }
    
    public static boolean compararFechas(GregorianCalendar g1, GregorianCalendar g2)
    {
        boolean retornar = false;
        if(g1.get(GregorianCalendar.DAY_OF_MONTH) == g2.get(GregorianCalendar.DAY_OF_MONTH) &&
                g1.get(GregorianCalendar.MONTH) == g2.get(GregorianCalendar.MONTH) &&
                g1.get(GregorianCalendar.YEAR) == g2.get(GregorianCalendar.YEAR))
        {
            retornar = true;
        }
        //System.out.println(retornar);
        return retornar;
    }
    
    public static int gcMayor(GregorianCalendar gc1, GregorianCalendar gc2)
    {
        long milis1=0; long milis2=0;
        
        GregorianCalendar x1 = new GregorianCalendar(gc1.get(GregorianCalendar.YEAR),gc1.get(GregorianCalendar.MONTH),gc1.get(GregorianCalendar.DAY_OF_MONTH));
        GregorianCalendar x2 = new GregorianCalendar(gc2.get(GregorianCalendar.YEAR),gc2.get(GregorianCalendar.MONTH),gc2.get(GregorianCalendar.DAY_OF_MONTH));
        
        milis1 = x1.getTimeInMillis();
        milis2 = x2.getTimeInMillis();
        if(milis1>milis2) return 1;
        else if(milis2>milis1) return 2;
        else if (milis1==milis2) return 0;
        else return -1;
    }
    
    public static void ordenarUsuarios()
    {
        int i = usuarios.size();
        orderUsers(i);
        serializarDatos();
    }
    public static void orderUsers(int n)
    {
        if(n==1)return;
        
        for (int i=0; i<(n-1); i++)
        {
            if(usuarios.get(i).getPuntaje()<usuarios.get(i+1).getPuntaje())
            {
                System.out.println("probanding");
                System.out.println(usuarios.get(i).getPuntaje());
                System.out.println(usuarios.get(i+1).getPuntaje());
                usuarioClass temp = usuarios.get(i);
                usuarios.set(i, usuarios.get(i+1));
                usuarios.set(i+1, temp);
            }
        }
        
        orderUsers(n-1);
    }
}
