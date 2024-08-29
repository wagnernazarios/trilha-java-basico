package edu.wagner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class PrimeiraTela {

    public static void main(String[] args) {

        // Criação do frame (janela principal)
        JFrame frame = new JFrame("Exemplo de Interface Gráfica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Criação do painel
        JPanel panel = new JPanel();

        JMenuBar menu = new JMenuBar();
        panel.add(menu);

        JMenu menu1 = new JMenu();
        menu1.setText("Home");
        menu.add(menu1);

        // criação de uma label
        JLabel label = new JLabel("Clique no botão!");
        panel.add(label);

        // Criação de um botão
        JButton button = new JButton("Clique em mim");
        panel.add(button);

        // Adiciona o painel ao frame
        frame.add(panel);

        // Exibe a janela
        frame.setVisible(true);

    }
}