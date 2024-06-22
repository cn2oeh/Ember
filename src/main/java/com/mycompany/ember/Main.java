package com.mycompany.ember;

import com.mycompany.ember.Ember;

public class Main {

    public static void main(String[] args) {
        Ember model = new Ember("", 0);

        EmberGUI viewgui = new EmberGUI(null);
        EmberKonzol viewkonzol = new EmberKonzol(null);

        EmberController controller = new EmberController(model, viewgui, viewkonzol);
        viewgui.setController(controller);
        viewkonzol.setController(controller);
        viewgui.setVisible(true); 

        viewkonzol.start(); 
    }
}