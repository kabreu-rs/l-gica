/*Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive). Se o valor
lido não estiver entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor. Após
a leitura do valor, escrever o valor lido na tela.*/

import java.util.Scanner;
public class Ee6{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       
       int a = 0;
       boolean continuar = true;
      
       while (continuar) {
       
        System.out.println(" Informe um numero ");
        a = in.nextInt();
        
        if (a >= 1 && a <= 10) {
         
         System.out.println(" Este numero " + a + " esta entre 1 e 10 " );
           continuar = false;
        } else {
         
         System.out.println(" Ah!!! Não acertou!!!");
 
        }
       
           
       }
     /*  System.out.println(" Informe um numero ");
       a = in.nextInt();
       
       if (a >= 1 && a <= 10) {
        
        System.out.println(" Este numero esta entre 1 e 10 " + a);
           
       } else {
        
        System.out.println(" Ah!!! Não acertou!!!");

       }*/
       
        
         
    }

}