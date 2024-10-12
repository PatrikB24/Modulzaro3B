package org.example;

import java.util.ArrayList;
import java.util.List;

        public class Szemely {
            private String nev;
            private int kor;
            private List<String> nyelv;

            // Konstruktor
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


            // Metódus új nyelvhez
            public void tanulNyelv(String ujNyelv) {
                if (!nyelv.contains(ujNyelv)) {
                    nyelv.add(ujNyelv);
                    System.out.println(nev + " megtanult új nyelven beszélni: " + ujNyelv);
                } else {
                    System.out.println(nev + " már beszéli a " + ujNyelv + " nyelvet.");
                }
            }



        }

