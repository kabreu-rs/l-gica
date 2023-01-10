/*(Peso1,5)Plano de Saúde-Criar um programa para identificar o valor a ser pago por um 
plano de saúde de uma família dadas as idades dos conveniados considerando que todos
pagam R$100, mais um adicional conforme a seguinte tabela:
a)crianças com menos de 10 anos pagam R$80;
b)conveniados com idade entre 10 e 30 anos pagam R$50;
c)conveniados com idade entre 40 e 60 anos pagam R$ 95;
d)conveniados com mais de 60 anos pagam R$130.
O programa deve executar um laço perguntando para o usuário qual a idade do membro da
família.O programa deve encerrar a execução quando o usuário informar -1 para a idade 
e então mostrar o valor total do plano.Por exemplo,para a entrada:30 25 5 1O -1
resultado será: 480.*/

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade = 0 , valort= 0;
        int v1 = 0, v2 = 0, v3 = 0, v4 =0;
        do {

            System.out.println(" Informe a idade do conveniado , por favor ? ");
            idade = in.nextInt();

            if (idade < 10) {
                valort += 180;                
            }
            if (idade >= 10 && idade <=30) {
                valort += 150;                
            }
            if (idade >= 40 && idade <=60) {
                valort += 195;                
            }
            if (idade > 60) {
                valort += 230;                
            }

        } while ( idade != -1);
        System.out.println("O valor total a ser pago é : " + valort);
    }
    
}
