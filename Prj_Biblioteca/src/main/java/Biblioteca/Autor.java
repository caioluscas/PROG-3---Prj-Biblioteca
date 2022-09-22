package Biblioteca;

import java.util.ArrayList;

public class Autor {
    private String nome;
    private String sobreNome;
    private String nacionalidade;


    public Autor(String nome, String sobreNome, String nacionalidade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.nacionalidade = nacionalidade;
    }

    public Autor(){

    }

    @Override
    public String toString() {
        return this.nome+" "+this.sobreNome+" "+this.nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}
