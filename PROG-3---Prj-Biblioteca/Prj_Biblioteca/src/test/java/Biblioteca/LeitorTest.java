package Biblioteca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeitorTest {
    @Test
    void testeLeitor(){
        Leitor leitor = new Leitor("Nome","Endereço","Telefone");
        String nomeEsperado = "Nome";
        String enderercoEsperado = "Endereço";
        String telefoneEsperada = "Telefone";

        Assertions.assertEquals(nomeEsperado, leitor.getNome());
        Assertions.assertEquals(enderercoEsperado, leitor.getEndereco());
        Assertions.assertEquals(telefoneEsperada, leitor.getTelefone());
    }
}
