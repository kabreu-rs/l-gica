/*Desenvolva o algoritmo de um programa onde o usuário irá informar um número
inteiro e o programa deve calcular e exibir quadrado do número informado pelo
usuário.*/
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        int numero,res;
        System.out.print(" Informe um numero: ");
        numero = in.nextInt();
        res = ( numero * numero);
        System.out.println(" O número ao quadrado eh : " + res);


        
    }
}
