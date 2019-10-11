package com.example.tuparquej;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context context;
    private ArrayList<Entidad> listItems;


    public Adaptador(Context context, ArrayList<Entidad> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        //Numero de datos a cargar (en este caso 10 mas cercanos)
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Entidad item=(Entidad) getItem(position);

        convertView= LayoutInflater.from(context).inflate(R.layout.item, null);

        Button btnFoto=convertView.findViewById(R.id.buttonParque);
        TextView nombre=convertView.findViewById(R.id.textViewNombre);
        TextView barrio=convertView.findViewById(R.id.textViewBarrio);
        TextView estrellas=convertView.findViewById(R.id.textViewEstrellas);
        TextView distancia=convertView.findViewById(R.id.textViewDistancia);

        //btnFoto.setBackground(item.getImgFoto());
        nombre.setText(item.getNombre());
        barrio.setText(item.getBarrio());
        estrellas.setText(item.getEstrellas()+"");
        distancia.setText(item.getDistancia()+"");

        return convertView;
    }
}