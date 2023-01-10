/*Faça um programa,utilizando vetores,que armazene o resultado 
de uma votação.Considere que você tem 5 candidatos,e para cada
voto,você deverá digitar 1,2,3,4 ou 5.que correspondem aos 
códigos de cada candidato.O programa deve parar de receber 
votos quando for digitado -1.Outros valores devem ser ignorados
NoFinal,indique qual o candidato vencedor da votação.*/

import java.util.Scanner;
public class E7 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

       // voto = 0;
       // int cand1, cand2, cand3,cand4, cand5;
        //int op = 0;
        int[]op = new int[5];
       
        do {

            for (int i = 0; i < op.length; i++) {
                System.out.println(" Informe o seu voto : ");
                op [i]= in.nextInt();
                
            }
            
        } while (op != -1);
    }
}
