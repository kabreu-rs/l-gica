/*Peso1,5)Soma iterativa-A professora de matemática Débora solicitou ajuda aos alunos 
do TADS para a criação de um programa que permitisse que os alunos entendessem melhor 
as Progressões Aritméticas.Para cada entrada X,Y,Z,indicando valor inicial,valor final
e incremento,o programa deveria mostrar todos os valores na tela bem como a soma destes.
O programa deveria permitir que os alunos testassem várias vezes,logo,uma repetição
seria necessária.Em comum acordo com a professora,ficou documentado que caso a entrada
fosse X=0,Y=0 e Z=0 o programa encerraria.Desenvolva o programa para que os alunos se
tornem  mestres de progressões aritméticas.*/

import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y , z, soma = 0;
        

        do {
            System.out.println(" Informe o valor inicial, por favor : ");
            x = in.nextInt();
            System.out.println(" Informe o valor final, por favor : ");
            y = in.nextInt();

            System.out.println(" Por favor, informe o valor da razão : ");
            z = in.nextInt();

            for (int i = x; i < y; i += z) {
                soma = soma + i;
                System.out.print( i  + "  ");                
            }
            System.out.println( " \n O valor total é : " + soma ); 
            soma = 0;         
        } while (x !=0 && y != 0 && z != 0);
        

        
    }
    
}
