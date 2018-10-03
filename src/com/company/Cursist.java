package com.company;

import java.time.LocalDate;
import java.time.Period;


public class Cursist {


    private String naam;
    private LocalDate geboortedatum;

    public Cursist(String naam, LocalDate geboortedatum) {

        this.naam = naam;
        this.geboortedatum = geboortedatum;
    }

    public String getGeboortedatum() {

        return geboortedatum.toString();
    }

    public String getNaam() {
        return this.naam;
    }

    public int getLeeftijd() {


        Period periode = Period.between(geboortedatum, LocalDate.now());

        return periode.getYears();
    }
}
