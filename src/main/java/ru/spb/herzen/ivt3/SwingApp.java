package ru.spb.herzen.ivt3;

import java.awt.*;
import javax.swing.*;

public class SwingApp extends JFrame {
    public SwingApp(String name) {
        super(name);
        setResizable(false);
        setPreferredSize(new Dimension(300,400));
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = this.getContentPane();

        JPanel topPanel = new JPanel();
        //topPanel.setAlignmentX(CENTER_ALIGNMENT);
        Button btmp = new Button("Start");
        btmp.setPreferredSize(new Dimension(300,50));
        topPanel.add(btmp);

        JPanel midPanel = new JPanel();
        midPanel.setLayout(new GridLayout(3,4));

        midPanel.add(new Button("F"));
        midPanel.add(new Button("1"));
        midPanel.add(new Button("2"));
        midPanel.add(new Button("3"));
        midPanel.add(new Button("F"));
        midPanel.add(new Button("4"));
        midPanel.add(new Button("5"));
        midPanel.add(new Button("6"));
        midPanel.add(new Button("F"));
        midPanel.add(new Button("7"));
        midPanel.add(new Button("8"));
        midPanel.add(new Button("9"));

        JPanel botPanel = new JPanel();

        botPanel.add(new JLabel("$tatus"));

        pane.add(topPanel, BorderLayout.PAGE_START);
        pane.add(midPanel, BorderLayout.CENTER);
        pane.add(botPanel, BorderLayout.PAGE_END);

        this.pack();
        this.setVisible(true);
    }
}