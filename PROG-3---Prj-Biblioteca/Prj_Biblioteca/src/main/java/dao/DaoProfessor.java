package dao;

import Biblioteca.Aluno;
import Biblioteca.Professor;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoProfessor extends Persistencia<Professor> implements Dao<Professor>{
    private final static String NOMEARQUIVO = "professor.json";

    public void save(Professor professor) throws Exception {
        List<Professor> professores = getAll();

        //1) adiciona objeto a lista
        professores.add(professor);


        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(professores); //converte em JSON

        //3) Grava o arquivo no disco
        FileOutputStream out = new FileOutputStream(NOMEARQUIVO);
        out.write(json.getBytes());
        out.close();
    }

    public List<Professor> getAll() throws Exception {

        try{
            //1) Ler o arquivo
            FileInputStream in = new FileInputStream(NOMEARQUIVO);
            String json = new String(in.readAllBytes());
            List<Professor> professores = getObjectmapper()
                    .readValue(json,
                            new TypeReference<List<Professor>>(){}); //converte o arquivo
            return professores;
        } catch (FileNotFoundException f){
            return new ArrayList<>();
        }

    }
}
