/*Criar um algoritmo que leia os elementos de uma matriz 
inteira 10x10 e escreva todos os elementos, exceto os 
elementos da diagonal principal.*/

import java.util.Random;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[][] valor = new int[10][10];

        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor[i].length; j++) {
                valor[i][j] = random.nextInt(101);

            }

        }
        System.out.println();
        System.out.println(" matriz ");
        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor[i].length; j++) {

                System.out.print(valor[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println(" Matriz sem diagonal principal ");
        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor[i].length; j++) {
                if (i != j) {
                    System.out.print(valor[i][j] + " ");

                }

            }
            System.out.println();
        }
        System.out.println();
    }

}
