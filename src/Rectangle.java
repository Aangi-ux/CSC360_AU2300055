import javax.swing.*;
import java.awt.*;

public class Rectangle extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(100, 100, 200, 120);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle");

        frame.add(new Rectangle());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}