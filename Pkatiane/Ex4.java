/*(Peso1,5)Me localiza-Um grupo de estudantes do TADS desenvolveram um brinquedo digital
que permitia que crianças estudassemos quadrantes de matemática,para isso,a criança 
digitava dois valores,representando as coordenadas X e Y e o programa devolvia o quadrante
resultante.Caso a criança colocasse como entrada algum valor igual a 0 e outro difum eixo(vertical ou horizontal).Caso os 
valores fossem ambos iguais a zero,o brinquedo indicava a origem e se desligava. Crie
um algoritmo em JAVA que simule o comportamento do brinquedo.*/

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;

        do {
            System.out.println(" Informe dois valores x e y por favor ? ");
            x = in.nextInt();
            y = in.nextInt();
           
            if (x > 0 && y > 0) {
                System.out.println(" Pertence ao 1° quadrante !!! ");
            } else if (x < 0 && y > 0) {
                System.out.println(" Pertence ao 2° quadrante !!!!");

            } else if (x < 0 && y < 0) {
                System.out.println(" Pertence ao 3° quadrante !!!!");
            } else if (x > 0 && y < 0) {
                System.out.println(" Pertence ao 4° quadrante !!!");
            } else if (x == 0 && y != 0) {
                System.out.println(" Pertence ao eixo vertical !!! ");
            } else if (x != 0 && y == 0) {
                System.out.println(" Pertence ao eixo horizontal !!!");
            } else {
                System.out.println(" Esta na origem !!!");
            }
        } while (x != 0 || y != 0);

    }

}