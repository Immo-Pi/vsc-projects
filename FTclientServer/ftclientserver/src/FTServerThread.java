import java.io.*;
import java.net.*;

public class FTServerThread extends Thread{
    
    private Socket clientSocket;
    private FTserver fts;
    private Mitglied mitglied;

    public FTServerThread(Socket clientsocket, FTserver fts){
        this.fts = fts;
        this.clientSocket = clientsocket;
    }

    public void run(){
        String[] benpw = clientSocket.readline().split(";");
        mitglied = fts.findeMitglied(benpw[0], benpw[1]);
        if(mitglied != null){
            clientSocket.write("ok \n");
        }
        else{
            clientSocket.write("nok \n");
            clientSocket.close();;
        }
        String anforderung;
        while (!anforderung.equals("quit")) {
            String anforderung = clientSocket.readline();
            if(anforderung.startsWith("eintragenInWarteschlange")){
                String[] cmd = anforderung.split(";");
                int anr = Integer.parseInt(cmd[1]);
                Aktion a = fts.findeAktion(anr);
                if(a!=null){
                    a.eintragenInWartelisten(mitglied);
                    clientSocket.write("OK \n");
                }
                else{
                    clientSocket.write("NOK \n");
                }
            }
            else{
                clientSocket.write("NOK Kommando existiert nicht");
            }
            
        }
        clientSocket.write("bye");
        clientSocket.close();
    }
}
