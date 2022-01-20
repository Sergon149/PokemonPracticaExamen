package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Ventana2Controller {

    ArrayList <PokemonMalo> pkmalos = new ArrayList<>();


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


    int elecc = (int) (Math.random()*4);

    public void initialize() {
        ataque1.setVisible(false);
        ataque2.setVisible(false);
        ataque3.setVisible(false);
        cancelar.setVisible(false);

        pkmalos.add( new PokemonMalo ("Rayquaza",100, 100, 30,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/7/78/latest/20140111185443/Rayquaza_XY.gif")));
        pkmalos.add( new PokemonMalo ("Pikachu",100, 100,95,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/thumb/7/74/latest/20200104060734/Pikachu_EpEc.gif/111px-Pikachu_EpEc.gif")));
        pkmalos.add( new PokemonMalo ("Tyranitar",100, 100,45,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/thumb/5/5d/latest/20200105034804/Tyranitar_EpEc.gif/88px-Tyranitar_EpEc.gif")));
        pkmalos.add( new PokemonMalo ("Mr. Mine",100, 100,60,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/thumb/3/39/latest/20200104030503/Mr._Mime_EpEc.gif/120px-Mr._Mime_EpEc.gif")));



        nombremalo.setText(pkmalos.get(elecc).getNombre().toUpperCase());
        nivelmalo.setText("Nv "+pkmalos.get(elecc).getNivel());
        fotomalo.setImage(pkmalos.get(elecc).getImagen());
    }

    @FXML
    public void pasarpk(Pokemon pokemon){
        nombrebueno.setText(pokemon.nombre.toUpperCase());
        nivelbueno.setText("Nv "+pokemon.nivel);
        fotobueno.setImage(pokemon.imagen);
        psbueno.setText(String.valueOf(pokemon.vidaActual));

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
    public void pssalemalo(){psmalo.setText("PS");}
    @FXML
    private void psentrabueno(){}
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