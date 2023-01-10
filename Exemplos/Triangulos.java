import java.util.Scanner;
public class Triangulos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Informe o ângulo A ");
        a = in.nextInt();

        System.out.println("Informe o ângulo B ");
        b = in.nextInt();

        System.out.println(" Informe o ângulo C ");
        c = in.nextInt();

        if ((a != 90 && b != 90 && c != 90) && (a > 90 || b > 90 || c > 90)) {
            System.out.println(" Triângulo Obtusangulo ");

        }

        if (a < 90 && b < 90 && c < 90) {
            System.out.println(" Triângulo Acutangulo ");

        }

        if (a == 90 || b == 90 || c == 90) {
            System.out.println(" Triângulo Retangulo ");
        }

    }

}

