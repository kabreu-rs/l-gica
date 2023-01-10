import java.util.Scanner;

public class Lista2Exec14 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int aa, an ,idade;

        System.out.println(" Informe o ano de nascimento ");
        an = in.nextInt();
        aa = 2020;
        idade = aa - an;

        if (idade >= 18) {

            System.out.println(" Ok, você já pode votar ");
            
        } else {

            System.out.println(" Uiii, você ainda não pode votar ");
            
        }

    }
    
}
/* 14.Ler o ano atual e o ano de nascimento de uma pessoa.Escrever uma 
mensagem que diga se ela poderá ou não votar este ano(não é necessário
 considerar o mês em que a pessoa nasceu).*/