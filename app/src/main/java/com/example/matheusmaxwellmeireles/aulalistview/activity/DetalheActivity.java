package com.example.matheusmaxwellmeireles.aulalistview.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.matheusmaxwellmeireles.aulalistview.R;
import com.example.matheusmaxwellmeireles.aulalistview.model.Carro;

public class DetalheActivity extends Activity implements View.OnClickListener{

    TextView txtFab;
    TextView txtMod;
    ImageView image;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        txtFab = findViewById(R.id.txtFabricante);

        txtMod = findViewById(R.id.txtModelo);

        image = findViewById(R.id.image);

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);


        int idCar = getIntent().getIntExtra("idCar", 0);

        Carro carro = new Carro();

        switch (idCar){

            case R.drawable.uno:
                carro.setFabricante("FIAT");
                carro.setModelo("UNO");
                carro.setImage(R.drawable.uno);
                break;
            case R.drawable.gol:
                carro.setFabricante("VOLKSWAGEN");
                carro.setModelo("GOL");
                carro.setImage(R.drawable.gol);
                break;
            case R.drawable.palio:
                carro.setFabricante("FIAT");
                carro.setModelo("PALIO");
                carro.setImage(R.drawable.palio);
                break;
            case R.drawable.celta:
                carro.setFabricante("CHEVROLET");
                carro.setModelo("CELTA");
                carro.setImage(R.drawable.celta);
                break;
            case R.drawable.tesla:
                carro.setFabricante("TESLA");
                carro.setModelo("P100D");
                carro.setImage(R.drawable.tesla);
                break;
        }



        txtFab.setText("FABRICANTE: "+carro.getFabricante());
        txtMod.setText("MODELO: "+carro.getModelo());
        image.setImageResource(carro.getImage());

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
