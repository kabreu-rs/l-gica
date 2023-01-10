/*Ler um valor e escrever se é positivo ou negativo (considere o valor zero como
positivo).*/

import java.util.Scanner;
public class El3{
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int  numero;
        System.out.print(" Informe um numero: ");
        numero = in.nextInt();
        if (numero >= 0) {
            System.out.println(" O numero é positivo ");
            
        } else {
            System.out.println(" O numero é negativo ");
            
        }
    }
}