package Biblioteca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlunoTest {
    @Test
    void testeAluno(){
        Aluno aluno = new Aluno("Nome","Endereço","Telefone","Matrícula");
        String nomeEsperado = "Nome";
        String enderecoEsperado = "Endereço";
        String telefone = "Telefone";
        String matricula = "Matrícula";

        Assertions.assertEquals(nomeEsperado, aluno.getNome());
        Assertions.assertEquals(enderecoEsperado, aluno.getEndereco());
        Assertions.assertEquals(telefone, aluno.getTelefone());
        Assertions.assertEquals(matricula, aluno.getMatricula());
    }
}
