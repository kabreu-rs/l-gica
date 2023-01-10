/*Escreva um algoritmo para ler uma senha. Se o usuário não digitar a senha correta
que é 12345, o algoritmo deve ler novamente, até que seja a senha correta. O
algoritmo deve também contar quantas vezes o usuário tentou digitar a senha
correta, ou seja, quantas tentativas de acerto aconteceram. Escrever essa
informação na tela.*/

import java.util.Scanner;

public class Ee7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int tentativas = 1;
        String senha = "", senhaverdade = "12345";

        

        while ( senha != senhaverdade ) {

            System.out.println(" Informe sua senha  de 5 digitos: ");
            senha = in.next();

            if (senha.equals(senhaverdade)) {

                System.out.println(" Bem vindo usuário!!! ");
                break;

            } else {
                System.out.println(" Ops!! Senha incorreta!! Tente outra vez ");
                tentativas++;
            } 


        }
     
        System.out.println("O total de tentativas é : " + tentativas);
    }

}

       
          
      


