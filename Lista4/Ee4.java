/*Escreva um programa que apresente quatro opções: (a) consulta saldo, (b) saque e
(c) depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o
valor do saldo deve ser atualizado.*/
import java.util.Scanner;

public class Ee4{
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        
        int op = 0;
        float saldo = 0 , saque  , deposito ;
       
       
        System.out.print( "Seleciona a opção desejada : ");  
        System.out.print("\t 1. consulta do saldo ");
        System.out.print("\t 2. Saque ");
        System.out.print("\t 3. Depósito ");
        System.out.print("\t 4. Sair ");
        System.out.println("Opção : ");
        op = in.nextInt();
      
        while (op != 4) {   
                       
            
            if ( op == 1 ) {
                System.out.println(" O saldo  atual  é  R$ : " + saldo);
                System.out.println(" Qual opção desejada ? " );
                op = in.nextInt();
           
            } else if (op == 2) {
                System.out.println(" Qual valor do saque : ");
                saque = in.nextFloat();
                saldo = saldo - saque;
                System.out.println(" O saldo é R$ : " + saldo);
                System.out.println(" Qual opção desejada ?  ");
                op = in.nextInt();
                
            } else if (op == 3) {
                System.out.println(" Qual o valor do deposito : ");
                deposito = in.nextFloat();
                saldo = saldo + deposito;
                System.out.println(" O saldo é R$ :  " + saldo);
                System.out.println(" Qual opção desejada ?  ");
                op = in.nextInt();

            }           
            
            
        }  
        System.out.println(" Obrigado!!! ");
    }
}