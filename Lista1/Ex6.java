/*Desenvolva o algoritmo de um programa para calcular a média de duas notas das
avaliações de um aluno.*/
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        float n1 ,n2 , media;
        System.out.print(" Digite a primeira nota : ");
        n1 = in.nextFloat();
        System.out.print(" Digite a segunga nota : ");
        n2 = in.nextFloat();
        media = (n1 + n2)/2;
        
        System.out.println (" A média eh : " + media);
    }
}