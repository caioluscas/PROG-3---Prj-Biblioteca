package Biblioteca;

import dao.DaoinclusaoDeExemplar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class inclusaoDeExemplar {
    private Livro livro;
    private long codigo_exemplar;
    private LocalDate dataAquisicao;
    private LocalDate dataDevolucao = null;
    private static Long proximoCodigo = 1L;


    public inclusaoDeExemplar(){}

    public inclusaoDeExemplar(Livro livro) {  //Objeto da classe livro
        this.codigo_exemplar = proximoCodigo;
        this.dataAquisicao = LocalDate.now();
        this.livro = livro;
        proximoCodigo++;
        AtualizarProximoCodigo();
    }
    public void AtualizarProximoCodigo(){
        Long maior = 0L;
        try {
            List<inclusaoDeExemplar> exemplares = new DaoinclusaoDeExemplar().getAll();
            for (inclusaoDeExemplar exemplar : exemplares) {
                if (exemplar.getCodigo() > maior) {
                    maior = exemplar.getCodigo();
                    setCodigo(maior+1);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
    public void Devolucao(){
        this.dataDevolucao = LocalDate.now(); //pego hj e armazeno a data
    }


}
