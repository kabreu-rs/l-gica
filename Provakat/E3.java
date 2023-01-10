/*Corretor-Crie um programa que leia uma matriz 30x5 que se refere às respostas de
5 questões de múltipla escolha,referentes a 30 alunos.Leia também um vetor de 
tamanho 5 que contem o gabarito de respostas que podem ser A,B,C,D ou N.Seu 
programa deverá comparar as respostas de cada aluno com o gabarito e emitir um 
vetor resultado,contendo a pontuação correspondente,considerando que cada acerto 
soma 2 pontos,cada erro o aluno perde um ponto e caso a resposta não seja informada
(N), o aluno não perde nem ganha pontos.*/

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[][] matriz = new char[30][5];
        char[] gabarito = new char[5];
        int[] resultado = new int[matriz.length];
        int nota = 0;

        System.out.println("Armazenando o gabarito");
        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = in.nextLine().charAt(0);
        }

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe as respostas do aluno " + (i + 1) + " questão " + (j + 1) + ": ");
                matriz[i][j] = in.nextLine().charAt(0);
                System.out.println("");
            }
        }

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == gabarito[j]) {
                    nota += 2;

                } else if (matriz[i][j] == 'N') {
                    nota += 0;

                } else {
                    nota = nota - 1;
                }
                resultado[i] = nota;
            }
            nota = 0;
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < resultado.length; i++) {

            System.out.print(" A nota do aluno " + (i + 1) + " é : " + resultado[i] + "\n");
        }
        System.out.println();
    }
}
