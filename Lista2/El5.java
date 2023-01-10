/*Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre
eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma
mensagem de erro.*/

import java.util.Scanner;


public class El5{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float n1 , n2, divisao;
        System.out.print(" Informe um múmero : ");
        n1 = in.nextFloat();
        System.out.print(" Informe um número : ");
        n2 = in.nextFloat();
        divisao = (n1/n2);
        if (n2!=0) {
            System.out.println(" O resultado eh : " + divisao);
                        
        } else {
            System.out.println( " não foi possivel realizar o seu desejo!!!! ");
            
        }

    }
}