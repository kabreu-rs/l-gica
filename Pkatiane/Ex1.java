/*(Peso1,0)Dedução de percentual-Na usina de Angra dos Reis,os técnicos analisam a 
perda de massa de um material radioativo.Sabendo-se que este perde X% de sua massa a 
cada N segundos.Escrever um algoritmo em Java que calcule iterativamente e imprima o 
tempo necessário para que a massa deste material se torne menor que 0,10 grama.Obs:o 
usuário deve informar a massa inicial em gramas,a porcentagem X que o material perde
 a cada N segundos.*/

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float massa, p = 0, perda = 0;
        int seg = 1, segfinal = 0, contador = 1;

        System.out.println(" Informe a massa incial (gramas) do material ?   ");
        massa = in.nextFloat();

        System.out.println(" Informe a perda de massa em porcentagem (%) do material ?   ");
        p = in.nextInt();

        System.out.println(" Informe os segundos para ocorrer o decremento da massa :   ");
        seg = in.nextInt();

        while (massa >= 0.10) {

            perda = massa * (p / 100);
            massa = massa - perda;
            seg = seg * contador;
            contador += 1;
            System.out.println(" A perda da massa é :  " + massa + " g " + seg + "s");
            // seg = seg * contador;
            // contador+=1;

        }
        segfinal += seg;
        System.out.println(" O tempo final é : " + segfinal + " s ");
    }

}
