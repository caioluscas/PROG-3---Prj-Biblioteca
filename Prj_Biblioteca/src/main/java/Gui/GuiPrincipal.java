package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiPrincipal {
    private JButton btnBotao;
    private JPanel JPanel;

    public GuiPrincipal() {
        btnBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAutor guiAutor = new GuiAutor();
                JFrame frame = new JFrame("Autor");
                frame.setContentPane(guiAutor.getJPanel());  //serve para configurar o botao para abrir outra tela
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar caso abra outra tela
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        GuiPrincipal guiPrincipal = new GuiPrincipal();
        JFrame frame = new JFrame();
        frame.setContentPane(guiPrincipal.JPanel); //serve para abrir tela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar caso abra outra tela
        frame.pack();
        frame.setVisible(true);

    }
}
