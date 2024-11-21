public class Artikel {
    
    private String sympton;
    private String name;
    private Datenbank db;

    public Artikel(String sympton, String name, Datenbank db){
        this.sympton = sympton;
        this.name = name;
        this.db = db;
        db.addList(this);
    }
    
    public String getSympton(){
        return sympton;
    }

    @Override
    public String toString() {
            return name+" hilft bei Sympton : "+sympton;
    
    }


}
