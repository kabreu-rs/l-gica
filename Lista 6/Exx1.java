/*1.Fazer um programa para ler os dados(matrícula,idade,sexo,alturaeconcursado[S/N])
de vários funcionários de uma empresa.O último tem a matrícula igual a zero e não entra nos cálculos.
 Calcular e mostrar:a) o número de funcionárias concursadas;
 b) o número de funcionários (somente homens);
 c) a maior idade dos homens concursados; 
 d) a quantidade de mulheres com mais de 30 anos sem concurso;
 e) a quantidade de concursados(as);
 f) a média das alturas dos homens com menos de 40 anos*/

 import java.util.Scanner;

 public class Exx1{
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matricula;
        int idade;
        int sexo;
        String concursado;
        int contconcursada;
        int contFuncionarosHomens =0;
        int HomensMaisVelho = 0;
        int qtdMulhresMais30anosSemConcurso = 0;
        int qtdConcursado = 0;
        float MedeiaAlturaHomensMenos40anos =0;
        int contHonens40anos=0;
        float SomaAlturaHomensMenos40anos=0;
        int feminino = 0;
        int masculino = 0;


        System.out.print("  Cadastro de Funcionarios\n  ");

        System.out.println(" Informe sua Matricula : ");
        matricula = in.nextInt();

        while (matricula > 0) {
            System.out.println(" Informe sua Idade : ");
            idade = in.nextInt();
            System.out.println(" Informe seu Sexo  ( 1 para Feminino e 2 para Masculino ) :  ");
            sexo =in.nextInt();

            if (sexo == 1) {
                feminino ++;              
                
            }else if (sexo == 2) {
                masculino ++;
                
            }
            
        }




        
        
       


     }
 }