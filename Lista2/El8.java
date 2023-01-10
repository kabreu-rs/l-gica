/*Escreva um algoritmo para ler o número total de eleitores de um município, o
número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
cada um representa em relação ao total de eleitores*/
import java.util.Scanner;
public class El8{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float te,vb, vv, vn, pervb, percvv, percvn;
        System.out.print(" Informe o numero total de eleitores do municipio : ");
        te = in.nextFloat();
        System.out.print(" Informe o numero de votos brancos do municipio : ");
        vb = in.nextFloat();
        System.out.print(" Informe o numero de votos validos do municipio : ");
        vv = in.nextFloat();
        System.out.print(" Informe o numero de votos nulos do municipio : ");
        vn = in.nextFloat();
        pervb = ((vb * 100)/ te);
        percvv = ((vv * 100) / te);
        percvn = ((vn *100)/ te);
        System.out.println(" O percentual de votos validos eh : " + percvv);
        System.out.println(" O percentual de votos brancos eh :  " + pervb);
        System.out.println(" O percentual de votos nulos eh : " + percvn);
    }
}