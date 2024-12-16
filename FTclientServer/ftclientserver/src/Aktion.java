import java.util.ArrayList;

public class Aktion {
    private static int anrZaehler = 0;
    private int anr;
    private String datum;
    private String beginn;
    private String titel;
    private double kosten;
    private int plaetze;
    private Organisator veranstalter;
    private ArrayList<Mitglied> teilnehmer;
    private ArrayList<Mitglied> warteListe;

    public Aktion(String titel, String datum, String beginn, double kosten, int plaetze, Organisator organisator){
        this.titel = titel;
        this.datum = datum;
        this.beginn = beginn;
        this.kosten = kosten;
        this.plaetze = plaetze;
        veranstalter = organisator;
        veranstalter.aktionHinzufuegen(this);
        teilnehmer = new ArrayList<Mitglied>();
        warteListe = new ArrayList<Mitglied>();
        anr = anrZaehler + 1;
        anrZaehler++;
        }

    public boolean anmelden(Mitglied m){
        if (teilnehmer.size() < plaetze){
            teilnehmer.add(m);
            return true;
        }
        else{
            return false;
        }
    }

    public void eintragenInWartelisten(Mitglied m){
        warteListe.add(m);
    }

    public boolean abmelden(Mitglied m){
        if(teilnehmer.contains(m)){
            teilnehmer.remove(m);
            if(warteListe.size()> 0){
                teilnehmer.add(warteListe.remove(0));
            }
            return true;
        }
        else{
            return false;
        }
    }

    public boolean istTeilnehmer(Mitglied m){
        if(teilnehmer.contains(m)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean istAusgebucht(){
        if (teilnehmer.size() < plaetze){
            return false;
        }
        else{
            return true;
        }
    }
}
