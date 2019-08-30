/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sketsa;

import java.applet.*;
import java.awt.Color;

public class badan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setSize(700,1000);
    
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new gambar());
        frame.setVisible(true);
    }
    
}
