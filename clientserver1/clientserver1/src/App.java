public class App {
    public static void main(String[] args) throws Exception {
        Server test = new Server();
        new Artikel("Husten", "codein", test.getDatenbank());
        new Artikel("Durchfall","Zaepfchen", test.getDatenbank());
        new Artikel("Husten", "hustensaft", test.getDatenbank());
        new Artikel("Kopfschmerzen", "Aspirin", test.getDatenbank());
		test.start();
    }
}
