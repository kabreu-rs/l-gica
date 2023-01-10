/*Escreva um algoritmo para ler 2 valores e, se o segundo valor informado for ZERO,
deve ser lido um novo valor, ou seja, para o segundo valor lido não pode ser aceito o
valor zero. Após ler os 2 valores, imprimir o resultado da divisão do primeiro valor
lido pelo segundo valor lido*/

import java.util.Scanner;
public class Ee11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 , n2 , div;
        
        System.out.println(" Informe dois números quaisquer ? ");
            n1 = in.nextInt();
            n2 = in.nextInt();
        
        while (n2 == 0){

           System.out.println(" Por favor, informe outro némero diferente de zero : ");
           n1 = in.nextInt();   
           n2 = in.nextInt();           
        } 
        div = n1/n2; 
        System.out.println(" O valor eh : " + div);
    }
    
}
