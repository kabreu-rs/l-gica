import java.util.Scanner;

public class Lista2Exec16 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        float sl, ve,pe, pce;

        System.out.println(" Informe seu salário ");
        sl = in.nextFloat();
        System.out.println(" informe o valor do empréstimo desejado ");
        ve = in.nextFloat();
        System.out.println(" Informe o número de parcelas desejadas ");
        pe = in.nextFloat();
        pce = ((ve * 100)/sl);

        if (pce <= 30) {

            System.out.println(" Uhuu!!! Você conseguiu o empréstimo");
            
        } else {
            
            System.out.println(" Ahhh!!! Esse valor ultrapassa a linha de crédito ");
        }
    }
    
}
/*16.Uma empresa abriu uma linha de crédito para os funcionários.O valor da 
prestação não pode ultrapassar 30% do salário.Faça um programa que receba o 
salário,o valor do empréstimo e o número de prestações e informe se o 
empréstimo pode ser concedido.Nenhum dos valores informados pode ser zero ou
 negativo.*/
