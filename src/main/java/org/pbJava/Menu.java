package org.pbJava;

import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Arquivo");
        JMenuItem item = new JMenuItem("Sair");

        item.addActionListener(e -> System.exit(0));
        menu.add(item);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centraliza
        frame.setVisible(true);
    }
}