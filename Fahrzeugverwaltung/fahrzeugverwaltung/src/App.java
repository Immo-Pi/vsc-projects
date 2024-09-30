import java.util.ArrayList;

public class App {
    static ArrayList<Fahrzeug> liste = new ArrayList<Fahrzeug>();

    public static void main(String[] args) throws Exception {
        new Sportwagen("Mercedes", "Blau", 1996, 32, 17.5);
        new Lieferwagen("Byd", "orange", 2012, 2, 32, 6);
        new Wohnmobil("Renault", "pink", 1969, 4, 38, "hoher Standard");
        new Van("Caddilac", "Gruen", 1990, 20, 0);

    }
}
