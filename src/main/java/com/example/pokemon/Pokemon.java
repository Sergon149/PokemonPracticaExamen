package com.example.pokemon;

import javafx.scene.image.Image;

public class Pokemon {

    String nombre;
    int vidaActual;
    int vidaTotal;
    int nivel;
    Image imagen;

    public String getNombre() {
        return nombre;
    }


    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getVidaTotal() {
        return vidaTotal;
    }

    public int getNivel() {
        return nivel;
    }

    public Image getImagen() {
        return imagen;
    }

    public Pokemon(String nombre, int vidaActual, int vidaTotal, int nivel, Image imagen) {
        this.nombre = nombre;
        this.vidaActual = vidaActual;
        this.vidaTotal = vidaTotal;
        this.nivel = nivel;
        this.imagen = imagen;
    }
    public void curasegura(Pokemon pokemon){
        pokemon.setVidaActual((int) (pokemon.vidaActual+(Math.random()*75+25)));
    }

    public void ataquearriesgado(Pokemon pokemon){
        pokemon.setVidaActual((int) (pokemon.vidaActual-(Math.random()*25+10)));
    }
    public void ataquemuyarriesgado(Pokemon pokemon){
        int dano= (int) (Math.random()*50);
        pokemon.setVidaActual(pokemon.vidaActual-dano);
        System.out.println("El pokemon "+pokemon.getNombre()+" ha recibido "+dano);
    }

    public boolean vidamin(Pokemon pokemon){
        if(pokemon.getVidaActual()<=0){
            pokemon.setVidaActual(0);
            return false;
        }else {
            return true;
        }

    }

}