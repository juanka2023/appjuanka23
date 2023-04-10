package com.example.appjuanka23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private EditText et1_nombre ,et2_contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1_nombre = (EditText) findViewById(R.id.et1);
        et2_contenido = (EditText) findViewById(R.id.et2);
    }
    // metodo de guardar boton
    public void  guardar (View view){
        String nombre =  et1_nombre.getText().toString();
        String contenido = et2_contenido.getText().toString();

        try {
            //donde se encuentra la tarjeta SD
            File tarjetaSD = Environment.getExternalStorageDirectory();
            Toast.makeText(this, tarjetaSD.getPath(), Toast.LENGTH_SHORT).show();
            /// creamos el archivo con el nombre que nos indica el archivo, y el Pach de la tarjera SD
            File rutaArchivo = new File(tarjetaSD.getPath(),nombre + "txt");


        } catch (IOException e) {
            Toast.makeText(this, "no se pudo guardar el archivo", Toast.LENGTH_SHORT).show();

        }
    }

}