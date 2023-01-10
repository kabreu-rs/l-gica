import java.util.Scanner;

public class Ex2 {
    /*O algoritmo deve ter como entrada um número real e a saída deve ser o valor
atualizado com os 20%. */
 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     float valor,vatualizado;
     
     
     System.out.println(" iNFORME UM NUMERO: ");
     valor = in.nextFloat();
     vatualizado = (float) ( valor + valor * 0.2);
     System.out.println(" O valor atualizado eh: " + vatualizado);



     
 }
    
}
