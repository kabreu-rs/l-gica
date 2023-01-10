/*Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit para
graus Celsius.
A fórmula para conversão é a seguinte:c/5 = f -32/9
Onde:
C = temperatura em graus Celsius;
F = temperatura em graus Fahrenheit.*/
import java.util.Scanner;
public class Ex5{
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );
        float tf, tc;
        System.out.println(" Informe uma temperatura : ");
        tf = in.nextFloat();
        tc = ((tf-32)/9)*5;
        System.out.println(" A temperatura em ºc eh : " + tc);

    }
}