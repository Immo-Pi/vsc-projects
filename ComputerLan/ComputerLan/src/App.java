public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Seminare s1 = new Seminare(90,90);
        Seminare s2 = new Seminare(90,90);
        
        new Teilnehmer("Torben Spahn", 187, 2425, s1).addSeminar(s2);
        new Teilnehmer("Tom R", 188, 2426, s1);
        new Teilnehmer("Paul Fehl", 189, 2427, s1);
        new Teilnehmer("Toni Tonius", 193, 2429, s1).addSeminar(s2);

        new Teilnehmer("Finja Friedrich", 190, 2425, s2).addSeminar(s1);
        new Teilnehmer("Vincent Abels", 191, 2426, s2);
        new Teilnehmer("Tom B", 192, 2427, s2);
        
        s1.getTeilnehmer();
        System.out.println("\n");
        s2.getTeilnehmer();

    }
}
