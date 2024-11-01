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
                monster.setHealth(monster.getHealth()-player.getDamage());
                System.out.println("Monster hat "+player.getDamage()+" Schaden genommen und hat noch "+monster.getHealth()+" HP");

                if(monster.getHealth()<= 0){
                    System.out.println("Das Monster ist besiegt");
                    return;
                }
                player.setHealth(player.getHealth()-monster.getDamage());
                System.out.println("Spieler hat "+monster.getDamage()+" genommen und hat noch "+player.getHealth()+" HP");
                
                if (player.getHealth() <= 0) {
                    System.out.println("Der Spieler ist besiegt");
                }
            
    }
    public void encounter(){

        while(player.getHealth() > 0){
            System.out.println("1: fliehen || 2: kaempfen");
            int wahl = s1.nextInt();
                switch (wahl) {
                    case 1:
                    System.out.println("erfolgreich geflohen");
                        break;
                    case 2:
                    kampf();
                    if (player.getHealth() > 0 && monster.getHealth() <= 0) {
                        player.xpHinzufuegen(monster.getXpValue());
                    }
                        break;
                    default:
                    System.out.println("ungueltige Wahl");
                    player.setHealth(100);    
                    break;
                }
        }
    }
    public Monster getMonster(){
        return monster;
    }
    public void newMonster(){
        monster = new Monster();
    }
    }

