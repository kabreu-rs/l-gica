/*(Peso1,5)Figuras Retas-Joana criou um jogo de tabuleiro que tinha o tamanho de seu 
mapa alterado de acordo com a quantidade de jogadores.Como era muito trabalhoso criar
os mapas manualmente e Joana é muito sua amiga,ela pediu que você desenvolvesse um 
programa que,dado o número de jogadores,criasse a divisão no mapa. Obs: o código para
início do exercício está disponível no AVA.*/

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras extends JPanel {
    
    public static int n;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        //TODO - ESCREVA SEU CÓDIGO AQUI!!!
		//VOCE PODE USAR A VARIAVEL n
        
        int altura = 0, largura = 0;                  
        
        altura = 400 /n ;

        for (int i = 0; i < n ; i++) {
            largura = altura + largura;
            g.drawLine(400,largura, 0 ,largura);
            g.drawLine(largura, 400 , largura, 0);
            
        }
        

        
        
    }


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor de N");
        Figuras.n = in.nextInt();

        JFrame janela = new JFrame("Figuras retas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(410, 440);

        Figuras painel = new Figuras();
        painel.setBounds(0, 0, 400, 400);
        
        janela.add(painel);
        janela.setVisible(true);
        
    }

}
