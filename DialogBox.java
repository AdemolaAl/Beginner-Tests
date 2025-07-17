import javax.swing.JOptionPane;
public class DialogBox {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog(null,"What is your name?", "Name Test", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your Name is " + result);
    }
}