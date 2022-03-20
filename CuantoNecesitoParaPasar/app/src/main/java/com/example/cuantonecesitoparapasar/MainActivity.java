package com.example.cuantonecesitoparapasar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txt1,txt2;
    Button btnCalcular;
    TextView txtResultado;
    String j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt1);
        txtResultado= (TextView) findViewById(R.id.txtResultado);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        j="";

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(txt1.getText().toString());
                int valor2 = Integer.parseInt(txt2.getText().toString());
                int r = (valor1 + valor2);
                int x = r/3;
                int p = 6 - x;

                txtResultado.setText("Tu Nota total es : "+x+" Te falta para pasar "+p);





            }
        });
    }




}