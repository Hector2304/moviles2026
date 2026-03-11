package com.example.clase3;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class SegundaActividad extends AppCompatActivity {

    private static final String MI_LLAVE = "contador_guardado";

    TextView txvTitulo;
    Button btnIncrementa;

    int contador=0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        txvTitulo=findViewById(R.id.txvTitulo);
        btnIncrementa=findViewById(R.id.btnIncrementa);
        if(savedInstanceState !=null &&savedInstanceState.containsKey(MI_LLAVE)){
            contador=savedInstanceState.getInt(MI_LLAVE);
            mostrarTitulo();
        }

        btnIncrementa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           contador++;
           mostrarTitulo();
            }
        });
        Log.i("Fca","onCreate() ejecutado");
    }

    private void mostrarTitulo(){
        txvTitulo.setText(""+contador);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Fca","onStart() ejecutado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Fca","onResume() ejecutado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Fca","onRestart() ejecutado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Fca","onPause() ejecutado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Fca","onDestroy() ejecutado");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(MI_LLAVE, contador);
    }
}
