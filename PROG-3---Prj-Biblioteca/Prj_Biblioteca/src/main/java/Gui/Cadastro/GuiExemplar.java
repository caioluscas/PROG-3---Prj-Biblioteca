package Gui.Cadastro;

import Biblioteca.Livro;
import Biblioteca.inclusaoDeExemplar;
import dao.DaoLivro;
import dao.DaoinclusaoDeExemplar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GuiExemplar {
    private JList lstLivros;
    private JButton btnExemplar;
    private javax.swing.JPanel JPanel;

    public GuiExemplar() {
        updateList();

        btnExemplar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    inclusaoDeExemplar inclusaodeexemplar = new inclusaoDeExemplar((Livro)lstLivros.getSelectedValue());
                    if(inclusaodeexemplar.getLivro()==null){  //se o usuário nao preencher nada faça:
                        JOptionPane.showMessageDialog(null,"Favor selecionar um livro, amigo :)");
                    }
                    new DaoinclusaoDeExemplar().save(inclusaodeexemplar);
                    updateList();

                }catch (Exception ex){
                    throw new RuntimeException(ex);
                }

            }
        });
    }

    private void updateList() {
        try {
            List<Livro> livros = new DaoLivro().getAll();
            lstLivros.setListData(livros.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        GuiExemplar guiExemplar = new GuiExemplar();
        JFrame frame = new JFrame("Inclusão de Exemplar");
        frame.setContentPane(guiExemplar.JPanel); //serve para abrir tela
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //fechar caso abra outra tela
        frame.pack();
        frame.setVisible(true);

    }

    public javax.swing.JPanel getJPanel() {
        return JPanel;
    }
}
