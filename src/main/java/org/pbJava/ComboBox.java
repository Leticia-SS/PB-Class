package org.pbJava;

import javax.swing.*;

public class ComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox");
        String[] options = {"SF. do Itabapoana", "São Paulo", "Carapebus", "Sta. Maria Madalena"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        JLabel label = new JLabel("Selecione uma cidade");

        comboBox.addActionListener(e -> label.setText("Cidade: " + comboBox.getSelectedItem()));

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(comboBox);
        frame.add(label);
        frame.setSize(300,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
