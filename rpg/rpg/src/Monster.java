public class Monster {
    private int health;
    private int damage;
    private int xpValue;
    private String name;

    public Monster(int health, int damage, int xpValue, String name){
        this.health = health;
        this.damage = damage;
        this.xpValue = xpValue;
        this.name = name;
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
    public int getXpValue() {
        return xpValue;
    }
    public void setXpValue(int xpValue) {
        this.xpValue = xpValue;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
