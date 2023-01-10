/*Ler um número inteiro n. Decidir se n é um número primo e apresente o resultado.*/

import java.util.Scanner;
public class Ee3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n , number = 1 , contador = 0 ;
        

        System.out.println(" Informe um numero, por favor?: ");
        n = in.nextInt();
         while (number  <= n){
            if(n % number == 0) {
                contador++;              
                               
            }  

          number++;
            
        } if (contador <= 2) {

            System.out.println(" O número é primo !!!!" + n);
            
        } else{
            System.out.println(" Ele não é primo!!!!");
        }

    }
}