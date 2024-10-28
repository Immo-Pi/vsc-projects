import java.util.ArrayList;

public class Fahrzeug {
   
    private static int counter;
    private int fzNr;
    private int baujahr;
    private String marke;
    private String farbe;
    private String Nmrschild;
    private boolean vermietet;
    
    static ArrayList<Fahrzeug> liste = new ArrayList<Fahrzeug>();

    public Fahrzeug(String marke, String farbe, int baujahr){
        this.marke = marke;
        this.farbe = farbe;
        this.baujahr = baujahr;
        fzNr = counter + 1;
        counter++;
        liste.add(this);
    }
    public static void getListe(){
        for(Fahrzeug i : liste ){
            System.out.println(i.getClass()+" : "+i.getMarke() +" "+i.getBaujahr()+" "+i.getFarbe()+" "+i.getFzNr()+"\n");
        }
    }
    public int getFzNr() {
        return fzNr;
    }
    public void setFzNr(int fzNr) {
        this.fzNr = fzNr;
    }
    public int getBaujahr() {
        return baujahr;
    }
    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }
    public String getMarke() {
        return marke;
    }
    public void setMarke(String marke) {
        this.marke = marke;
    }
    public String getFarbe() {
        return farbe;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public String getNmrschild() {
        return Nmrschild;
    }
    public void setNmrschild(String nmrschild) {
        Nmrschild = nmrschild;
    } 
    public boolean isVermietet() {
        return vermietet;
    }
    public void setVermietet(boolean vermietet) {
        this.vermietet = vermietet;
    }

}
