/*(Peso1,5)Competição de Salto Ornamental-Crie um programa em Java que dado os atributos
nome do atleta,Grau de Dificuldade e as 7 notas de um atleta,indique a pontuação final
do atleta.O cálculo da pontuação é feito com a soma da notas,excluindo a menor e maior
nota e,ao final,multiplicando-se pelo Grau de Dificuldade.O programa deve funcionar para
múltiplos atletas até que o nome digitado seja FIM.Além da pontuação de cada atleta,o
programa deve mostrar o nome do atleta que obteve a pontuação mais alta*/

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double gd = 0, maior = 0, menor = 10, nota, maiornota = 0;
    String nome = " ", vencedor = " ";
    double notafinal = 0, notatotal = 0;

    while (!nome.equals("Fim")) {

      System.out.println(" Informe o nome do atleta ? ");
      nome = in.next();
      if (nome.equals("Fim")) {
        break;
      }
      System.out.println(" Informe o grau de dificuldade do salto ? ");
      gd = in.nextDouble();

      for (int i = 0; i < 7; i++) {

        System.out.println(" Informe as 7 notas dos atletas ? ");
        nota = in.nextDouble();

        if (nota > maior) {
          maior = nota;
        }
        if (nota < menor) {
          menor = nota;

        }
        notafinal += nota;

      }
      notatotal = (notafinal - (maior + menor)) * gd;
      System.out.println(" A nota final é : " + notatotal);
      notafinal = 0;
      if (notatotal > maiornota) {
        maiornota = notatotal;
        vencedor = nome;
      }

    }
    System.out.println(" O campeão é : " + vencedor + " Com nota : " + maiornota);

  }

}
