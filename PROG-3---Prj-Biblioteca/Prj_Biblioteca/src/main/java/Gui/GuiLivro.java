package Gui;

import Biblioteca.Autor;
import Biblioteca.Livro;
import dao.DaoAutor;
import dao.DaoLivro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GuiLivro {
    private JTextField txtTitulo;

    private JButton BtnSalvar;

    private JList lstLivros;
    private JTextField txtAutor;
    private JTextField txtCodigo;
    private JTextField txtAno;
    private JPanel JPanel;
    private JList lstAutor;


    public GuiLivro() {

    updateList();
    updateAutor();

        BtnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Livro livro = new Livro(txtTitulo.getText(),txtAno.getText(),lstAutor.getSelectedValuesList());
                    new DaoLivro().save(livro);
                    updateList();
                    updateAutor();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });


    }

    public void updateList(){
        try {
            List<Livro> livros = new DaoLivro().getAll();
            this.lstLivros.setListData(livros.toArray());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private void updateAutor() {
        try {
            List<Autor> autores = new DaoAutor().getAll();
            lstAutor.setListData(autores.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public javax.swing.JPanel getJPanel() {
        return JPanel;
    }

    public static void main(String[] args) {
        GuiLivro guiLivro = new GuiLivro();                 //criando uma instancia de GuiCliente
        JFrame frame = new JFrame("Cadastro de livro"); //inicializa
        //frame.setContentPane(guiLivro.JPanel);              //adicionei o desenho ao JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fiz o X funcionar

        /*try {
            //MaskFormatter mascara = new MaskFormatter("# ######## #"); //criando a masacara
            mascara.install(guiLivro.txtCodigo); //instalo ela no componente
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }*/

        try {
            List<Livro> livros = new DaoLivro().getAll();
            guiLivro.lstLivros.setListData(livros.toArray()); //serve para preencher a lista
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        frame.pack();                                         //configura a tela para o SO
        frame.setVisible(true);                               //exibe

    }



}
