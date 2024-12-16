import java.net.ServerSocket;
import java.net.Socket;

public class BestellServer {
    private int port;
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private BestellSystem bestellSystem;

    public void empfangeBestellung(Kunde k){
        private String x;
        clientSocket.write();
        while(!x.equals("ende")){
        x = serverSocket.readLine();
        String[] xAri = x.split(" ");
            if(x.startswith("bestellen")){
                Artikel artikel = bestellSystem.getArtikel(Integer.parseInt(xAri[1]));
                int anzahl = Integer.parseInt(xAri[2]);
                if (artikel != null)  {
                    if (artikel.getLagerbestand() >= anzahl ) {
                        new Bestellung(k).erstellePosition(artikel, anzahl);
                        clientSocket.write("ok");
                        artikel.setLagetbestand()= artikel.getLagerbestand - anzahl;
                    }
                    else{
                        clientSocket.write("-Err zu wenig auf Lager")
                    }   
                }
                else{
                    clientSocket.write("-Err kein Artikel mit dieser Artikel Nummer")
                }
            else{
                clientSocket.write("-Err Unbekanntes Kommando")
            }
    }
}
}

