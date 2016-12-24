package com.isalcedo.unam42;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Bundle params = getIntent().getExtras();

        TextView nombre =  ((TextView)findViewById(R.id.tvNombre));
        nombre.setText( params.getString("nombre"));

        TextView desc =  ((TextView)findViewById(R.id.tvDesc));
        desc.setText( params.getString("descripcion"));

        TextView tel =  ((TextView)findViewById(R.id.tvTel));
        tel.setText( params.getString("telefono"));

        TextView email =  ((TextView)findViewById(R.id.tvEmail));
        email.setText( params.getString("email"));

        TextView fecha =  ((TextView)findViewById(R.id.tvFecha));
        fecha.setText( params.getString("fecha"));

    }

    protected void editar(View view){
        finish();
    }
}
