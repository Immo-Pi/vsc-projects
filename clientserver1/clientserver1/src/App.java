public class App {
    public static void main(String[] args) throws Exception {
        Server test = new Server();
        new Artikel("Husten", "codein", test.getDatenbank());
		test.start();
    }
}
