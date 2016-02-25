/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author Reyna Santos
 */
public class Dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int[] nota =new int [5];
        
        for (int i = 0; i < 5; i++) {
            
            nota[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota"));
        }
        double promedio= (nota[0]+nota[1]+nota[2]+nota[3]+nota[4])/5;
        JOptionPane.showConfirmDialog(null,"El promedio de las notas: "+nota[0]+"\n"+nota[1]+"\n"+nota[2]+"\n"+nota[3]+"\n"+nota[4]);
        JOptionPane.showConfirmDialog(null, "El promedio es: "+promedio);
    }
    
}
