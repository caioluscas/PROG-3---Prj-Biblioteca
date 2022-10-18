package Biblioteca;
import dao.DaoAutor;
import dao.DaoLivro;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private Long codigo;
    private String titulo;
    private String ano;
    private static Long proximoCodigo = 1L;

    private List<Autor> listaAutores = new ArrayList<>();



    public Livro(){}

    public Livro( String titulo, String ano, List<Autor> listaAutores) {
        this.titulo = titulo;
        this.ano = ano;
        this.listaAutores = listaAutores;
        this.codigo = proximoCodigo;
        proximoCodigo++;
        AtualizarProximoCodigo();
    }

    public void AtualizarProximoCodigo(){
        Long maior = 0L;
        try {
            List<Livro> livros = new DaoLivro().getAll();
            for (Livro livro : livros) {
                if (livro.getCodigo() > maior) {
                    maior = livro.getCodigo();
                    setCodigo(maior+1);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static Long getProximoCodigo() {
        return proximoCodigo;
    }

    public static void setProximoCodigo(Long proximoCodigo) {
        Livro.proximoCodigo = proximoCodigo;
    }

    public List<Autor> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(List<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    @Override
    public String toString() {
        return this.titulo;
    }
}
