/*Uma empresa abriu uma linha de crédito para os funcionários. O valor da prestação
não pode ultrapassar 30% do salário. Faça um programa que receba o salário, o
valor do empréstimo e o número de prestações e informe se o empréstimo pode ser
concedido. Nenhum dos valores informados pode ser zero ou negativo.*/
import java.util.Scanner;
public class El16{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float sl, ve, pe, pce;
        System.out.print(" Informe seu salario R$ :  ");
        sl = in.nextFloat();
        System.out.print(" Informe o valor do emprestimo desejado R$ : ");
        ve = in.nextFloat();
        System.out.print(" Informe o numero de prestações desejadas : ");
        pe = in.nextFloat();
        pce = ((ve * 100)/sl);
        if (pce <= 30) {
            System.out.println(" uhuuu!! Voce conseguiu o emprestimo!!! ");
            
        } else {
            System.out.println(" Ah!! Esse valor ultrapassa a linha de credito ofertado ");
            
        }


    }
}