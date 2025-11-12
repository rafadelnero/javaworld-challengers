package com.javaworld.javachallengers.command;

import java.awt.BorderLayout;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListenerExample {

  public static void main(String[] args) {
    JFrame frame = new JFrame();

    JButton button = new JButton("Click Me");
    button.addActionListener(e -> button.setText("Clicked!"));

    frame.add(button);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

}
