package org.example;


import java.util.ArrayList;
import java.util.List;



public class Teszt {
    public static void main(String[] args) {

        tesztBemutatkozasNyelvNelkul();
        tesztBemutatkozasNyelvvel();
        tesztNyelvTanulas();
    }

    public static void tesztBemutatkozasNyelvNelkul() {
        System.out.println("Teszt: Személy bemutatkozása nyelvtudás nélkül");
        Szemely bela = new Szemely("Béla", 25, null);

        // Teszt: Béla valóban nem beszél idegen nyelvet
        assert bela.getNyelv().isEmpty() : "Hiba: Béla nem beszélhetne idegen nyelvet!";
        System.out.println("Teszt sikeres: Béla nem beszél idegen nyelvet.");
    }

    public static void tesztBemutatkozasNyelvvel() {
        System.out.println("Teszt: Személy bemutatkozása egy nyelvvel");
        List<String> nyelvekEszter = new ArrayList<>();
        nyelvekEszter.add("angol");
        Szemely eszter = new Szemely("Eszter", 30, nyelvekEszter);

        // Eszter tényleg beszél angolul
        assert eszter.getNyelv().contains("angol") : "Hiba: Eszternek angolul kellene beszélnie!";
        System.out.println("Teszt sikeres: Eszter beszél angolul.");
    }

    public static void tesztNyelvTanulas() {
        System.out.println("Teszt: Személy új nyelvet tanul");
        Szemely bela = new Szemely("Béla", 25, null);
        bela.tanulNyelv("francia");

        // Béla tényleg megtanulta-e a franciát?
        assert bela.getNyelv().contains("francia") : "Hiba: Béla nem tanulta meg a franciát!";
        System.out.println("Teszt sikeres: Béla megtanulta a franciát.");
    }
}