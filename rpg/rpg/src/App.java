
public class App {
    public static void main(String[] args) throws Exception {
        Player p1 = new Player();
        Game g1 = new Game(p1);
        g1.newMonster();
        g1.encounter();
    }
}
