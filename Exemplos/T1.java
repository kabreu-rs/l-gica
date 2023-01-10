
import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String senha = " ";
        String repetir = " ";
        //boolean Igual = true;

        System.out.println(" Informe uma senha, por favor : ");
        senha = in.next();

            for (int i = 0; i < senha.length(); i++) {
                for (int j = 0; j < repetir.length(); j++) {
                    while (!repetir.equalsIgnoreCase(senha)) {

                        if (repetir.charAt(j)== senha)) {
                            
                        }
                        
                    }
                }
            }
        
        
    }

}

/*while (Igual) {
    for (int i = 0; i < senha.length(); i++) {
        for (int j = 0; j < repetir.length(); j++) {
            if (!repetir.equals(senha) && repetir.charAt(j) == senha.charAt(i)) {
                Igual = true;
                System.out.println(repetir.charAt(j));
                
            }
        }
    }
}
if (Igual) {
    System.out.println(" Senha Fraca !!!!");

} else {
    System.out.println(" Senha Forte !!!!");
}