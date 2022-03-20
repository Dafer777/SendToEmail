package com.example.correo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etPara,etMensaje,etTitulo;
    Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPara=findViewById(R.id.et);
        etMensaje=findViewById(R.id.etMensaje);
        etTitulo=findViewById(R.id.etTitulo);
        btnSend=findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{etPara.getText().toString().trim()});
                intent.putExtra(Intent.EXTRA_SUBJECT,etTitulo.getText().toString().trim());
                intent.putExtra(Intent.EXTRA_TEXT,etMensaje.getText().toString().trim());

                startActivity(intent.createChooser(intent,"Elija un servicio de correo electronico"));
            }
        });

    }
}