
public class Server
{
    private Client client;
    private Datenbank db;

    /**
     * 
     */
    public Server()
    {
        client = new Client();
        db = new Datenbank();
    }

    /**
     *
     */
    public void start()
    {
        boolean beenden = false;
        
        begruessungErzeugen();
        
        while(beenden == false) {
            String anfrage = client.erzeugeAnfrage();
            if(anfrage.startsWith("ende"))
            {
            beenden = true;
            }
            else
            {
                db.bearbeiteAnfrage(anfrage);
                
            }
        }
        
        abschiedErzeugen();
    }

    /**
     *
     */
    private void begruessungErzeugen()
    {
        System.out.println("Herzlich Willkommen bei der Online-Apotheke MediHealth.");
        System.out.println();
        System.out.println("Bitte berichten Sie uns von Ihren Beschwerden." +
                           " Wir werden Sie umfassend beraten.");
        System.out.println("Tippen Sie nun bitte das Schlagwort zu Ihrem Symptom ein," +
                           " z.B. 'Husten' und Sie \nerhalten unsere Produktempfehlungen.");
        System.out.println();
        System.out.println("Um den Dialog zu verlassen, geben Sie bitte" +
                           " 'Ende' ein.");
    }

    /**
     *
     */
    private void abschiedErzeugen()
    {
        System.out.println();
        System.out.println("Vielen Dank für Ihr Interesse an unseren Produkten.");
    }

    public Datenbank getDatenbank(){
        return db;
    }
}
