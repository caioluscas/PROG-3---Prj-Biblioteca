package Biblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataDevolucao;

    public void Emprestimo(){

    }

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataPrevistaDevolucao, LocalDate dataDevolucao) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
        this.dataDevolucao = dataDevolucao;
    }


}
