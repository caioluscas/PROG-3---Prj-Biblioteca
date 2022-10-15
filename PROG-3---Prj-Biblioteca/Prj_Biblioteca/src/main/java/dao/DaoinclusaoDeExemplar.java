package dao;

import Biblioteca.inclusaoDeExemplar;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoinclusaoDeExemplar extends Persistencia<inclusaoDeExemplar> implements Dao<inclusaoDeExemplar> {
    private final static String NOMEARQUIVO = "exemplares.json";

    public void save(inclusaoDeExemplar exemplar) throws Exception {
        List<inclusaoDeExemplar> exemplares = getAll();
        exemplares.add(exemplar);
        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(exemplares);

        FileOutputStream out = new FileOutputStream(NOMEARQUIVO);
        out.write(json.getBytes());
        out.close();
    }


    public List<inclusaoDeExemplar> getAll() throws Exception{
        try {
            FileInputStream in = new FileInputStream(NOMEARQUIVO); //abre um arquivo
            String json = new String(in.readAllBytes());    //pega o JSON dentro do arquivo

            //transforma em um lista de objeto
            List<inclusaoDeExemplar> exemplares = getObjectmapper().readValue(json, new TypeReference<List<inclusaoDeExemplar>>(){});
            return exemplares;
        }
        catch (FileNotFoundException f) {
            return new ArrayList();
        }
    }
}

