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
        g.drawLine(0, 0, 400, 400);

        int largura = getWidth();
        int altura = getHeight();
        int contador = 0;
	
        
        //TODO - ESCREVA SEU CÓDIGO AQUI!!!
        g.drawLine(0, 0, 400, 400);
       
            while( altura - contador>= 0){
            g.drawLine(0, 0, contador, altura - contador);
            g.drawLine(largura, altura, contador, altura- contador);
			g.drawLine(largura, 0, contador, contador);
			g.drawLine(0, altura, contador, contador);
			
			contador = contador + 15;
        
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
