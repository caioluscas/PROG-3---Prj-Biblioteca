package Biblioteca;

public class Professor extends Leitor{
    private String disciplina;

    public Professor(String nome, String endereco, String telefone, String disciplina) {
        super(nome, endereco, telefone);
        this.disciplina = disciplina;
    }

    public Professor(){

    }
    @Override
    public String toString() {
        return this.disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
