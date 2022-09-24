package Gui;

import Biblioteca.Autor;
import dao.DaoAutor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GuiAutor {
    private JTextField txtNome;
    private JFormattedTextField txtSobrenome;
    private JFormattedTextField txtNacionalidade;
    private JButton salvarButton;
    private javax.swing.JPanel JPanel;
    private JList lstAutores;

    public GuiAutor() {
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Autor autor = new Autor(txtNome.getText(), txtSobrenome.getText(), txtNacionalidade.getText());
                    new DaoAutor().save(autor);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

            }
        });
    }

    public JPanel getJPanel() {  //serve para pegar essa tela sem mudar a visibilidade private de JPane
        return JPanel;
    }

    public static void main(String[] args) {
        GuiAutor guiAutor = new GuiAutor(); //criacao do objeto relativo a tela
        JFrame frame = new JFrame("N1"); //criei um objeto com o titulo desejado
        frame.setContentPane(guiAutor.JPanel); //adicionei o desenho

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            List<Autor> autores = new DaoAutor().getAll();
            guiAutor.lstAutores.setListData(autores.toArray()); //serve para preencher a lista
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        frame.pack();  //serve para formatar a tela

        frame.setVisible(true);



    }
}
