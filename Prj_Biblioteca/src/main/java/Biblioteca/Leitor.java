package Biblioteca;

public class Leitor {
    private Long codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private Integer prazoMaximoDevolucao;

    public void Leitor(){

    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getPrazoMaximoDevolucao() {
        return prazoMaximoDevolucao;
    }

    public void setPrazoMaximoDevolucao(Integer prazoMaximoDevolucao) {
        this.prazoMaximoDevolucao = prazoMaximoDevolucao;
    }
}