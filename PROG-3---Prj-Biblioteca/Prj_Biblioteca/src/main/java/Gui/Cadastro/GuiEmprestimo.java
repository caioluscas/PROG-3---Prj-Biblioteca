package Gui.Cadastro;

import Biblioteca.*;
import dao.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GuiEmprestimo {

    private JList lstLivroExemplar;
    private JList lstLeitor;
    private JButton btnEmprestimo;
    private javax.swing.JPanel JPanel;
    private JButton btnDevolucao;
    private JList lstDevolucao;
    private JButton btnLivro;

    public GuiEmprestimo() {
        updateList();
        updateLeitor();
        updateExemplar();
        btnEmprestimo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Emprestimo emprestimo = new Emprestimo((inclusaoDeExemplar) lstLivroExemplar.getSelectedValue(),
                            (Leitor) lstLeitor.getSelectedValue());
                    new DaoEmprestimo().save(emprestimo);
                    updateList();
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

            }
        });
        btnDevolucao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Emprestimo emprestimo = (Emprestimo) lstDevolucao.getSelectedValue(); //Cast faz a conversão para o tipo de dado
                    emprestimo.setDataDevolucao(LocalDate.now());
                    new DaoEmprestimo().save(emprestimo);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }


    private void updateLeitor() {
        try {
            List<Aluno> alunos = new DaoAluno().getAll();  //guardo tudo do .json no alunos, getALL pq pega o .json da lista
            List<Professor> professores = new DaoProfessor().getAll(); //guardo tudo do .json no professores
            List<Leitor> leitores = new ArrayList<>(); //Lista vazia
            leitores.addAll(alunos); //addAll pega uma lista .json
            leitores.addAll(professores);
            lstLeitor.setListData(leitores.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void updateExemplar() {
        try {
            List<inclusaoDeExemplar> exemplares = new DaoinclusaoDeExemplar().getAll();
            lstLivroExemplar.setListData(exemplares.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void updateList() {
        try {
            List<Emprestimo> emprestimos = new DaoEmprestimo().getAll();
            lstDevolucao.setListData(emprestimos.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public JPanel getJPanel() {  //serve para pegar essa tela sem mudar a visibilidade private de JPane
        return JPanel;
    }

    public static void main(String[] args) {
        GuiEmprestimo guiEmprestimo = new GuiEmprestimo();                 //criando uma instancia de GuiCliente
        JFrame frame = new JFrame("Efetuação de Emprestimo"); //inicializa
        frame.setContentPane(guiEmprestimo.JPanel);              //adicionei o desenho ao JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fiz o X funcionar

        frame.pack();                                         //configura a tela para o SO
        frame.setVisible(true);                               //exibe

    }
}
