/*(Peso1,5)Notas musicais-Tom,filho de Jobim,está aprendendo parte da teoria 
musical mas está com problemas em decorar quais as notas dos saltos de terças
na escala diatônica de Dó Maior.Dó Ré Mi Fá Sol La Si                                     
                                1   2 3  4   5   6  7
Ele trouxe a tabela acima para você e pediu que você ajudasse criando um 
programa que,dado uma nota da escala,mostrasse na tela qual a nota utilizando a
técnica dos saltos de terça.Para executar a técnica dos saltos de terça,
consideramos a nota principal(1ª)e aumentamos duas posições,chegando na terça.
Por exemplo,o salto de terça partindo de Dó será Mi, partindo de Sol será Si, e 
assim sucessivamente.*/
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);

        //String notasmusicais = "Do,Re,Mi,Fa,Sol,La,Si";
        String notas;
        

        System.out.println(" Informe a nota musical deseja ? ");
        notas =  in.next();

        if (notas.equalsIgnoreCase("Do")) {
            System.out.println(" A nota de salto de terça é : Mi ");
            
        } 
        if (notas.equalsIgnoreCase("Re")) {
            System.out.println(" A nota de salto de terça é : Fa ");
            
        } 
        if (notas.equalsIgnoreCase("Mi")) {
            System.out.println(" A nota de salto de terça  é : Sol ");
            
        }
        if (notas.equalsIgnoreCase("Fa")) {
            System.out.println(" A nota de salto de terça é : La ");
            
        }
        if (notas.equalsIgnoreCase("Sol")) {
            System.out.println(" A nota de salto de terça é : Si");
            
        }
        if (notas.equalsIgnoreCase("la")) {
            System.out.println(" A nota de salto de terça é : Do");
            
        }
        if (notas.equalsIgnoreCase("Si")) {
            System.out.println(" A nota de salto de terça é : Re");
            
        }


    }     
    
}
