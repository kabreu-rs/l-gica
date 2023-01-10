import java.util.Scanner;

public class Lista2Exec7 {
     public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        float sh,ht,slm, sld,sldi,di;

        System.out.print(" Informe sua remuneração por hora trabalhada? ");
        sh = in.nextFloat();
        System.out.print(" Informe quantas horas trabalha no dia? ");
        ht = in.nextFloat();
        slm = (sh *ht) * 30;
        sld = (slm - (slm / 100*15));

        System.out.println(" O salário do mês é : " + slm + 
        "e com desconto o salário é :" + sld );

        System.out.println(" Informe seu desconto em folha no mês? ");
        di = in.nextFloat();
        sldi = (slm - (slm / 100 * di));

        System.out.println(" O salário do mês é: " + sldi);

               


     }


}
/* Faça um algoritmo que pergunte quanto a pessoa ganha por hora(salário
 por hora)e o número de horas trabalhadas no mês.

Calcule e mostre o total do seu salário no referido mês e qual será seu salário atual.Calcule também o salário líquido
(desconto de impostos) considerando 15% de impostos e mostre esses valores.
a.Pergunte ao usuário qual a % de imposto que é descontada do salário.*/