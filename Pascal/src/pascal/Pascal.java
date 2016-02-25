/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal;

import java.util.Scanner;

/**
 *
 * @author Reyna Santos
 */
public class Pascal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int niveles = 0;
        int[]arreglo = new int[1];
        System.out.println("Numeros de niveles");
        niveles = entrada.nextInt();
        for (int i = 1; i <= niveles; i++) {
            int[]pascal =new int[i];
            for (int j = niveles; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                if(k==0 || k==(i -1)){
                    pascal[k] = 1;
                   }else{
                    pascal[k] = arreglo[k] + arreglo[k-1];
                }
                System.out.print("["+pascal[k]+"]");
            }
       arreglo = pascal;
            System.out.println();
        }   
        
    }
    
}
