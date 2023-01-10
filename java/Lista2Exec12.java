import java.util.Scanner;

public class Lista2Exec12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float qm, v1 , v2;
        System.out.println(" Informe a quantidade de maças compradas ");
        qm = in.nextFloat();

        if (qm < 12) {

            v1 = (1.50f * qm);
            System.out.println(" O valor total da compra é: " + v1);
            
        }
          else if( qm >=12){
              v2 = (1.30f * qm );
              System.out.println(" O valor total da compra é: " + v2);
          }

    }
    
}
/*12.As maçãs custam R$1.50 cada se forem compradas menos de uma dúzia,
e R$1.30 se forem compradas pelo menos 12.Escreva um programa que leia 
o número de maçãs compradas,calcule e escreva o custo total da compra.*/
