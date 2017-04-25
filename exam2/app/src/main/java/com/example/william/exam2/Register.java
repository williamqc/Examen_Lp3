package com.example.william.exam2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.william.exam2.Bean.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Register extends AppCompatActivity {
    EditText Nombre;
    EditText Apellido;
    EditText Usuario;
    EditText Contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Nombre = (EditText) findViewById(R.id.Nombre);
        Apellido =(EditText) findViewById(R.id.Apellidos);
        Usuario = (EditText) findViewById(R.id.Usuario);
        Contraseña = (EditText) findViewById(R.id.Contraseña);
        Button btnSave = (Button)findViewById(R.id.btnSave);





        btnSave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                    Random rn = new Random();
                    int answer = rn.nextInt(1000) + 1;
                    Users.listUser.add(new Usuario(answer,Nombre.getText().toString(),Apellido.getText().toString(),Usuario.getText().toString(),Contraseña.getText().toString()));
                    goMain();
            }
        });


    }

    public void goMain(){
        Intent i = new Intent(this,Users.class);
        startActivity(i);
    }

}
