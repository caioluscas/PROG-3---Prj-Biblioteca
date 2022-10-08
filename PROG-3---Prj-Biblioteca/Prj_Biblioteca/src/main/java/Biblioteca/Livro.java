package Biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private Long codigo;
    private String titulo;
    private static Long proximoCodigo = 1L;

    private Autor autor;

    private List<Autor> listaAutores = new ArrayList<>();


    public Livro(String titulo) {
        this.codigo = proximoCodigo;
        this.titulo = titulo;
        proximoCodigo++;
    }

    @Override
    public String toString() {
        return this.titulo;
    }

    public Livro(){}

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static Long getProximoCodigo() {
        return proximoCodigo;
    }

    public static void setProximoCodigo(Long proximoCodigo) {
        Livro.proximoCodigo = proximoCodigo;
    }
}
