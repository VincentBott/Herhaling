package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;


public class Cursus implements Iterable<Cursist> {  // Type van het Object dat de Iterator


    private String cursusnaam;
    private int duurtijd;
    private int maxAantalDeelnemers;

    private ArrayList<Cursist> cursisten = new ArrayList<>();


    public Cursus(String cursusnaam, int duurtijd, int maxAantalDeelnemers) {

        this.cursusnaam = cursusnaam;
        this.duurtijd = duurtijd;
        this.maxAantalDeelnemers = maxAantalDeelnemers;
    }

    public void schrijfCursistIn(Cursist cursist)  throws CursusException{

        if (cursisten.size() == this.maxAantalDeelnemers)
            throw new CursusException("Maximum aantal deelnemers bereikt !");


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
    public Iterator<Cursist> iterator() {
        return cursisten.iterator();
    }

    public void schrijfCursistUit(Cursist cursist) throws CursusException {


           if  (!cursisten.remove(cursist))
               throw new CursusException("Kan onbestaande cursist niet verwijderen.");
    }

}
