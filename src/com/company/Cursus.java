package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursus implements Iterable {


    private String cursusnaam;
    private int duurtijd;
    private int maxAantalDeelnemers;
    private ArrayList<Cursist> cursisten = new ArrayList<>();


    public Cursus(String cursusnaam, int duurtijd, int maxAantalDeelnemers) {

        this.cursusnaam = cursusnaam;
        this.duurtijd = duurtijd;
        this.maxAantalDeelnemers = maxAantalDeelnemers;
    }

    public void schrijfCursistIn(Cursist cursist) {
        cursisten.add(cursist);
    }

    public String getNaam() {
        return this.cursusnaam;
    }

    public int getAantalDagen() {
        return this.duurtijd;
    }

    public int getMaxdeelnemers() {
        return this.maxAantalDeelnemers;
    }

    public int getAantalCursisten() {
        return cursisten.size();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
