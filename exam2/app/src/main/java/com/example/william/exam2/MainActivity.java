package com.example.william.exam2;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import com.example.william.exam2.Bean.Usuario;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }





    public void registrar(View view){
        Intent register = new Intent(this, Register.class);
        startActivity(register);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void login(View view) {
        EditText username = (EditText) findViewById(R.id.editText);
        EditText password = (EditText) findViewById(R.id.editText2);
        for (Usuario us : Tab01User.listUser) {
            if (Objects.equals(username.getText().toString(), us.getUser()) && Objects.equals(password.getText().toString(), us.getContraseña())) {
                Intent p = new Intent(this, Tab.class);
                startActivity(p);
            } else {
                //wrong password
            }
        }

    }




}
