import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras03 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        // TODO - ESCREVA SEU CÓDIGO AQUI!!!
        int linha = 0;

        for (linha = 0; linha <= getHeight(); linha += 10) {
            g.drawLine(0, linha, linha, getHeight());
        }

        for (linha = getHeight(); linha >= 0; linha -= 10) {
            g.drawLine(0, linha, getHeight() - linha, 0);
        }

        for (linha = 0; linha <= getHeight(); linha += 10) {
            g.drawLine(getWidth(), linha, getWidth() - linha, getHeight());
        }

        for (linha = getHeight(); linha >= 0; linha -= 10) {
            g.drawLine(getWidth(), linha, getWidth() - (getHeight() - linha), 0);
        }

    }

    public static void main(String[] args) {

        JFrame janela = new JFrame("Figuras retas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(410, 440);

        Figuras03 painel = new Figuras03();
        painel.setBounds(0, 0, 400, 400);

        janela.add(painel);
        janela.setVisible(true);

    }
}