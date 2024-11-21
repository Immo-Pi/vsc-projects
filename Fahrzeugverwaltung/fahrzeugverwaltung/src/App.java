import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
        Sportwagen s1 = new Sportwagen("Mercedes", "Blau", 1996, 32, 17.5);
        new Sportwagen("BMW", "Blau", 1996, 32, 17.5);
        new Sportwagen("Porsche", "Blau", 1996, 32, 17.5);
        new Lieferwagen("Byd", "orange", 2012, 2, 32, 6);
        new Wohnmobil("Renault", "pink", 1969, 4, 38, "hoher Standard");
        new Van("Caddilac", "Gruen", 1990, 20, 0);
        
        Fahrzeug.searchListeForClass(s1);

    }

}
