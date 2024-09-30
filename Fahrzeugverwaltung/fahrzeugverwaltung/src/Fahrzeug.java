public class Fahrzeug {
   
    private static int counter;
    private int fzNr;
    private int baujahr;
    private String marke;
    private String farbe;
    private String Nmrschild;
    private boolean vermietet;
    
    public Fahrzeug(String marke, String farbe, int baujahr){
        this.marke = marke;
        this.farbe = farbe;
        this.baujahr = baujahr;
        fzNr = counter + 1;
        System.out.println("Counter : "+counter+"\n Fahrzeugnummer: "+fzNr);
        counter++;
        App.liste.add(this);
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
