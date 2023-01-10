/*Escreva um algoritmo que leia as notas das duas avaliações normais e a nota da
avaliação optativa. Caso o aluno não tenha feito a optativa deve ser fornecido o valor
–1. Calcular a média do semestre considerando que a prova optativa substitui a nota
mais baixa entre as duas primeiras avaliações. Escrever a média e mensagens que
indiquem se o aluno foi aprovado, reprovado ou está em exame, de acordo com as
informações abaixo:
Aprovado : media >= 6.0
Reprovado: media < 3.0
Exame : media >= 3.0 e < 6.0*/
import java.util.Scanner;
public class Le9{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float n1,n2,n3,media, m1,m2;
        System.out.print(" Informe as notas do aluno ");
        n1 = in.nextFloat();
        n2 = in.nextFloat();
        System.out.println(" Se aluno fez a prova optativa informe sua nota, senão digite -1: ");
        n3 = in.nextFloat();
        media = ((n1 + n2)/2);
       
        if (media >= 6.0 && n1 < n2) {
            m1 = ((n1 + n3)/2);
            System.out.println(" Uhuuu!!! Aluno Aprovado!!! ");
            

            
        } else if (n2 < n1) {
            m2 = ((n2 + n3)/2);
            
        }else if (media >=6.0) {
            
            
        }else if (media < 3.0) {
            System.out.println(" Ah!! aluno Reprovado ");
            
        }else if (media >= 3.0 && media < 6.0) {
            System.out.println(" Aluno em Exame!!!!");
            
        }
            
            
    }


}
