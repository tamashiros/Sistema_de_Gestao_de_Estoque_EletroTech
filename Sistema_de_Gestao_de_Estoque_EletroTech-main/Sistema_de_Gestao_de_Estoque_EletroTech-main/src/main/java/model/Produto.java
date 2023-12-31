package model;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private String categoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String toString() {
        // Formata cada propriedade do produto em uma coluna de tabela
        return String.format("| %-5d | %-20s | %-50s | %-20s |", id, nome, descricao, categoria);
    }

}
