import java.util.Scanner;


public class Client
{
    private Scanner scanner;

    public Client()
    {
        scanner = new Scanner(System.in);
    }


    public String erzeugeAnfrage()
    {
        System.out.println();
        System.out.print("--> ");
        String eingabe = scanner.nextLine();
        
        return eingabe;
    }
}
