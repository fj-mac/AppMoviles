package com.example.tuparquej;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
    private Entidad item;

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
        item=(Entidad) getItem(position);

        convertView= LayoutInflater.from(context).inflate(R.layout.item, null);

        Button btnFoto= (Button)convertView.findViewById(R.id.buttonParque);
        TextView nombre=convertView.findViewById(R.id.textViewNombre);
        TextView barrio=convertView.findViewById(R.id.textViewBarrio);
        TextView estrellas=convertView.findViewById(R.id.textViewEstrellas);
        TextView distancia=convertView.findViewById(R.id.textViewDistancia);

        //btnFoto.setBackground(item.getImgFoto());
        nombre.setText(item.getNombre());
        barrio.setText(item.getBarrio());
        estrellas.setText(item.getEstrellas()+"");
        distancia.setText(item.getDistancia()+"");
        btnFoto.setTag(position);
        btnFoto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(context, parqueDetails.class);
                Bundle b =new Bundle();
                b.putString("key",(Integer) v.getTag()+"");
                intent.putExtras(b);
                context.startActivity(intent);
            }
        });



        return convertView;
    }


}
