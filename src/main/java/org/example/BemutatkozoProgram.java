package org.example;

import java.util.ArrayList;
import java.util.List;

public class BemutatkozoProgram {
    public static void main(String[] args) {

        public class Szemely {
            private String nev;
            private int kor;
            private List<String> nyelv;

            // Konstructor
            public Szemely(String nev, int kor, List<String> nyelv) {
                this.nev = nev;
                this.kor = kor;
                this.nyelv = nyelv != null ? nyelv : new ArrayList<>();
            }

            // Metódus az ember bemutatására
            public void bemutatkozas() {
                System.out.print("Hello, a nevem " + nev + ". Én " + kor + " éves vagyok.");
                if (nyelv.isEmpty()) {
                    System.out.println(" Nem beszélek idegen nyelven.");
                } else {
                    System.out.println(" A következő idegen nyelveken beszélek: " + String.join(", ", nyelv) + ".");
                }
            }






        }
    }
}