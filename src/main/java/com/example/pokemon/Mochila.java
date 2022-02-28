package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Mochila {

    @FXML
    ImageView imagen;
    @FXML
    ImageView mochila1;
    @FXML
    ImageView mochila2;
    @FXML
    ImageView mochila3;
    @FXML
    Label nombre;
    @FXML
    Label vida;
    @FXML
    Label uno;
    @FXML
    Label dos;
    @FXML
    Label tres;
    @FXML
    ProgressBar bar;

    Pokemon pokemon=null;
    private HelloController ventana1;

    public void pasarmierda(HelloController ventana1){
        this.ventana1=ventana1;
    }

    public void pasarpkmochila(Pokemon pokemon) throws FileNotFoundException {

        this.pokemon=pokemon;

        imagen.setImage(pokemon.imagen);
        mochila1.setImage(new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\estrella.png")));
        mochila2.setImage(new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\estrella.png")));
        mochila3.setImage(new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\estrella.png")));
        nombre.setText(pokemon.nombre);
        vida.setText(pokemon.vidaActual+"/"+pokemon.vidaTotal);

        double salida = (double) pokemon.getVidaActual()/pokemon.getVidaTotal();
        bar.setProgress(salida);

        if (bar.getProgress() <= 0.50 && bar.getProgress() >= 0.25){
            bar.setStyle("-fx-accent: #f1c905;");
        }
        if (bar.getProgress() < 0.25){
            bar.setStyle("-fx-accent: #ff0000;");
        }
        if (bar.getProgress() > 0.50){
            bar.setStyle("-fx-accent:  #94ED30;");
        }

        if (pokemon.vidaActual <= 0){
            mochila2.setVisible(false);
            mochila3.setVisible(false);
        }else{
            mochila1.setVisible(false);
        }
    }

    public void moch1() throws FileNotFoundException {
        if (pokemon.vidaActual <= 0){
            pokemon.vidaActual=pokemon.vidaTotal;
            vida.setText(pokemon.vidaActual+"/"+pokemon.vidaTotal);

            double salida = (double) pokemon.getVidaActual()/pokemon.getVidaTotal();
            bar.setProgress(salida);

            ventana1.actualizarvida(pokemon);

            ventana1.ventana2.actualizarvidamochila(pokemon);
        }
    }
    public void moch2() throws FileNotFoundException {
        if (pokemon.vidaActual > 0){
            pokemon.vidaActual+=20;
            vida.setText(pokemon.vidaActual+"/"+pokemon.vidaTotal);

            double salida = (double) pokemon.getVidaActual()/pokemon.getVidaTotal();
            bar.setProgress(salida);

            ventana1.actualizarvida(pokemon);

            ventana1.ventana2.actualizarvidamochila(pokemon);
        }
    }
    public void moch3() throws FileNotFoundException {
        if (pokemon.vidaActual > 0){
            pokemon.vidaActual+=40;
            vida.setText(pokemon.vidaActual+"/"+pokemon.vidaTotal);

            double salida = (double) pokemon.getVidaActual()/pokemon.getVidaTotal();
            bar.setProgress(salida);

            ventana1.actualizarvida(pokemon);

            ventana1.ventana2.actualizarvidamochila(pokemon);
        }
    }

}
