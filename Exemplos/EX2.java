/*Escreva um programa que leia os valores inteiros referentes aos lados de um triângulo e verifique
 se é um triângulo válido.Após,indique se o triângulo é EQUILATERO,ESCALENO ou ISOSCELES.
 Além disso,o programa deve informar se o triângulo é retângulo.*/
import java.util.Scanner;
public class EX2{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a,b,c;
        System.out.print(" Digite tres valores :");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println(" Eh triangulo ");
            
        } else  {
            System.out.println(" Não eh triangulo ");
            
        }
        if (a == b && a == c) {

            System.out.println(" O triangulo eh Equilatero ! ");
            
        }else if (a == b || a == c || b == c) {
            System.out.println(" O triangulo eh Isosceles ! ");
            
        }else if (a != b || a != c || b != c ) {
            System.out.println( " O triangulo eh Escaleno ! ");
            
        } 
        if (a > b && a > c) {
            if  (a * a== b*b +c*c){
                System.out.println(" È triangulo retangulo ");
    
            } else{
                System.out.println(" Nao eh tringulo retangulo ");
            } 
      
        } else if (b > a && b > c) {

            if(b*b == a*a +c*c){
            
                System.out.println(" È triangulo retangulo ");
  
             } else{
             
              System.out.println(" Nao eh tringulo retangulo ");
          }     
       
        } else {

            if(c*c == a*a + b*b){
            
                System.out.println(" Eh triangulo retangulo ");
  
             } else{
             
              System.out.println(" Não eh tringulo retangulo ");
          }

        } 

    }        
            
}


 
 
 
 
 
 
 
 
 