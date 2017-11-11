/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava3;
import javax.swing.JFrame;
import interfaces.Interfaz;
/**
 *LORENA SALINAS ROJO
 * FECHA:NOVIEMBRE 10 DE 2017
 * PROGRAMA:PRUEBAJAVA3
 * ATRIBUTOS DE LA VENTANA
 * @author LAB15
 */
public class Conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    Interfaz w = new Interfaz();

       w.setVisible(true);

       w.setBounds(0, 0, 400, 400);

       w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    //TODO code application logic here
    
    }
    
}
