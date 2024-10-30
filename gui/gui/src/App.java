import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.Frame;
import java.awt.event.ActionEvent;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        JFrame frame2 = new JFrame("knopf");
 
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JButton button = new JButton("Funktion");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                doSomething();
             }
    
        });
    
        frame2.add(button);
        frame2.setVisible(true);
        frame2.setSize(100, 100);

    }
    public static void doSomething(){
        JFrame frame = new JFrame("WARNUNG");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Torben Spahn");
        frame.add(label);
        frame.setVisible(true);
        frame.setSize(1000,1000);
    }
    }


