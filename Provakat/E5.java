/*CriptografiaBásica-Você e sua melhor amiga criaram um mecanismo de criptografia 
para que vocês pudessem se comunicar através de textos sem se preocupar em com
as informações que outros poderiam ter acesso,cada carta vem no seguinte formato:
#N #P
#NLetras Criptografadas 
#NLetras Corretas 
#P frases
Como era muito cansativo ficar reescrevendoa carta com as letras corretas,você
desenvolveu um programa para descriptografar o texto para você.
Exemplo:
3 1
B Z S
O A N
Bi zmigz, cbmb fbi b escbstrb?
Saída: Oi amiga, como foi o encontro ?*/

import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[]letracerta;
        char []letrafalsa;
        String texto = "";
        char[] textochar ;
        int letras = 0, frases = 0;

        System.out.println(" Informe os numeros de letras serão trocadas ? ");
        letras = in.nextInt();
        System.out.println(" Informe os numeros de frases criptografadas ? ");
        frases = in.nextInt();

        System.out.println();

        letracerta = new char [letras];
        letrafalsa = new char [letras];

        for (int i = 0; i < letrafalsa.length; i++) {
            System.out.println(" Quais letras serão criptografads ? ");
            letrafalsa[i]= in.next().charAt(0);            
        }
        System.out.println();
        for (int i = 0; i < letracerta.length; i++) {
            System.out.println(" Quais letras serão as corretas ? ");
            letracerta [i]= in.next().charAt(0);
            
        }
        System.out.println();

        texto = in.nextLine();
        System.out.println(" Informe a frase a ser criptograda, por favor ? ");
        texto = in.nextLine();

        textochar = texto.toCharArray();

        for (int i = 0; i < textochar.length; i++) {
            for (int j = 0; j < letrafalsa.length; j++) {

                if (textochar[i] == letrafalsa[j]){
                    textochar[i] = letracerta[j];
                
                }    
                
            }
        }
        System.out.print(" A frase correta é : " );
        System.out.println(textochar);
    }
    
}
