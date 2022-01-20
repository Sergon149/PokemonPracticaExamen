package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Locale;

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
    @FXML
    Label psmalo;
    @FXML
    Label psbueno;

    int elecc = (int) (Math.random()*4);

    public void initialize() {
        ataque1.setVisible(false);
        ataque2.setVisible(false);
        ataque3.setVisible(false);
        cancelar.setVisible(false);

        pkmalos.add( new PokemonMalo ("Jolteon",100, 100, 65,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/135.png")));
        pkmalos.add( new PokemonMalo ("Charizard",100, 100,45,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/006.png")));
        pkmalos.add( new PokemonMalo ("Vaporeon",100, 100,54,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/134.png")));
        pkmalos.add( new PokemonMalo ("Blastoide",100, 100,65,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/009.png")));



        nombremalo.setText(pkmalos.get(elecc).getNombre().toUpperCase());
        nivelmalo.setText("Nv "+pkmalos.get(elecc).getNivel());
        fotomalo.setImage(pkmalos.get(elecc).getImagen());
    }

    @FXML
    public void pasarpk(Pokemon pokemon){

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

    }
    @FXML
    private void ataquearriesgado(){

    }
    @FXML
    private void ataquemuyarriesgado(){

    }

    @FXML
    private void psentramalo(){
        psmalo.setText(""+pkmalos.get(elecc).getVidaActual());
    }
    @FXML
    private void pssalemalo(){
        psmalo.setText("PS");
    }
    @FXML
    private void psentrabueno(){

    }
    @FXML
    private void pssalebueno(){
        psbueno.setText("PS");
    }
}
class PokemonMalo {
    String nombre;
    float vidaActual;
    float vidaTotal;
    int nivel;
    Image imagen;

    public PokemonMalo(String nombre, float vidaActual, float vidaTotal, int nivel, Image imagen) {
        this.nombre = nombre;
        this.vidaActual = vidaActual;
        this.vidaTotal = vidaTotal;
        this.nivel = nivel;
        this.imagen = imagen;
    }

    public void ataque2(){
        int segundo = (int) (Math.random()*25+10);
    }

    public void ataque3(){
        int tercero = (int) (Math.random()*50);
    }

    public void cura(){
        int curisima = (int) (Math.random()*75+25);
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