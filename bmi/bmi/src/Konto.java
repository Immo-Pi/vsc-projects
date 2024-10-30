public class Konto {
    private int kontonr;
    private String besitzer;
    private Bank bank;

    public Konto(int kontonr, String besitzer, Bank bank){
        this.kontonr = kontonr;
        this.besitzer = besitzer;
        this.bank = bank;
        bank.addKonto(this);
    }

    public Bank getBank() {
        return bank;
    }
    public void setBank(Bank bank) {
        this.bank = bank;
    }
    public int getKontonr() {
        return kontonr;
    }
    public void setKontonr(int kontonr) {
        this.kontonr = kontonr;
    }
    public String getBesitzer() {
        return besitzer;
    }
    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }
}
