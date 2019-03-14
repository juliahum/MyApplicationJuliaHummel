package com.example.myapplicationjuliahummel;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Aufgabe2 {


    public static void main(String[] args) {

        String stringnumber = "01611872";
        int[] ziffern = new int[stringnumber.length()]; //Array anlegen dass so groß wie die Zahl ist

        //Zahlen in Array einfügen
        for (int i = 0; i < ziffern.length; i++) {
            ziffern[i] = Integer.parseInt(String.valueOf(stringnumber.charAt(i)));
        }

        //Ziffern sortieren und ausgeben
        Arrays.sort(ziffern);
        System.out.println(Arrays.toString(ziffern));

        //Primzahl ausgeben
        List ergebnis = new LinkedList();
        for (int i = 0; i < ziffern.length; i++) {
            boolean primTest = isPrime1(ziffern[i]);
            if (!primTest) {
                ergebnis.add(ziffern[i]);
            }
        }
        System.out.println("Neue Matrikelnummer ohne Primzahlen: "+ergebnis.toString());
    }
//Primzahl überprüfen
    public static boolean isPrime1(int n) {
        if(n == 3 || n == 5 || n ==7){
            return true;
        }else{
            return false;
        }
    }
}
