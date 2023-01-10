/*Dada uma seqüência de n números, imprimi-la na ordem inversa à da leitura.*/

import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
       
       // int tamanho = 0 , n = 0;


        System.out.println(" Insira o tamanho da sequencia, por favor : ");
        int tamanho = in.nextInt();
       
        //System.out.println(" Insira os valores da sequencia , por favor : ");  
        int[]vetor = new int[tamanho];
        
        for (int i = 0; i < vetor.length; i++) {
          System.out.println(" Insira os valores da sequencia , por favor : ");  
          vetor[i] = in.nextInt();
          
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" A sequencia eh : " + (vetor[i]));
            
        }
        for (int i = tamanho -1; i >= 0; i--) {
            System.out.println(" A sequencia inversa eh : " + (vetor[i]));
            
        }
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    
}
