import java.util.Scanner;


public class Ex2 {
 public static void main(String[] args) {
     Scanner in = new Scanner( System.in);
     int   ttomadas ;
     int regua1, regua2 ,regua3 , regua4 ;
     int livretomadas;

     System.out.println(" Quantas tomadas têm na regua 1 ? ");
      regua1 = in.nextInt();
     System.out.println(" Quantas tomadas têm na regua 2 ? ");
      regua2 = in.nextInt();
     System.out.println(" Quantas tomadas têm na regua 3 ? ");
      regua3 = in.nextInt();
     System.out.println(" Quantas tomadas têm na regua 4 ? ");
     regua4 = in.nextInt();

      ttomadas = (regua1 + regua2 + regua3 + regua4);
      livretomadas = (ttomadas - 3);

      System.out.println(" O total de tomadas disponível é : " + livretomadas );


     


        
    }
    
}
