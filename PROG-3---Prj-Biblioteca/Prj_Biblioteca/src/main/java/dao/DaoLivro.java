package dao;

import Biblioteca.Livro;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DaoLivro extends Persistencia<Livro> implements Dao<Livro> {
    private final static String NOMEARQUIVO = "Livros.json";

    public void save(Livro livro) throws Exception {
        List<Livro> livros = getAll();

        //1) adiciona objeto a lista
        livros.add(livro);


        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(livros); //converte em JSON

        //3) Grava o arquivo no disco
        FileOutputStream out = new FileOutputStream(NOMEARQUIVO);
        out.write(json.getBytes());
        out.close();
    }

    public List<Livro> getAll() throws Exception {

        try{
            //1) Ler o arquivo
            FileInputStream in = new FileInputStream(NOMEARQUIVO);
            String json = new String(in.readAllBytes());
            List<Livro> livros = getObjectmapper()
                    .readValue(json,
                            new TypeReference<List<Livro>>(){}); //converte o arquivo
            return livros;
        } catch (FileNotFoundException f){
            return new ArrayList<>();
        }

    }

}
