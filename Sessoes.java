package Prova2;

public class Sessoes {
    private long id;
    private String horario;
    private int sala;

    public Sessoes(long id, String horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
    }

    public Sessoes() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Sessoes{" +
                "id=" + id +
                ", horario='" + horario + '\'' +
                ", sala=" + sala +
                '}';
    }
}
