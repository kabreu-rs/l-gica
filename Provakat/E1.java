/*Faça um programa para gerar automaticamente números entre 0 e 99 de uma cartela
de bingo.Sabendo que cada cartela deverá conter 5 linhas de 5 números,gere estes
dados de modo a não ter números repetidos dentro das cartelas.O programa deve
exibir na tela a cartela gerada.*/

import java.util.Random;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[][] cartela = new int[5][5];
        int aux = 1;

        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {

                cartela[i][j] = random.nextInt(100);

                for (int m = 0; m < cartela.length; m++) {
                    for (int n = 0; n < cartela[m].length; n++) {
                        if ((i == m && j == n) || (((m * cartela.length) + n) > (i * cartela.length) + j)) {
                            aux = 1;

                        } else if (cartela[i][j] == cartela[m][n]) {
                            cartela[i][j] = random.nextInt(100);
                            break;

                        }
                    }

                }
                if (aux == 0) {
                    j = j - 1;
                    break;

                }

            }

        }
        System.out.println(" A cartela eh : ");

        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                System.out.print(cartela[i][j] + " ");

            }
            System.out.println();

        }

    }

}
