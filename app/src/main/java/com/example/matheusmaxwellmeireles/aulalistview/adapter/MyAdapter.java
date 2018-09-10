package com.example.matheusmaxwellmeireles.aulalistview.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.matheusmaxwellmeireles.aulalistview.R;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter{

    private Context context;
    private ArrayList<Integer> listImages;
    private ArrayList<String> listCars;

    //private final List<Carro> elementos;
    // private final Activity activity;


    public MyAdapter(Context context, ArrayList<Integer> listImages, ArrayList<String> listCars) {
        this.context = context;
        this.listImages = listImages;
        this.listCars = listCars;
    }

    @Override
    public int getCount() {
        return listCars.size();
    }

    @Override
    public Object getItem(int i) {
        return listCars.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //View view = activity.getLayoutInflater().inflate(R.layout.layout_item_list, parent, false);
        //Carro carro = elementos.get(position);

        if(convertView == null){
            convertView = View.inflate(context, R.layout.layout_item_list, null);
        }

        /*LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.layout_item_list, parent, false);*/

        //convertView = LayoutInflater.from(this.context).inflate(R.layout.layout_item_list, null);

        ImageView imageView = convertView.findViewById(R.id.imageLogo);
        TextView textModel = convertView.findViewById(R.id.textModel);
        TextView textFab = convertView.findViewById(R.id.textFab);

        imageView.setImageResource(listImages.get(position));
        textModel.setText(listCars.get(position));
        if(listImages.get(position) == R.drawable.fiatlogo){
            textFab.setText("Fiat");
        }
        else if(listImages.get(position) == R.drawable.chevroletlogo){
            textFab.setText("Chevrolet");
        }
        else if(listImages.get(position) == R.drawable.volkslogo){
            textFab.setText("Volkswagen");
        }
        else if(listImages.get(position) == R.drawable.teslalogo){
            textFab.setText("Tesla");
        }

        return convertView;
        // return view;

    }

}
