package Prova2;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private String nome;
    private long id;
    private List<Categoria> categoria = new ArrayList<Categoria>();

    public Cinema() {
    }

    public Cinema(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", sessoes=" + categoria +
                '}';
    }
}
