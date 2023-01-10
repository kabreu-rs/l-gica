/*Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
(considerar que média igual ou maior que 6.0 o aluno é aprovado). Escrever também
a média calculada.*/
import java.util.Scanner;
public class El13{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float n1 , n2 , media;
        System.out.println( " Informe a duas notas do aluno : ");
        n1 = in.nextFloat();
        n2 = in.nextFloat();
        media = ( n1 + n2 ) / 2;
        if (media >= 6) {
            System.out.println(" Aluno aprovado !!  sua media foi :  " + media);
            
        }else  {
            System.out.println(" Aluno reprovado ^^ sua media foi :  " + media);
                        
        }
    }
}