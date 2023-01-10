
import java.util.Scanner;
public class E17 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int[] vetor;
        vetor = new int[20];
        

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" Informe o " + (i + 1) + " numero desejado : ");
            vetor[i] = in.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" Os valores são : " + vetor[i]);
                        
        }
        //int i = 0;
        int aux = 0;
        for (int i = 0; i < vetor.length ; i++) {
                aux = vetor[i];
                vetor[i] = vetor[i + 10];
                vetor [i + 10] = aux;
            if (i == 9) {
                for (int j = 0; j < vetor.length; j++) {
                 
                    System.out.println(" Os valores invertidos são: " + vetor[j]);
                                        
                }
                break;
            }
        }          
      
    }
    
}
