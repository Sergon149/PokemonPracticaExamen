package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Pokedex {

    @FXML
    Label nom;
    @FXML
    Label nivel;
    @FXML
    Label vida;
    @FXML
    ProgressBar bar;
    @FXML
    ImageView imagen;
    @FXML
    ImageView star1;
    @FXML
    ImageView star2;

    Pokemon pokemon=null;

    public void pasarpkelegido(Pokemon pokemon) throws FileNotFoundException {
        this.pokemon=pokemon;

        nom.setText(pokemon.nombre);
        nivel.setText("Nv "+pokemon.nivel);
        vida.setText(pokemon.vidaActual+"/"+ pokemon.vidaTotal);
        imagen.setImage(pokemon.imagen);
        star1.setImage(new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\estrella.png")));
        star2.setImage(new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\estrellaamarilla.png")));
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

    public void clicstar1(){
        star1.setVisible(false);
        star2.setVisible(true);
    }

    public void clicstar2(){
        star1.setVisible(true);
        star2.setVisible(false);
    }
}
