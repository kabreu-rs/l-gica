import java.util.Scanner;

public class Lista2Exec3 {
    /*Ler um valor e escrever se é positivo ou negativo(considere o valor zero como positivo)*/
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int valor;

         System.out.println("informe um número ");
         valor = in.nextInt();

         if (valor >=0) {

            System.out.println(" Número positivo ");
             
         } else { System.out.println(" Número negativo ");
             
         }
     
        
     }
    
}