import java.util.Random;
import java.util.Scanner;

public class Game {
    
    private Player player;
    private Monster monster;
    private Scanner s1;

    public Game(Player player){

        this.player = player;
        s1 = new Scanner(System.in);
    }
    public void kampf(){
        if(monster.getHealth() <= 0){
            newMonster();
            }        
        System.out.println("Kampf tritt auf");
        System.out.println("\nSpieler :"+player.getHealth()+ " Leben ||"+player.getDamage()+" Schaden ||"+player.getLevel()+" Level ||"+player.getXp()+" XP");
        System.out.println("Monster :"+monster.getHealth() + " Leben ||"+monster.getDamage()+" Schaden ||"+monster.getXpValue()+" XP");   
                monster.setHealth(monster.getHealth()-player.getDamage());
                System.out.println("\nMonster hat "+player.getDamage()+" Schaden genommen und hat noch "+monster.getHealth()+" HP");

                if(monster.getHealth()<= 0){
                    System.out.println("Das Monster ist besiegt");
                    player.setHealth(player.getMAX_HEALTH()); 
                    return;
                }
                player.setHealth(player.getHealth()-monster.getDamage());
                System.out.println("Spieler hat "+monster.getDamage()+" Schaden genommen und hat noch "+player.getHealth()+" HP");
                
                if (player.getHealth() <= 0) {
                    System.out.println("Der Spieler ist besiegt");
                }
            
    }
    public void encounter(){
        while(player.getHealth() > 0){
            System.out.println("\nOptionen :");
            System.out.println("1: fliehen || 2: kaempfen");
            int wahl = s1.nextInt();
                switch (wahl) {
                    case 1:
                    System.out.println("\nerfolgreich geflohen\n");
                    newMonster();
                        break;
                    case 2:
                    kampf();
                    if (player.getHealth() > 0 && monster.getHealth() <= 0) {
                        player.xpHinzufuegen(monster.getXpValue());
                    }
                        break;
                    default:
                    System.out.println("ungueltige Wahl");   
                    break;
                }
        }
    }
    public Monster getMonster(){
        return monster;
    }
    public void newMonster(){
        
        final int MIN_HEALTH = 20;
        final int MAX_HEALTH = 100;
        final int MIN_DAMAGE = 5;
        final int MAX_DAMAGE = 20;
        final int MIN_XPVALUE = 2;
        final int MAX_XPVALUE = 10;

        Random randmom = new Random();

        int health = randmom.nextInt(MAX_HEALTH - MIN_HEALTH + 1) + MIN_HEALTH;
        int damage = randmom.nextInt(MAX_DAMAGE - MIN_DAMAGE + 1) + MIN_DAMAGE;
        int xpValue = randmom.nextInt(MAX_XPVALUE - MIN_XPVALUE + 1) + MIN_XPVALUE;

        monster = new Monster(health, damage, xpValue);
        System.out.println("Ein Monster ist erschienen");
        System.out.println("Monster :"+monster.getHealth() + " Leben ||"+monster.getDamage()+" Schaden ||"+monster.getXpValue()+" XP");
    }
    }

