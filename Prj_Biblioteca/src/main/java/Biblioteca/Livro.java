package Biblioteca;
import java.util.ArrayList;

public class Livro {
    private Long codigo;
    private String titulo;
    private static Long proximoCodigo = 1L;

    public Livro(String titulo) {
        this.codigo = proximoCodigo;
        this.titulo = titulo;
        proximoCodigo++;
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
