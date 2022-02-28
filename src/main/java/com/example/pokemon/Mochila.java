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
    ProgressBar bar;


    public void pasarpkmochila(Pokemon pokemon) throws FileNotFoundException {

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
    }

}
