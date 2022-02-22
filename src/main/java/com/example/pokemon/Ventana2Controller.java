package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.Optional;

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
    HelloController ventana1;


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
    }


    public void pasarvida(HelloController ventana1){
        this.ventana1=ventana1;
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
    private void curarse(){
        if (pokemon.vidamin(malo)){
            malo.curasegura(pokemon);
            malo.vidamin(pokemon);
            actualizarbarra(pokemon,barrabueno);
            ventana1.actualizarvida(pokemon);
        }

        if (malo.vidamin(pokemon)){
            pokemon.curasegura(malo);
            pokemon.vidamin(malo);
            actualizarbarra(malo,barramalo);
        }
    }

    @FXML
    private void ataqueseguro(){

        if(malo.vidamin(pokemon)) {
            malo.setVidaActual(malo.vidaActual - 20);
            pokemon.vidamin(malo);
            actualizarbarra(malo, barramalo);
            HelloController.danototalejecutado += 20;
            showAlert();
        }

        if(pokemon.vidamin(malo)) {
            pokemon.setVidaActual(pokemon.vidaActual-20);
            malo.vidamin(pokemon);
            actualizarbarra(pokemon,barrabueno);
            ventana1.actualizarvida(pokemon);
            HelloController.danototalrecibido += 20;
            showAlert();
        }
        ventana1.actualizarStats1();
    }
    @FXML
    private int ataquearriesgado(){

        if(malo.vidamin(pokemon)) {
            HelloController.danototalejecutado += pokemon.ataquearriesgado(malo);
            pokemon.vidamin(malo);
            actualizarbarra(malo, barramalo);
            showAlert();
        }
        if(pokemon.vidamin(malo)) {
            HelloController.danototalrecibido += malo.ataquearriesgado(pokemon);
            malo.vidamin(pokemon);
            actualizarbarra(pokemon, barrabueno);
            ventana1.actualizarvida(pokemon);
            showAlert();
        }
        ventana1.actualizarStats1();

        return 0;
    }
    @FXML
    private void ataquemuyarriesgado(){

        if(malo.vidamin(pokemon)){
            HelloController.danototalejecutado += pokemon.ataquemuyarriesgado(malo);
            pokemon.vidamin(malo);
            actualizarbarra(malo,barramalo);
            showAlert();
        }

        if(pokemon.vidamin(malo)) {
            HelloController.danototalrecibido += malo.ataquemuyarriesgado(pokemon);
            malo.vidamin(pokemon);
            actualizarbarra(pokemon, barrabueno);
            ventana1.actualizarvida(pokemon);
            showAlert();
        }
        ventana1.actualizarStats1();

    }

    @FXML
    public void showAlert() {
        if (barramalo.getProgress() <= 0) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Fin del Combate");
            alert.setHeaderText("¡Has ganado!");
            alert.setContentText("Enhorabuena " + nombrebueno.getText());
            alert.setGraphic(fotobueno);

            Optional<ButtonType> resultado = alert.showAndWait();
            if (resultado.get() == ButtonType.OK) {
                System.exit(0);
            } else if (resultado.get() == ButtonType.CANCEL) {
                Stage stage = (Stage) cancelar.getScene().getWindow();
                stage.close();
            }
        }

        if (barrabueno.getProgress() <= 0) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Fin del Combate");
            alert.setHeaderText("¡Has perdido!");
            alert.setContentText("Enhorabuena " + nombremalo.getText());
            alert.setGraphic(fotomalo);

            Optional<ButtonType> resultado = alert.showAndWait();
            if (resultado.get() == ButtonType.OK) {
                System.exit(0);
            } else if (resultado.get() == ButtonType.CANCEL) {
                Stage stage = (Stage) cancelar.getScene().getWindow();
                stage.close();
            }
        }
    }

    @FXML
    private void psentramalo(){
        psmalo.setText(""+malo.getVidaActual());
    }
    @FXML
    public void pssalemalo(){
        psmalo.setText("PS");
    }
    @FXML
    private void psentrabueno(){
        psbueno.setText(""+pokemon.getVidaActual());
    }
    @FXML
    private void pssalebueno(){
        psbueno.setText("PS");
    }

    public void actualizarbarra(Pokemon pokemon, ProgressBar barra){
        double salida = (double) pokemon.getVidaActual()/pokemon.getVidaTotal();

        barra.setProgress(salida);

        if (barra.getProgress() <= 0.50 && barra.getProgress() >= 0.25){
            barra.setStyle("-fx-accent: #f1c905;");
        }
        if (barra.getProgress() < 0.25){
            barra.setStyle("-fx-accent: #ff0000;");
        }
        if (barra.getProgress() > 0.50){
            barra.setStyle("-fx-accent:  #94ED30;");
        }

        System.out.println(salida);
    }
}
