import java.util.ArrayList;

public class Datenbank
{
    public static ArrayList<Artikel> artikelList;
    public Datenbank()
    {
        artikelList = new ArrayList<Artikel>();
    }
    
    public void addList(Artikel x){
        artikelList.add(x);
    }

    public void bearbeiteAnfrage(String anfrage)
    {
        for(Artikel i : artikelList){
            System.out.println(i.getSympton() + " | "+anfrage);
            String sympton = i.getSympton();
            if(anfrage.equals(sympton)){
                System.out.println(i);
            }
        }
        }
}
