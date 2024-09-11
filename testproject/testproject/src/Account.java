public class Account {
    
    private int money;
    private Kunde owner;
    private int nummer;

    public Account(int money, Kunde owner, int nummer){
        this.money = money;
        this.owner = owner;
        this.nummer = nummer;
        owner.addAccount(this);
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getMoney(){
        return money;
    }

    public void addMoney(int aMoney){
        money = money + aMoney;
        System.out.println("New Balance is: "+money);
    }

    public void removeMoney(int rMoney){
        money = money - rMoney;
        System.out.println("New Balance is: "+money);
    }

    public Kunde getOwner(){
        return owner;
    }
}
