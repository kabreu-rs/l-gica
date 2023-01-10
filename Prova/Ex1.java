import java.util.Scanner;


 public class Ex1{
    public static void main (String[]args){
        Scanner in = new Scanner ( System.in);
       
        int ano ;
        System.out.println( " Informe o ano desejado ? ");
        ano = in.nextInt();

        if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(" O ano é bissexto !! " + ano );
            
        } else {
            System.out.println(" O ano não é bissexto !!!" + ano );
          }
   

    }
}
     