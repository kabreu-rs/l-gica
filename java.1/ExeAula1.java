import java.util.Scanner;

public  class ExeAula1{

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int nota =0;

        System.out.println(" Informe a nota do aluno ");
        nota = in.nextInt();

        if ( nota >=7) {
            System.out.println(" Aluno Aprovado ");
        } else if (nota > 4) {
                System.out.println(" Aluno em Recuperação ");
                
        } else {
                System.out.println(" Aluno Reprovado ");
                
            }
            
        

    }
    
}
