/*Solicitar um número inteiro positivo ao usuário,validando a 
entrada de dados(informando se ele estiver errado e repetindo a 
solicitação até que esteja correto).Após o programa deve informar
todos os números pares existentes entre 1 e o número fornecido pelo 
usuário.ao final ele pergunte ao usuário se ele deseja informar um
 outro número. Caso positivo, o programa deve ser repetido */

 import java.util.Scanner;
 public class Exx2{
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         int num = 0;
         String rep = "sim";
         
            while (rep.equals("sim")) {
            System.out.println(" Informe um número positivo : ");
            num = in.nextInt();         
            
            if (num > 0 ) {
                System.out.println(" Número digitado eh : " + num);
                System.out.println(" Os numeros pares entre 1 e  "  + num );
                
                for ( int i = 1; i < num; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                                                
                    }
                    
                }       

                
            }else{
                System.out.println(" Valor Incorreto !!! ");
            }
            System.out.println(" Você deseja repetir ? ");
            rep = in.next();


             
         }


  }
 }

