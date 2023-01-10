/*Faça um programa onde você declara um vetor de 10 posições que receba respectivamente
10 valores do tipo float(você deverá digitá-los via teclado).Apresente então, a média
 desses 10 valores.*/
 
import java.util.Scanner;


public class E3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

       
         final int Tamanho = 5;
         
         float soma =0f , media = 0f;
         
         float[] vetor;
         vetor = new float [Tamanho];
        
         System.out.println(" Informe os" + Tamanho + " valores aleatórios, por favor  ");
         System.out.println();
         
         for (int i = 0; i < vetor.length; i++) {
             System.out.println(" Informe os valores  " + ( i + 1) + " : ");
             vetor[i] = in.nextFloat();
                     
        }
        System.out.println(" Seus valores digitados : ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor [i] + "\t");
                      
        }
        System.out.println();

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];            
        }
         media = soma / Tamanho;

         System.out.println(" A média dos valaroes são ; " + media);

    }

    
}
