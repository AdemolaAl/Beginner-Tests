import javax.swing.JOptionPane;
public class HackerTest {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the Hacker Test!", "Hacker Test", JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < 2000; i++) {
            JOptionPane.showMessageDialog(null, "Hacking in progress... ", "Hacking", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
