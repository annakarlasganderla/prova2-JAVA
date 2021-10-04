package Prova2;

public class Main {
    public static void main(String[] args) {

    Cinema cinema = new Cinema("cinemark", 1);
    Cinema cinema2 = new Cinema("cinecataratas", 2);

    Sessoes sessao = new Sessoes(1,"Sexta-feira - 14:00",4);
    Sessoes sessao2 = new Sessoes(2,"Domingo - 20:00",5);

    cinema.getSessoes().add(sessao);
    cinema2.getSessoes().add(sessao2);

    System.out.println(cinema);

    }
}
