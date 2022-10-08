package dao;

import Biblioteca.Aluno;
import Biblioteca.Livro;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoAluno extends Persistencia<Aluno> implements Dao<Aluno>{
    private final static String NOMEARQUIVO = "alunos.json";
    public void save(Aluno aluno) throws Exception {
        List<Aluno> alunos = getAll();

        //1) adiciona objeto a lista
        alunos.add(aluno);


        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(alunos); //converte em JSON

        //3) Grava o arquivo no disco
        FileOutputStream out = new FileOutputStream(NOMEARQUIVO);
        out.write(json.getBytes());
        out.close();
    }

    public List<Aluno> getAll() throws Exception {

        try{
            //1) Ler o arquivo
            FileInputStream in = new FileInputStream(NOMEARQUIVO);
            String json = new String(in.readAllBytes());
            List<Aluno> alunos = getObjectmapper()
                    .readValue(json,
                            new TypeReference<List<Aluno>>(){}); //converte o arquivo
            return alunos;
        } catch (FileNotFoundException f){
            return new ArrayList<>();
        }

    }
}
