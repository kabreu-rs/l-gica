import java.util.Scanner;

public class Lista2Exec10 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int idade;

        System.out.println(" Informe a idade do nadador ");
        idade = in.nextInt();

        if (idade >= 18) {

            System.out.println(" O nadador é da categoria adulta ");
        }
         
            else if (idade >= 14 && idade <18) {
                
                System.out.println(" O nadador é da categoria juvenil ");
            }

                else if (idade >=9 && idade < 14) {

                    System.out.println(" O nadador é da categoria infantil ");
                }

                    else { 
                        
                        System.out.println(" O nadador é da categoria mirim");

                    }
                      
                    
    }
            
            

            
}
/*10.Faça um programa que receba a idade de um nadador e classifique-o numa 
das seguintes categorias: 
// • Adulto (idade >= 18);
• Juvenil (idade >= 14 e idade < 18);
• Infantil (idade >=9 e idade < 14); 
• Mirim (Idade < 9) */
