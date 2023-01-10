import java.util.Scanner;

public class AproximacaoDePi {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Quantas interacoes serao feitas?");
        int iteracoes = in.nextInt();
        double pi, soma;
        int i;

        soma = 0;
        for (i = 0; i < iteracoes; i++) {

            if (i % 2 == 0) {
                soma = soma + 1.0 / (2 * i + 1);
            } else {
                soma = soma - 1.0 / (2 * i + 1);
            }
        }

        pi = 4 * soma;

        System.out.printf("O valor aproximado de pi é (%.16f) ", pi);

    }

}
