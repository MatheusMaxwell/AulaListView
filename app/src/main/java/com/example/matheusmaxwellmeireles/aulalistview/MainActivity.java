package com.example.matheusmaxwellmeireles.aulalistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    ListView listView;
    ArrayList<Integer> listImages;
    ArrayList<String> listCars;
    Intent intent;
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        //List<Carro> carros = adicionarCarros();

        listCars = new ArrayList<>();
        listImages = new ArrayList<>();

        listCars = getListCars();
        listImages = getListImages();

        adapter = new MyAdapter(MainActivity.this, listImages, listCars);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);


    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(getApplicationContext(), "Um item foi clicado.", Toast.LENGTH_LONG).show();
        intent = new Intent(getApplicationContext(), DetalheActivity.class);

        intent.putExtra("linha", i);
        startActivity(intent);
    }

    /*private List<Carro> adicionarCarros (){

        List<Carro> carros = new ArrayList<>();
        Carro c = new Carro("Fiat", "Uno", R.drawable.fiatlogo, R.drawable.uno);
        carros.add(c);
        c = new Carro("Volkswagen", "Gol", R.drawable.volkslogo, R.drawable.gol);
        carros.add(c);
        c = new Carro("Fiat", "Palio", R.drawable.fiatlogo, R.drawable.palio);
        carros.add(c);
        c = new Carro("Chevrolet", "Celta", R.drawable.chevroletlogo, R.drawable.celta);
        carros.add(c);
        c = new Carro("Tesla", "T1", R.drawable.teslalogo, R.drawable.tesla);
        carros.add(c);

        return carros;

    }*/

    public ArrayList<Integer> getListImages() {
        listImages = new ArrayList<>();

        listImages.add(R.drawable.fiatlogo);
        listImages.add(R.drawable.volkslogo);
        listImages.add(R.drawable.fiatlogo);
        listImages.add(R.drawable.chevroletlogo);
        listImages.add(R.drawable.teslalogo);

        return listImages;
    }

    public ArrayList<String> getListCars() {
        listCars = new ArrayList<>();

        listCars.add("Uno");
        listCars.add("Gol");
        listCars.add("Palio");
        listCars.add("Celta");
        listCars.add("P100D");

        return listCars;
    }
}
