package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Ventana2Controller {

    PokemonMalo pk1=new PokemonMalo("Jolteon",204, 204, 65,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/135.png"));
    PokemonMalo pk2=new PokemonMalo("Charizard",148, 148,45,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/006.png"));
    PokemonMalo pk3=new PokemonMalo("Vaporeon",234, 234,54,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/134.png"));
    PokemonMalo pk4=new PokemonMalo("Blastoide",222, 222,65,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/009.png"));

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
}