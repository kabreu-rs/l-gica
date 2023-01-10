import java.util.Scanner;

public class Lista2Exec17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float cf, pd, ipf, vfc;

        System.out.println(" Informe o valor do carro de fábrica R$: ");
        cf = in.nextFloat();
        pd = ( cf * 28 /100);
        ipf = ( cf *45 /100);
        vfc = ( cf + pd + ipf);

        System.out.println(" O valor final do carro é R$: " + vfc);
    }
    
}
/*17.O custo de um carro novo ao consumidor é a soma do custo de fábrica 
com a porcentagem do distribuidor e dos impostos(aplicados ao custo de fábrica).
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
escrever um algoritmo para ler o custo de fábrica de um carro,calcular e
 escrever o custo final ao consumidor.*/