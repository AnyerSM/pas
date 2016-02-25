/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multi;

import java.util.Scanner;

/**
 *
 * @author Reyna Santos
 */
public class Mutidi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arreglo1[][] = new int[5][5];
        Scanner datos = new Scanner(System.in);
        
        System.err.println("Ingresa los valores del arreglo");
        for(int x=0; x<arreglo1.length; x++){
            for(int y=0; y<5; y++){
                arreglo1[x][y] = datos.nextInt();
                System.out.println("Columna"+x+"fila"+y+"valores: "+arreglo1[x][y]);
            }
        }
        
    }
    
}
