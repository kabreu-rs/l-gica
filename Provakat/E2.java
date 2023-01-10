/*Baguncinha-Dado um vetor de tamanho 10 e números inseridos pelo usuário,permitir,
dentro de um laço de repetição,que o usuário escolha entre duas opções,girar ou 
visualizar.A opção girar aceita um número inteiro que“gira”o vetor avançando ou 
voltando com os valores de acordo com a quantia definida pelo usuário.O menu de 
visualizar mostra a situação atual do vetor.
Exemplo
[1, 2, 3, 4, 5]
Girar: 2
[4, 5, 1, 2, 3]
Girar: -1
[5, 1, 2, 3, 4]*/

import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int tamanho = 10;
        int []vetor = new int[tamanho];
        int girar = 1;
        int op = 3;
        int aux;

        System.out.println(" Informe os valores " + (tamanho) +" aleatórios, por favor ? " );
        System.out.println();

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" Informe 10 valores " + (i + 1) + " desejado : ");
            vetor[i] = in.nextInt();                         
        }
        System.out.println();

        System.out.println();
       /* for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");            
        }*/

        System.out.println();
       
        while (op != 0) {
            System.out.println("Escolha : 1 - visualizar ou 2 - girar ? ");
            op = in.nextInt();

            if (op == 1) {
               
                for (int i = 0; i < vetor.length; i++) {
                    System.out.print(vetor[i] + " ");
                }           
                                
            }
            if (op == 2) {

                System.out.println(" Quantas posições deseja rotacionar ? ");
                girar = in.nextInt();

                
                    for (int j = 0; j < girar; j++) {

                        if (girar < 0) {
                            girar = girar - tamanho + 1;                           
                        }
                                                                  
                    }
                   
                        
            }
                           
        }
            
    } 

            
        
}

    

