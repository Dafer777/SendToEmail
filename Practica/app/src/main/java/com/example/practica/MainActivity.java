package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {



    private Spinner listaFrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String lalista[]={"Uva","Manzanas","Fresas"};
        listaFrutas = findViewById(R.id.spinner1);
        ArrayAdapter adaptadoFrutas = new ArrayAdapter(this, android.R.layout.simple_spinner_item,lalista);
        listaFrutas.setAdapter(adaptadoFrutas);





    }
}