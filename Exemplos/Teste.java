
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String senha = "";
        boolean Igual ;
       
         // System.out.println(" Informe uma senha , por favor ");
         // senha = in.next();
        
         do {

            Igual = true;
            
            System.out.println(" Informe uma senha , por favor ");
            senha = in.next();
    
            
            for (int j = 0; j < senha.length(); j++) {
                
                for (int i = 0; i < senha.length(); i++) {

                    if (senha.charAt(j) == senha.charAt(i) && j!= i) {
                        System.out.println(senha.charAt(i) +  " Senha Fraca !!! ");
                        Igual = false;                            
                        
                                               
                    }
                    
                }
               // System.out.println(" Senha Forte !!!");
            }
            
                   
        }while (Igual);
        System.out.println(" Senha Forte !!!");
    }
            
}           

