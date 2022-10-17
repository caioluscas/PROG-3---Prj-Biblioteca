package Gui.Usuarios;

import Gui.Cadastro.GuiAutor;
import Gui.Cadastro.GuiExemplar;
import Gui.Cadastro.GuiLivro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiBibliotecario {
    private javax.swing.JPanel JPanel;
    private JButton btnLivro;
    private JButton btnExemplar;
    private JButton btnAutor;
    private JList lstBibliotecario;

    public GuiBibliotecario() {
        btnLivro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiLivro guiLivro = new GuiLivro();
                JFrame frame = new JFrame("Cadastro de livro");
                frame.setContentPane(guiLivro.getJPanel());  //serve para configurar o botao para abrir outra tela
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //fechar caso abra outra tela
                frame.pack();
                frame.setVisible(true);
            }
        });

        btnAutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAutor guiAutor = new GuiAutor();
                JFrame frame = new JFrame("Cadastro de autor");
                frame.setContentPane(guiAutor.getJPanel());  //serve para configurar o botao para abrir outra tela
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //fechar caso abra outra tela
                frame.pack();
                frame.setVisible(true);
            }
        });
        btnExemplar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiExemplar guiExemplar = new GuiExemplar();
                JFrame frame = new JFrame("Cadastro de Exemplar");
                frame.setContentPane(guiExemplar.getJPanel());  //serve para configurar o botao para abrir outra tela
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //fechar caso abra outra tela
                frame.pack();
                frame.setVisible(true);
            }
        });
    }


    public static void main(String[] args) {
        GuiBibliotecario guiBibliotecario = new GuiBibliotecario();
        JFrame frame = new JFrame("Bibliotecário");
        frame.setContentPane(guiBibliotecario.JPanel); //serve para abrir tela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar caso abra outra tela
        frame.pack();
        frame.setVisible(true);

    }

    public JPanel getJPanel() {  //serve para pegar essa tela sem mudar a visibilidade private de JPane
        return JPanel;
    }
}
