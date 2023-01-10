import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float distancia ;
        float litronecessario ;
        float precogasolina ;
        float custoviagemcarro;
        float valorpassagem ;
        float custoonibus;
        int kml;
        int quantidadealuno;
               
        System.out.println("Quantos alunos vão na viagem  ? ");
        quantidadealuno = in.nextInt();
        System.out.println(" Qual a distancia entre as duas cidades ? ");
        distancia = in.nextInt();
        System.out.println(" Qual o consumo médio do   por km/l ? ");
        kml = in.nextInt();
        System.out.println(" Qual é o preço da gasolina por litro ? ");
        precogasolina = in.nextFloat();
        System.out.println(" Qual o valor da passagem de ônibus intermunicipal ? ");
        valorpassagem = in.nextFloat();

        litronecessario = (distancia / kml);
        System.out.println(" Os litros necessários para viagem é : ? " + litronecessario);
        
        custoviagemcarro = (litronecessario * precogasolina);
        System.out.println(" O custo da viagem de carro é : ? " + custoviagemcarro);

        custoonibus = ( valorpassagem * quantidadealuno);
        System.out.println(" Qual é o custo da viagem de ônibus : ? " + custoonibus);

        if (quantidadealuno <= 5) { 
            
            if (custoviagemcarro < custoonibus)  {

            System.out.println(" Vá de carro!!!!! ");
            
            } else {

            System.out.println( " Vá de ônibus !!!!! ");
            
            }
            
        }
    
        
    }
    
}
