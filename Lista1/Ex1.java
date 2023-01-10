
/* Desenvolva o algoritmo de um programa onde o usuário irá informar um número
inteiro e o programa deve calcular e exibir o número imediatamente antecessor ao
número digitado pelo usuário.*/

import java.util.Scanner;

 public class Ex1{
     public static void main (String[]args){
         Scanner in = new Scanner ( System.in);
         int numero , antecessor;
         System.out.print(" Digite um numero : ");
         numero = in.nextInt();
         antecessor =( numero - 1);
         System.out.println( " o antecessor eh : "+ antecessor);


     }
 }
     