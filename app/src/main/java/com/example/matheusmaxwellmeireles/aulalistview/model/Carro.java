package com.example.matheusmaxwellmeireles.aulalistview.model;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Carro implements Serializable {

    private String fabricante;
    private String modelo;
    private int image;



    /*public Carro(String fabricante, String modelo, int image){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.image = image;
    }*/

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {

        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
