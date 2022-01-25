package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.PortUnreachableException;
import java.util.ArrayList;

public class Ventana2Controller {


    @FXML
    Button atacar;
    @FXML
    Button curar;
    @FXML
    Button ataque1;
    @FXML
    Button ataque2;
    @FXML
    Button ataque3;
    @FXML
    Button cancelar;
    @FXML
    Label nombremalo;
    @FXML
    Label nombrebueno;
    @FXML
    Label nivelmalo;
    @FXML
    Label nivelbueno;
    @FXML
    ImageView fotomalo;
    @FXML
    ImageView fotobueno;
    @FXML
    Label psmalo;
    @FXML
    Label psbueno;
    @FXML
    ProgressBar barramalo;
    @FXML
    ProgressBar barrabueno;


    Pokemon pokemon=null;
    Pokemon malo=null;


    @FXML
    public void pasarpk(Pokemon pokemon, Pokemon malo){

        this.pokemon=pokemon;
        this.malo=malo;

        nombrebueno.setText(pokemon.nombre.toUpperCase());
        nivelbueno.setText("Nv "+pokemon.nivel);
        fotobueno.setImage(pokemon.imagen);

        nombremalo.setText(malo.getNombre().toUpperCase());
        nivelmalo.setText("Nv "+malo.getNivel());
        fotomalo.setImage(malo.getImagen());
        psmalo.setText(""+malo.getVidaActual());

    }

    public void initialize() {
        ataque1.setVisible(false);
        ataque2.setVisible(false);
        ataque3.setVisible(false);
        cancelar.setVisible(false);



    }


    @FXML
    private void botonataque(){
        ataque1.setVisible(true);
        ataque2.setVisible(true);
        ataque3.setVisible(true);
        cancelar.setVisible(true);

        atacar.setVisible(false);
        curar.setVisible(false);
    }

    @FXML
    private void botoncancelar(){
        atacar.setVisible(true);
        curar.setVisible(true);

        ataque1.setVisible(false);
        ataque2.setVisible(false);
        ataque3.setVisible(false);
        cancelar.setVisible(false);
    }

    @FXML
    private void ataqueseguro(){

        if(malo.vidamin(pokemon)) {
            malo.setVidaActual(malo.vidaActual - 20);
            pokemon.vidamin(malo);
            actualizarbarra(malo, barramalo);
        }

        if(pokemon.vidamin(malo)) {
            pokemon.setVidaActual(pokemon.vidaActual-20);
            malo.vidamin(pokemon);
            actualizarbarra(pokemon,barrabueno);}

    }
    @FXML
    private void ataquearriesgado(){

        if(malo.vidamin(pokemon)) {
            pokemon.ataquearriesgado(malo);
            pokemon.vidamin(malo);
            actualizarbarra(malo, barramalo);
        }
        if(pokemon.vidamin(malo)) {
            malo.ataquearriesgado(pokemon);
            malo.vidamin(pokemon);
            actualizarbarra(pokemon, barrabueno);
        }

    }
    @FXML
    private void ataquemuyarriesgado(){

        if(malo.vidamin(pokemon)){
            pokemon.ataquemuyarriesgado(malo);
            pokemon.vidamin(malo);
            actualizarbarra(malo,barramalo);}

        if(pokemon.vidamin(malo)) {
            malo.ataquemuyarriesgado(pokemon);
            malo.vidamin(pokemon);
            actualizarbarra(pokemon, barrabueno);
        }

    }

    @FXML
    private void psentramalo(){
        psmalo.setText(""+malo.getVidaActual());
    }
    @FXML
    public void pssalemalo(){psmalo.setText("PS");}
    @FXML
    private void psentrabueno(){psbueno.setText(""+pokemon.getVidaActual());}
    @FXML
    private void pssalebueno(){psbueno.setText("PS");}

    public void actualizarbarra(Pokemon pokemon, ProgressBar barra){
        double salida = (double) pokemon.getVidaActual()/pokemon.getVidaTotal();
        barra.setProgress(salida);
        System.out.println(salida);


    }
}
