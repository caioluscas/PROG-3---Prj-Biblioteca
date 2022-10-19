package Biblioteca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoTest {
    @Test
    void Emprestimo(){
        Autor autor = new Autor("Nome","Sobrenome","Nacionalidade");
        Leitor leitor = new Leitor("Nome", "Endereço","Telefone" );
        List<Autor> listaAutores = new ArrayList<>(); //crio uma lista de Autores ja q o proprio nao é uma String
        listaAutores.add(autor);
        //Livro livro = new Livro("Tilulo", "Ano",);
        inclusaoDeExemplar inclusaodeexemplar = new inclusaoDeExemplar();



    }
}
