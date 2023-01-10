/*. Escreva um algoritmo para ler um salário. O algoritmo deve “validar” a leitura do
salário para aceitar somente um “salário válido”. Você deve definir o que é um
“salário válido”. Escrever o salário lido*/

import java.util.Scanner;
public class Ee10 {

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int salario = 0;

        System.out.println(" Informe seu salário, por favor? R$ ");
        salario = in.nextInt();


        while (salario <= 1100 || salario > 5000){

            System.out.println(" Informe seu salário, por favor? R$ ");
            salario = in.nextInt();

        }

        System.out.println(" O seu salário é R$ " + salario);
    }
    
}
