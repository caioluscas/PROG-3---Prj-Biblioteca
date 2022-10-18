package Gui.Cadastro;

import Biblioteca.Aluno;
import Biblioteca.Professor;
import dao.DaoAluno;
import dao.DaoProfessor;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;

public class GuiProfessor {
    private JFormattedTextField txtTelefone;
    private JButton btnGravar;
    private JTextField txtNome;
    private JTextField txtEndereco;
    private JTextField txtDisciplina;
    private JPanel jPanel;
    private JList lstProfessor;

    public GuiProfessor() {
        updateList();
        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    try{
                        Professor professor = new Professor(txtNome.getText(),txtEndereco.getText(),
                                txtTelefone.getText(),txtDisciplina.getText());
                        new DaoProfessor().save(professor);
                        updateList();

                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }

            }
        });
    }

    private void updateList() {
        try {
            List<Professor> professores = new DaoProfessor().getAll();
            lstProfessor.setListData(professores.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public JPanel getJPanel() {  //serve para pegar essa tela sem mudar a visibilidade private de JPane
        return jPanel;
    }

    public static void main(String[] args) {
        GuiProfessor guiProfessor = new GuiProfessor(); //criacao do objeto relativo a tela
        JFrame frame = new JFrame("Professor"); //criei um objeto com o titulo desejado
        frame.setContentPane(guiProfessor.jPanel); //adicionei o desenho

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            MaskFormatter mascara = new MaskFormatter("#######-####");
            mascara.install((JFormattedTextField) guiProfessor.txtTelefone);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        try {
            List<Professor> professores = new DaoProfessor().getAll();
            guiProfessor.lstProfessor.setListData(professores.toArray()); //serve para preencher a lista
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        frame.pack();  //serve para formatar a tela

        frame.setVisible(true);
    }
}
