public class App {
    public static void main(String[] args) throws Exception {
        Kunde tom = new Kunde("Tom", 37);
        tom.createAccount(1337, tom, 2424);
        tom.createAccount(14242, tom, 42440);
        tom.createAccount(244252, tom, 69132);
        tom.createAccount(15, tom, 10102);
        tom.getAccounts();
    }
}
