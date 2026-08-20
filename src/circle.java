import javax.swing.*;
import java.awt.*;

public class circle extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(100, 100, 200, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle");

        frame.add(new circle());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
