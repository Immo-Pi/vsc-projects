public class Lieferwagen extends Fahrzeug {

    private int anzahlSchiebetüren;
    private int ladeflaeche;
    private int anzahlAchsen;

    public Lieferwagen(String marke, String farbe, int baujahr,int anzahlSchiebetüren, int ladeflaeche, int anzahlAchsen ) {
        super(marke, farbe, baujahr);
        this.anzahlAchsen = anzahlAchsen;
        this.ladeflaeche = ladeflaeche;
        this.anzahlSchiebetüren = anzahlSchiebetüren;
    }
    
    public int getAnzahlSchiebetüren() {
        return anzahlSchiebetüren;
    }
    public void setAnzahlSchiebetüren(int anzahlSchiebetüren) {
        this.anzahlSchiebetüren = anzahlSchiebetüren;
    }
    public int getLadeflaeche() {
        return ladeflaeche;
    }
    public void setLadeflaeche(int ladeflaeche) {
        this.ladeflaeche = ladeflaeche;
    }
    public int getAnzahlAchsen() {
        return anzahlAchsen;
    }
    public void setAnzahlAchsen(int anzahlAchsen) {
        this.anzahlAchsen = anzahlAchsen;
    }
}
