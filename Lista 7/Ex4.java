/*Criar um programa para identificar o valor a ser pago por um plano de saúde dada a
idade do conveniado considerando que todos pagam R$ 100 mais um adicional
conforme a seguinte tabela: 1) crianças com menos de 10 anos pagam R$80; 2)
conveniados com idade entre 10 e 30 anos pagam R$50; 3) conveniados com idade
entre 40 e 60 anos pagam R$ 95; e 4) conveniados com mais de 60 anos pagam
R$130.*/

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
         int idade , valor;


         System.out.println("Se sua idade for menor que 10 digite 1 \nSe sua idade for entre 10 e 30 anos digite 2 \nSe sua idade for entre 40 e 60 anos digite 3 \nE se for acima de 60 anos digite 4");
         
         System.out.println("Qual a opção que deseja : ");
         idade = in.nextInt();

         switch (idade) {
             case 1:
             valor = 100 + 80;
             System.out.println(" O valor da mensalidade é R$ " + valor);
                 
                 break;
         
             default:
                 break;
         }
         

     
         
    }
    
}
