package com.example.matheusmaxwellmeireles.aulalistview.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.matheusmaxwellmeireles.aulalistview.R;

public class MyAdapterGrid extends BaseAdapter {

    private Context context;
    private int idCar;

    public MyAdapterGrid(Context context, int idCar) {
        this.context = context;
        this.idCar = idCar;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;
        /*if(convertView == null){
            imageView = new ImageView(context);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(85,85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8,8);
        }
        else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(images[position]);*/

        imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setAdjustViewBounds(true);
        Toast.makeText(context, "IdCar: "+idCar+"||idDraw"+R.drawable.uno,Toast.LENGTH_LONG).show();

        return imageView;
    }

    private Integer[] images = {
            idCar, idCar,
            idCar, idCar,
            idCar, idCar,
            idCar, idCar,
            idCar, idCar,
            idCar, idCar,
            idCar, idCar,
            idCar, idCar
    };
}
