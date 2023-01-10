/*Faça um programa que receba a 5 notas de um aluno, através do comando while, e
que apresente ao final a média dessas 5 notas. Você deverá ter apenas uma
variável nota, e uma variável média.*/


import java.util.Scanner;
public class Ee5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int qtdadenotas = 0;
        float media = 0 , notas;
        
        while  (qtdadenotas< 5) {
            System.out.println(" Informe as notas dos alunos ? ");
            notas = in.nextFloat();
            media = notas + media;
            qtdadenotas++;            
        }
        media = media/5;
        System.out.printf("A media final é %.2f  " , media);
     
   }   

    
}
