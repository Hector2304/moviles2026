package com.example.clase3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView miTexto;
    TextView miGrupo;
    Button miBoton;

    String nombresGrupo[][]={
            {"Roberto","Messi","Fer"},
            {"Yo","Aldir","XD","777"}
    };
    String grupos[]={
            "2291","2292"
    };

    int indiceGrupo=0;
    int indiceAlumno=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miTexto=findViewById(R.id.txvMiTexto);
        miGrupo=findViewById(R.id.txvMiGrupo);
        miBoton=findViewById(R.id.txvMiBoton);

        miBoton.setOnClickListener(this);


    }

    void mostrarDatos(){
        miGrupo.setText("Grupo: "+grupos[indiceGrupo]);
        miTexto.setText("Alumno: "+nombresGrupo[indiceGrupo][indiceAlumno]);
    }

    void cambiar(){
        indiceAlumno++;

        if(indiceAlumno>=nombresGrupo[indiceGrupo].length){
            indiceAlumno=0;
            indiceGrupo++;

            if(indiceGrupo>=grupos.length){
                indiceGrupo=0;
            }
        }

        mostrarDatos();
    }

    @Override
    public void onClick(View v) {
        cambiar();
    }

}