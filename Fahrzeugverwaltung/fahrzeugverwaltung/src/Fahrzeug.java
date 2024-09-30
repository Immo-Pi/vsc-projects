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
    }

}
