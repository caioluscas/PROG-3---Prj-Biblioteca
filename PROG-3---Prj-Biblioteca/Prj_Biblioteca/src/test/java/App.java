import Biblioteca.Aluno;
import Biblioteca.Livro;
import dao.Dao;
import dao.DaoAluno;

import java.util.List;

public class App {
    public static void main(String[] args) {
        //lerLivros();

        gerarAlunos();
    }
    private static void gerarAlunos(){
        Aluno aluno = new Aluno("Caio Lucas", "Rua Nova friburgo", "22999236464", "24324234");
        DaoAluno dao = new DaoAluno();
        try {
            new DaoAluno().save(aluno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void lerLivros(){
        Dao<Livro> dao = new DaoLivro();

        try {
            List<Livro> livros = new DaoLivro().getAll();
            for(Livro livro: livros){
                System.out.println(livro.getTitulo());
                System.out.println(livro.getCodigo());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void gerarLivros(){
        Livro livro = new Livro("Batman");
        DaoLivro dao = new DaoLivro();
        try {
            dao.save(livro);
        } catch (Exception e) {
            System.out.println(e.getMessage() );
        }

        Livro livro1 = new Livro("Barbie e o mundo mágico");
        try {
            dao.save(livro1);
        } catch (Exception e) {
            System.out.println(e.getMessage() );
        }
    }



}
