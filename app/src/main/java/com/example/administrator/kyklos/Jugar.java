package com.example.administrator.kyklos;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
    private ArrayList<Integer> listaImagenes;
    private int indice;
    private int puntaje;
    private ArrayList<Integer> listaNumeros;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar);
        cargarImagenes();
        generarNumeros();

        txt_puntaje = (TextView) findViewById(R.id.txt_puntaje);
        //txt_desecho = (TextView) findViewById(R.id.txt_desecho);
        btn_basurero1 = (Button)findViewById(R.id.button6);
        btn_basurero2 = (Button)findViewById(R.id.button7);
        btn_basurero3 = (Button)findViewById(R.id.button8);
        btn_basurero4 = (Button)findViewById(R.id.button9);
        image = (ImageView)findViewById(R.id.imageView8);

        //String texto = String.valueOf(listaNumeros.get(indice));
        //txt_desecho.setText("Desecho:" + texto);
        //txt = (TextView)findViewById(R.id.textView4);
        //String res = String.valueOf((listaNumeros.get(indice)%4)+1);
        //txt.setText("Tocar:" + res);
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
        /*
        String texto2 = String.valueOf(listaNumeros.get(indice));
        txt_desecho.setText("Desecho:" + texto2);
        String res = String.valueOf((listaNumeros.get(indice)%4)+1);
        txt.setText("Tocar:" + res);
        */
        int imgagen = listaImagenes.get(listaNumeros.get(indice));
        image.setImageResource(imgagen);

    }

    public void generarNumeros(){
        listaNumeros = new ArrayList<>();
        for (int i=0; i<listaImagenes.size(); i++) {
            listaNumeros.add(i);
        }
        Collections.shuffle(listaNumeros);

    }

    public void cargarImagenes(){
        listaImagenes = new ArrayList<>();
        listaImagenes.add(R.drawable.banano);
        listaImagenes.add(R.drawable.disco);
        listaImagenes.add(R.drawable.lata);
        listaImagenes.add(R.drawable.botella);

        listaImagenes.add(R.drawable.manzana);
        listaImagenes.add(R.drawable.bombillo);
        listaImagenes.add(R.drawable.sardina);
        listaImagenes.add(R.drawable.bolsa);

        listaImagenes.add(R.drawable.huevo);
        listaImagenes.add(R.drawable.celular);
        listaImagenes.add(R.drawable.gancho);
        listaImagenes.add(R.drawable.galon);
    }


}
