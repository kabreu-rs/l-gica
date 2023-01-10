/*As maçãs custam R$ 1.50 cada se forem compradas menos de uma dúzia, e R$
1.30 se forem compradas pelo menos 12. Escreva um programa que leia o número
de maçãs compradas, calcule e escreva o custo total da compra.*/
import java.util.Scanner;
public class El12{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float qm, v1,v2;
        System.out.print(" Informe a quantidade de maças adquiridas : ");
        qm = in.nextFloat();
        if (qm < 12) {
            v1 = (qm * 1.5f);
            System.out.println(" O valor da compra das maças eh : $ " + v1);
              
        }else if (qm >= 12) {
            v2 = ( qm * 1.30f);
            System.out.println(" O valor da compra das maças eh : $ " + v2);
            
        }
    }
}