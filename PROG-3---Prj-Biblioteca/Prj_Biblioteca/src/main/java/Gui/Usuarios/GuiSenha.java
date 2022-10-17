package Gui.Usuarios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiSenha {
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar;
    private javax.swing.JPanel JPanel;


    public GuiSenha() {

        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtUsuario.getText().equals("admin") && txtSenha.getText().equals("12345")){
                    GuiBibliotecario guiBibliotecario = new GuiBibliotecario();
                    JFrame frame = new JFrame("Bibliotecário");
                    frame.setContentPane(guiBibliotecario.getJPanel());  //serve para configurar o botao para abrir outra tela
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar caso abra outra tela
                    frame.pack();
                    frame.setVisible(true);
                }
                else if(txtUsuario.getText().equals("atendente") && txtSenha.getText().equals("54321")){
                    GuiAtendente guiAtendente = new GuiAtendente();
                    JFrame frame = new JFrame("Atendente");
                    frame.setContentPane(guiAtendente.getJPanel());  //serve para configurar o botao para abrir outra tela
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar caso abra outra tela
                    frame.pack();
                    frame.setVisible(true);
                } else{
                    JOptionPane.showMessageDialog(null,"Inválido");
                }
            }
        });
    }

    public JPanel getJPanel() {  //serve para pegar essa tela sem mudar a visibilidade private de JPane
        return JPanel;
    }


    public static void main(String[] args) {
        GuiSenha guiSenha = new GuiSenha();
        JFrame frame = new JFrame("Login");
        frame.setContentPane(guiSenha.JPanel); //serve para abrir tela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar caso abra outra tela
        frame.pack();
        frame.setVisible(true);

    }
}
