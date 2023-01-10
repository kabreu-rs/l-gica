import java.util.Scanner;

/*Escreva um algoritmo para ler as dimensões de um retângulo(base e altura),calcular 
 e escrever a área e o perímetro do retângulo.*/

/**
 * Lista2Exec2
 */
public class Lista2Exec2 {
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base, altura, area, perimetro;

        System.out.println("informe a base do retangulo");
        base = in.nextInt();
        System.out.println("Informe a altura do retangulo");
        altura= in.nextInt();

        area = (base*altura);
        perimetro = 2*(base+altura);

        System.out.println("O valor da area é " + area + "O valor do perimetro é "+ perimetro);
        



    }

    
}

