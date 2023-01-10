/*Escreva um programa que pergunte o raio de uma circunferência, e sem seguida
mostre o diâmetro, comprimento e área da circunferência. Considere PI = 3.141692*/
import java.util.Scanner;
public class El10{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float raio, diametro, comprimento, area;
        System.out.print(" Informe o raio da circunferencia : ");
        raio = in.nextFloat();
        diametro = (2 * raio * 3.141592f);
        comprimento = (2 * raio);
        area = (raio * raio * 3.141692f);
        System.out.println(" O valor do diametro da circunferencia eh : " + diametro);
        System.out.println(" O valor do cumprimento da circunferencia eh : " + comprimento);
        System.out.println(" O valor da area da circunferencia eh : " + area);
    }
}