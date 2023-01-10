/*Faça um programa que receba dois números e efetua a adição. Caso o valor
somado seja maior que 20, este deverá ser apresentado somando-se a ele 8; caso
o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se
10.*/
import java.util.Scanner;
public class El11{
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int n1,n2, soma, res;
        System.out.print(" Informe dois numeros quaisquer : ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        soma = ( n1 + n2);
        if (soma > 20) {
            res = soma + 8;
            System.out.println(" o resultado eh : " + res);
            
        } else if (soma <= 20) {
            res = soma -10;
            System.out.println(" O resultado eh : " + res);
            
        }

    }
}