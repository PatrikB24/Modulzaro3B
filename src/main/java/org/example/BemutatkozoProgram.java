package org.example;

import java.util.ArrayList;
import java.util.List;

public class BemutatkozoProgram {
    public static void main(String[] args) {

        // Egy lista, arról milyen nyelvet beszél 1 ember
        List<String> nyelvekEszter = new ArrayList<>();
        nyelvekEszter.add("angol");

        // Emberek
        Szemely Eszter = new Szemely("Eszter", 30, nyelvekEszter);
        Szemely Béla = new Szemely("Béla", 25, null); // Béla nem beszél még 1 nyelvet sem

        // Bemutatkozása az embereknek
        Eszter.bemutatkozas();
        Béla.bemutatkozas();

        // Béla új nyelvet tanul
        Béla.tanulNyelv("French");
        Béla.bemutatkozas(); // Újrabemutat Béla
    }
}
