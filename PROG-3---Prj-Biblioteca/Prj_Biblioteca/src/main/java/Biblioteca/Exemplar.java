package Biblioteca;

import java.time.LocalDate;

public class Exemplar {
    private static Long proximoCodigo = 1L;
    private Livro livro;
    private Long codigo;
    private LocalDate dataAquisicao;

    public Exemplar(){}

    public Exemplar(Livro livro){
        this.livro = livro;
        this.dataAquisicao = LocalDate.now();
        this.codigo = proximoCodigo;
        proximoCodigo++;
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



}
