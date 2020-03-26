import javax.swing.*;
import java.awt.*;

public class Check
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton btn1 = new JButton("Shock me");
        JButton btn2 = new JButton("Bliss");
        JButton btn3 = new JButton("HUh?");
        JButton btn4 = new JButton("What is this?");

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250,200);
        frame.setVisible(true);
    }
}