import java.util.ArrayList;

public class Teilnehmer {
    private int kdr;
    private String name;
    private int blz;
    private ArrayList<Seminare> seminare;
    
    public Teilnehmer(String name, int kdr, int blz, Seminare seminar){
        this.name = name;
        this.kdr = kdr;
        this.blz = blz;
        seminare = new ArrayList<Seminare>();
        seminare.add(seminar);
        seminar.addTeilnehmer(this);
    }

    public void addSeminar(Seminare seminar){
        seminare.add(seminar);
        seminar.addTeilnehmer(this);
    }

    public int getKdr() {
        return kdr;
    }

    public void setKdr(int kdr) {
        this.kdr = kdr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlz() {
        return blz;
    }

    public void setBlz(int blz) {
        this.blz = blz;
    }
}
