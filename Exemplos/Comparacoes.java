import java.util.Scanner;

public class Comparacoes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valor;
        int positivo;
        int negativo;
        int nulo;
        valor = 0;
        positivo = 0;
        negativo = 0;
        nulo = 0;

        for (int i = 0; i < 100; i++) {

            System.out.println("Informe " + (i + 1) + " º valor ");
            valor = in.nextInt();

            if (valor > 0) {

                positivo++;
            } else if (valor < 0) {
                negativo++;

            } else {
                nulo++;
            }

        }

        System.out.println(" São positivo! " + positivo);
        System.out.println(" São negatitivos " + negativo);
        System.out.println(" São nulos " + nulo);

    }
}


   