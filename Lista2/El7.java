/*Faça um algoritmo que pergunte quanto a pessoa ganha por hora (salário por hora)
e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
referido mês e qual será seu salário atual. Calcule também o salário líquido
(desconto de impostos) considerando 15% de impostos e mostre esses valores.
a. Pergunte ao usuário qual a % de imposto que é descontada do salário.*/
import java.util.Scanner;
public class El7{
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        float sh, ht,slm,sld,di, sldi;
        System.out.print("Informe o valor da sua hora trabalhada : ");
        sh = in.nextFloat();
        System.out.print(" Informe quantas horas trabalhadas mes : ");
        ht = in.nextFloat();
        slm = ( sh * ht);
        sld = ( slm - (slm/100*15));
        System.out.println(" Seu salario sem desconto eh : " + slm + " e com desconto sera : " + sld);
        System.out.print(" Informe seu desconto em folha  : ");
        di = in.nextFloat();
        sldi = ( slm-(slm / 100 * di));
        System.out.println(" O slario a receber eh : " + sldi);
        
    }
}