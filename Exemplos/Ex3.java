/*Faça um programa que Java que dado um número inteiro maior ou igual a 1,mostre para o 
usuário a mensagem“Eu amo Java!!!” com a quantidadede letras o igual ao número digitado.
Por exemplo,se o número digitado for 3,a saída será“Eu amooo Java!!!*/
import java.util.Scanner;
public class Ex3{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = 0;
        int i =1;
        String letra = "o";

        System.out.println(" Digite um numero maior ou igual a 1 : ");
            n = in.nextInt();
               
        while (i < n) {
            letra += "o";
            i++;
             
        }
            
         System.out.println(" Eu am" + letra +  " Java !!!");   
    }



        

        
}
