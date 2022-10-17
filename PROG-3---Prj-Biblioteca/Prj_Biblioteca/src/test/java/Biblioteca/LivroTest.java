package Biblioteca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LivroTest {
    @Test
    void testeLivro(){
        Autor autor = new Autor("Nome","Sobrenome","Nacionalidade");
        List<Autor> listaAutores = new ArrayList<>(); //crio uma lista de Autores ja q o proprio nao é uma String
        listaAutores.add(autor);
        Livro livro = new Livro("Título","Ano",listaAutores);
        String tituloEsperado = "Título";
        String anoEsperado = "Ano";
        String nomeEsperado = "Nome";
        String sobrenomeEsperado = "Sobrenome";
        String nacionalidadeEsperada = "Nacionalidade";

        //vou na lista de autores de livro e no indice 1 pego o nome
        Assertions.assertEquals(tituloEsperado, livro.getTitulo());
        Assertions.assertEquals(nomeEsperado, livro.getListaAutores().get(0).getNome());
        Assertions.assertEquals(sobrenomeEsperado, livro.getListaAutores().get(0).getSobreNome());
        Assertions.assertEquals(nacionalidadeEsperada, livro.getListaAutores().get(0).getNacionalidade());
        Assertions.assertEquals(nacionalidadeEsperada, autor.getNacionalidade());
    }
}
