package com.example.tuparquej;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    private ListView lvItems;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lvItems=findViewById(R.id.lvItems);
        adaptador=new Adaptador(this,getArrayList() );
        lvItems.setAdapter(adaptador);
    }
    //Metodo de carga de parques

    private ArrayList<Entidad> getArrayList(){
        ArrayList<Entidad> listItems=new ArrayList<>();
        listItems.add( new Entidad(R.drawable.japon,"Parque del Japon","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"Parque 80 11","Nogal",5,250));
        listItems.add( new Entidad(R.drawable.japon,"Parque del Japon","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"Parque del Japon","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"Parque del Japon","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"Parque del Japon","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"Parque del Japon","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"Parque del Japon","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"Parque del Japon","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"Parque del Japon","Cabrera",4,300));
        return listItems;
    }

}
