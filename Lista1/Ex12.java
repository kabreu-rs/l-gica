/*. Desafio 02 - Até agora nossos algoritmos obedecem sequências simples de passos.
Vamos supor que eu tenha mais de uma opção, por exemplo, um aluno pode ser
aprovado ou ficar de recuperação em determinada disciplina, isso significa que
vamos ter duas possíveis respostas de acordo com a nota deste aluno.*/
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        float n1, n2, media;
        System.out.print(" Informe a nota n1 do aluno : ");
        n1 = in.nextFloat();
        System.out.print(" Informe a nota n2 do aluno : ");
        n2 = in.nextFloat();
        media = (n1 + n2)/2;
        if (media >=7) {
            System.out.println(" Aluno aprovado ");
            
        } else {
            System.out.println( " Aluno em recuperação ");
            
        }
    }
}