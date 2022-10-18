package Biblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private Leitor leitor;
    private inclusaoDeExemplar inclusaodeexemplar;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataDevolucao = null;


    public Emprestimo(){}
    public Emprestimo(inclusaoDeExemplar inclusaodeexemplar, Leitor leitor) {
        this.leitor = leitor;
        this.inclusaodeexemplar = inclusaodeexemplar;
        this.dataEmprestimo = LocalDate.now();
        this.dataPrevistaDevolucao = LocalDate.now().plusDays(leitor.getPrazoMaximoDevolucao()); //plusDay add os dias ao dia da classe
        //pulsdays pega o dia de hj e soma com o prazo

    }


    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public inclusaoDeExemplar getInclusaodeexemplar() {
        return inclusaodeexemplar;
    }

    public void setInclusaodeexemplar(inclusaoDeExemplar inclusaodeexemplar) {
        this.inclusaodeexemplar = inclusaodeexemplar;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override //A data de devolução é do tipo LocalDate, usamos o ToString para transformar em String
    public String toString() {
        return this.inclusaodeexemplar.toString() + " ";
    }
}
