package Prova2;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private String nome;
    private long id;
    private List<Sessoes> sessoes = new ArrayList<Sessoes>();

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

    public List<Sessoes> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessoes> sessoes) {
        this.sessoes = sessoes;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", sessoes=" + sessoes +
                '}';
    }
}
