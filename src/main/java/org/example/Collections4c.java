package org.example;

import java.util.HashMap;
import java.util.Map;

public class Collections4c {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Ala");
        mapa.put(2, "ma");
        mapa.put(3, "Kota");

        for (int i = 1; i <= mapa.size(); i++) {
            System.out.println("Element slownika: " + mapa.get(i));
        }

        mapa.put(1, "Adam");
        mapa.put(4, "As to kot Ali");
        mapa.put(5, "Fajne kotki");
        mapa.put(6, "Psy tez sa fajne");

        for (int i = 1; i <= mapa.size(); i++) {
            System.out.println("Element slownika: " + mapa.get(i));
        }
    }

}
