package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Ventana2Controller {

    ArrayList <PokemonMalo> pkmalos = new ArrayList <PokemonMalo>();


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
    Label nivelmalo;
    @FXML
    ImageView fotomalo;



    public void initialize() {
        ataque1.setVisible(false);
        ataque2.setVisible(false);
        ataque3.setVisible(false);
        cancelar.setVisible(false);

        pkmalos.add( new PokemonMalo ("Jolteon",204, 204, 65,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/135.png")));
        pkmalos.add( new PokemonMalo ("Charizard",148, 148,45,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/006.png")));
        pkmalos.add( new PokemonMalo ("Vaporeon",234, 234,54,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/134.png")));
        pkmalos.add( new PokemonMalo ("Blastoide",222, 222,65,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/009.png")));

        int elecc = (int) (Math.random()*4);

        nombremalo.setText(pkmalos.get(elecc).getNombre());
        nivelmalo.setText(String.valueOf(pkmalos.get(elecc).getNivel()));
        fotomalo.setImage(pkmalos.get(elecc).getImagen());
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
}
class PokemonMalo {
    String nombre = " ";
    float vidaActual = 0;
    float vidaTotal = 0;
    int nivel = 0;
    Image imagen;

    public PokemonMalo(String nombre, float vidaActual, float vidaTotal, int nivel, Image imagen) {
        this.nombre = nombre;
        this.vidaActual = vidaActual;
        this.vidaTotal = vidaTotal;
        this.nivel = nivel;
        this.imagen = imagen;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(float vidaActual) {
        this.vidaActual = vidaActual;
    }

    public float getVidaTotal() {
        return vidaTotal;
    }

    public void setVidaTotal(float vidaTotal) {
        this.vidaTotal = vidaTotal;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
}