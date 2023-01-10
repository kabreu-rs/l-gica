/*Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
(codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser
pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 4.30 e o preço do
litro do álcool é R$ 3.90.*/
import java.util.Scanner;

public class Le7{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char  combustivel;
        int litros;
        float desc , valorpago;

        System.out.println(" Qual o combustível deseja ? ");
        combustivel = in.next().charAt(0);
        System.out.println(" Qtos litros deseja abastecer ? ");
        litros = in.nextInt();  

        if (combustivel == 'A') {
            if (litros <= 20) {
                desc = (litros * 0.03f);                
            } else {
                desc = (litros * 0.05f);
            }

          valorpago = ((litros * 3.90f) - desc);

          System.out.printf(" O valor total é  R$ : %.2f  " , valorpago);
           
        } else if (combustivel == 'G' ) {
            if (litros <= 20) {
                desc = (litros * 0.04f);
                
            } else {
                desc = ( litros * 0.06f);
            }
            valorpago = ((litros * 4.30f) - desc);

            System.out.printf(" O valor total é R$ : %.2f  " , valorpago);
            
        }

        
       
    }


}