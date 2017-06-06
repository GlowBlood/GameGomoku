package newGame;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

@SuppressWarnings("WeakerAccess")

public class gamePanel extends JPanel {

//массивы координат центров шариков
    private int[] massivX = {50, 100, 150, 200, 250, 300, 350, 400, 450};
    private int[] massivY = {50, 100, 150, 200, 250, 300, 350, 400, 450};

//проверка правильности щелчка игрока
    private Boolean isInMassive(int x, int y) {
        for (int i = 0; i <massivX.length; i++){
            for (int j=0; j<massivY.length; i++){
                Double ifX = Math.pow(2, (i - x));
                Double ifY = Math.pow(2, (j - y));
                if (ifX + ifY <= 400.0) return true;
            }
        }
        return false;
    }
//нахождение Х координаты нужного центра шарика
    private Integer ballX(int x, int y) {
        int result = 0;
        if (isInMassive(x, y)) {
            for (int i = 0; i < massivX.length; i++) {
                for (int j = 0; j < massivY.length; i++) {
                    Double ifX = Math.pow(2, (i - x));
                    Double ifY = Math.pow(2, (j - y));
                    if (ifX + ifY <= 400.0) result = i;
                }
            }
        }
        return result;
    }
//нахождение У координаты нужного центра шарика
    private Integer ballY(int x, int y) {
        int result = 0;
        if (isInMassive(x, y)) {

            for (int i = 0; i < massivX.length; i++) {
                for (int j = 0; j < massivY.length; i++) {
                    Double ifX = Math.pow(2, (i - x));
                    Double ifY = Math.pow(2, (j - y));
                    if (ifX + ifY <= 400.0) result = j;
                }
            }
        }
        return result;
    }



    public gamePanel() {
        setBackground(new Color(160,82,45));

    }

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

    private void paintBall(Graphics g, Ball b){

        g.setColor(b.getColor());
        int radius = b.getRadius();
        g.fillOval(b.getX() - radius, b.getY() - radius, 2*radius, 2*radius);

    }

    class Ball {
        int x;
        int y;
        int radius = 20;
        Color color;

        public void setColor(Color color){
            this.color = color;
        }

        public void setX(Integer x){
            this.x = x;
        }

        public void setY(Integer y){
            this.y = y;
        }

        public Color getColor(){
            return color;
        }

        public Integer getRadius(){
            return radius;
        }
        
        public Integer getX(){
            return x;
        }

        public Integer getY(){
            return y;
        }
    }

    public void init() {
        addMouseListener((MouseListener) this);

    }

    public void mouseClicked(MouseEvent event) {
        int x = event.getX();
        int y = event.getY();
        int finalX = ballX(x, y);
        int finalY = ballY(x, y);
        Ball ball = new Ball();
        ball.setColor(Color.CYAN);
        ball.setX(finalX);
        ball.setY(finalY);

        paintBall(getGraphics(), ball );
    }

}