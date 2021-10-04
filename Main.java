package Prova2;

public class Main {
    public static void main(String[] args) {

    Cinema cinema = new Cinema("cinemark", 1);
    Cinema cinema2 = new Cinema("cinecataratas", 2);

    Categoria cat1 = new Categoria("terror", 3);
    Categoria cat2 = new Categoria("Aventura", 4);

    cinema.getCategoria().add(cat1);
    cinema2.getCategoria().add(cat2);

    System.out.println(cinema);
    System.out.println(cinema2);

    }
}
