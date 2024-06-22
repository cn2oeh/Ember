package com.mycompany.ember;

public class Ember {
    private String nev;
    private int szuletesiEv;
    
    public Ember(String nev, int szuletesiEv) {
        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        int aktualisEv = java.time.Year.now().getValue();
        return aktualisEv - szuletesiEv;
    }

    public String bemutatkozas() {
        return "Üdvözlöm, a nevem " + nev + " , " + getKor() + " éves vagyok.";
    }
}