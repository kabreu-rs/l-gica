
import java.util.Scanner;
public class Teste1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String senha;
        boolean repete;
        do {
            repete = false;
            System.out.println("insira a sua senha: ");
            senha = in.next();
            for (int n = 0; n < senha.length(); n++) {
                senha.charAt(n);
                for (int m = 0; m < senha.length(); m++) {
                    if (senha.charAt(m) == senha.charAt(n) && n != m) {
                        System.out.println(senha.charAt(n) + "  repete");
                        repete = true;
                    }
                }

            }

        } while (repete);
        System.out.println("senha forte");

    }

}
