package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiAtendente {
    private JButton btnProfessor;
    private JButton btnAluno;
    private javax.swing.JPanel JPanel;

    public GuiAtendente() {
        btnProfessor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiProfessor guiProfessor = new GuiProfessor();
                JFrame frame = new JFrame("Cadastro de professor");
                frame.setContentPane(guiProfessor.getJPanel());  //serve para configurar o botao para abrir outra tela
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar caso abra outra tela
                frame.pack();
                frame.setVisible(true);
            }
        });
        btnAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAluno guiAluno = new GuiAluno();
                JFrame frame = new JFrame("Cadastro de aluno");
                frame.setContentPane(guiAluno.getJPanel());  //serve para configurar o botao para abrir outra tela
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar caso abra outra tela
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public JPanel getJPanel() {  //serve para pegar essa tela sem mudar a visibilidade private de JPane
        return JPanel;
    }

    public static void main(String[] args) {
        GuiAtendente guiAtendente = new GuiAtendente();
        JFrame frame = new JFrame("Atendente");
        frame.setContentPane(guiAtendente.JPanel); //serve para abrir tela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar caso abra outra tela
        frame.pack();
        frame.setVisible(true);

    }
}
