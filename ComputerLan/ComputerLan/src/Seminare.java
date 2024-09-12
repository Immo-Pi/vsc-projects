import java.util.ArrayList;
import java.util.Iterator;

public class Seminare {
    private int dauer;
    private int kosten;
    private ArrayList<Teilnehmer> teilnehmer;

    public Seminare(int dauer, int kosten){
        this.dauer = dauer;
        this.kosten = kosten;
        teilnehmer = new ArrayList<Teilnehmer>();
    }

    public void addTeilnehmer(Teilnehmer x){
        teilnehmer.add(x);
    }

    public void removeTeilnehmer(int kdr){
        for(int i = 0; i < teilnehmer.size(); i++){
            int x = teilnehmer.get(i).getKdr();
            if(x == kdr){
                teilnehmer.remove(i);
            }
        }
    }

    public void getTeilnehmer(){
        for(int i = 0; i < teilnehmer.size(); i++){
            System.out.println("Kd-Nr. : "+teilnehmer.get(i).getKdr()+" | Vor- und Nachname: "+teilnehmer.get(i).getName()+" | Kto-Nr.: "+teilnehmer.get(i).getKdr()+" | BLZ: "+teilnehmer.get(i).getBlz());
        }
    }
    public void getTeilnehmer2(){
        for(Teilnehmer i :teilnehmer) {
            System.out.println("Kd-Nr. : "+i.getKdr()+" | Vor- und Nachname: "+i.getName()+" | Kto-Nr.: "+i.getKdr()+" | BLZ: "+i.getBlz());
        }
    }
    public void getTeilnehmer3(){
        Iterator<Teilnehmer> it = teilnehmer.iterator();
        int i = 0;
        while(it.hasNext()){
            System.out.println("Kd-Nr. : "+teilnehmer.get(i).getKdr()+" | Vor- und Nachname: "+teilnehmer.get(i).getName()+" | Kto-Nr.: "+teilnehmer.get(i).getKdr()+" | BLZ: "+teilnehmer.get(i).getBlz());
            i++;
            it.next();
        }
    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }
    
    public int getKosten() {
        return kosten;
    }

    public void setKosten(int kosten) {
        this.kosten = kosten;
    }
}
