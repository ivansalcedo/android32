package com.isalcedo.unam42;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void detalle(View view){

        DatePicker dp = (DatePicker) findViewById(R.id.dtpFechaNacimiento);
        int dia =  dp.getDayOfMonth();
        int mes = dp.getMonth();
        int año = dp.getYear();

        Intent i = new Intent(this, Detalle.class);

        i.putExtra("nombre",  ((EditText)findViewById(R.id.edNombre)).getText().toString());
        i.putExtra("telefono",  ((EditText)findViewById(R.id.edTel)).getText().toString());
        i.putExtra("email",  ((EditText)findViewById(R.id.edMail)).getText().toString());
        i.putExtra("descripcion",  ((EditText)findViewById(R.id.edDesc)).getText().toString());
        i.putExtra("fecha", Integer.toString(dia) + "/" +  Integer.toString(mes) + "/" + Integer.toString(año));
        startActivity(i);
    }
}
