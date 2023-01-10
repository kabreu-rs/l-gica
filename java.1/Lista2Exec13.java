import java.util.Scanner;

public class Lista2Exec13 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner (System.in);
        float n1, n2, média;
        
        System.out.println(" Informe as notas do aluno ");
        n1 = in.nextFloat();
        n2 = in.nextFloat();
        média = (n1 + n2)/2;

        if (média >= 6) {
           
            System.out.println (" Aluno Aprovado ");
            
        } else {

            System.out.println (" Aluno Reprovado ");
            
        }
    }
    
}
/*13.Ler as notas da 1a.e 2a. avaliações de um aluno.Calcular a média 
aritmética simples e escrever uma mensagem que diga se o aluno foi ou 
não aprovado(considerar que média igual ou maior que 6.0 o aluno é aprovado).
Escrever também a média calculada.*/
