import java.util.ArrayList;

public class Organisator extends Mitglied {
    private static double honorar = 40;
    private ArrayList<Aktion> veranstaltungen;
    public Organisator(String name, String vorname){
        super();
        veranstaltungen = new ArrayList<Aktion>();
    }

    public void aktionHinzufuegen(Aktion a){
        veranstaltungen.add(a);
    }

    public boolean abmeldenVonAktion(Aktion a){
        if (!veranstaltungen.contains(a)) {
            return true;
            
        }    
        else{
            return true;
        }
}
}

