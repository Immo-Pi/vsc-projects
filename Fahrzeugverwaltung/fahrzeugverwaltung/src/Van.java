public class Van extends Fahrzeug{

    private int sitzplaetze;
    private int airbags;

    public Van(String marke, String farbe, int baujahr, int sitzplaetze, int airbags) {
        super(marke, farbe, baujahr);
        this.sitzplaetze = sitzplaetze;
        this.airbags = airbags;
    }
    
    public int getSitzplaetze() {
        return sitzplaetze;
    }
    public void setSitzplaetze(int sitzplaetze) {
        this.sitzplaetze = sitzplaetze;
    }
    public int getAirbags() {
        return airbags;
    }
    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }
}
