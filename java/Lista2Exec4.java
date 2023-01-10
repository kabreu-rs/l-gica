import java.util.Scanner;

public class Lista2Exec4{
     public static void main(String[] args) {
                    
         Scanner in = new Scanner( System.in);
         int n1, n2;


         System.out.println("informe dois números quaisquer");

         n1 = in.nextInt();
         n2 = in.nextInt();

         
         
         if ( n1 > n2) {

            System.out.println(" O valor de n1 é o maior =  " + n1);
             
         } else {

            System.out.println(" O valor de n2 é o maior = " + n2);


             
         }
        
    }
}



    /*Escreva um programa que faça a leitura de dois valores inteiros e descubra qual deles é o maior, imprimindo na
     resposta o nome da variável e o seu valor.*/

     