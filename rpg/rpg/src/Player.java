public class Player {
    
    private int health;
    private int damage;
    private int xp;
    private int level;
    private int MAX_HEALTH;

    public Player(){
        health = 100;
        damage = 10;
        MAX_HEALTH = 100;
    }
    
    public void xpHinzufuegen(int x){
        xp = xp + x;
        if (xp >= 10) {
            xp = xp - 10;
            damage += 5;
            MAX_HEALTH += 20;
            System.out.println("Level Up \nSchaden : "+damage+" Max Leben :"+MAX_HEALTH);
        }
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealth(){
    return health;
    }
    public void setHealth(int health) {
    this.health = health;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getMAX_HEALTH() {
        return MAX_HEALTH;
    }

    public void setMAX_HEALTH(int mAX_HEALTH) {
        MAX_HEALTH = mAX_HEALTH;
    }
}
