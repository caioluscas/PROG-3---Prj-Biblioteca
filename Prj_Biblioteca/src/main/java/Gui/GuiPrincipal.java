package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiPrincipal {
    private JButton btnAutor;
    private JPanel JPanel;
    private JButton btnAluno;
    private JButton cadastrarProfessorButton;

    public GuiPrincipal() {
        btnAutor.addActionListener(new ActionListener() {  //1) Botão Autor
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
        btnAluno.addActionListener(new ActionListener() {   //2) Botão Aluno
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAluno guiAluno = new GuiAluno();
                JFrame frame = new JFrame("Aluno");
                frame.setContentPane(guiAluno.getJPanel());  //serve para configurar o botao para abrir outra tela
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar caso abra outra tela
                frame.pack();
                frame.setVisible(true);
            }
        });
        cadastrarProfessorButton.addActionListener(new ActionListener() {   //3) Botão Professor
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiProfessor guiProfessor = new GuiProfessor();
                JFrame frame = new JFrame("Professor");
                frame.setContentPane(guiProfessor.getJPanel());  //serve para configurar o botao para abrir outra tela
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
