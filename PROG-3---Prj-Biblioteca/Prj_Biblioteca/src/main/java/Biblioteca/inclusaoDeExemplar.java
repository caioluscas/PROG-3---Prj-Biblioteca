package Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class inclusaoDeExemplar {
    private Livro livro;
    private long codigo_exemplar;
    private LocalDate dataAquisicao;
    private static Long proximoCodigo = 1L;


    public inclusaoDeExemplar(){}

    public inclusaoDeExemplar(Livro livro) {  //Objeto da classe livro
        this.codigo_exemplar = proximoCodigo;
        this.dataAquisicao = LocalDate.now();
        this.livro = livro;
        proximoCodigo++;
    }

    public String toString() {
        return ("Livro exemplar: "+this.getLivro());
    }

    public long getCodigo() {
        return codigo_exemplar;
    }

    public void setCodigo(long codigo_exemplar) {
        this.codigo_exemplar = codigo_exemplar;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public static Long getProximoCodigo() {
        return proximoCodigo;
    }

    public static void setProximoCodigo(Long proximoCodigo) {
        inclusaoDeExemplar.proximoCodigo = proximoCodigo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }


}
