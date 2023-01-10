/*Construa um algoritmo que dadas as entradas: distância do trajeto e velocidade
média da viagem, informe o tempo que uma família levará saindo de sua cidade de
férias até o destino previsto. Após o cálculo, o algoritmo deve mostrar o tempo
calculado.*/
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        float distancia, velocidade, tempo;
        System.out.print(" Informe a distancia : ");
        distancia = in.nextFloat();
        System.out.print(" Informe a velocidade : ");
        velocidade = in.nextFloat();
        tempo = ( distancia / velocidade);
        System.out.println(" O tempo de viagem serah : " + tempo);

    }
}