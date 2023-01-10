import java.util.Scanner;


public class Repetico{
    public static void main(String[]args){

        Scanner in = new Scanner (System.in);
        int valor ;
        int positivo;
        int negativo;
        int nulo;
        valor = 100;                          
        positivo = 0;
        negativo = 0;  
        nulo = 0 ;

        for (int i= 0; i < 100; i++) {
          
            System.out.println("Informe "+ (i+1)+" º valor " );
            valor= in.nextInt();
                  
            if(valor > 0 ) {

               positivo++;
            }
            else if(valor < 0) {
               negativo++;
                
            } else  {
               nulo ++;
            }
       
        }

           
        System.out.println(" São positivo! " + positivo);
        System.out.println(" São negatitivos " + negativo);
        System.out.println(" São nulos " + nulo);

    }
}





  /*System.out.println("Informe 10 valores ");
            valor= in.nextInt();
                  
            if(valor > 0 ) {
                          positivo++;
            }
            else if(valor < 0) {
                                negativo++;
                
            } else  {
                            nulo ++;
            }*/





    /* for ( valor = 0; valor < 10; valor++) {
               
            System.out.println("Informe 10 valores ");
            valor= in.nextInt();
            if(valor > 0 ) {
                          positivo++;
            }
            else if(valor < 0) {
                                negativo++;
                
            } else  {
                            nulo ++;
            }
        }  
        System.out.println(" São positivo!!!!" + valor);
        System.out.println(" São negatitivos " + valor);
        System.out.println(" São nulos" + valor);
   
    }

}*/

    

    


    


