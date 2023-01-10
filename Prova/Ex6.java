/*6.(Peso1,5)Reabastecimento de estoque-Por suas excelentes notas,o laboratório
da instituição te convidou a desenvolver um sistema de compras para o 
reabastecimento do estoque de produtos,o programa solicitado leva em 
consideração a quantidade atual,mínimas e máximas do estoque.Caso a quantidade
atual seja menor que a  média entre o valor mínimo e máximo,o programa indica 
que deve ser feita uma compra,caso contrário,indica que não é necessário. Por
 exemplo: Produto: Canetas 
  Mínima: 10
  Máxima: 100
  Atual: 30
  Resposta: Fazer Compra*/

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        String produto;
        int quantidademinima ;
        int quantidademaxima ;
        int quantidadeatual;
        int mediaproduto;

        System.out.println(" Nome do  produto :");
        produto = in.next();

        System.out.println(" Qual a quantidade mínima do produto no estoque ? ");
        quantidademinima = in.nextInt();

        System.out.println(" Qual a quantidade máxima do produto no estoque ? ");
        quantidademaxima = in.nextInt();

        System.out.println(" Qual a quantidade atual do produto no estoque ? ");
        quantidadeatual = in.nextInt();
        
        mediaproduto = ( quantidademinima + quantidademaxima)/2;

        if (quantidadeatual < mediaproduto) {

            System.out.println(" Realizar compras !!!!");
            
        } else {

            System.out.println(" Não necessita fazer compras !!!!!");
            
        }


    }
    
}
