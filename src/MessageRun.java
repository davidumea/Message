import javax.swing.*;

public class MessageRun {

    public static void main(String[] args) {
        Message test = new Message(JOptionPane.showInputDialog(null, "skriv meddelande"));
        System.out.println(test);
    }
}