/*Ler um número inteiro n. Escrever a soma de todos os números de 1 até n.*/
import java.util.Scanner;
public class Ee1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;        
                 
        System.out.println(" Informe um  numero N qualquer : ");
            n = in.nextInt(); 

            int numeros = 1;
            int soma = 0;

            while (numeros <= n) {
                System.out.println(numeros);
                soma = soma + numeros;
                numeros++;
                                       
            }   
             System.out.println(" Soma igual a : " + soma);                                                                        
                
    

                     
    } 
            

}


