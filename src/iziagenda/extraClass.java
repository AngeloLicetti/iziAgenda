/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iziagenda;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URI;
import java.util.GregorianCalendar;
import java.util.TimerTask;
import javax.swing.*;
/**
 *
 * @author alumno
 */
public class extraClass
{
    static int r = 65;
    static int g = 65;
    static int b = 244;

    static boolean haciendoR = true;
    static boolean haciendoG = false;
    static boolean haciendoB = false;
    
    public static void centrarFrame(JFrame frm)
    {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frm.setLocation(dim.width/2-frm.getSize().width/2, dim.height/2-frm.getSize().height/2-19);
    }
    
    public static void abrirUrl(String link)
    {
        try
        {
            if(Desktop.isDesktopSupported())
            {
                Desktop desktop = Desktop.getDesktop();
                if(desktop.isSupported(Desktop.Action.BROWSE))
                {
                    desktop.browse(new URI(link));
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void cambiarFondoChido(JFrame frm)
    {
        int rgbSpeed = 1;
        int colorMili = 10;
        
        java.util.Timer timy = new java.util.Timer();
        TimerTask taskCosmo = new TimerTask()
        {
            @Override
            public void run()
            {
                if(haciendoR==true)
                {
                    if (b <= 65)
                    {
                        r += rgbSpeed;
                        frm.getContentPane().setBackground(new Color(r,g,b));
                        frm.repaint();
                        if (r >= 244)
                        {
                            haciendoR=false;
                            haciendoG=true;
                        }
                    }
                    if (b >= 244)
                    {
                        r -= rgbSpeed;
                        frm.getContentPane().setBackground(new Color(r,g,b));
                        frm.repaint();
                        if (r <= 65)
                        {
                            haciendoR = false;
                            haciendoG=true;
                        }
                    }
                }
                else if (haciendoG==true)
                {
                    if (r <= 65)
                    {
                        g += rgbSpeed;
                        frm.getContentPane().setBackground(new Color(r,g,b));
                        frm.repaint();
                        if (g >= 244)
                        {
                            haciendoG=false;
                            haciendoB=true;
                        }
                    }
                    if (r >= 244)
                    {
                        g -= rgbSpeed;
                        frm.getContentPane().setBackground(new Color(r,g,b));
                        frm.repaint();
                        if (g <= 65)
                        {
                            haciendoG = false;
                            haciendoB=true;
                        }
                    }
                }
                else if (haciendoB==true)
                {
                    if (g <= 65)
                    {
                        b += rgbSpeed;
                        frm.getContentPane().setBackground(new Color(r,g,b));
                        frm.repaint();
                        if (b >= 244)
                        {
                            haciendoB=false;
                            haciendoR=true;
                        }
                    }
                    if (g >= 244)
                    {
                        b -= rgbSpeed;
                        frm.getContentPane().setBackground(new Color(r,g,b));
                        frm.repaint();
                        if (b <= 65)
                        {
                            haciendoB = false;
                            haciendoR=true;
                        }
                    }
                }
            }
        };
        
        timy.scheduleAtFixedRate(taskCosmo,0,colorMili);
    }
    public static void cambiarFondoChido(JPanel pnl)
    {
        int rgbSpeed = 1;
        int colorMili = 10;
        
        java.util.Timer timy = new java.util.Timer();
        TimerTask taskCosmo = new TimerTask()
        {
            @Override
            public void run()
            {
                if(haciendoR==true)
                {
                    if (b <= 65)
                    {
                        r += rgbSpeed;
                        pnl.setBackground(new Color(r,g,b));
                        pnl.repaint();
                        if (r >= 244)
                        {
                            haciendoR=false;
                            haciendoG=true;
                        }
                    }
                    if (b >= 244)
                    {
                        r -= rgbSpeed;
                        pnl.setBackground(new Color(r,g,b));
                        pnl.repaint();
                        if (r <= 65)
                        {
                            haciendoR = false;
                            haciendoG=true;
                        }
                    }
                }
                else if (haciendoG==true)
                {
                    if (r <= 65)
                    {
                        g += rgbSpeed;
                        pnl.setBackground(new Color(r,g,b));
                        pnl.repaint();
                        if (g >= 244)
                        {
                            haciendoG=false;
                            haciendoB=true;
                        }
                    }
                    if (r >= 244)
                    {
                        g -= rgbSpeed;
                        pnl.setBackground(new Color(r,g,b));
                        pnl.repaint();
                        if (g <= 65)
                        {
                            haciendoG = false;
                            haciendoB=true;
                        }
                    }
                }
                else if (haciendoB==true)
                {
                    if (g <= 65)
                    {
                        b += rgbSpeed;
                        pnl.setBackground(new Color(r,g,b));
                        pnl.repaint();
                        if (b >= 244)
                        {
                            haciendoB=false;
                            haciendoR=true;
                        }
                    }
                    if (g >= 244)
                    {
                        b -= rgbSpeed;
                        pnl.setBackground(new Color(r,g,b));
                        pnl.repaint();
                        if (b <= 65)
                        {
                            haciendoB = false;
                            haciendoR=true;
                        }
                    }
                }
            }
        };
        
        timy.scheduleAtFixedRate(taskCosmo,0,colorMili);
    }
    public static void cambiarFondoChido(JButton btn)
    {
        int rgbSpeed = 1;
        int colorMili = 10;
        
        java.util.Timer timy = new java.util.Timer();
        TimerTask taskCosmo = new TimerTask()
        {
            @Override
            public void run()
            {
                if(haciendoR==true)
                {
                    if (b <= 65)
                    {
                        r += rgbSpeed;
                        btn.setBackground(new Color(r,g,b));
                        btn.repaint();
                        if (r >= 244)
                        {
                            haciendoR=false;
                            haciendoG=true;
                        }
                    }
                    if (b >= 244)
                    {
                        r -= rgbSpeed;
                        btn.setBackground(new Color(r,g,b));
                        btn.repaint();
                        if (r <= 65)
                        {
                            haciendoR = false;
                            haciendoG=true;
                        }
                    }
                }
                else if (haciendoG==true)
                {
                    if (r <= 65)
                    {
                        g += rgbSpeed;
                        btn.setBackground(new Color(r,g,b));
                        btn.repaint();
                        if (g >= 244)
                        {
                            haciendoG=false;
                            haciendoB=true;
                        }
                    }
                    if (r >= 244)
                    {
                        g -= rgbSpeed;
                        btn.setBackground(new Color(r,g,b));
                        btn.repaint();
                        if (g <= 65)
                        {
                            haciendoG = false;
                            haciendoB=true;
                        }
                    }
                }
                else if (haciendoB==true)
                {
                    if (g <= 65)
                    {
                        b += rgbSpeed;
                        btn.setBackground(new Color(r,g,b));
                        btn.repaint();
                        if (b >= 244)
                        {
                            haciendoB=false;
                            haciendoR=true;
                        }
                    }
                    if (g >= 244)
                    {
                        b -= rgbSpeed;
                        btn.setBackground(new Color(r,g,b));
                        btn.repaint();
                        if (b <= 65)
                        {
                            haciendoB = false;
                            haciendoR=true;
                        }
                    }
                }
            }
        };
        
        timy.scheduleAtFixedRate(taskCosmo,0,colorMili);
    }
}
