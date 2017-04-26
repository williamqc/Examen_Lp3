package com.example.william.exam2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.william.exam2.Bean.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Users extends AppCompatActivity {
    public static List<Usuario> listUser= new ArrayList<Usuario>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

         ListView listView = (ListView) findViewById(R.id.ListView);


        int layout = android.R.layout.simple_list_item_1;
        final ArrayAdapter<Usuario> arrayAdapter = new ArrayAdapter<Usuario>(this, layout,listUser);

        listView.setAdapter(arrayAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
