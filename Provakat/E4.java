/*Somador-Desenvolva um programa que leia uma matriz de tamanho 5x5.Apartir daí 
o programa deve perguntar ao usuário um valor X qualquer e o programa deve 
informar se a soma dos elementos de alguma das linhas ou das colunas resulta neste
valor X, informando qual foi a linha ou coluna.O programa deve permitir que o
usuário repita essa pesquisa até que o usuário informe o valor 0.*/

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        
        int numero = 1;
        int somador = 0;
        int somador1 = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" Informe valores para linha " + i + " coluna " + j + " : ");
                matriz[i][j] = in.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        while (numero != 0) {

            System.out.println(" Informe um valor Qualquer , por favor ? ");
            numero = in.nextInt();

            if (numero == 0) {
                break;
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    somador += matriz[i][j];

                }
                if (numero == somador) {
                    System.out.println(" O resultado da soma na linha " + i + " é : " + somador);
                }
                somador = 0;

            }
            System.out.println();
            for (int j = 0; j < matriz.length; j++) {
                for (int i = 0; i < matriz[j].length; i++) {
                    somador1 += matriz[i][j];

                }
                if (numero == somador1) {
                    System.out.println(" O resultado da soma da coluna " + j + " é : " + somador1);

                }
                somador1 = 0;
            }
        }

    }

}
