import java.util.Scanner;

public class Teste1{
    public static void main (String[]args){

        Scanner in = new Scanner (System.in);

        int divisor=2; 
        int valor;
        
        System.out.println(" Ingorme um valor ");

            
            valor = 1; 
            while (valor!=1) {
              
                if (valor % divisor==0) {
		     	System.out.println (" O resultado é ", + divisor);
                 
                 valor=valor/divisor;
		    	divisor=2;
		}
	     	   else {
		    	divisor++;
		}
	}

    } 
}

