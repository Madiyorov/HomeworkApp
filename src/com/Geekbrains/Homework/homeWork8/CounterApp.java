package com.Geekbrains.Homework.homeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {

    private int counter = 0;

    public CounterApp() {
        setTitle("CounterApp window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 350, 250);

        Font font = new Font("Arial", Font.BOLD, 30);

        JPanel panel = new JPanel();
        JLabel counterView = new JLabel(String.valueOf(counter));
        counterView.setHorizontalAlignment(SwingConstants.CENTER);
        counterView.setFont(font);
        add(counterView, BorderLayout.CENTER);

        JButton headerButton = new JButton("RESET");
        add(headerButton, BorderLayout.NORTH);
        JButton incrementButton = new JButton(">");
        add(incrementButton, BorderLayout.LINE_END);
        JButton decrementButton = new JButton("<");
        add(decrementButton, BorderLayout.LINE_START);
        JButton footerPlusButton = new JButton("+10");
        panel.add(footerPlusButton);
        JButton footerMinusButton = new JButton("-10");
        panel.add(footerMinusButton);
        JButton footerMultiplyButton = new JButton("*10");
        panel.add(footerMultiplyButton);
        JButton footerDivisionButton = new JButton("/10");
        panel.add(footerDivisionButton);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == headerButton) {
                    counter = 0;
                } else if (e.getSource() == incrementButton) {
                    counter++;
                } else if (e.getSource() == decrementButton) {
                    counter--;
                } else if (e.getSource() == footerPlusButton) {
                    counter += 10;
                } else if (e.getSource() == footerMinusButton) {
                    counter -= 10;
                } else if (e.getSource() == footerMultiplyButton) {
                    counter *= 10;
                } else if (e.getSource() == footerDivisionButton) {
                    counter /= 10;
                }
                refreshCounterView(counterView);
            }
        };
        headerButton.addActionListener(actionListener);
        decrementButton.addActionListener(actionListener);
        incrementButton.addActionListener(actionListener);
        footerPlusButton.addActionListener(actionListener);
        footerMinusButton.addActionListener(actionListener);
        footerMultiplyButton.addActionListener(actionListener);
        footerDivisionButton.addActionListener(actionListener);
        getContentPane().add(BorderLayout.SOUTH, panel);

        setVisible(true);
    }

    private void refreshCounterView(JLabel counterView) {
        counterView.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}
