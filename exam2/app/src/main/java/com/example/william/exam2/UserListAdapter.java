package com.example.william.exam2;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.example.william.exam2.Bean.Usuario;

public class UserListAdapter extends ArrayAdapter<Usuario> {
    private Context contextGeneral;

    public UserListAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    private class ViewHolder{
        TextView nombre;
        TextView Apellidos;
        TextView User;
        TextView contraseña;

    }




    }

