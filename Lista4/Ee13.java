/*. Faça um programa que receba 3 notas de um aluno, e escolha apenas as duas
maiores notas para o cálculo da média. Apresente a média final, entre as duas
maiores notas. Dica: utilize 3 comandos if.*/

import java.util.Scanner;
public class Ee13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         float n1 , n2 , n3, media = 0;
         
         System.out.print(" Informe a 1° nota :");
         n1 = in.nextFloat();
         System.out.print(" Informe a 2° nota : ");
         n2 = in.nextFloat();
         System.out.println(" informe a 3° nota : ");
         n3 = in.nextFloat();
         
         while (media < 7 ) {

            if (n1 > n2 && n3 > n2) {
                media = (n1 + n3 ) /2;
                
            }
            if (n2 > n1 && n3 > n1) {
                media = (n2 + n3) / 2;
                
            }
            if (n2 > n3 && n1 > n3) {
                media =(n1 + n2)/2 ;
                
            }
            
             System.out.println(" A media do aluno eh : " + media);
         }
        
    }
    
}
