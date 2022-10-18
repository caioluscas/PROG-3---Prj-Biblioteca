package Biblioteca;

import dao.DaoProfessor;

import java.util.List;

public class Professor extends Leitor{
    private String disciplina;

    public Professor(String nome, String endereco, String telefone, String disciplina) {
        super(nome, endereco, telefone);
        this.disciplina = disciplina;
        setPrazoMaximoDevolucao(30);
        AtualizarProximoCodigo();

    }

    public Professor(){

    }

    public void AtualizarProximoCodigo(){
        Long maior = 0L;
        try {
            List<Professor> professores = new DaoProfessor().getAll();
            for (Professor professor : professores) {
                if (professor.getCodigo() > maior) {
                    maior = professor.getCodigo();
                    setCodigo(maior+1);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
