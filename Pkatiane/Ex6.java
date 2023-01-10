/*Peso1,5)Senha forte-O time de TI do IFRS solicitou que fosse desenvolvido um sistema 
que verificasse se uma senha é forte.No entendimentodo time,uma senha forte não possui
caracteres repetidos.Foi solicitado que você desenvolvesse um programa que dado uma 
senha(palavra digitada)ao final mostrasse os caracteres repetidos,caso nenhum tenha se 
repetido,a mensagem de que a senha é forte.Obs1:para acessar uma letra de uma string,
pode ser utilizado o método em Java charAt(N) onde N representa a posição da letra 
começando em 0.Obs2:Não tem problema caso apareça várias vezes uma letra como repetida,
o importante é a mensagem final de que a senha é forte ou fraca.*/

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String senha = "";
        int cont = 0;

        System.out.println(" Informe uma senha , por favor ");
        senha = in.next();

        String repetidos = senha;

        for (int i = 0; i < senha.length(); i++) {

            for (int j = 0; j < senha.length(); j++) {

                if (repetidos.charAt(j) == senha.charAt(i) && j != i) {
                    System.out.println(repetidos.charAt(j) + " ");
                    cont++;
                }

            }

        }
        if (cont > 0) {
            System.out.println(" Senha Fraca !!!! ");

        } else {
            System.out.println(" Senha Forte !!!!");

        }

    }

}
