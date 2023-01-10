/*Ler um valor e escrever se é positivo, negativo ou zero.*/
import java.util.Scanner;

public class Le1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        System.out.print(" Informe um numero: ");
        numero = in.nextInt();
        if (numero > 0) {
            System.out.println(" O numero eh positivo ");
            
        } else if (numero < 0) {
            System.out.println(" O numero eh negativo ");
            
        } else{
            System.out.println(" O numero é zero ");
            
        }

    }
}