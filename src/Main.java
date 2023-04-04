import javax.swing.*;
import java.awt.*;

public class Main {
    public Main() {
        super();
    }

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("My GUI");

        // Set the size of the frame
        frame.setSize(400, 300);

        // Create a new JPanel
        JPanel panel = new JPanel();
        ImageIcon imageIcon = new ImageIcon("lol.jpeg");
        JLabel backgroundLabel = new JLabel(imageIcon);

        // Set the layout of the background label to BorderLayout
        backgroundLabel.setLayout(new BorderLayout());

        // Create a new JButton and add it to the background label
        JButton button = new JButton("Click me!");
        backgroundLabel.add(button, BorderLayout.CENTER);

        // Add the background label to the JFrame
        frame.setContentPane(backgroundLabel);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}


