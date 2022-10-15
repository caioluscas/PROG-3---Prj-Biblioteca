package Menu;

import Gui.GuiSenha;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GuiPrincipal {

    //private JPanel JPanel;
    private JButton btnBibliotecario;
    private JButton btnAtendente;
    private javax.swing.JPanel JPanel;
    public GuiPrincipal() {
        btnBibliotecario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiSenha guiSenha = new GuiSenha();
                JFrame frame = new JFrame("Login");
                frame.setContentPane(guiSenha.getJPanel()); //serve para abrir tela
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar caso abra outra tela
                frame.pack();
                frame.setVisible(true);
            }
        });
        btnAtendente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiSenha guiSenha = new GuiSenha();
                JFrame frame = new JFrame("Login");
                frame.setContentPane(guiSenha.getJPanel()); //serve para abrir tela
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
        GuiPrincipal guiPrincipal = new GuiPrincipal();
        JFrame frame = new JFrame("Login");
        frame.setContentPane(guiPrincipal.JPanel); //serve para abrir tela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar caso abra outra tela
        frame.pack();
        frame.setVisible(true);

    }

}
