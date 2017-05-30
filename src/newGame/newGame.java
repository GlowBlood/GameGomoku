package newGame;

import javax.swing.*;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;
import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseMotionListener;


public class newGame extends JFrame {


    private newGame(String s) {
        super(s);
        setSize(500, 600);
        setLayout(null);


        JPanel gamePanel = new gamePanel();
        setBackground(new Color(160,82,45));
        gamePanel.setBounds(0,0,500,500);
        add(gamePanel);

        JButton button = new JButton("Start new game");
        button.setBounds(0, 500, 150, 60);
        add(button);

        JTextArea text = new JTextArea("Go");
        text.setBounds(150, 500, 200, 60);
        text.setForeground(Color.blue);
        add(text);

        JPanel panel = new JPanel();
        panel.setBounds(350, 500, 150, 60);
        panel.setBackground(Color.black);
        add(panel);


        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new newGame("Gomoku"));
    }


    public  class  MouseEvents implements MouseListener {

        private int[] massivX = {50, 100, 150, 200, 250, 300, 350, 400, 450};
        private int[] massivY = {50, 100, 150, 200, 250, 300, 350, 400, 450};

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

        public Integer ballX(int x, int y) {
            int result = 0;
            if (isInMassive(x, y) == true) {

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

        public Integer ballY(int x, int y) {
            int result = 0;
            if (isInMassive(x, y) == true) {

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


        public void init() {
            // Инициализация интерфейсов
            addMouseListener(this);

        }

        // Метод обработки щелчка мышки
        public int finalX = 0;
        public int finalY = 0;

        public void mouseClicked(MouseEvent event) {

            int x = event.getX();
            int y = event.getY();
            finalX = ballX(x, y);
            finalY = ballY(x, y);
        }

        public void mouseExited(MouseEvent event){
        }

        public void mouseEntered(MouseEvent e) {
        }

        // Метод обработки ввода мышки в обьект
        public void mouseEntemaroon(MouseEvent event) {
        }

        // Метод обработки нажатия кнопки мышки в обьекте
        public void mousePressed(MouseEvent event) {
        }

        // Метод обработки освобождения кнопки  мышки в обьекте
        public void mouseReleased(MouseEvent event) {
        }
        // Метод обработки движения "нажатой" мышки в обьекте
        public void mouseDragged(MouseEvent event) {
        }
        // Метод обработки движения мышки в обьекте
        public void mouseMoved(MouseEvent event) {
        }

    }

}