public class Monster {
    private int health;
    private int damage;
    private int xpValue;


 
    public Monster(){
        health = 100;
        damage = 5;
        xpValue = 5;
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


}
