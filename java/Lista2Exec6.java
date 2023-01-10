import java.util.Scanner;

public class Lista2Exec6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ano, mse, d, idade , im ,dv,
         atual;
        

        System.out.println(" Informe ano de nascimento ");
        System.out.println(" Informe dia e mês de nascimento ");

        ano = in.nextInt();
        d = in.nextInt();
        mse = in.nextInt();
        atual = in.nextInt();
       
        atual= (atual - ano);
        im =( idade * 12);
        dv = (im * 30);

    
        if (condition) {
            
        } (  ) {
            
            System.out.println (" Sua idade em dias é " + dv);

        } else {
       
            System.out.println(" Sua idade é ");
            
        }         
           
                
        
            }
    
}
/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos,meses e dias e escreva a idade dessa pessoa 
expressa apenas em dias.Considerar ano com 365 dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje. 
    a.Desafio e pesquisa: utilizando a classe Calendar ou Date do Java
,peça que o usuário informe sua data de nascimento e o sistema irá calcular quantos anos, meses e dias a pessoa viveu*/