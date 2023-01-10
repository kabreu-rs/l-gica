import java.util.Scanner;

/**
 * Faça um  algoritmo que converta metros para centímetros.Lembrando que 1m=100cm
 */
public class Lista2Exec01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, cm, conversao;

        System.out.println(" Digite um valor em metros");
        m = in.nextInt();

        conversao = (m*100);

        System.out.println( "O valor em cm é : " + conversao);


    }
}