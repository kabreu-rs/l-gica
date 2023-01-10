/*Faça um programa que leia 10 valores do teclado,e que imprima esses valores divididos
em 2 etapas:primeiro,somente os valores pares,e depois,somente os valores ímpares.
Identifique cada valor escrevendo ao lado do valor se ele é par ou ímpar.*/

import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor;
        vetor = new int[10];
        
        
        //System.out.println(" Informe " + (i + 1) + " números quaisque, por favor : ");

        for (int i = 0; i < vetor.length; i++) {
          System.out.println(" Informe  " + (i + 1) + " números quaisque, por favor : ");
          vetor[i] = in.nextInt();
        }
        System.out.println("\t");
        for (int i = 0; i < vetor.length; i++) {

            System.out.println(" Os valor eh :  ");

            if (vetor[i] % 2 == 0) {

                System.out.println( vetor[i] + " Par " );
                
            } else {
                System.out.println( vetor[i] + " Ìmpar ");
                
            }

            
        }
    }
    
}
