package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Cursist joske = new Cursist("Joske", LocalDate.of(2000, Month.OCTOBER, 30));

        System.out.printf("%s is geboren op %s en is %d jaar oud.%n", joske.getNaam(), joske.getGeboortedatum(), joske.getLeeftijd());



        Cursus cursus = new Cursus("Java", 70, 3);

        System.out.printf("De cursus %s duurt %d dagen. Er is plaats voor %d deelnemers.%n", cursus.getNaam(), cursus.getAantalDagen(), cursus.getMaxdeelnemers());

        cursus.schrijfCursistIn(joske);



        String output;

        if (cursus.getAantalCursisten() == 1)
            output = "is er 1 deelnemer";

        else
            output = String.format("zijn er %d deelnemers", cursus.getAantalCursisten());


        System.out.printf("Na het inschrijven van %s %s.%n%n", joske.getNaam(), output);

        Cursist karen = new Cursist("Karen", LocalDate.of(1974, Month.OCTOBER, 28));
        cursus.schrijfCursistIn(karen);

        System.out.printf("%s (%d jaar) is ingeschreven.%n%n", karen.getNaam(), karen.getLeeftijd());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef naam nieuwe cursist: ");

        String naam = scanner.nextLine();

        System.out.print("Geef geboortejaar nieuwe cursist: ");
        int geboortejaar = Integer.parseInt(scanner.nextLine());

        System.out.print("Geef geboortemaand nieuwe cursist: ");
        int geboortemaand = Integer.parseInt(scanner.nextLine());

        System.out.print("geboortedag nieuwe cursist: ");
        int geboortedag = Integer.parseInt(scanner.nextLine());

        Cursist nieuweCursist = new Cursist(naam, LocalDate.of(geboortejaar, geboortemaand, geboortedag));

        cursus.schrijfCursistIn(nieuweCursist);

        System.out.printf("%s (%d jaar) is ingeschreven.%n", nieuweCursist.getNaam(), nieuweCursist.getLeeftijd());

        System.out.println("De ingeschreven cursisten zijn: ");

        int teller = 1;


        for(Cursist c: cursus){
            System.out.printf("%d. %s%n", teller, c.getNaam());
            teller ++;
        }


    }
}

