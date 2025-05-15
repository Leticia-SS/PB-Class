package org.pbJava;

import javax.swing.*;

public class ReceitasFrame extends JFrame {
    public ReceitasFrame() {
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Receitas");
        setLayout(null);

        JLabel lblNome = new JLabel("Digite seu nome: ");
        lblNome.setBounds(10,10,300,20);
        add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(10,10,300,20);
        add(txtNome);

        JButton btnCliqueAqui = new JButton("Clique Aqui");
        btnCliqueAqui.setBounds(125,200,150,30);
        add(btnCliqueAqui);
        btnCliqueAqui.addActionListener((e) -> {
            JOptionPane.showMessageDialog(this,"Olá " + txtNome.getText() + "!");
        });


    }
}
