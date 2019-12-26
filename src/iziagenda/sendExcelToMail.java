/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iziagenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.Scanner;
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
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Angelo
 */
public class sendExcelToMail
{
    static Scanner input = new Scanner(System.in);
    
    //valores por default:
    static String fileName = "probandoAdjuntoExcel.xlsx";
    
    static String Mensage = "Hola " + fabricaClass.getUsuarioLogeado().getNombre()+"!\n\n Aquí te enviamos adjuntamente tus actividades para el día "
                        + "(día)" + ".\n"
                        + "Si tienes cualquier duda o consulta estaremos encantados de ayudarte cuando envíes un mensaje a esta dirección."
                        + "\n\nRecuerda: iziAgenda - reoganiza tu vida."
                        + "\n\nAngelo Licetti Leon. Administrador de iziAgenda.";
    static GregorianCalendar dia = new GregorianCalendar();
    
    static Object[][] matriz;
    
    static Object[] cabecera = {"Nombre","Tipo","Hora","Importancia","Rubro","Detalles","Lugar"};
    
    public sendExcelToMail()
    {
        
    }
    
    public static void enviar() throws Exception
    {
        //crear excel:
        crearExcel();
        
        //enviar correo con el archivo adjunto:
        enviarCorreo();
    }
    
    public static void enviar(GregorianCalendar gc) throws Exception
    {
        //cambiar los valores por default:
        
        dia = gc;
        
        fileName = newFileName();
        
        //Mensage = msg;
        int n = 0;
        for(PendienteClass pendiente: fabricaClass.getUsuarioLogeado().getPendientes())
        {
            if(fabricaClass.compararFechas(dia, pendiente.getParaCuando()))
            {
                n++;
            }
        }
        
        matriz=  new Object[n+1][];
        
        matriz[0]= cabecera;
        
        int i = 1;
        for(PendienteClass pendiente: fabricaClass.getUsuarioLogeado().getPendientes())
        {
            if(fabricaClass.compararFechas(dia, pendiente.getParaCuando()))
            {
                matriz[i]=pendiente.getRegistroExcel();
                i++;
            }
        }
    
        
        //crear excel:
        crearExcel();
        
        //enviar correo con el archivo adjunto:
        enviarCorreo();
    }
    
    public static String newFileName()
    {
        String fn = "";
        String carpeta = "ArchivosDeUsuarios\\"+fabricaClass.getUsuarioLogeado().getNombre();
        
        File folder = new File(carpeta);
        
        if(!folder.exists())
        {
            folder.mkdirs();
        }
        else
        {
            if(!folder.isDirectory())
            {
                folder.mkdirs();
            }
        }
        
        fn = carpeta + "\\" + getString(dia) + ".xlsx";
        
        return fn;
    }
    
    public static String getString(GregorianCalendar gc)
    {
        String r = "";
        r+= gc.get(GregorianCalendar.YEAR);
        r+= "-";
        r+= gc.get(GregorianCalendar.MONTH);
        r+= "-";
        r+= gc.get(GregorianCalendar.DAY_OF_MONTH);
        return r;
    }
    
    public static void crearExcel() throws Exception
    {
        
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
        

        int rowNum = 0;
        System.out.println("Creating excel");

        for (Object[] registro : matriz) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : registro) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        FileOutputStream outputStream = new FileOutputStream(fileName);
        workbook.write(outputStream);
        workbook.close(); 

        System.out.println("Done");
    }
    
    public static void enviarCorreo()
    {
        String Username = "iziagenda.backup@gmail.com";
        String PassWord = "drvroxzibzatzqdy";
        String To = fabricaClass.getUsuarioLogeado().getCorreo();
        String Subject = "Reporte de actividades pendientes del día "+getString(dia)+".";
        
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
            Mensage = "Hola " + fabricaClass.getUsuarioLogeado().getNombre()+"!\n\n Aquí te enviamos adjuntamente tus actividades para el día "
                        + getString(dia) + ".\n"
                        + "Si tienes cualquier duda o consulta estaremos encantados de ayudarte cuando envíes un mensaje a esta dirección."
                        + "\n\nRecuerda: iziAgenda - reoganiza tu vida."
                        + "\n\nAngelo Licetti Leon. Administrador de iziAgenda.";
            bpTexto.setText(Mensage);
            
            // Cargamos los archivos
            BodyPart bpAdjunto = new MimeBodyPart();
            bpAdjunto.setDataHandler(new DataHandler(new FileDataSource(fileName)));
            // nombre de fichero.
            bpAdjunto.setFileName(getString(dia)+".xlsx");
            
            //defino las partes del mensaje multi-parte
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(bpTexto);
            multiParte.addBodyPart(bpAdjunto);
            
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
}
