/*Criar um programa para calcular o valor da multa a ser paga de anuidade de uma
associação. A anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5%
de juros (com juros sobre juros). Por exemplo, uma associação de R$100 paga em
janeiro, custa R$ 100; em fevereiro, custa R$105; em março, custa R$110,25; e, em
dezembro, R$171,03*/

import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);

        int mes;
        float multa;
        
        System.out.println(" Qual o mes da mensalidade que deseja pagar? ");
        mes = in.nextInt();
        System.out.println(" Qual o valor da multa a ser paga : ");
        multa = in.nextFloat();
       
        switch (mes) {
            case 1:
                System.out.println("O valor da mensalidade é : " + multa);
                
                break;
            case 2:
                for (int i = 1; i < mes; i++) {
                    multa += multa * 0.05f;                    
                }
                System.out.println(" O valor da mensalidade é : " + multa);

                break;
        
            default:
                break;
        }
        
    }
    
}
