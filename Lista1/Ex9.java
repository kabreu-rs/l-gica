/*Considere que você deseja uma comemoração especial para o seu aniversário e
assim irá convidar familiares a amigos para um churrasco na sua residência. Você
irá precisar comprar a carne a ser consumida pelos seus convidados, logo precisa
de uma forma de calcular a quantidade certa a ser adquirida.
Desenvolva o algoritmo do programa para auxiliar no cálculo da quantidade de carne
bovina (sem osso) a ser comprada considerando que homens, mulheres e crianças
consomem uma quantidades diferentes de carne.
Consumo
de
carne
(http://www.embaixadordochurrasco.com.br/calculochurrasco):
médio
Homens: 400 gramas
Mulheres: 320 gramas
Crianças: 200 gramas
*Observação: geralmente é adicionada uma margem de segurança na quantidade
de carne a ser comprada para evitar que falte. Adicione uma margem de segurança
de 20% no total de carne a ser adquirida.*/
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        float tcarne, th, tm, tc, stp, qm, qc, qh;
        System.out.print(" Informe a quantidade  de crianças : ");
        qc = in.nextFloat();
        System.out.print(" Informe a quantidade de mulheres : ");
        qm = in.nextFloat();
        System.out.print(" Informe quantidade de homens : ");
        qh = in.nextFloat();
        th = (qh* 400 );
        tm = (qm * 320);
        tc = (qc * 200);
        stp = (th + tm + tc);
        tcarne = (stp *1.2f);
        System.out.println(" O total de carne a ser comprada eh : " + tcarne);
    }
}
