/*7.(Peso1,5)O inversor-Crie um programa que leia um valor de 4 digitos(inteiro)
e inverta a ordem dois dígitos,isto é,caso o usuário digite 1234 a saída do 
programa deverá ser 4321.*/

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int numero,num1 , num2, num3,num4;
        

        System.out.println(" Informe um numero de 4 digitos ? ");
        numero = in.nextInt();

        num1 = numero % 10;
        num2 = (numero % 100) / 10;
        num3 = (numero /100) %10;
        num4 = numero /1000;

        System.out.println( " O numero inverso é : " + num1 + num2 + num3 + num4);
    }
    
}
