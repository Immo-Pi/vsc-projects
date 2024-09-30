public class Wohnmobil extends Fahrzeug {

    private int schlafplaetze;
    private int wassertank;
    private String wohnmobilkategorie;
    
    public Wohnmobil(String marke, String farbe, int baujahr, int schlafplaetze, int wassertank, String wohnmobilkategorie) {
        super(marke, farbe, baujahr);
        this.schlafplaetze = schlafplaetze;
        this.wassertank = wassertank;
        this.wohnmobilkategorie = wohnmobilkategorie;
    }

    public int getSchlafplaetze() {
        return schlafplaetze;
    }
    public void setSchlafplaetze(int schlafplaetze) {
        this.schlafplaetze = schlafplaetze;
    }
    public int getWassertank() {
        return wassertank;
    }
    public void setWassertank(int wassertank) {
        this.wassertank = wassertank;
    }
    public String getWohnmobilkategorie() {
        return wohnmobilkategorie;
    }
    public void setWohnmobilkategorie(String wohnmobilkategorie) {
        this.wohnmobilkategorie = wohnmobilkategorie;
    }
}
