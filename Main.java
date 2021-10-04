package Prova2;

public class Main {
    public static void main(String[] args) {

    Cinema cinema = new Cinema("cinemark", 1);

    Sessoes sessoes = new Sessoes(1,"Sexta-feira - 14:00",4);

    cinema.getSessoes().add(sessoes);

    System.out.println(cinema);

    }
}
