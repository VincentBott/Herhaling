package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;


public class Cursist  {


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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cursist cursist = (Cursist) o;
        return Objects.equals(naam, cursist.naam) &&
                Objects.equals(geboortedatum, cursist.geboortedatum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, geboortedatum);
    }

}
