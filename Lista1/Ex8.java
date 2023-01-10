/*Desenvolva o algoritmo para calcular o resultado de uma eleição de um municipal.
A entrada de dados será:

Número total de eleitores;
Número de votos válidos;
Número de votos brancos;
Número de votos nulos.
O algoritmo deve calcular e exibir para o usuário as seguintes informações (em
relação ao total de eleitores):

Percentual de votos válidos;
Percentual de votos brancos;
Percentual de votos nulos;*/
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        int te, vb , vn, vv, pvv,pvn, pvb;
        System.out.print( " Informe o total de eleitores : ");
        te = in.nextInt();
        System.out.print(" Informe o total de votos validos : ");
        vv = in.nextInt();
        System.out.print(" Informe o total de votos brancos : ");
        vb = in.nextInt();
        System.out.print(" Informe o total de votos nulos : ");
        vn = in.nextInt();
        pvv = ( te * vv)/100;
        pvb = ( te * vb)/100;
        pvn = ( te * vn)/100;
        System.out.println(" o valor percentual de votos validos foi : " + pvv);
        System.out.println(" O valor percentual de votos brancos foi : " + pvb);
        System.out.println(" O valor percentual de votos nulos foi : " + pvn);

    }
}