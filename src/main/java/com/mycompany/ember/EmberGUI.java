package com.mycompany.ember;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmberGUI extends javax.swing.JFrame implements ActionListener {

    private JTextField nevField, evField;
    private JLabel bemutatkozasLabel;
    private EmberController controller;

    public EmberGUI(EmberController controller) {
        this.controller = controller;
        initComponents();
        setTitle("Bemutatkozás");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2)); 

        add(new JLabel("Név: "));
        nevField = new JTextField();
        add(nevField);

        add(new JLabel("Születési év: "));
        evField = new JTextField();
        add(evField);

        JButton bemutatkozasButton = new JButton("OK");
        bemutatkozasButton.addActionListener(this);
        add(bemutatkozasButton);

        bemutatkozasLabel = new JLabel();
        add(bemutatkozasLabel);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nev = nevField.getText();
        int ev;
        try {
            ev = Integer.parseInt(evField.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Helytelen formátum!", "Hiba", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    public void setBemutatkozas(String bemutatkozas) {
        bemutatkozasLabel.setText(bemutatkozas);
    }

    public void setController(EmberController controller) {
        this.controller = controller;
 
    }
    private void initComponents() {
    }
}