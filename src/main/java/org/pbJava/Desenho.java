package org.pbJava;

import javax.swing.*;
import java.awt.*;

public class Desenho {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Desenho");
        JPanel panel = new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.blue);
                g.fillOval(100,50,100,100);

            }
        };

        frame.add(panel);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
