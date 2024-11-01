public class Player {
    
    private int health;
    private int damage;
    private int xp;
    private int level;

    public Player(){
        health = 100;
        damage = 10;
    }
    
    public void xpHinzufuegen(int x){
        xp = xp + x;
        if (xp >= 10) {
            xp = xp - 10;
            health += 20;
            damage += 5;
            System.out.println("Level Up Schaden : "+damage+" Leben :"+health);
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

}
