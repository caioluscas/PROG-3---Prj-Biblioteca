package Biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private Long codigo;
    private String titulo;
    private String ano;
    private static Long proximoCodigo = 1L;

    private List<Autor> listaAutores = new ArrayList<>();

    @Override
    public String toString() {
        return this.titulo;
    }

    public Livro(){}

    public Livro( String titulo, String ano, List<Autor> listaAutores) {
        this.titulo = titulo;
        this.ano = ano;
        this.listaAutores = listaAutores;
        this.codigo = proximoCodigo;
        proximoCodigo++;
    }

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
