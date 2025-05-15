package org.pbJava;

import javax.swing.*;

public class List {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lista");
        String[] itens = {"Sumidouro", "Varre-sai","Quatis","Itaperuna","Campos"};
        javax.swing.JList<String> list = new javax.swing.JList<>(itens);

        frame.add(new JScrollPane(list));
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
