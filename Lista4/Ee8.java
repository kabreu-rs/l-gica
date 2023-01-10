/*Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva
um algoritmo que permita a entrada das seguintes informações:
a) o número total de mercadorias no estoque
b) o valor de cada mercadoria.
Ao final imprimir o valor total em estoque e a média dos valores das mercadorias*/

import java.util.Scanner;
public class Ee8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tmer = 0;
        float vmerc = 0 ;
        int contador = 1;
        float valorto = 0 , mediamerc = 0;

        System.out.println(" Informe o total de mercadoria no estoque: ");
        tmer = in.nextInt();
                
        while ( tmer >= contador) {
         System.out.println(" Informe o valor de cada mercadoria : ");
         vmerc = in.nextFloat();
         
         valorto = vmerc + valorto;

         contador ++;   
                            
        }
        mediamerc = valorto / tmer;
        
        System.out.println(" O valor total em estoque é " + valorto);
        System.out.println(" A média dos valores das mercadorias é "+ mediamerc);

    }
    
}
