package com.example.administrator.kyklos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    Button btn_jugar;
    Button btn_configuracion;
    Button btn_puntaje;
    Button btn_ayuda;
    Button btn_salir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_jugar = (Button)findViewById(R.id.btn_jugar);
        btn_configuracion = (Button)findViewById(R.id.btn_configuracion);
        btn_puntaje = (Button)findViewById(R.id.btn_verPuntajes);
        btn_ayuda = (Button)findViewById(R.id.btn_ayuda);
        btn_salir = (Button)findViewById(R.id.btn_salir);

        btn_jugar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent siguiente1 = new Intent(MainActivity.this , IngresarNombre.class);
                startActivity(siguiente1);
            }
        });

        btn_configuracion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent siguiente1 = new Intent(MainActivity.this , Configuracion.class);
                startActivity(siguiente1);
            }
        });

        btn_puntaje.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent siguiente1 = new Intent(MainActivity.this , Puntaje.class);
                startActivity(siguiente1);
            }
        });

        btn_ayuda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent siguiente1 = new Intent(MainActivity.this , Ayuda.class);
                startActivity(siguiente1);
            }
        });

    }

}
