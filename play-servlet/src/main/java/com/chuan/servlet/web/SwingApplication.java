package com.chuan.servlet.web;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApplication {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Simple Swing Application");
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(new GridLayout(2, 1));
        JButton button = new JButton("Click me");
        final JLabel label = new JLabel();
        contentPane.add(button);
        contentPane.add(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String information = JOptionPane.showInputDialog("请输入一串字符");
                label.setText(information);
            }
        });
        jFrame.setSize(200, 100);
        jFrame.show();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
