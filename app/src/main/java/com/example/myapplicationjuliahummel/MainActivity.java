package com.example.myapplicationjuliahummel;

import android.content.Context;
import android.net.ConnectivityManager;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //OnClick button
   /* public void button_onClick(View view) throws Exception {
        //Matrikelnummereingabe
        EditText editText =(EditText)findViewById(R.id.editText);
        String matrikelnr = editText.getText().toString();

        //Senden aufrufen
        //String antwort = sendEmpfangNeu(matrikelnr).toString();

        //Ausgabefeld
        TextView textAusgabe =(TextView)findViewById(R.id.textAusgabe);
        //textAusgabe.setText(antwort);

        //sendenEmpfangen();
    }*/


    //Berechnung Prim
    public void buttonPrim_onclick(View view) {
        //Matrikelnummereingabe
        EditText editText =(EditText)findViewById(R.id.editText);
        String stringnumber = editText.getText().toString();


        int[] ziffern = new int[stringnumber.length()]; //Array anlegen dass so groß wie die Zahl lang ist

        //Zahlen in Array einfügen
        for (int i = 0; i < ziffern.length; i++) {
            ziffern[i] = Integer.parseInt(String.valueOf(stringnumber.charAt(i)));
        }

        //Ziffern sortieren
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
        TextView ausgabePrim =(TextView)findViewById(R.id.textViewPrim);
        ausgabePrim.setText("Matrikelnummer ohne Primzahlen" +ergebnis.toString());
    }

    public static boolean isPrime(int n) {
        if(n == 3 || n == 5 || n ==7){
            return true;
        }else{
            return false;
        }
    }





}
