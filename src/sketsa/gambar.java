/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sketsa;

import java.awt.geom.*;
import java.awt.*;
import java.applet.*;

class gambar extends javax.swing.JComponent 
{ 
 

    public  void paint (java.awt.Graphics g) 
    {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D)g;
        
        //kepala
        g2.setColor(Color.black);
        g2.drawArc(200,10,110,150,0,-180); 
        
        //alis kanan
        g2.drawArc(220, 80, 20, 12, -10, 180);
        
        //alis kiri
        g2.drawArc(270, 80, 20, 12, 0, 190);

        //mulut
        g2.drawArc(244, 124, 20, 2, 0, 189);
        g2.drawArc(245, 115, 20, 20, 0, -180);
       
        //mata kiri
        g2.setColor(Color.blue);
        g2.fillOval(270, 85, 15, 20);
        g2.setColor(Color.white);
        g2.fillOval(280, 85, 5, 10);
                 
        //mata kanan
        g2.setColor(Color.blue);
        g2.fillOval(222, 85, 15, 20);
        g2.setColor(Color.white);
        g2.fillOval(232, 85, 5, 10);
        
        //hijab
        g2.setColor(Color.black); 
        g2.drawArc(200,35,110,100,0,180);
        g2.drawArc(180,5,150,300,0,180);
        g2.drawLine(180, 155, 100,290);
        g2.drawLine(400, 290, 100,290);
        g2.drawLine(330, 155, 400, 290);
        
        //tangan kanan
        g2.drawArc(250,255,150,300,0,50);
        
        //baju
        g2.drawRect(152, 290, 200, 330);
        //g2.drawRoundRect(152, 290, 200, 330, 1000, 60);
        
        //kaki kanan
        g2.drawRect(220, 620, 20, 40);
        g2.drawArc(220, 650, 20, 20, 0, -180); 
        
        //kaki kiri
        g2.drawRect(270, 620, 20, 40);
        g2.drawArc(270, 650, 20, 20, 0, -180);
    }
    
    
}
