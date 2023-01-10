import java.util.Scanner;

public class Lista2Exec9 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        double raio, dia, com, area;

        System.out.println(" Informe o raio da circunferência : ");
        raio = in.nextFloat();
        dia = 2 * 3.141692 * raio;
        com = 2 * raio;
        area = 3.141692 * raio * raio;

        System.out.println(" O diâmetro da circunferência é: " + dia);
        System.out.println(" O comprimento da circunferência é: " + com);
        System.out.println(" A area da circunferência é: " + area);

    }

    
}
/*9.Escreva um programa que pergunte o raio de uma circunferência,
e sem seguida mostre o diâmetro, comprimento e área da circunferência. 
Considere PI = 3.141692*/