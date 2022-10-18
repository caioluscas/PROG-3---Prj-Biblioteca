package Biblioteca;

import dao.DaoAluno;
import dao.DaoProfessor;

import java.util.List;

public class Aluno extends Leitor{
    private String matricula;

    public Aluno(String nome, String endereco, String telefone, String matricula) {
        super(nome, endereco, telefone);
        this.matricula=matricula;
        setPrazoMaximoDevolucao(15);
        AtualizarProximoCodigo();
    }

    public Aluno(){

    }


    public void AtualizarProximoCodigo(){
        Long maior = 0L;
        try {
            List<Aluno> alunos = new DaoAluno().getAll();
            for (Aluno aluno : alunos) {
                if (aluno.getCodigo() > maior) {
                    maior = aluno.getCodigo();
                    setCodigo(maior+1);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
