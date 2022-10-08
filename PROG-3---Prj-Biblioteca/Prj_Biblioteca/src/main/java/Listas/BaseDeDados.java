package Listas;

import Biblioteca.Autor;
import Biblioteca.Emprestimo;
import Biblioteca.Livro;

import java.util.ArrayList;

public class BaseDeDados {
    private ArrayList<Autor> atores;
    private ArrayList<Livro> livros;
    private ArrayList<Emprestimo> emprestimos;

    public BaseDeDados(ArrayList<Autor> atores, ArrayList<Livro> livros, ArrayList<Emprestimo> emprestimos) {
        this.atores = atores;
        this.livros = livros;
        this.emprestimos = emprestimos;
    }

    public boolean criarAutor(Autor autor){
        return atores.add(autor);
    }

    public boolean apagarAutor(Autor autor){
        return atores.remove(autor);
    }

    public boolean criarLivro(Livro livro){
        return livros.add(livro);
    }

    public boolean removerLivro(Livro livro){
        return livros.remove(livro);
    }
}
