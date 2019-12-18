package fourteen_A;

import java.awt.*;
import java.awt.Point;
import javax.swing.*;
import java.awt.event.*;

public class applet_2 extends JPanel{

     MouseHandler mouseHandler = new MouseHandler();
     Point p1 = new Point(0, 0);
     Point p2 = new Point(0, 0);
     boolean drawing;

    public applet_2(){
        this.setPreferredSize(new Dimension(500, 400));
        this.addMouseListener(mouseHandler);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(p1.x, p1.y, p2.x, p2.y);
    }

    private class MouseHandler extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            drawing = true;
            p1 = e.getPoint();
            p2 = p1;
            repaint();
        }

        public void mouseReleased(MouseEvent e) {
            drawing = false;
            p2 = e.getPoint();
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Draw Rectangle On Mouse Click");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new applet_2());
        f.pack();
        f.setVisible(true);
    }
}