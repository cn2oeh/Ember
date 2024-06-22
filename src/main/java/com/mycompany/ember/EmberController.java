package com.mycompany.ember;

import com.mycompany.ember.Ember;

public class EmberController {
    private Ember model;
    private EmberGUI viewgui;
    private EmberKonzol viewkonzol;

    public EmberController(Ember model, EmberGUI viewgui, EmberKonzol viewkonzol) {
        this.model = model;
        this.viewgui = viewgui;
        this.viewkonzol = viewkonzol;
    }

    public void bemutatkozas(String nev, int ev) {
        model = new Ember(nev, ev);
        String bemutatkozas = model.bemutatkozas();
        viewgui.setBemutatkozas(bemutatkozas);
        viewkonzol.kiirBemutatkozas(bemutatkozas);
    }
}