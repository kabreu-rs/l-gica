/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365
dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.
a. Desafio e pesquisa: utilizando a classe Calendar ou Date do Java, peça que
o usuário informe sua data de nascimento e o sistema irá calcular quantos
anos, meses e dias a pessoa viveu.*/

import java.util.Scanner;
public class El6{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int anos,meses, dias,idade;
        
        System.out.println(" Qual sua idade em anos, meses e dias ? ");
        anos = in.nextInt();
        meses = in.nextInt();
        dias = in.nextInt();

        idade = ((anos *365) + (meses * 30) + dias);

        System.out.println(" A sua idade em dias é : " + idade );
        
    }
}