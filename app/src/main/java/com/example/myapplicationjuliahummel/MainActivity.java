package com.example.myapplicationjuliahummel;

import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

   private EditText eingabetext;
   private TextView ausgabetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eingabetext = findViewById(R.id.editText);
        ausgabetext = findViewById(R.id.textAusgabe);

    }


    //Aufgabe 2 Berechnung Prim
    public void buttonPrim_onclick(View view) {
        //Matrikelnummerholen
        String matriklnr = eingabetext.getText().toString();
        char[] ziffern = new char[matriklnr.length()];

        //Ziffern in Char-Array einfügen
        for (int i = 0; i < ziffern.length; i++) {
            ziffern[i] = matriklnr.charAt(i);
        }
        Arrays.sort(ziffern);

        //Primzahl ausgeben
        List ergebnis = new LinkedList();
        for (int i = 0; i < ziffern.length; i++) {
            boolean primTest = isPrime(ziffern[i]);
            if (!primTest) { //Wenn die Zahl keine Primzahl ist speichere sie in die liste
                ergebnis.add(ziffern[i]);
            }
        }
        //Ausgabe
        ausgabetext.setText("Ergebnis: " +ergebnis.toString());
    }

    public static boolean isPrime(char n) {
        if (n =='2'||n == '3' || n == '5' || n == '7') {
            return true;
        } else {
            return false;
        }
    }
}
