package Biblioteca;

import dao.DaoinclusaoDeExemplar;

import java.time.LocalDate;
import java.util.List;

public class Exemplar {
    private static Long proximoCodigo = 1L;
    private Livro livro;
    private Long codigo;
    private LocalDate dataAquisicao;
    private LocalDate dataDevolucao = null;

    public Exemplar(){}

    public Exemplar(Livro livro){
        this.livro = livro;
        this.dataAquisicao = LocalDate.now();
        this.codigo = proximoCodigo;
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
    public static Long getProximoCodigo() {
        return proximoCodigo;
    }

    public static void setProximoCodigo(Long proximoCodigo) {
        Exemplar.proximoCodigo = proximoCodigo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public void Devolucao(){
        this.dataDevolucao = LocalDate.now(); //pego hj e armazeno a data
    }

}
