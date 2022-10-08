package Gui;

import Biblioteca.Aluno;
import dao.DaoAluno;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;

public class GuiAluno {
    private JTextField txtNome;
    private JTextField txtEndereco;
    private JTextField txtTelefone;
    private JTextField txtMatricula;
    private JButton btnSalvar;
    private JPanel jPanel;
    private JList lstAluno;

    public GuiAluno() {
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Aluno aluno = new Aluno(txtNome.getText(),
                            txtEndereco.getText(),
                            txtTelefone.getText(),
                            txtMatricula.getText());
                    new DaoAluno().save(aluno);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        lstAluno.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Aluno aluno = (Aluno) lstAluno.getSelectedValue();

                if(!(aluno==null)){
                    txtNome.setText(aluno.getNome());
                    txtEndereco.setText(aluno.getEndereco());
                    txtTelefone.setText(aluno.getTelefone());
                    txtMatricula.setText(aluno.getMatricula());
                }
            }
        });
    }

    public JPanel getJPanel() {  //serve para pegar essa tela sem mudar a visibilidade private de JPane
        return jPanel;
    }

    public static void main(String[] args) {
        GuiAluno guiAluno = new GuiAluno(); //criacao do objeto relativo a tela
        JFrame frame = new JFrame("Aluno"); //criei um objeto com o titulo desejado
        frame.setContentPane(guiAluno.jPanel); //adicionei o desenho

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            MaskFormatter mascara = new MaskFormatter("#######-####");
            mascara.install((JFormattedTextField) guiAluno.txtTelefone);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        try {
            List<Aluno> alunos = new DaoAluno().getAll();
            guiAluno.lstAluno.setListData(alunos.toArray()); //serve para preencher a lista
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        frame.pack();  //serve para formatar a tela

        frame.setVisible(true);
    }
}
