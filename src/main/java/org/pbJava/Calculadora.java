package org.pbJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculadora {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);
        frame.setLocationRelativeTo(null);


        JTextField campo1 = new JTextField();
        JTextField campo2 = new JTextField();
        JLabel resultado = new JLabel("Resultado: ");

        JButton somar = new JButton("+");
        JButton subtrair = new JButton("-");
        JButton multiplicar = new JButton("*");
        JButton dividir = new JButton("/");
        JButton potencia = new JButton("x^");
        JButton raizQuadrada = new JButton("Raiz");

        JPanel botoes = new JPanel();
        botoes.setLayout(new GridLayout(2,2,10,10));
        botoes.add(somar);
        botoes.add(subtrair);
        botoes.add(multiplicar);
        botoes.add(dividir);
        botoes.add(potencia);
        botoes.add(raizQuadrada);

        frame.setLayout(new GridLayout(3,2,10,10));
        frame.add(new JLabel("Número 1: "));
        frame.add(campo1);
        frame.add(new JLabel("Número 2: "));
        frame.add(campo2);
        frame.add(botoes);
        frame.add(resultado);

        ActionListener operacao = e -> {
            try{
                double num1 = Double.parseDouble(campo1.getText());
                double num2 = Double.parseDouble(campo2.getText());
                double res = 0;

                if (e.getSource()==subtrair)
                    res = num1 - num2;
                if (e.getSource()==somar)
                    res = num1 + num2;
                if (e.getSource()==multiplicar)
                    res = num1 * num2;
                if (e.getSource()==dividir)
                    res = num1 / num2;
                if (e.getSource()==potencia)
                    res = Math.pow(num1,num2);
                if (e.getSource()==raizQuadrada)
                    res = Math.sqrt(num1);
                resultado.setText("Resultado = " + res);
            } catch (NumberFormatException ex) {
                resultado.setText("Entrada Inválida");
            }
        };

        somar.addActionListener(operacao);
        subtrair.addActionListener(operacao);
        multiplicar.addActionListener(operacao);
        dividir.addActionListener(operacao);

        frame.setVisible(true);

    }
}
