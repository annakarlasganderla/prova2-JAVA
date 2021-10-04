package Prova2;

public class Categoria {
    private String nome;
    private long id;

    public Categoria(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public Categoria() {
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

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
