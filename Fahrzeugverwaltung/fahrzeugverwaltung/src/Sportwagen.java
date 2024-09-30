public class Sportwagen extends Fahrzeug{

    private double felgengroeße;
    private int sitzplaetze;
    
    public Sportwagen(String marke, String farbe, int baujahr, int sitzplaetze, double felgengroeße) {
        super(marke, farbe, baujahr);
        this.sitzplaetze = sitzplaetze;
        this.felgengroeße = felgengroeße;
        
    }

    public double getFelgengroeße() {
        return felgengroeße;
    }
    public void setFelgengroeße(double felgengroeße) {
        this.felgengroeße = felgengroeße;
    }
    public int getSitzplaetze() {
        return sitzplaetze;
    }
    public void setSitzplaetze(int sitzplaetze) {
        this.sitzplaetze = sitzplaetze;
    }
    
}
