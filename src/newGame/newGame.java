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

}