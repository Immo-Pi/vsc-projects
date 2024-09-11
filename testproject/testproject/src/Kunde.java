import java.util.ArrayList;

public class Kunde {
    
    private String name;
    private int alter;
    private ArrayList<Account> accounts;

    public Kunde(String name, int alter){
        this.name = name;
        this.alter = alter;
        ArrayList<Account> accounts = new ArrayList<Account>();
        this.accounts = accounts;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public void setAlter(int alter){
        this.alter=alter;
    }

    public int getAlter(){
        return alter;
    }

    public void addAccount(Account acount){
        accounts.add(acount);
    }

    public void createAccount(int money, Kunde owner, int nummer){
        new Account(money, owner, nummer);
    }

    public void getAccounts(){
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println((i+1)+". Account: "+ accounts.get(i).getNummer());
            System.out.println("    Owner: " + accounts.get(i).getOwner().getName());
            System.out.println("    Balance: " + accounts.get(i).getMoney()+"€ \n");
        }
    }
}