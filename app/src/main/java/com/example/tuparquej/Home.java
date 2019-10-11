package com.example.tuparquej;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.view.View;
import java.util.ArrayList;

public class Home extends AppCompatActivity {
    private ListView lvItems;
    private Adaptador adaptador;
    private Button irParque;

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
        listItems.add( new Entidad(R.drawable.japon,"a","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"b","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"c","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"d","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"e","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"f","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"g","Cabrera",4,300));
        listItems.add( new Entidad(R.drawable.japon,"h","Cabrera",4,300));
        return listItems;
    }

}
