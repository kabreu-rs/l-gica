/*Escreva um programa que faça a leitura de dois valores inteiros e descubra qual
deles é o maior, imprimindo na resposta o nome da variável e o seu valor.*/
import java.util.Scanner;
public class El4{
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int na,nb;
        System.out.println("Informe dois numeros quaisquer : ");
        na = in.nextInt();
        nb = in.nextInt();

        if (na > nb) {
            System.out.println(" na é o maior " + na );
                        
        } else {
            System.out.println(" nb é maior " + nb);
            
        }
    }
}