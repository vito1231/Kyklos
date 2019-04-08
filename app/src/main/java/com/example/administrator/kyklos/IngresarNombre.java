package com.example.administrator.kyklos;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IngresarNombre extends Activity {


    Button btn_salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_nombre);

        btn_salir = (Button)findViewById(R.id.btn_aceptar);

        btn_salir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent siguiente1 = new Intent(IngresarNombre.this , Jugar.class);
                startActivity(siguiente1);
            }
        });
    }
}
