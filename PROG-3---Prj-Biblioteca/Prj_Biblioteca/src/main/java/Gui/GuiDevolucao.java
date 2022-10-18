package Gui;

import Biblioteca.Emprestimo;
import Biblioteca.Leitor;
import Biblioteca.inclusaoDeExemplar;
import dao.DaoEmprestimo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

//public class GuiDevolucao {
////    private JList lstDevolucao;
////    private javax.swing.JPanel JPanel;
////    private JButton btnDevolucao;
////
////
//////    public GuiDevolucao() {
//////        updateExemplar();
//////        btnDevolucao.addActionListener(new ActionListener() {
//////            @Override
//////            public void actionPerformed(ActionEvent e) {
//////                try{
//////                    Emprestimo emprestimo = new Emprestimo(lstDevolucao.getSelectedValue());
//////                    new DaoEmprestimo().save(emprestimo);
//////                }catch (Exception ex){
//////                    JOptionPane.showMessageDialog(null, ex.getMessage());
//////                }
//////            }
//////        });
//////    }
//////
//////    private void updateExemplar() {
//////        try {
//////            List<Emprestimo> emprestimos = new DaoEmprestimo().getAll();
//////            lstDevolucao.setListData(emprestimos.toArray());
//////        } catch (Exception e) {
//////            throw new RuntimeException(e);
//////        }
//////    }
//////
//////    public JPanel getJPanel() {  //serve para pegar essa tela sem mudar a visibilidade private de JPane
//////        return JPanel;
//////    }
//////
////////    public static void main(String[] args) {
////////        GuiDevolucao guiDevolucao = new GuiDevolucao(); //criacao do objeto relativo a tela
////////        JFrame frame = new JFrame("Devolução"); //criei um objeto com o titulo desejado
////////        frame.setContentPane(guiDevolucao.JPanel); //adicionei o desenho
////////
////////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////////
////////
////////
////////        frame.pack();  //serve para formatar a tela
////////
////////        frame.setVisible(true);
////////    }
////}
