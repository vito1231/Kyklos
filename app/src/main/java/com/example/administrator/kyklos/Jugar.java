package com.example.administrator.kyklos;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Jugar extends Activity implements View.OnClickListener {

    private TextView txt;
    private TextView txt_puntaje;
    private TextView txt_desecho;
    private Button btn_basurero1;
    private Button btn_basurero2;
    private Button btn_basurero3;
    private Button btn_basurero4;
    private int indice;
    private int puntaje;
    private ArrayList<Integer> listaNumeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar);
        listaNumeros = generarNumeros();


        txt_puntaje = (TextView)findViewById(R.id.txt_puntaje);
        txt_desecho = (TextView)findViewById(R.id.txt_desecho);
        btn_basurero1 = (Button)findViewById(R.id.button3);
        btn_basurero2 = (Button)findViewById(R.id.button4);
        btn_basurero3 = (Button)findViewById(R.id.button5);
        btn_basurero4 = (Button)findViewById(R.id.button6);
        String texto = String.valueOf(listaNumeros.get(indice));
        txt_desecho.setText("Desecho:" + texto);
        txt = (TextView)findViewById(R.id.textView4);
        String res = String.valueOf((listaNumeros.get(indice)%4)+1);
        txt.setText("Tocar:" + res);
        String texto1 = String.valueOf(puntaje);
        txt_puntaje.setText("Puntaje:" + texto1);


        btn_basurero1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                verficar(0,listaNumeros.get(indice));
            }
        });

        btn_basurero2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                verficar(1,listaNumeros.get(indice));
            }
        });

        btn_basurero3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                verficar(2,listaNumeros.get(indice));
            }
        });

        btn_basurero4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                verficar(3,listaNumeros.get(indice));
            }
        });

    }

    @Override
    public void onClick(View view) {

    }

    public void verficar(int numBasurero, int numDesecho){
        indice+=1;
        if (numBasurero == numDesecho%4){
            puntaje += 5;
            String texto1 = String.valueOf(puntaje);
            txt_puntaje.setText("Puntaje:" + texto1);
        }
        String texto2 = String.valueOf(listaNumeros.get(indice));
        txt_desecho.setText("Desecho:" + texto2);
        String res = String.valueOf((listaNumeros.get(indice)%4)+1);
        txt.setText("Tocar:" + res);

    }

    public ArrayList<Integer> generarNumeros(){
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for (int i=0; i<100; i++) {
            listaNumeros.add(i);
        }
        Collections.shuffle(listaNumeros);
        return listaNumeros;
    }

}
