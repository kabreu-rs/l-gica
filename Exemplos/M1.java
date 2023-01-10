import java.util.Scanner;
public class M1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int divisor ; 
        int dividendo ;
        int resto = 0;
        int quociente = 0;
        

        System.out.println("Informe 2 valores ? ");
        dividendo = in.nextInt();
        divisor = in.nextInt();

        quociente = (dividendo / divisor);
        resto = (dividendo -(quociente * divisor));

        System.out.println(" O resultado da  é " + quociente);
        System.out.println(" O resto é : " + resto);
            
        
    }
}