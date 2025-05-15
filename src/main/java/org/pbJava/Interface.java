package org.pbJava;

import javax.swing.*;
import java.awt.*;

public class Interface {
    public static void main(String[] args) {
        JFrame  frame = new JFrame("Interface Completa");

        JPanel top = new JPanel();
        top.add(new JLabel("Nome:"));
        top.add(new JTextField(10));

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(2,2));
        center.add(new JLabel("Opção 1"));
        center.add(new Checkbox());
        center.add(new JLabel("Opção 2"));
        center.add(new Checkbox());

        JPanel bottom = new JPanel();
        bottom.add(new JButton("OK"));
        bottom.add(new JButton("Cancelar"));


        frame.setLayout(new BorderLayout());
        frame.add(top,BorderLayout.NORTH);
        frame.add(center,BorderLayout.CENTER);
        frame.add(bottom,BorderLayout.SOUTH);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
