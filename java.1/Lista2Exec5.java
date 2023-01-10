import java.util.Scanner;

public class Lista2Exec5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float n1, n2 , resultado;

        System.out.println(" informe dois números quaisquer ");

        n1 = in.nextFloat();
        n2 = in.nextFloat();
        resultado= (n1/n2);

        if (n2 != 0) {

            System.out.println(" O resultado é " + resultado);
            
        } else {

            System.out.println(" Não foi pssível resolver o cálculo ");
            
        }


    }
    
}
/*Escreva um programa que faça a leitura de dois valores reai se faça a divisão entre eles se o
denominador não for zero.Ao final deve ser impresso o resultado ou uma mensagem de erro*/