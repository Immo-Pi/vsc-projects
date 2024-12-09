import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Datenbank
{
    Pattern digit = Pattern.compile("[0-9]");
    Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

    private static ArrayList<Artikel> artikelList;
    private boolean medAusgegeben;
    public static final String[] fehlerAusgaben = {
        "Das Medikament konnte nicht gefunden werden",
        "Ihre Symptone wurden wahrscheinlich falsch beschrieben",
        "Versuchen sie es nochmal",
        "LRS?",
        "leck eier"
    };

    public Datenbank()
    {
        artikelList = new ArrayList<Artikel>();
    }
    
    public void addList(Artikel x){
        artikelList.add(x);
    }

    public void bearbeiteAnfrage(String anfrage)
    {
        medAusgegeben = false;
        if (digit.matcher(anfrage).matches()) {
            System.out.println("Ungültige Eingabe");
        }
        else if(special.matcher(anfrage).matches()){
            System.out.println("Ungültige Eingabe");
        }
        else{
            try{
            for(Artikel i : artikelList){
            if(anfrage.toLowerCase().equals(i.getSympton().toLowerCase()) || i.getSympton().startsWith(anfrage.substring(0, 3)) || i.getSympton().endsWith(anfrage.substring(anfrage.length()-3, anfrage.length()))){
                System.out.println(i);
                medAusgegeben = true;
            }
        }
        }
        catch (Exception e) {}
        if (medAusgegeben == false) {
            Random random = new Random();
            System.out.println(fehlerAusgaben[random.nextInt(fehlerAusgaben.length)]);

        }
        }
        }
}
