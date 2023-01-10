/*Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
que diga se ela poderá ou não votar este ano (não é necessário considerar o mês
em que a pessoa nasceu).*/
import java.util.Scanner;
public class El14{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int aa, an, idade;
        System.out.print(" Informe o ano de nascimento : ");
        an = in.nextInt();
        aa = 2021;
        idade = (aa - an);
        if (idade >= 18) {
            System.out.println(" Uma triste noticia voce esta apto para votar!!! ");
            
        } else {
            System.out.println(" Uma otima noticia voce não esta apto para votar!!!!!! ");
            
        }

    }
}