public class App {
    public static void main(String[] args) throws Exception {
        Bank b1 = new Bank();
        new Konto(23, "Torben", b1);
        new Konto(24,"jochen",b1);
        new Konto(25, "lisa", b1);
        b1.getKonten();
    }
}
