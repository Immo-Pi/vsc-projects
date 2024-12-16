import java.util.ArrayList;

public class Bestellung {
    private Datum datum;
    private int bestellNr;
    private static int letzteBestellNr = 0;
    public Kunde kunde;
    private ArrayList<Position> positionen;
    
    public Bestellung(Kunde kunde){
        bestellNr = letzteBestellNr + 1;
        letzteBestellNr++;
        this.kunde = kunde;
        kunde.bestellungHinzufuegen(this);
        positionen = new ArrayList<Position>();
        datum = new Datum();
    }

    public void erstellePosition(Artikel a, int anzahl){
        positionen.add(new Position(a, anzahl));
    }

}
