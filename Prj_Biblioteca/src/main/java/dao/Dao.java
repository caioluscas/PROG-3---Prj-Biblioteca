package dao;
import java.util.List;

public interface Dao<T> {   //serve para fazer a interface que vai trabalhar com generico

        public void save(T objeto) throws Exception;

        public List<T> getAll() throws Exception;


}
