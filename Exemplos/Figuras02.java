

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras02 extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        int largura = getWidth();
        int altura = getHeight();
        int contador = 0 , int n = 0;;
	
        
        //TODO - ESCREVA SEU CÓDIGO AQUI!!!
        g.drawLine(0, 0, 400, 400);
       
            while( n * contador>= 0){
            g.drawLine(0, 0, contador, n * contador);
            g.drawLine(largura, altura, contador, n * contador);
			g.drawLine(largura, 0, contador, contador);
			g.drawLine(0, n, contador, contador);
			
			contador = contador + 15;
        }

    }

      


    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Figuras retas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(410, 440);

        Figuras02 painel = new Figuras02();
        painel.setBounds(0, 0, 400, 400);
        
        janela.add(painel);
        janela.setVisible(true);
        
    }

} 