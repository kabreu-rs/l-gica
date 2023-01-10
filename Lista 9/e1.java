/*Faça um programa que leia duas matrizes 3x3 e apresente 
o resultado na tela.A soma de matrizes é feita utilizando 
a seguinte regra:

C = A+B = [0 1 2   + [4 2 3  ]  = [ 4 3 5]
           4 0 1]     3 5 9         7 5 10*/
           

import java.util.Scanner;
public class e1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] a = new int [2][3];
        int [][] b = new int [2][3];
        int [][] c = new int [2][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" Digite matriz A linha " + i + " e a coluna  " + j + " : ");
                a [i][j] = in.nextInt();
               
            }
            
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(" Digite matriz B linha " + i + " e a coluna " + j + " : ");
                b [i][j] = in.nextInt();
                c [i][j] = a [i][j] + b [i][j];

            }
            
        }
        System.out.println();
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print( c[i][j] + " " );
                
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
