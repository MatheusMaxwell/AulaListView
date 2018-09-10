package com.example.matheusmaxwellmeireles.aulalistview.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.matheusmaxwellmeireles.aulalistview.R;
import com.example.matheusmaxwellmeireles.aulalistview.adapter.MyAdapterGrid;

public class PurchaseActivity extends Activity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        final int car = getIntent().getIntExtra("idCar", 0);

        gridView = findViewById(R.id.grid);
        gridView.setAdapter(new MyAdapterGrid(this, car));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetalheActivity.class);

                intent.putExtra("idCar", car);
                startActivity(intent);
            }
        });

    }
}
