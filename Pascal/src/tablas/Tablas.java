/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Reyna Santos
 */
public class Tablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int i;
int resultado;
int num;
num=Integer.parseInt(JOptionPane.showInputDialog("¿Qué tabla de multiplicar deseas?"));
System.out.println("Tabla del" + num);
System.out.println("—————–");

for (i=1; i<11; i++){
resultado =i*num;
System.out.println(num + " X "+i+" = "+resultado);
}
      */  
  /*      
        Scanner entrada = new Scanner(System.in);
        int niveles = 0;
        int[]arreglo = new int[1];
        System.out.println("Numeros de niveles");
        niveles = entrada.nextInt();
        for (int i = 1; i <= niveles; i++) {
            int[]tablas =new int[i];
            for (int j = niveles; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                if(k==0 || k==(i +1)){
                    tablas[k] = 1;
                   }else{
                    tablas[k] = arreglo[k] + arreglo[k+1];
                }
                System.out.print("["+tablas[k]+"]");
            }
       arreglo = tablas;
            System.out.println();
        }   
*/
  int tabla=0; 
  int columna=0;
  int fila=0;
  
        for (int i = 2; i <= fila; i++) {
            for (int j = 2; j <= columna; j++) {
              // tabla=([i,j]<=tabla[i,1]*tabla[1,j]);
              // tabla=([fila]*[columna]);
            }
        }
  
    }
    
}

