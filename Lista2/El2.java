/*Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
calcular e escrever a área e o perímetro do retângulo.*/

import java.util.Scanner;
public class El2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base, altura,area,perimetro;
        System.out.print(" Informe a base do retangulo : ");
        base = in.nextFloat();
        System.out.print(" Informe a altura do reatngulo : ");
        altura = in.nextFloat();
        area = (base * altura);
        perimetro = ( base + altura)*2;
        System.out.println(" O valor da area eh : " + area + " e do perimetro eh : " + perimetro);

    }

}