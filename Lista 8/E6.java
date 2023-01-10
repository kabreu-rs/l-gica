/*Escreva uma palavra,letra por letra,colocando cada letra em um vetor.Ao final,imprima
na tela a palavra digitada,com o formato de uma palavra(uma letra após a outra).*/

import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String palavra = "";
        int tamanho = 0;

        System.out.println(" Qual o tamanho da palavra :  ");
        tamanho = in.nextInt();
        char[] vetor = new char[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" Digite a " + (i + 1) + " letra desejada : ");
            vetor[i] = in.next().charAt(0);
        }
        for (int i = 0; i < vetor.length; i++) {
            palavra += vetor[i];
                 
        }
        System.out.println(" A palavra eh :\t " + palavra);
    }

}