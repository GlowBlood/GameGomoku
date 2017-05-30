package newGame;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("WeakerAccess")

public class gamePanel extends JPanel {

    public gamePanel() {
        setBackground(new Color(160,82,45));
    }

@Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(50,0,50,500);
        g.drawLine(100,0,100,500);
        g.drawLine(150,0,150,500);
        g.drawLine(200,0,200,500);
        g.drawLine(250,0,250,500);
        g.drawLine(300,0,300,500);
        g.drawLine(350,0,350,500);
        g.drawLine(400,0,400,500);
        g.drawLine(450,0,450,500);

        g.drawLine(0,50, 500,50);
        g.drawLine(0,100, 500,100);
        g.drawLine(0,150, 500,150);
        g.drawLine(0,200, 500,200);
        g.drawLine(0,250, 500,250);
        g.drawLine(0,300, 500,300);
        g.drawLine(0,350, 500,350);
        g.drawLine(0,400, 500,400);
        g.drawLine(0,450, 500,450);

    }



}