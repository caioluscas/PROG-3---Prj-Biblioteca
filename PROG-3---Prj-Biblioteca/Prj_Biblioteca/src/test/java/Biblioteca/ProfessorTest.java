package Biblioteca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProfessorTest {
    @Test
    void testeProfessor(){
        Professor professor = new Professor("Nome", "Endereço", "Telefone", "Disciplina");
        String nomeEsperado = "Nome";
        String enderecoEsperado = "Endereço";
        String telefoneEsperado = "Telefone";
        String disciplinaEsperada = "Disciplina";

        Assertions.assertEquals(nomeEsperado, professor.getNome());
        Assertions.assertEquals(enderecoEsperado, professor.getEndereco());
        Assertions.assertEquals(telefoneEsperado, professor.getTelefone());
        Assertions.assertEquals(disciplinaEsperada, professor.getDisciplina());
    }

}