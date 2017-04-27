package com.example.william.exam2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.william.exam2.Bean.Usuario;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Alumnos on 11/04/2017.
 */

public class Tab01User extends Fragment {
    public static List<Usuario> listUser= new ArrayList<Usuario>();
    public int userId=0;
    ListView listView;
    public int ID=0;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View view = inflater.inflate(R.layout.tab01_user,container,false);

        listView = (ListView)view.findViewById(R.id.listView);


        int layout = android.R.layout.simple_list_item_1;
        final ArrayAdapter<Usuario> arrayAdapter = new ArrayAdapter<Usuario>(getActivity(),layout, listUser);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Usuario us = (Usuario) parent.getItemAtPosition(position);
                userId=us.getId();


            }
        });
        Button elimina =(Button)view.findViewById(R.id.btnEliminar);

        elimina.setOnClickListener(new View.OnClickListener(){
            int i = userId;
            @Override
            public void onClick(View view) {

                arrayAdapter.remove(listUser.get(i));

            }




    });
        return view;

}
}
