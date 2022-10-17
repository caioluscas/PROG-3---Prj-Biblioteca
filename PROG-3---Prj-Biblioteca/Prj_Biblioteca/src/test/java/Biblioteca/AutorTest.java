package Biblioteca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AutorTest {
    @Test
    void testeAutor(){
        Autor autor = new Autor("Nome","Sobrenome","Nacionalidade");
        String nomeEsperado = "Nome";
        String sobrenomeEsperado = "Sobrenome";
        String nacionalidadeEsperada = "Nacionalidade";

        Assertions.assertEquals(nomeEsperado, autor.getNome());
        Assertions.assertEquals(sobrenomeEsperado, autor.getSobreNome());
        Assertions.assertEquals(nacionalidadeEsperada, autor.getNacionalidade());
    }
}
