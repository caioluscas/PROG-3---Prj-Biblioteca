package Gui;

import Biblioteca.Livro;
import dao.DaoLivro;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class GuiLivro {
    private JTextField txtTitulo;

    private JButton BtnSalvar;
    private JPanel jPanel;

    public GuiLivro() {
        BtnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Livro livro = new Livro(txtTitulo.getText());
                    new DaoLivro().save(livro);

                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public static void main(String[] args) {
        GuiLivro guiLivro = new GuiLivro();                 //criando uma instancia de GuiCliente
        JFrame frame = new JFrame("Cadastro de livro"); //inicializa
        frame.setContentPane(guiLivro.jPanel);              //adicionei o desenho ao JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fiz o X funcionar

        /*try {
            //MaskFormatter mascara = new MaskFormatter("# ######## #"); //criando a masacara
            mascara.install(guiLivro.txtCodigo); //instalo ela no componente
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }*/

        frame.pack();                                         //configura a tela para o SO
        frame.setVisible(true);                               //exibe

    }
}
