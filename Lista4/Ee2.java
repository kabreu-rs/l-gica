/*Ler um número inteiro n. Escrever a soma de todos os números pares de 2 até n.*/
import java.util.Scanner;

public class Ee2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
          
        System.out.print(" Informe un numero : ");
        n = in.nextInt();

        int numero =2;
        int soma = 0;

        while (numero <= n) {
            System.out.println(numero);
            soma = soma + numero;
            numero = numero + 2;
                   
       } 
           System.out.println(" A soma dos numeros n : " + soma);

    }    
    
    
}
        
    
            
            
        