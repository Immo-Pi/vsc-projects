import java.util.ArrayList;

public class Bank {
    
    private ArrayList<Konto> konten;

    public Bank(){
        konten = new ArrayList<>();
    }

    public void addKonto(Konto konto){
        konten.add(konto);
    }

    public void getKonten(){
        for(Konto i : konten){
            System.out.println("KontoNr :"+i.getKontonr()+"|| Besitzer : "+i.getBesitzer());
        }
    }
}
