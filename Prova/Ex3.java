import java.util.Scanner;
public class Ex3{

     public static void main(String[] args) {
          Scanner in = new Scanner ( System.in);
          int totalsegundos = 0;
          int qtdhoras = 0;
          int qtdminuto = 0;
          int qtdsegundos = 0 ;
          int totalhoras = 0;
          int n = 0;

          System.out.println(" Digite 1 para conversão h => s  e  digite 2 para s => h ");
          n = in.nextInt();

          if (n ==1 ) {
             System.out.println(" Quantos segundos tu queres passar para hora ? ");
             totalsegundos = in.nextInt();

             qtdhoras = totalsegundos/3600;
             totalsegundos = totalsegundos % 3600;
             qtdminuto = totalsegundos/60;
             totalsegundos = totalsegundos % 60;
             qtdsegundos = totalsegundos;
   
             System.out.println ( qtdhoras + ":" + qtdminuto  + ":" + qtdsegundos );
               
          } else{
               System.out.println(" Quantas horas: minutos : segundos tu queres passar para segundos ? ");
               totalhoras = in.nextInt();
               qtdminuto = in.nextInt();
               qtdsegundos = in.nextInt();
         
         
               qtdhoras = totalhoras * 3600;
               qtdminuto =  qtdminuto * 60;
               totalsegundos = (qtdhoras + qtdminuto + qtdsegundos);

               System.out.println( "A quantidade de segundos é : " + totalsegundos );


          }   
          
           
     }
}
