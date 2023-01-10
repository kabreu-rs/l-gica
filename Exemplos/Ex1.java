/*Faça um programa que leia 100 valores inteiros e informe quantos deles são divisíveis por 3,
quantos são divisíveis por 5 e quantos são divisíveis por 3 e por5.*/
import java.util.Scanner;
public class Ex1{
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        int numero = 1;
        int cont = 0;
        int cont1 = 0;
        int cont2 = 0;
      
        while (numero <= 100) {

            if (numero % 3 == 0 && numero % 5 == 0) {
                cont ++;
            }else if (numero % 3 == 0) {
                cont1 ++;

            } else if (numero % 5 == 0) {
                cont2 ++;
                
            }    numero ++;           

        }    
            System.out.println(" O total de numeros divisiveis por 3 eh : " + cont1);
            System.out.println(" O total de numeros divisiveis por 5 eh : " + cont2);
            System.out.println(" O total de numeros divisiveis por 3 e 5 sao : " + cont);            
    }

}


/*int numero = 1;

while (numero <= 100) {

    if (numero % 3 == 0 && numero % 5 == 0) {
        System.out.println("BuzzFeed");
    } else if (numero % 3 == 0) {
        System.out.println("Buzz");
    } else if (numero % 5 == 0) {
        System.out.println("Feed");
    } else {
        System.out.println(numero);
    }

    numero++;*/