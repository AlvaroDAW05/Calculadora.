/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.entornos;

import javax.swing.JFrame;
import javax.swing.JTextPane;

/**
 *
 * @author Alumnado
 */
/**
 * @param args the command line arguments
 */
public class HolaMundoGrafico {

    public static void main(String[] args) {
        JFrame miVentana = new JFrame();
    miVentana.setTitle ("Hola Mundo Grafico"); 
    JTextPane miCampoDeTexto = new JTextPane();
    miCampoDeTexto.setText("HOLA MUNDO");
    miVentana.add(miCampoDeTexto);
    miVentana.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE); 
    miVentana.pack();
    miVentana.setVisible(true); 
    }
}
