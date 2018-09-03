package com.example.matheusmaxwellmeireles.aulalistview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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

        int linha = getIntent().getIntExtra("linha", 0);

        Carro carro = new Carro();

        switch (linha){

            case 0:
                carro.setFabricante("FIAT");
                carro.setModelo("UNO");
                carro.setImage(R.drawable.uno);
                break;
            case 1:
                carro.setFabricante("VOLKSWAGEN");
                carro.setModelo("GOL");
                carro.setImage(R.drawable.gol);
                break;
            case 2:
                carro.setFabricante("FIAT");
                carro.setModelo("PALIO");
                carro.setImage(R.drawable.palio);
                break;
            case 3:
                carro.setFabricante("CHEVROLET");
                carro.setModelo("CELTA");
                carro.setImage(R.drawable.celta);
                break;
            case 4:
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
